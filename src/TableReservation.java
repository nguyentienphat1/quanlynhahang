public class TableReservation {
    private Table Table;
    private Reservation reserVaTion;

    public TableReservation(Table table, Reservation reserVaTion) {
        Table = table;
        this.reserVaTion = reserVaTion;
    }
    public TableReservation() {
        Table = new Table();
        this.reserVaTion = new Reservation();
    }

    public Table getTable() {
        return Table;
    }

    public void setTable(Table table) {
        Table = table;
    }

    public Reservation getReserVaTion() {
        return reserVaTion;
    }

    public void setReserVaTion(Reservation reserVaTion) {
        this.reserVaTion = reserVaTion;
    }

    public void inPut(){
        Table.input();
        reserVaTion.inPut();
    }

    public void outPut(){
        Table.output();
        reserVaTion.outPut();
    }
}
