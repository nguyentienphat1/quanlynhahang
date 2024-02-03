import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Waiter extends Employee {
    private ArrayList<Order> listOrder;

    public Waiter(String name, String email, String phone, String phoneStar, int employeeID, Date dateJoined, Account accountEmployee, String employeeType, ArrayList<Order> listOrder) {
        super(name, email, phone, phoneStar, employeeID, dateJoined, accountEmployee, employeeType);
        this.listOrder = listOrder;
    }

    public Waiter(int employeeID, Date dateJoined, Account accountEmployee, String employeeType, ArrayList<Order> listOrder) {
        super(employeeID, dateJoined, accountEmployee,employeeType);
        this.listOrder = listOrder;
    }

    public Waiter(ArrayList<Order> listOrder) {
        this.listOrder = listOrder;
    }
    public Waiter() {
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
        Order order = new Order();
        order.input();
    }

    public void output(){
        super.output();
        for (int i = 0; i < listOrder.size(); i++){
            listOrder.get(i).output();
        }
    }
    public void createOrder(){
        Order order = new Order();
        order.input();
        listOrder.add(order);
    }

    public void placeOrder(){
        boolean contuneu = true;
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        do {
            System.out.println("1 : Add Meal");
            System.out.println("2 : Add order Item");
            System.out.println("0 : exit");
            System.out.println("moi chon ");
            int chon = scanner.nextInt();
            switch (chon){
                case 1:
                 order.getMeal().nhap();
                 listOrder.add(order);
                    break;
                case 2:
                   order.input();
                   listOrder.add(order);
                   break;
                case 0:
                    System.out.println("hen gap lai");
                    contuneu = false;
                    break;
                default:
                    System.out.println("chon sai xin chon lai");
            }
        }while (contuneu);
    }


}
