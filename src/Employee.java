import java.util.Date;
import java.util.Scanner;

public  class Employee extends Person {
    private int employeeID;
    private Date dateJoined;
    private Account accountEmployee;
    private String employeeType;
    private String nameBranch;

    public Employee(String name, String email, String phone, String phoneStar, int employeeID, Date dateJoined, Account accountEmployee, String employeeType, String nameBranch) {
        super(name, email, phone, phoneStar);
        this.employeeID = employeeID;
        this.dateJoined = dateJoined;
        this.accountEmployee = accountEmployee;
        this.employeeType = employeeType;
        this.nameBranch = nameBranch;
    }


    public Employee(int employeeID, Date dateJoined, Account accountEmployee, String employeeType) {
        this.employeeID = employeeID;
        this.dateJoined = dateJoined;
        this.accountEmployee = accountEmployee;
        this.employeeType = employeeType;
    }
    public Employee() {
        this.employeeID = 0;
        this.dateJoined = new Date();
        this.accountEmployee = new Account();
        this.employeeType = null;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public Account getAccountEmployee() {
        return accountEmployee;
    }

    public void setAccountEmployee(Account accountEmployee) {
        this.accountEmployee = accountEmployee;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id employee");
        employeeID = scanner.nextInt();
        super.inPut();
        dateJoined = new Date();
        accountEmployee.nhap();
    }

    public void output(){
        super.outPut();
        System.out.println("employeeID : " + getEmployeeID());
        System.out.println("date : "+getDateJoined());
        System.out.println("employeeType : "+getEmployeeType());
        accountEmployee.output();
    }


}
