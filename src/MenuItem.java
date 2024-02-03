import java.util.ArrayList;
import java.util.Scanner;

public class MenuItem {
    private int menuItemID;
    private String title,desCription;
    private double Price;
    private ArrayList<MealItem>listMealItem;

    public MenuItem(int menuItemID, String title, String desCription, double price, ArrayList<MealItem> listMealItem) {
        this.menuItemID = menuItemID;
        this.title = title;
        this.desCription = desCription;
        this.Price = price;
        this.listMealItem = listMealItem;
    }
    public MenuItem() {
        this.menuItemID = 0;
        this.title = null;
        this.desCription = null;
        this.Price = 0.0;
        this.listMealItem = new ArrayList<>();
    }

    public int getMenuItemID() {
        return menuItemID;
    }

    public void setMenuItemID(int menuItemID) {
        this.menuItemID = menuItemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesCription() {
        return desCription;
    }

    public void setDesCription(String desCription) {
        this.desCription = desCription;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public ArrayList<MealItem> getListMealItem() {
        return listMealItem;
    }

    public void setListMealItem(ArrayList<MealItem> listMealItem) {
        this.listMealItem = listMealItem;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap menuItemID");
        menuItemID = scanner.nextInt();
        System.out.println("nhap title");
        scanner.nextLine();
        title = scanner.nextLine();
        System.out.println("nhap desCription");
        desCription = scanner.nextLine();
        System.out.println("nhap price");
        Price = scanner.nextDouble();
    }

    public void output(){
        System.out.println("menuItemID : "+getMenuItemID());
        System.out.println("title menu item : "+getTitle());
        System.out.println("desCription menu item : "+getDesCription());
        System.out.println("Price : "+getPrice());
        for (int i = 0; i < listMealItem.size(); i++){
            listMealItem.get(i).output();
        }
    }

    public boolean updatePrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap price can update");
        double price = scanner.nextDouble();
        setPrice(price);
        System.out.println("da update price thanh cong");
        return true;
    }
}
