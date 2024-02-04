import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private int menuId;
    private String titLe,desCription;
    private ArrayList<MenuSection> listMEnuSection;

    public Menu(int menuId, String titLe, String desCription, ArrayList<MenuSection> listMEnuSection) {
        this.menuId = menuId;
        this.titLe = titLe;
        this.desCription = desCription;
        this.listMEnuSection = listMEnuSection;
    }
    public Menu() {
        this.menuId = 0;
        this.titLe = null;
        this.desCription = null;
        this.listMEnuSection = new ArrayList<>();
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
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

    public ArrayList<MenuSection> getListMEnuSection() {
        return listMEnuSection;
    }

    public void setListMEnuSection(ArrayList<MenuSection> listMEnuSection) {
        this.listMEnuSection = listMEnuSection;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap menuID");
        menuId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhap title");
        titLe = scanner.nextLine();

        System.out.println("nhap description");
        desCription = scanner.nextLine();
    }

    public void output(){
        System.out.println("menuID : "+getMenuId());
        System.out.println("title Menu : "+getTitLe());
        System.out.println("description : "+getDesCription());
        for (int i =0; i < listMEnuSection.size(); i++){
            listMEnuSection.get(i).output();
        }
    }

    public void addMenusecsion(){
        Scanner scanner = new Scanner(System.in);
        MenuSection menuSection = new MenuSection();
        menuSection.nhap();
        for (int i = 0; i < listMEnuSection.size(); i++){
            while (listMEnuSection.get(i).getMenuSectionID() == menuSection.getMenuSectionID()){
                System.out.println(" id bi trung vui long nhap lai");
                int id = scanner.nextInt();
                menuSection.setMenuSectionID(id);
            }
        }
        listMEnuSection.add(menuSection);
    }
}
