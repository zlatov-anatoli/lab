package task_4;

public class 6_15 {
    public static void main(String[] args) {
        System.out.println("1 Triangle: "+ hypotenuse(3.0,4.0));
        System.out.println("2 Triangle: "+ hypotenuse(5.0,12.0));
        System.out.println("3 Triangle: "+ hypotenuse(9.0,15.0));
    }
    public static double hypotenuse(double a, double b){
        double hypo = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        return hypo;
    }
}