import java.util.ArrayList;
import java.util.Scanner;

public class CheckBill {
    private int checkID;
    private double amount,tip,tax;
    private boolean isPaid;
    private Order billOrder;
    private ArrayList<Order> listorder;

    public CheckBill(int checkID, double amount, double tip, double tax, boolean isPaid, Order billOrder, ArrayList<Order> listorder) {
        this.checkID = checkID;
        this.amount = amount;
        this.tip = tip;
        this.tax = tax;
        this.isPaid = isPaid;
        this.billOrder = billOrder;
        this.listorder = listorder;
    }
    public CheckBill() {
        this.checkID = 0;
        this.amount = 0.0;
        this.tip = 0.0;
        this.tax = 0.0;
        this.isPaid = false;
        this.billOrder = new Order();
        this.listorder = new ArrayList<>();
    }

    public int getCheckID() {
        return checkID;
    }

    public void setCheckID(int checkID) {
        this.checkID = checkID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Order getBillOrder() {
        return billOrder;
    }

    public void setBillOrder(Order billOrder) {
        this.billOrder = billOrder;
    }

    public ArrayList<Order> getListorder() {
        return listorder;
    }

    public void setListorder(ArrayList<Order> listorder) {
        this.listorder = listorder;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id checkbill");
        checkID = scanner.nextInt();
        System.out.println("nhap amount");
        amount = scanner.nextDouble();
        System.out.println("nhap tien tip");
        tip = scanner.nextDouble();
        System.out.println("nhap tax");
        tax = scanner.nextDouble();
        boolean contuneu = true;
        do {
            System.out.println("1 : neu chua thanh toan");
            System.out.println("2 : neu da thanh toan");
            System.out.println("moi chon ");
            int chon = scanner.nextInt();
            switch (chon){
                case 1 :
                    System.out.println("bill chua thanh toan");
                    isPaid = false;
                    contuneu = false;
                    break;
                case 2 :
                    System.out.println("bill da duoc thanh toan");
                    isPaid = true;
                    contuneu = false;
                    break;
                default:
                    System.out.println("vui long chon 1 hoac 2 ");
            }
        }while (contuneu);
    }

    public void output(){
        System.out.println("id check bill : "+ getCheckID());
        System.out.println("amount : "+ getAmount());
        System.out.println("tien tip : "+ getTip());
        System.out.println("tax : "+ getTax());
        System.out.println("ispaid : ");
        billOrder.output();
    }



    public void createBilll(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id order can in ra");
        int id = scanner.nextInt();
        Order order = new Order();
        listorder.add(order);
        for (int i = 0; i < listorder.size(); i++){
            if (listorder.get(i).getOrderID() == id){
                listorder.get(i).output();
            }
        }
    }
}
