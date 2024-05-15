import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottleOfWater implements VendingMachine{
    private List<Product> productList = new ArrayList<>();

    @Override
    public void initProducts(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public void addProduct(Product product){
        productList.add(product);
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
    
    public Product getProduct(String name, double value) {
        for (Product product : productList) {
            if (product.getName().equals(name) && ((BottleOfWater)product).getVolume() == value) {
                return product;
            }
        }
        return null;
    }
}
