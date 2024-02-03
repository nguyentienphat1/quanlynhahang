import java.util.ArrayList;

public class Reserve {
    private ArrayList<TableReservation> listtableReservation;

    public Reserve(ArrayList<TableReservation> listtableReservation) {
        this.listtableReservation = listtableReservation;
    }
    public Reserve() {
        this.listtableReservation = new ArrayList<>();
    }

    public ArrayList<TableReservation> getListtableReservation() {
        return listtableReservation;
    }

    public void setListtableReservation(ArrayList<TableReservation> listtableReservation) {
        this.listtableReservation = listtableReservation;
    }
}
