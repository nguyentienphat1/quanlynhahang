import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Chef extends Employee {
    private ArrayList<Order> listOrder;

    public Chef(String name, String email, String phone, String phoneStar, int employeeID, Date dateJoined, Account accountEmployee, String employeeType, ArrayList<Order> listOrder) {
        super(name, email, phone, phoneStar, employeeID, dateJoined, accountEmployee, employeeType);
        this.listOrder = listOrder;
    }

    public Chef(int employeeID, Date dateJoined, Account accountEmployee, String employeeType, ArrayList<Order> listOrder) {
        super(employeeID, dateJoined, accountEmployee, employeeType);
        this.listOrder = listOrder;
    }

    public Chef(ArrayList<Order> listOrder) {
        this.listOrder = listOrder;
    }
    public Chef() {
        this.listOrder = new ArrayList<>();
    }

    public ArrayList<Order> getListOrder() {
        return listOrder;
    }

    public void setListOrder(ArrayList<Order> listOrder) {
        this.listOrder = listOrder;
    }
@Override
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id nhan vien bep");
        int id = scanner.nextInt();
        setEmployeeID(id);
        System.out.println("nhap ten nhan vien bep");
        String name = scanner.nextLine();
        setName(name);
        System.out.println("nhap so phone nhan vien bep");
        String phone = scanner.nextLine();
        setPhone(phone);
        System.out.println("nhap email nhan vien bep");
        String email = scanner.nextLine();
        setEmail(email);
        setEmployeeType(EmployeeTypeStatus.Chef);
        setDateJoined(new Date());

    }

    public void output(){
        for (int i = 0; i < listOrder.size(); i++){
            listOrder.get(i).output();
        }
//        super.output();
    }

    public boolean takeOrder(){
        Order order = new Order();
        order.input();
        listOrder.add(order);
        return true;
    }
}
