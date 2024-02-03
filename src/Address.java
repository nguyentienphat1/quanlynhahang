import java.util.Scanner;

public class Address {
    private String StreetAddress,city,State,zipCode,counTry;

    public Address(String StreetAddress, String city, String state, String zipCode, String counTry) {
        this.StreetAddress = StreetAddress;
        this.city = city;
        this.State = state;
        this.zipCode = zipCode;
        this.counTry = counTry;
    }

    public Address() {
        this.StreetAddress = null;
        this.city = null;
        this.State = null;
        this.zipCode = null;
        this.counTry = null;
    }

    public String getSTreetAddress() {
        return StreetAddress;
    }

    public void setSTreetAddress(String StreetAddress) {
        this.StreetAddress = StreetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCounTry() {
        return counTry;
    }

    public void setCounTry(String counTry) {
        this.counTry = counTry;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap StreetAddress");
        StreetAddress = scanner.nextLine();
        System.out.println("nhap city");
        city = scanner.nextLine();
        System.out.println("nhap state");
        State = scanner.nextLine();
        System.out.println("nhap zipCode");
        zipCode = scanner.nextLine();
        System.out.println("nhap country");
        counTry = scanner.nextLine();
    }

    public void xuat(){
        System.out.println("StreetAddress : "+getSTreetAddress());
        System.out.println("city : "+getCity());
        System.out.println("state : "+getState());
        System.out.println("zipCode : "+getZipCode());
        System.out.println("country : "+getCounTry());
    }
}
