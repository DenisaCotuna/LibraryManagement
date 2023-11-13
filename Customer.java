import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String ID;
    private String name;

    private Map<Integer, Item> itemList = new HashMap<>();

    private Customer(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }


}
