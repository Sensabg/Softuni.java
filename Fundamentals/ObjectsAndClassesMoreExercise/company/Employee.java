package ObjectsAndClassesMoreExercise.company;

public class Employee {
    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private String age;

    public Employee(String name, double salary, String position, String department, String email, String age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }
}
