import java.util.Scanner;

public class Account {
    private String id,password;
    private Address address;
    private String status;

    public Account(String id, String password, Address address, String status) {
        this.id = id;
        this.password = password;
        this.address = address;
        this.status = status;
    }

    public Account() {
        this.id = null;
        this.password = null;
        this.address = new Address();
        this.status = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        address.nhap();
        status = AccountStatus.Active;
        System.out.println("nhap id account");
        id = scanner.nextLine();
        System.out.println("nhap password account");
        password = scanner.nextLine();
    }

    public void output(){
        address.xuat();
        System.out.println("status : "+ getStatus());
        System.out.println("password : "+ getPassword());
    }
    public void resetPassword(){
        Scanner scanner = new Scanner(System.in);

           System.out.println("nhap password reset lai");
           String password = scanner.nextLine();
           System.out.println("nhap lai password tuong tu");
           String samePassword = scanner.nextLine();
           while (!samePassword.equals(password)){
               System.out.println("password khong trung vui long nhap lai");
               System.out.println("nhap password reset lai");
               password = scanner.nextLine();
               System.out.println("nhap lai password tuong tu");
               samePassword = scanner.nextLine();
           }
           System.out.println("da reset password thanh cong");
           setPassword(password);
    }


}

