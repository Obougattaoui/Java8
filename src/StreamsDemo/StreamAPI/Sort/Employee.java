package StreamsDemo.StreamAPI.Sort;

public class Employee {

    private int id;
    private String name;
    private String dept;
    private Double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, String dept, Double salary) {
        super();
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
    }

}