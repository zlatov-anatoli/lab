package task2.task3_13;

public class Employee {
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) {
        setName(name);
        setSalary(salary);
        setSurname(surname);

    }

    public double getYearlySalary(double raise){
       double yearlySalary = (salary+((salary*raise)/100))*12;
       return yearlySalary;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getSurname() {
        return surname;
    }
}