import java.util.Date;

public class RecepTionist extends Employee {


    public RecepTionist(String name, String email, String phone, String phoneStar, int employeeID, Date dateJoined, Account accountEmployee, String employeeType) {
        super(name, email, phone, phoneStar, employeeID, dateJoined, accountEmployee, employeeType);
    }

    public RecepTionist(int employeeID, Date dateJoined, Account accountEmployee, String employeeType) {
        super(employeeID, dateJoined, accountEmployee, employeeType);
    }

    public RecepTionist() {
    }


}
