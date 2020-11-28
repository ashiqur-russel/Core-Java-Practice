package lecture;

public class Main {
    public static void main(String[] args) {
        System.out.println(Person.numPerson);


        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(Person.numPerson);


        Person p3 = new Person(34);

        Person p4 = new Person("John", "Doe", 4);

        System.out.println(Person.numPerson);


    }
}
