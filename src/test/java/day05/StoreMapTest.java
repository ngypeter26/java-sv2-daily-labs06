package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StoreMapTest {


    StoreMap store = new StoreMap();

    @BeforeEach
    void init() {
        store.addProduct(new Product("Milk", Type.DIARY, 0.7));
        store.addProduct(new Product("Butter", Type.DIARY, 2.3));
    }


    @Test
    void testNumberOfProductsByOneType() {
        Map<Type, Integer> result = store.numberOfProductsByType();

        assertEquals(1, result.size());
        assertEquals(2, result.get(Type.DIARY));
    }

    @Test
    void testNumberOfProductsByMoreType() {
        store.addProduct(new Product("Beef", Type.MEAT, 2.7));
        Map<Type, Integer> result = store.numberOfProductsByType();


        assertEquals(2, result.size());
        assertEquals(2, result.get(Type.DIARY));
        assertEquals(1, result.get(Type.MEAT));
    }
}
