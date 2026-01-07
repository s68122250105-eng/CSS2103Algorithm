import java.util.Date;

public class Order {
    public Date orderDate;
    public String status;  
    public Float totalPrice;

    public int orderCount = 0;

    public Order() {
        this.orderDate = new Date();
        this.status = "Pending";
        this.totalPrice = 0.0f;
        orderCount++;
    }

    public Order(String status, Float totalPrice) {
        this.orderDate = new Date();
        this.status = status;
        this.totalPrice = totalPrice;
        orderCount++;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void calcTotal() {
        System.out.println("From class Order = calcTotal");
    }

    public void updateStatus() {
        System.out.println("From class Order = updateStatus");
    }

    public void assignRider() {
        System.out.println("From class Order = assignRider");
    }
} 