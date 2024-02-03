import java.io.BufferedReader;
import java.util.Date;
import java.util.Scanner;

public class Payment {
    private int paymentID;
    private String status;
    private double amount;
    private Date createDate;
    private CheckBill paymentBill;

    public Payment(int paymentID, double amount, Date createDate, CheckBill paymentBill,String status) {
        this.paymentID = paymentID;
        this.status = status;
        this.amount = amount;
        this.createDate = createDate;
        this.paymentBill = paymentBill;
    }
    public Payment() {
        this.paymentID = 0;
        this.status = null;
        this.amount = 0.0;
        this.createDate = new Date();
        this.paymentBill = new CheckBill();
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public CheckBill getPaymentBill() {
        return paymentBill;
    }

    public void setPaymentBill(CheckBill paymentBill) {
        this.paymentBill = paymentBill;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id payment");
        paymentID = scanner.nextInt();
        System.out.println("cac trang thai cua payment");
        System.out.println("1 : Unpaid");
        System.out.println("2 : Pending");
        System.out.println("3 : Conpleted");
        System.out.println("4 : Failled");
        System.out.println("5 : Declined");
        System.out.println("6 : Cancelled");
        System.out.println("7 : Abandoned");
        System.out.println("8 : Settling");
        System.out.println("9 : Settled");
        System.out.println("10 : Refunded");
        System.out.println("moi chon");
        int chon = scanner.nextInt();
        switch (chon){
            case 1:
                setStatus(PaymentStatus.Unpaid);
                break;
            case 2:
                setStatus(PaymentStatus.Pending);
                break;
            case 3:
                setStatus(PaymentStatus.Conpleted);
                break;
            case 4:
                setStatus(PaymentStatus.Failled);
                break;
            case 5:
                setStatus(PaymentStatus.Declined);
                break;
            case 6:
                setStatus(PaymentStatus.Cancelled);
                break;
            case 7:
                setStatus(PaymentStatus.Abandoned);
                break;
            case 8:
                setStatus(PaymentStatus.Settling);
                break;
            case 9:
                setStatus(PaymentStatus.Settled);
                break;
            case 10:
                setStatus(PaymentStatus.Refunded);
                break;
            default:
                System.out.println("vui long chon tu 1 den 10");
        }
        System.out.println("nhap amount");
        amount = scanner.nextDouble();
        createDate = new Date();
    }

    public void output(){
        System.out.println("id payment : "+getPaymentID());
        System.out.println("status : "+ getStatus());
        System.out.println("amount : "+ getAmount());
        System.out.println(" date : "+getCreateDate());
    }
}
