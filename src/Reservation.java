import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Reservation {
    private int ReservationID,peopleCount;
    private Date timeOfReservation;
    private String status;
    private String notes;
    private Date checkInTime;
    private Customer cusTomer;
    private ArrayList<Notification> listNotification;

    public Reservation(int reservationID, int peopleCount, Date timeOfReservation, String status, String notes, Date checkInTime, Customer cusTomer, ArrayList<Notification> listNotification) {
        this.ReservationID = reservationID;
        this.peopleCount = peopleCount;
        this.timeOfReservation = timeOfReservation;
        this.status = status;
        this.notes = notes;
        this.checkInTime = checkInTime;
        this.cusTomer = cusTomer;
        this.listNotification = listNotification;
    }
    public Reservation() {
        this.ReservationID = 0;
        this.peopleCount = 0;
        this.timeOfReservation = new Date();
        this.status = null;
        this.notes = null;
        this.checkInTime = new Date();
        this.cusTomer = new Customer();
        this.listNotification = new ArrayList<>();
    }

    public int getReservationID() {
        return ReservationID;
    }

    public void setReservationID(int reservationID) {
        ReservationID = reservationID;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public Date getTimeOfReservation() {
        return timeOfReservation;
    }

    public void setTimeOfReservation(Date timeOfReservation) {
        this.timeOfReservation = timeOfReservation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Customer getCusTomer() {
        return cusTomer;
    }

    public void setCusTomer(Customer cusTomer) {
        this.cusTomer = cusTomer;
    }

    public ArrayList<Notification> getListNotification() {
        return listNotification;
    }

    public void setListNotification(ArrayList<Notification> listNotification) {
        this.listNotification = listNotification;
    }

    public void inPut(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ReservationID");
        ReservationID = scanner.nextInt();
        System.out.println("nhap peopleCount");
        peopleCount = scanner.nextInt();
        System.out.println("nhap notes");
        notes = scanner.nextLine();
        trangThaiStatus();
        cusTomer.inPut();
        timeOfReservation = new Date();
        checkInTime = new Date();
    }

    public void outPut(){
        System.out.println("ReservationID : "+getReservationID());
        System.out.println("peopleCount : "+getPeopleCount());
        System.out.println("timeOfReservation : "+getTimeOfReservation());
        System.out.println("status : "+getStatus());
        System.out.println("notes : "+getNotes());
        System.out.println("checkInTime : "+getCheckInTime());
        cusTomer.outPut();

    }

    public void trangThaiStatus(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi chon trang thai cua status");
        System.out.println("1 : Requested");
        System.out.println("2 : Pending");
        System.out.println("3 : Confirmed");
        System.out.println("4 : Checked-in");
        System.out.println("5 : Canceled");
        System.out.println("6 : Abandoned");
        int chon = scanner.nextInt();
        switch (chon){
            case 1 :
                status = ReservationStatus.Requested;
                break;
            case 2:
                status = ReservationStatus.Pending;
                break;
            case 3:
                status = ReservationStatus.Confirmed;
                break;
            case 4 :
                status = ReservationStatus.CheckedIn;
                break;
            case 5 :
                status = ReservationStatus.Canceled;
                break;
            case 6:
                status =ReservationStatus.Abandoned;
                break;
            default:
                System.out.println("chon sai vui long chon thu 1 den 6");
        }
    }
}
