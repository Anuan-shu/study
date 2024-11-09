package Lei;

public class User {
//    public static void main(String[] args) {
//        User user = new User();
//        user.setType(StudentType.本科生);
//        System.out.println(user.getType());
//    }

    private String id;
    private String name;
    private String password;
    private UserType type;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type.toString();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(UserType type) {
        this.type = type;
    }
}
