package co.edureka;

public class Client {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.seteId(101);
        e.seteName("Jhon Doe");
        e.seteSalary(3000);

        System.out.println(e);

    }
}
