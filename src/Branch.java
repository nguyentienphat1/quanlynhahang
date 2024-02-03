import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    private String name;
    private Address location;
    private ArrayList<Employee> listEmployee;
    private  String asd;
    private KitChen kitchen;
    private Menu menu;
    private ArrayList<TabLeChart> tabLeCharts;

    public Branch(String name, Address location, ArrayList<Employee> listEmployee, KitChen kitchen, Menu menu,ArrayList<TabLeChart> tabLeCharts) {
        this.name = name;
        this.location = new Address();
        this.listEmployee = listEmployee;
        this.kitchen = kitchen;
        this.menu = menu;
        this.tabLeCharts = tabLeCharts;
    }
    public Branch() {
        this.name = null;
        this.location = new Address();
        this.listEmployee = new ArrayList<>();
        this.kitchen = new KitChen();
        this.menu = new Menu();
        this.tabLeCharts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public KitChen getKitchen() {
        return kitchen;
    }

    public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(ArrayList<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }

    public KitChen getKitchenBranch() {
        return kitchen;
    }

    public void setKitchen(KitChen kitchen) {
        this.kitchen = kitchen;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public ArrayList<TabLeChart> getTabLeCharts() {
        return tabLeCharts;
    }

    public void setTabLeCharts(ArrayList<TabLeChart> tabLeCharts) {
        this.tabLeCharts = tabLeCharts;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap name Branch");
        name = scanner.nextLine();
        location.nhap();
        kitchen.input();
        for (int i = 0; i < listEmployee.size();i++){
            if (listEmployee.get(i).getEmployeeType().equals(EmployeeTypeStatus.Chef)){
                kitchen.getListChef().add(listEmployee.get(i));
            }
        }
        menu.input();
    }

    public void output(){
        System.out.println("name branch : "+getName());
        for (int i = 0; i < listEmployee.size();i++){
            listEmployee.get(i).output();
        }
        location.xuat();
        kitchen.output();
        menu.output();
        for (int i = 0; i < tabLeCharts.size(); i++){
            tabLeCharts.get(i).outPut();
        }
    }

    public void addkitChen(){
        kitchen.input();
    }
}
