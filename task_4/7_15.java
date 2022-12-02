package task_4;

public class 7_15 {
    public static void main(String[] args) {
        int arraySize = 0;
        if(args[0]==null){
            arraySize = 10;
        }
        else {
            arraySize = Integer.parseInt(args[0]);
            int[] arr = new int[arraySize];
        }
    }
}