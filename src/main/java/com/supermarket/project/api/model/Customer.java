public class Customer extends User {
    private Decimal wallet;

    public Customer(){
        
    }

    public Customer(Integer id, String name, String email, String username, String password, Decimal wallet){
        super(id, name, email, username, password);
        this.wallet = wallet;
    }

    public Decimal getWallet() {
        return wallet;
    }

    public void setWallet(Decimal wallet) {
        this.wallet = wallet;
    }

}