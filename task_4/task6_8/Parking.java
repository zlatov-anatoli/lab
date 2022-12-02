package task_4.task6_8;

public class Parking {
    private double total = 0.0;
    public Parking(int hours){
        setTotal(hours);
    }

    public void setTotal(int hours){
        if (hours<=3){
            this.total = hours;
        }
        else if (hours == 24){
            this.total = 10;
        }
        else{
            this.total = 2+((hours-3)*0.5);
        }
    }

    public double getTotal() {
        return total;
    }
}