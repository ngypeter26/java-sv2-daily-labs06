package day05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreMap {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public Map<Type,Integer> numberOfProductsByType() {
        Map<Type,Integer> result = new HashMap<>();
        int actualAmount;
        for (Product p : products) {

            if (result.containsKey(p.getType())) {
                actualAmount = result.get(p.getType());
                result.put(p.getType(),actualAmount+1);
            } else {
                result.put(p.getType(),1);
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }

}
