import java.util.Date;

public class PostalNotification extends Notification{
    private String phone;

    public PostalNotification(int notIficationID, Date createdOn, String conTent, String phone) {
        super(notIficationID, createdOn, conTent);
        this.phone = phone;
    }

    public PostalNotification(String phone) {
        this.phone = phone;
    }
    public PostalNotification() {
        this.phone = null;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
