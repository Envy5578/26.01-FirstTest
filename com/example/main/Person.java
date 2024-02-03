public class Person {
    private String name;
    private int age;
    private int day;
    private int month;
    public Person() {
        
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age; 
    }
    public Person(String name, int age, int day, int month) {
        this.name = name;
        this.age = age;
        this.day = day;
        this.month = month;
    }
    public int getmonth() {
        return month;
    }
    public int getday() {
        return day;
    }
    public int getage() {
        return age;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return name.equals(((Person) o).name);
    }
}
