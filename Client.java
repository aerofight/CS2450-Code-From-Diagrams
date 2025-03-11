public class Client extends User{
    private int clientId;
    private String clientStanding;

    public Client(String username, String password, int clientId, String clientStanding) {
        super(username, password);
        this.clientId = clientId;
        this.clientStanding = clientStanding;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setClientStanding(String clientStanding) {
        this.clientStanding = clientStanding;
    }

    public int getClientId() {
        return clientId;
    }

    public String getClientStanding() {
        return clientStanding;
    }
}
