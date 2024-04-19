package DesignPattern.SinletonPattern_UserService;

public class User {
    private String name;
    private int eta;
    private Role role;

    public User(String name, int eta, Role role) {
        this.name = name;
        this.eta = eta;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", eta=" + eta +
                ", role=" + role +
                '}';
    }
}
