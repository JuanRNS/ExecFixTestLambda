package entities;

public class Func {

    private String name;
    private Double salary;
    private String email;

    public Func() {
    }
    public Func(String name, String email,double salary ) {
        this.name = name;
        this.salary = salary;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
