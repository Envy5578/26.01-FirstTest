public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");        
        Person p = new Person();
        System.out.println(p);
        Person p2 = new Person("John", 30);
        System.out.println(p2);
        System.out.println(p.equals(p2));
        System.out.println(p == p2);
    }

}