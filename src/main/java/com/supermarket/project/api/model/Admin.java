public class Admin extends User {
    private Integer permissionLevel;

    public Admin(){

    }

    public Admin(Integer id, String name, String email, String username, String password, Integer permissionLevel){
        super(id, name, email, username, password);
        this.permissionLevel = permissionLevel;
    }

    public Integer getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(Integer permissionLevel) {
        this.permissionLevel = permissionLevel;
    }
}