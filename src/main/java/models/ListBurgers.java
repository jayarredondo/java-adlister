package models;

import java.util.ArrayList;
import java.util.List;

public class ListBurgers implements McBurgers{

    private List<McBurger> burgers = new ArrayList<>();

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
