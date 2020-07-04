package encapsulationConcept;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setId(1001);
        employee.setName("Random");
        employee.setSalary(120000);
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary()+"$");
        //Another way of fetching/presenting output
        int id =employee.getId();
        String name=employee.getName();
        System.out.println("Employee detailes: "+id+" "+name);
    }


}
