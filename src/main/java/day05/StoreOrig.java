package day05;

import java.util.ArrayList;
import java.util.List;

public class StoreOrig {


    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }
    // megoldás map-pel




    // hivatalos megoldás
    public List<ProductWithCount> numberOfProductsByType() {
        List<ProductWithCount> result = new ArrayList<>();

        for (Product actual : products) {
            ProductWithCount productWithPiece = containsProduct(actual, result);
            if (productWithPiece != null) {
                productWithPiece.incrementCount();
            } else {
                result.add(new ProductWithCount(actual.getType()));
            }
        }

        return result;
    }

    private ProductWithCount containsProduct(Product actual, List<ProductWithCount> productsPieceList) {
        for (ProductWithCount pwc : productsPieceList) {
            if (actual.getType() == pwc.getType()) {
                return pwc;
            }
        }
        return null;
    }

}