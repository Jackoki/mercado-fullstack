import java.util.Date;

public class Order {
    private Integer id;
    private Integer idShoppingCart;
    private Integer idUser;
    private String name;
    private Date date;
    private Double price;

    public Order(){
        
    }

    public Order(Integer id, Integer idShoppingCart, Integer idUser, String name, Date date, Double price) {
        this.id = id;
        this.idShoppingCart = idShoppingCart;
        this.idUser = idUser;
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdShoppingCart() {
        return idShoppingCart;
    }

    public void setIdShoppingCart(Integer idShoppingCart) {
        this.idShoppingCart = idShoppingCart;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}