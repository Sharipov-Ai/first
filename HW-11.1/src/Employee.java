public class Employee {
    String fullName;
    int age;
    String position;
    int salary;

    public Employee(String fullName, int age, String position, int salary){
        this.fullName = fullName;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {

    }

    public String toString(){
        return "Full name: " + fullName + "; Age: " + age + "; Position: " + position + "; Salary: " + salary;
    }
}
