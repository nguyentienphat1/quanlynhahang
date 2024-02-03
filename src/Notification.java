import java.util.Date;

public class Notification {
    private int notIficationID;
    private Date createdOn;
    private String conTent;

    public Notification(int notIficationID, Date createdOn, String conTent) {
        this.notIficationID = notIficationID;
        this.createdOn = createdOn;
        this.conTent = conTent;
    }
    public Notification() {
        this.notIficationID = 0;
        this.createdOn = null;
        this.conTent = null;
    }

    public int getNotIficationID() {
        return notIficationID;
    }

    public void setNotIficationID(int notIficationID) {
        this.notIficationID = notIficationID;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getConTent() {
        return conTent;
    }

    public void setConTent(String conTent) {
        this.conTent = conTent;
    }
}
