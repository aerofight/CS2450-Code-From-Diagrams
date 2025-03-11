public class Order {
    private int price = 0;
    private int estimatedDeliveryTime = 0;
    private int TrackingNumber = 0;
    private String orderId = "";

    public int getPrice() { return price; };
    public int setPrice(int price){this.price = price;} ;

    public int getEstimatedDeliveryTime() { return estimatedDeliveryTime; };
    public int setEstimatedDeliveryTime(int estimatedDeliveryTime) {this.estimatedDeliveryTime = estimatedDeliveryTime;};

    public int getTrackingNumber() { return TrackingNumber; };
    public int setTrackingNumber(int TrackingNumber) {this.TrackingNumber = TrackingNumber;};

    public int getOrderId() {return TrackingNumber; };
    public int setOrderId(int orderId ){this.orderId = orderId} ;
}
