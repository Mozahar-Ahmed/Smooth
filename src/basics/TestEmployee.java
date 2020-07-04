package basics;

public class TestEmployee {
    public static void main(String[] args) {
        Employee.change();
        Employee employee=new Employee(100,"Ram");
        Employee employee1=new Employee(200,"Sham");
        employee.display();
        employee1.display();
    }
}
