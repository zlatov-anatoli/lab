package task_4;

public class 7_16 {
    public static void main(String[] args) {
        double[] arr = new double[args.length];
        double total = 0.0;
        for (int i = 0; i < args.length; i++) {
            arr[i] = Double.parseDouble(args[i]);
        }
        for (int i = 0; i < args.length; i++) {
            total += arr[i];
        }
    }
}