package task_4.task6_8;

public class Parking_Count {
    public static void main(String[] args) {
        Parking client1 = new Parking(10);
        Parking client2 = new Parking(24);
        Parking client3 = new Parking(2);
        Parking client4 = new Parking(15);
        Parking client5 = new Parking(8);
        System.out.println("Чек для 1-го клиента: "+client1.getTotal());
        System.out.println("Чек для 2-го клиента: "+client2.getTotal());
        System.out.println("Чек для 3-го клиента: "+client3.getTotal());
        System.out.println("Чек для 4-го клиента: "+client4.getTotal());
        System.out.println("Чек для 5-го клиента: "+client5.getTotal());
        sum(client1,client2,client3,client4,client5);
    }
    public static void sum(Parking client1, Parking client2, Parking client3, Parking client4, Parking client5){
        double sum = client1.getTotal()+ client2.getTotal()+ client3.getTotal()+ client4.getTotal()+ client5.getTotal();
        System.out.println("Сумма всех чеков: "+ sum);
    }
}