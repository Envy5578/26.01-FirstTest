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
        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());       
        System.out.println(p.hashCode() == p2.hashCode());
        System.out.println(p.equals(p2));
        System.out.println(p2.equals(p));
        System.out.println(p2.hashCode() == p.hashCode()); 
    }

}