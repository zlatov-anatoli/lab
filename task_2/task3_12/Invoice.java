package task_2.task3_12;

public class Invoice {
    private String serialNumber;
    private String description;
    private int count;
    private double price;
    private double invoiceAmount;

    public Invoice(String serialNumber, String description, int count, double price) {
        setSerialNumber(serialNumber);
        setCount(count);
        setPrice(price);
        setDescription(description);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCount(int count) {
        if (count <= 0) {
            this.count = 0;
        } else {
            this.count = count;
        }
    }

    public void setPrice(double price) {
        if (price <= 0.0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setInvoiceAmount() {
        this.invoiceAmount = price * count;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }
}