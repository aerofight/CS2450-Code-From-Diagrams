public class Address {
    private int zip;
    private String state = "";
    private String street = "";
    public void setZip(int x){
        zip = x;
    }
    public int getZip(){
        return zip;
    }
    public void setState(String x){
        state = x;
    }
    public String getState(){
        return state;
    }
    public void setStreet(String x){
        street = x;
    }
    public String getStreet(){
        return street;
    }
}
