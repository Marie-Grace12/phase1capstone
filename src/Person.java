public class Person {
    private String name;
    private String userName;
    private int id;

    public Person(String name, String userName, int id) {
        this.name = name;
        this.userName = userName;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", id=" + id +
                '}';
    }
}
