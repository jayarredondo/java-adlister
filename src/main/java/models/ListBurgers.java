package models;

import java.util.ArrayList;
import java.util.List;

public class ListBurgers implements McBurgers{

    private List<McBurger> burgers = new ArrayList<>();

    public ListBurgers(){
        Ingredient pickles = DAOFactory.getIngredientsDao().findbyID(1);
        Ingredient cheese = DAOFactory.getIngredientsDao().findbyID(2);
        Ingredient beefPatty = DAOFactory.getIngredientsDao().findbyID(3);
        Ingredient bun = DAOFactory.getIngredientsDao().findbyID(4);
        Ingredient tomatoes = DAOFactory.getIngredientsDao().findbyID(5);

        ArrayList<Ingredient> bigMacIngredients = new ArrayList<>();

        McBurger bigMac = new McBurger();
        bigMac.setId(1);
        bigMac.setTitle("Big Mac");
        bigMac.setDescription("The big burger with secret special sauce.");
        bigMac.setPriceInCents(350);
        // Define what ingredients are in the burger
        bigMacIngredients.add(pickles);
        bigMacIngredients.add(cheese);
        bigMacIngredients.add(beefPatty);
        bigMacIngredients.add(beefPatty);
        bigMacIngredients.add(bun);
        bigMac.setIngredients(bigMacIngredients);
        burgers.add(bigMac);

        ArrayList<Ingredient> qpIngredients = new ArrayList<>();

        McBurger quarterPounder = new McBurger();
        quarterPounder.setId(2);
        quarterPounder.setTitle("Quarter Pounder");
        quarterPounder.setDescription("The classic go-to when you need protein.");
        quarterPounder.setPriceInCents(300);
        // Define what ingredients are in the burger.
        qpIngredients.add(beefPatty);
        qpIngredients.add(bun);
        qpIngredients.add(cheese);
        qpIngredients.add(pickles);
        quarterPounder.setIngredients(qpIngredients);
        burgers.add(quarterPounder);


        ArrayList<Ingredient> homestyleIngredients = new ArrayList<>();
        McBurger homestyle = new McBurger();
        homestyle.setId(3);
        homestyle.setTitle("Homestyle Burger");
        homestyle.setDescription("The one that got away...");
        homestyle.setPriceInCents(250);
        // Define what ingredients are in the burger
        homestyleIngredients.add(beefPatty);
        homestyleIngredients.add(bun);
        homestyleIngredients.add(pickles);
        homestyleIngredients.add(tomatoes);
        homestyleIngredients.add(cheese);
        homestyle.setIngredients(homestyleIngredients);
        burgers.add(homestyle);


    }

    @Override
    public McBurger findById(long id) {
        //get the McBurger at the index 'id'
        // ['1' => bigMac, '2' => quarterPounder ect.]
        // casting to an int to subtract since ArrayLists start at 0, and IDs start at 1.
        return burgers.get((int)id -1);
    }

    @Override
    public long createBurger(McBurger newBurger) {
        // we need to determine what the ID will be of this new burger
        newBurger.setId(burgers.size() + 1);
        // add this burger to the list in this Data Access Object
        burgers.add(newBurger);
        // we need to return the ID of our newly created burger
        return newBurger.getId();
    }
}
