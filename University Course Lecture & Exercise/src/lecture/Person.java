package lecture;

public class Person {

    static int numPerson = 0;
    String firstName;
    String lastName;
    int age;
    Address address;
    Person[] friend;


    public Person(String firstName, String lastName, int numFRiend) {
        this.firstName = firstName;
        this.lastName = lastName;
        numPerson++;

        friend = new Person[numFRiend];


    }

    public Person(int age) {
        this.age = age;
        numPerson++;

    }

    public Person() {
        numPerson++;
    }


}
