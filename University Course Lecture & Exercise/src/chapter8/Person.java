package chapter8;

import lecture.Address;

public class Person {
    String name;
    int age;
    Address address;

    Person(int age) {
        this.name = "Rahman";
        this.age = age;
    }

    public static void main(String[] args) {
        Person peter = new Person(22);
        // peter.setName("Peter");
        System.out.println(peter.name + " , " + peter.age);
        System.out.println(peter.age);
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    void isBirthDay() {
        this.age += this.age;
    }
}
