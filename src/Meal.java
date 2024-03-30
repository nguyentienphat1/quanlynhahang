import java.util.ArrayList;
import java.util.Scanner;

public class Meal {
    private int mealID;
    private ArrayList<MealItem> listMealItem;

    public Meal(int mealID, ArrayList<MealItem> listMealItem) {
        this.mealID = mealID;
        this.listMealItem = listMealItem;
    }
    public Meal() {
        this.mealID = 0;
        this.listMealItem = new ArrayList<>();
    }

    public int getMealID() {
        return mealID;
    }

    public void setMealID(int mealID) {
        this.mealID = mealID;
    }

    public ArrayList<MealItem> getListMealItem() {
        return listMealItem;
    }

    public void setListMealItem(ArrayList<MealItem> listMealItem) {
        this.listMealItem = listMealItem;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id meal");
        mealID = scanner.nextInt();
        MealItem mealItem = new MealItem();
        mealItem.nhap();
        listMealItem.add(mealItem);
    }

    public void output(){
        System.out.println("mealID : "+getMealID());
        for (int i = 0; i < listMealItem.size(); i++){
            listMealItem.get(i).output();
        }
    }

    public boolean AddMealItem(){
        boolean contuneu = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("chon 1 de them MealItem");
            System.out.println("chon 0 de thoat");
            System.out.println("moi chon");
            int chon = scanner.nextInt();
                switch (chon){
                    case 1 :
                        MealItem mealItem = new MealItem();
                        mealItem.nhap();
                        listMealItem.add(mealItem);
                        System.out.println("them mealItemID thanh cong");
                        for (int i = 0; i < listMealItem.size(); i++){
                            listMealItem.get(i).output();
                        }
                        break;
                    case 2 :
                        System.out.println("tam biet");
                        contuneu = false;
                        break;
                    default:
                        System.out.println("chon sai xin chon lai");
                }
        }while (contuneu);
        return true;
    }
}
