import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Manager extends Employee {
    private ArrayList<EmployeeManager> listEmployeeManager;

    public Manager(String name, String email, String phone, String phoneStar, int employeeID, Date dateJoined, Account accountEmployee, String employeeType, ArrayList<EmployeeManager> listEmployeeManager) {
        super(name, email, phone, phoneStar, employeeID, dateJoined, accountEmployee, employeeType);
        this.listEmployeeManager = listEmployeeManager;
    }

    public Manager(int employeeID, Date dateJoined, Account accountEmployee, String employeeType, ArrayList<EmployeeManager> listEmployeeManager) {
        super(employeeID, dateJoined, accountEmployee,employeeType);
        this.listEmployeeManager = listEmployeeManager;
    }

    public Manager(ArrayList<EmployeeManager> listEmployeeManager) {
        this.listEmployeeManager = listEmployeeManager;
    }
    public Manager() {
        this.listEmployeeManager = new ArrayList<>();
    }

    public ArrayList<EmployeeManager> getListEmployeeManager() {
        return listEmployeeManager;
    }

    public void setListEmployeeManager(ArrayList<EmployeeManager> listEmployeeManager) {
        this.listEmployeeManager = listEmployeeManager;
    }

    public boolean updateEmployeeManager(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id can tim kiem");
        String id = scanner.nextLine();
        for (int i = 0; i < listEmployeeManager.size(); i++){
            if (listEmployeeManager.get(i).getListemployee().get(i).getAccountEmployee().getId().equals(id)){
                System.out.println("nhap employeeType can update");
                String employeeType = scanner.nextLine();
                listEmployeeManager.get(i).getListemployee().get(i).setEmployeeType(employeeType);

                System.out.println("nhap StreetAddress can update");
                String StreetAddress = scanner.nextLine();
                listEmployeeManager.get(i).getListemployee().get(i).getAccountEmployee().getAddress().setSTreetAddress(StreetAddress);

                System.out.println("nhap city can update");
                String city = scanner.nextLine();
                listEmployeeManager.get(i).getListemployee().get(i).getAccountEmployee().getAddress().setCity(city);

                System.out.println("nhap state can update");
                String state = scanner.nextLine();
                listEmployeeManager.get(i).getListemployee().get(i).getAccountEmployee().getAddress().setState(state);

                System.out.println("nhap zipcode ca update");
                String zipCode = scanner.nextLine();
                listEmployeeManager.get(i).getListemployee().get(i).getAccountEmployee().getAddress().setZipCode(zipCode);

                System.out.println("nhap country can update");
                String counTry = scanner.nextLine();
                listEmployeeManager.get(i).getListemployee().get(i).getAccountEmployee().getAddress().setCounTry(counTry);

                System.out.println("nhap status can update");
                String status = scanner.nextLine();
                listEmployeeManager.get(i).getListemployee().get(i).getAccountEmployee().setStatus(status);
            }
            else {
                System.out.println("khong tim thay id trung khop");
                return false;
            }
        }
        return true;
    }

    public boolean removeEmployeeManager(){
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        for (int i = 0; i < listEmployeeManager.size(); i++){
            if (listEmployeeManager.get(i).getListemployee().get(i).getAccountEmployee().getId().equals(id)){
                listEmployeeManager.remove(i);
                return true;
            }
            else {
                System.out.println("id tim kiem khong khop");
                return false;
            }
        }
        return true;
    }

    public void displayInformation(){
        for (int i = 0; i < listEmployeeManager.size(); i++){
            listEmployeeManager.get(i).getListemployee().get(i).output();
        }
    }
}
