package p3;

public class Main {

    public static void main(String[] args) {
        Printable printable;
        printable = (x) -> System.out.println(x);

        printable.print(20);

        Printable printable1 = System.out::println;
        printable1.print(150);

        PersonBuilder personBuilder = Person::new;
        Person person = personBuilder.create("Ivan");
        System.out.println(person.getName());






    }

}

interface Printable{
    void print(int a);
}

interface PersonBuilder{
    Person create(String name);
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}