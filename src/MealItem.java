import java.util.Scanner;

public class MealItem {
    private int mealItemID,quanTity;

    public MealItem(int mealItemID, int quanTity) {
        this.mealItemID = mealItemID;
        this.quanTity = quanTity;
    }
    public MealItem() {
        this.mealItemID = 0;
        this.quanTity = 0;
    }

    public int getMealItemID() {
        return mealItemID;
    }

    public void setMealItemID(int mealItemID) {
        this.mealItemID = mealItemID;
    }

    public int getQuanTity() {
        return quanTity;
    }

    public void setQuanTity(int quanTity) {
        this.quanTity = quanTity;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap mealItemID");
        mealItemID = scanner.nextInt();
        System.out.println("nhap quantity");
        quanTity = scanner.nextInt();
    }

    public void output(){
        System.out.println("mealItemID : "+getMealItemID());
        System.out.println("quantity : "+getQuanTity());
    }

    public boolean updateQuantity(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap quantity can update");
        int quantity = scanner.nextInt();
        setQuanTity(quantity);
        System.out.println("da update quantity thanh cong");
        return true;
    }
}
