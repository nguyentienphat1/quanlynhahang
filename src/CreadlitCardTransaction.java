import java.util.Date;

public class CreadlitCardTransaction extends Payment{
    private String nameOncard;

    public CreadlitCardTransaction(int paymentID, double amount, Date createDate, CheckBill paymentBill, String nameOncard,String status) {
        super(paymentID, amount, createDate, paymentBill,status);
        this.nameOncard = nameOncard;
    }

    public CreadlitCardTransaction(String nameOncard) {
        this.nameOncard = nameOncard;
    }
    public CreadlitCardTransaction() {
        this.nameOncard = null;
    }

    public String getNameOncard() {
        return nameOncard;
    }

    public void setNameOncard(String nameOncard) {
        this.nameOncard = nameOncard;
    }


}
