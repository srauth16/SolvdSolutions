// User Class
class User {
    private String id;
    private String name;
    private int age;

    public User(String id, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("User age must be at least 18.");
        }
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getUserInfo() {
        return "User[ID=" + id + ", Name=" + name + ", Age=" + age + "]";
    }
}
