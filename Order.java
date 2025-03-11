public class Order {
    private int price = 0;
    private int estimatedDeliveryTime = 0;
    private int TrackingNumber = 0;
    private int orderId;

    public Order(int price, int estimatedDeliveryTime, int TrackingNumber, int orderId) {
        this.price = price;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.TrackingNumber = TrackingNumber;
        this.orderId = orderId;
    }

    public int getPrice() {
        return price;
    };
    public void setPrice(int price){
        this.price = price;
    } ;

    public int getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    };
    public void setEstimatedDeliveryTime(int estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    };

    public int getTrackingNumber() {
        return TrackingNumber;
    };
    public void setTrackingNumber(int TrackingNumber) {
        this.TrackingNumber = TrackingNumber;
    };

    public int getOrderId() {
        return TrackingNumber;
    };
    public void setOrderId(int orderId ){
        this.orderId = orderId;
    };
}
