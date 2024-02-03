import java.util.Date;

public class CashTransaction extends Payment{
    private double cashTendered;

    public CashTransaction(int paymentID, double amount, Date createDate, CheckBill paymentBill, double cashTendered,String status) {
        super(paymentID, amount, createDate, paymentBill,status);
        this.cashTendered = cashTendered;
    }

    public CashTransaction(double cashTendered) {
        this.cashTendered = cashTendered;
    }
    public CashTransaction() {
        this.cashTendered = 0.0;
    }

    public double getCashTendered() {
        return cashTendered;
    }

    public void setCashTendered(double cashTendered) {
        this.cashTendered = cashTendered;
    }
}
