package task_2.task3_12;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice pack = new Invoice("HGTWATW", "Apple Pencil 2", 2,120);
        Invoice pack2 = new Invoice("null", "null", -19,-22.5);
        pack.setInvoiceAmount();
        System.out.printf("Price for ur purchase: $%.2f%n",pack.getInvoiceAmount());
        System.out.printf("Price for ur purchase: $%.2f%n",pack2.getInvoiceAmount());

    }
}