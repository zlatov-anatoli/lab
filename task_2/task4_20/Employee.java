package task_2.task4_20;

public class Employee {
    private int hoursPerWeek;
    private int grossPerHour;
    public void grossPay(){
        int firstSalary = 40*grossPerHour;
        int secondHours = hoursPerWeek - 40;
        int secondSalary = secondHours*(grossPerHour/2);
        int salary = (firstSalary+secondSalary)*4;
        System.out.println("Gross pay for employee is "+salary);

    }

    public void setGrossPerHour(int firstHoursEarn) {
        this.grossPerHour = firstHoursEarn;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
}