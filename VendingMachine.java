import java.util.List;

interface VendingMachine {

    void initProducts(List<Product> productsList);
    void addProduct(Product product);
    Product getProduct(String name);
    
}
