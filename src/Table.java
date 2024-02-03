import java.util.ArrayList;
import java.util.Scanner;

public class Table {
    private int tabLeID,maxCaPaCity,locationidentifier;
    private String status;
    private ArrayList<Order> listOrder;
    private ArrayList<TableSeat> listTableSeat;

    public Table(int tabLeID, int maxCaPaCity, int locationidentifier, String status, ArrayList<Order> listOrder, ArrayList<TableSeat> listTableSeat) {
        this.tabLeID = tabLeID;
        this.maxCaPaCity = maxCaPaCity;
        this.locationidentifier = locationidentifier;
        this.status = status;
        this.listOrder = listOrder;
        this.listTableSeat = listTableSeat;
    }
    public Table() {
        this.tabLeID = 0;
        this.maxCaPaCity = 0;
        this.locationidentifier = 0;
        this.status = null;
        this.listOrder = new ArrayList<>();
        this.listTableSeat = new ArrayList<>();
    }

    public int getTabLeID() {
        return tabLeID;
    }

    public void setTabLeID(int tabLeID) {
        this.tabLeID = tabLeID;
    }

    public int getMaxCaPaCity() {
        return maxCaPaCity;
    }

    public void setMaxCaPaCity(int maxCaPaCity) {
        this.maxCaPaCity = maxCaPaCity;
    }

    public int getLocationidentifier() {
        return locationidentifier;
    }

    public void setLocationidentifier(int locationidentifier) {
        this.locationidentifier = locationidentifier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Order> getListOrder() {
        return listOrder;
    }

    public void setListOrder(ArrayList<Order> listOrder) {
        this.listOrder = listOrder;
    }

    public ArrayList<TableSeat> getListTableSeat() {
        return listTableSeat;
    }

    public void setListTableSeat(ArrayList<TableSeat> listTableSeat) {
        this.listTableSeat = listTableSeat;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tabLeID");
        tabLeID = scanner.nextInt();
        System.out.println("nhap maxCaPaCity");
        maxCaPaCity = scanner.nextInt();
        System.out.println("nhap locationidentifier");
        locationidentifier = scanner.nextInt();
        status = TableStatus.Other;
    }

    public void output(){
        System.out.println("tabLeID : "+getTabLeID());
        System.out.println("maxCaPaCity : "+getMaxCaPaCity());
        System.out.println("locationidentifier : "+getLocationidentifier());
        System.out.println("status : "+getStatus());
        for (int i = 0; i < listOrder.size(); i++){
            listOrder.get(i).output();
        }
        for (int i = 0; i < listTableSeat.size(); i++){
            listTableSeat.get(i).output();
        }
    }
}
