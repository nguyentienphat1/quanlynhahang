import java.util.Scanner;

public class TableSeat {
    private int tableSeatNumber;
    private String type;
    private Meal meal;

    public TableSeat(int tableSeatNumber, String type, Meal meal) {
        this.tableSeatNumber = tableSeatNumber;
        this.type = type;
        this.meal = meal;
    }
    public TableSeat() {
        this.tableSeatNumber = 0;
        this.type = null;
        this.meal = new Meal();
    }

    public int getTableSeatNumber() {
        return tableSeatNumber;
    }

    public void setTableSeatNumber(int tableSeatNumber) {
        this.tableSeatNumber = tableSeatNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tableSeatNumber ");
        tableSeatNumber = scanner.nextInt();
        System.out.println("1 : Regular");
        System.out.println("2 : kid");
        System.out.println("3 : Accesible");
        System.out.println("4 : Other");
        System.out.println(" moi chon ");
        int chon = scanner.nextInt();
        switch (chon){
            case 1:
                setType(SeatType.Regular);
                break;
            case 2:
                setType(SeatType.kid);
                break;
            case 3:
                setType(SeatType.Accesible);
                break;
            case 4:
                setType(SeatType.Other);
                break;
            default:
                System.out.println("vui long chon tu 1 den 4");
        }
        meal.nhap();
    }

    public void output(){
        System.out.println("tableSeatNumber la : "+getTableSeatNumber());
        System.out.println("type la : "+getType());
        meal.output();
    }
}
