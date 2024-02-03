import java.util.Date;

public class Customer extends Person {
    private Date lastVisiTed;

    public Customer(String name, String email, String phone, String phoneStar, Date lastVisiTed) {
        super(name, email, phone, phoneStar);
        this.lastVisiTed = lastVisiTed;
    }

    public Customer(Date lastVisiTed) {
        this.lastVisiTed = lastVisiTed;
    }
    public Customer() {
        this.lastVisiTed = new Date();
    }

    public Date getLastVisiTed() {
        return lastVisiTed;
    }

    public void setLastVisiTed(Date lastVisiTed) {
        this.lastVisiTed = lastVisiTed;
    }

    public void inPut(){
        super.inPut();
    }

    public void outPut(){
        super.outPut();
        System.out.println("lastVisiTed : "+getLastVisiTed());
    }
}
