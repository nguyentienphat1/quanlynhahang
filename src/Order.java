import java.util.Scanner;

public class Order {
    private int OrderID;
    private Waiter waiTer;
    private Chef chef;
    private String Status;
    private Table tabLe;
    private Meal meal;

    public Order(int orderID, Waiter waiTer, Chef chef, String status, Table tabLe, Meal meal) {
        this.OrderID = orderID;
        this.waiTer = waiTer;
        this.chef = chef;
        this.Status = status;
        this.tabLe = tabLe;
        this.meal = meal;
    }
    public Order() {
        this.OrderID = 0;
        this.waiTer = new Waiter();
        this.chef = new Chef();
        this.Status = null;
        this.tabLe = new Table();
        this.meal = new Meal();
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public Waiter getWaiTer() {
        return waiTer;
    }

    public void setWaiTer(Waiter waiTer) {
        this.waiTer = waiTer;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Table getTabLe() {
        return tabLe;
    }

    public void setTabLe(Table tabLe) {
        this.tabLe = tabLe;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap oderID");
        OrderID = scanner.nextInt();
        Status = OrderStatus.None;
        chef.input();
        System.out.println("nhap id ban can order");
        int id = scanner.nextInt();
        tabLe.setTabLeID(id);
        meal.nhap();
    }

    public void output(){
        System.out.println("oderID : "+getOrderID());
        System.out.println("status : "+getStatus());
        waiTer.output();
        chef.output();
        System.out.println("id ban :"+ tabLe.getTabLeID());
        meal.output();
    }

    public boolean addMeal(){
        meal.nhap();
        return true;
    }

    public boolean removeMeal() {
        for (int i = 0; i < meal.getListMealItem().size(); i++) {
            meal.getListMealItem().remove(meal);
            }
            return true;
        }

        public OrderStatus SetStatus () {
            Scanner scanner = new Scanner(System.in);
            boolean contuneu = true;
            do {
                System.out.println("1 : Received");
                System.out.println("2 : Preparing");
                System.out.println("3 : Complete");
                System.out.println("4 : Canceled");
                System.out.println("5 : None");
                System.out.println(" moi chon");
                int chon = scanner.nextInt();
                switch (chon) {
                    case 1:
                        setStatus(OrderStatus.Received);
                        contuneu = false;
                        break;
                    case 2:
                        setStatus(OrderStatus.Preparing);
                        contuneu = false;
                        break;
                    case 3:
                        setStatus(OrderStatus.Complete);
                        contuneu = false;
                        break;
                    case 4:
                        setStatus(OrderStatus.Canceled);
                        contuneu = false;
                        break;
                    case 5:
                        setStatus(OrderStatus.None);
                        contuneu = false;
                        break;
                    default:
                        System.out.println("chi co the chon tu 1 den 5");
                }
            } while (contuneu);
            return SetStatus();
        }

}
