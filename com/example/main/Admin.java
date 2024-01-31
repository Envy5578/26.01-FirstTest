
public class Admin extends Person {
    
    public Admin(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + getName() + '\'' +
                ", age=" + getage() +
                '}';
    }
    
}
