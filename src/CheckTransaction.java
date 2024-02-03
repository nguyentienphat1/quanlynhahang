import java.util.Date;

public class CheckTransaction extends Payment{
    private String bankName,checkNumber;

    public CheckTransaction(int paymentID, double amount, Date createDate, CheckBill paymentBill, String bankName, String checkNumber,String status) {
        super(paymentID, amount, createDate, paymentBill,status);
        this.bankName = bankName;
        this.checkNumber = checkNumber;
    }

    public CheckTransaction(String bankName, String checkNumber) {
        this.bankName = bankName;
        this.checkNumber = checkNumber;
    }
    public CheckTransaction() {
        this.bankName = null;
        this.checkNumber = null;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }
}
