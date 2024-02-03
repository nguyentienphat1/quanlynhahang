import java.util.Date;

public class EmailNotification extends Notification{
    private String email;

    public EmailNotification(int notIficationID, Date createdOn, String conTent, String email) {
        super(notIficationID, createdOn, conTent);
        this.email = email;
    }

    public EmailNotification(String email) {
        this.email = email;
    }
    public EmailNotification() {
        this.email = null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
