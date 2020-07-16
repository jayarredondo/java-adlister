package models;

public interface Ingredients {
    // This interface lists the methods that any class who implements it, MUST define (or have these methods)
    Ingredient findbyID(long id);

    // if we create a ingredient, return the Id of the newly created ingredient so we can do stuff with it
    long createIngredient(Ingredient newIngredient);
}
