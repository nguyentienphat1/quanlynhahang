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
        setType(TableStatus.Other);
        meal.nhap();
    }

    public void output(){
        System.out.println("tableSeatNumber la : "+getTableSeatNumber());
        System.out.println("type la : "+getType());
        meal.output();
    }
}
