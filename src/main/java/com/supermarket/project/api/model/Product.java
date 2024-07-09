public class Product {
    private Integer id;
    private String name;
    private Decimal price;
    private Integer stock;
    private Integer idCategory;

    public Product(){
        
    }

    public Product(Integer id, String name, Decimal price, Integer stock, Integer idCategory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.idCategory = idCategory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Decimal getPrice() {
        return price;
    }

    public void setPrice(Decimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }
}