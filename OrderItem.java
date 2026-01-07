public class OrderItem {

    private String productId;
    private String productName;
    private int quantity;
    private double pricePerUnit;
    public MenuItem menuItem;

    public OrderItem(String productId) {
    this.productId = productId;
    }

    public OrderItem(String productId, String productName) {
    this.productId = productId;
    this.productName = productName;
    }

    public OrderItem(String productId, String productName, int quantity){
    this.productId = productId;
    this.productName = productName;
    this.quantity = quantity;    
    }

    public OrderItem(String productId, String productName, int quantity, double pricePerUnit) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
     public OrderItem(String productId, String productName, int quantity, double pricePerUnit, MenuItem menuItem) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.menuItem = menuItem
    }
   
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity ) { 
            this.quantity = quantity;
        }
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    
    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

}