package models;


// This DAO class will provide access to our model data, but will not require
// accessing the ListBurgersDAO / ListIngredientsDAO directly -- Instead,
// we will reference those interfaces.
public class DaoFactory {
    private static McBurgers mcBurgersDao; // the mcBurger interface

    public static McBurgers getMcBurgersDao(){
        if(mcBurgersDao == null) {
            mcBurgersDao = new ListBurgers();
        }
        return mcBurgersDao;
    }

    private static Ingredients ingredientsDao; // the ingredient interface


    public static Ingredients getIngredientsDao(){
        if(ingredientsDao == null){
            ingredientsDao = new ListIngredients();
        }
        return ingredientsDao;
    }
}
