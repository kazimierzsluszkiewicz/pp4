package pl.kazik.ecommerce.catalog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class ProductCatalog{

    List<Product> products;
    public List<Product>allProducts(){
        return new ArrayList<>();
    }

    public String addProduct(String name, String description){
        UUID id = UUID.randomUUID();
        Product newProduct = new Product(id, name,description);

        ArrayList<Product>  products = new ArrayList<>();
        products.add(newProduct);

        return id.toString();
    }
    public Product getProductBy(String id){
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    public void changePrice(String id, BigDecimal newPrice){
        var loadedProduct = getProductBy(id);
        loadedProduct.changePrice(newPrice);
    }
}