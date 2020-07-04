package encapsulationConcept;

public class Employee {
    private int id;
    private String name;
    private int salary;

    public void setId(int i){
       id=i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setSalary(int salary){
        this.salary= salary;
    }
    public int getSalary(){
        return salary;
    }
}
