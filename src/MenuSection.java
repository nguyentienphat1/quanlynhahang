
import java.util.ArrayList;
import java.util.Scanner;

public class MenuSection {
    private int menuSectionID;
    private String titLe, desCription;
    private ArrayList<MenuItem> listMenuItem;

    public MenuSection(int menuSectionID, String titLe, String desCription, ArrayList<MenuItem> listMenuItem) {
        this.menuSectionID = menuSectionID;
        this.titLe = titLe;
        this.desCription = desCription;
        this.listMenuItem = listMenuItem;
    }

    public MenuSection() {
        this.menuSectionID = 0;
        this.titLe = null;
        this.desCription = null;

        this.listMenuItem = new ArrayList<>();
    }

    public int getMenuSectionID() {
        return menuSectionID;
    }

    public void setMenuSectionID(int menuSectionID) {
        this.menuSectionID = menuSectionID;
    }

    public String getTitLe() {
        return titLe;
    }

    public void setTitLe(String titLe) {
        this.titLe = titLe;
    }

    public String getDesCription() {
        return desCription;
    }

    public void setDesCription(String desCription) {
        this.desCription = desCription;
    }

    public ArrayList<MenuItem> getListMenuItem() {
        return listMenuItem;
    }

    public void setListMenuItem(ArrayList<MenuItem> listMenuItem) {
        this.listMenuItem = listMenuItem;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap menuSectionID");
        menuSectionID = scanner.nextInt();
        System.out.println(" nhap titLe");
        scanner.nextLine();
        titLe = scanner.nextLine();
        System.out.println("nhap desCription");
        desCription = scanner.nextLine();
    }

    public void output(){
        System.out.println("menuSectionID : "+getMenuSectionID());
        System.out.println("titLe Menu section : "+getTitLe());
        System.out.println("desCription menu section : "+getDesCription());
        for (int i = 0; i < listMenuItem.size(); i++){
            listMenuItem.get(i).output();
        }
    }

    public void addMenuItem(){
        Scanner scanner = new Scanner(System.in);
        MenuItem menuItem = new MenuItem();
        menuItem.nhap();
        for (int i = 0; i < listMenuItem.size(); i++){
            while (listMenuItem.get(i).getMenuItemID() == menuItem.getMenuItemID()){
                System.out.println("id bi trung xin moi nhap lai");
                int id = scanner.nextInt();
                menuItem.setMenuItemID(id);
            }
        }
        listMenuItem.add(menuItem);
    }
}
