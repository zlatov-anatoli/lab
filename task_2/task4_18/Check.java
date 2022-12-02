package task_2.task4_18;

public class Check {
    public static void main(String[] args) {
        Client client1 = new Client(1,10000,5000,30000);
        Client client2 = new Client(2,20000,300000,20000);
        client1.NewBalance();
        client2.NewBalance();
    }
}