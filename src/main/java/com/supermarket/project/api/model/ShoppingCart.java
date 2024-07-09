import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Integer id;
    private Integer userId;
    private Map<Integer, Integer> products;
    private double totalValue;

    public ShoppingCart(){
        
    }

    public ShoppingCart(Integer id, Integer userId) {
        this.id = id;
        this.userId = userId;
        this.products = new HashMap<>();
        this.totalValue = 0.0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Map<Integer, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Integer> products) {
        this.products = products;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}