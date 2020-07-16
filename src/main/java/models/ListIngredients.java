package models;

import java.util.ArrayList;
import java.util.List;

public class ListIngredients  implements Ingredients{

    private List<Ingredient> ingredientList = new ArrayList<>();

    @Override
    public Ingredient findbyID(long id) {
        //get the Ingredient at the index 'id'
        // ['1' => patty, '2' => cheese ect.]
        // casting to an int to subtract since ArrayLists start at 0, and IDs start at 1.
        return ingredientList.get((int)id -1);
    }

    @Override
    public long createIngredient(Ingredient newIngredient) {
        // we need to determine what the ID will be of this new burger
        newIngredient.setId(ingredientList.size() + 1);
        // add this burger to the list in this Data Access Object
        ingredientList.add(newIngredient);
        // we need to return the ID of our newly created burger
        return newIngredient.getId();
    }
}
