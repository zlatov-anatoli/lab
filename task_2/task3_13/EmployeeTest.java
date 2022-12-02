package task_2.task3_13;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee first = new Employee("Penelope","Cruz",1200);
        Employee second = new Employee("Jennifer","Lopez",77000);
        System.out.println(first.getYearlySalary(0));
        System.out.println(second.getYearlySalary(10));
    }


}