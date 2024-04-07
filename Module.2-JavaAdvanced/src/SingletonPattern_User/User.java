package SingletonPattern_User;

// la classe User è la un Singleton

public class User {
    private String name;
    private int age;

    private static User instance; // riferimento all'unica istanza

    // costruttore private per evitare che vengano create nuove istanze
    // e per far si che io possa chiamarlo solo all'interno di questa classe
    private User() {}

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Nome: " + name + "\n" + "Età: " + age);
    }

}