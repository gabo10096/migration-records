package batchprocess.model;

/**
 * DigitizedDocument
 */
public class DigitizedDocument {

    private String clientId;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append(clientId);
        return sb.toString();
    }

}