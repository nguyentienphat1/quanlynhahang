import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeManager {
    private ArrayList<Employee> listemployee;
    private Employee nowEmployee;
    private ArrayList<Order> orderArrayList;
    private ArrayList<MealItem> mealItemArrayList;
    private ArrayList<MenuSection> menuSectionArrayList;
    private ArrayList<MenuItem> menuItemArrayList;
    private ArrayList<TableSeat> tableSeatArrayList;
    private ArrayList<TableReservation> tableReservationArrayList;
    private ArrayList<TabLeChart> tabLeChartArrayList;
    private RestauRant restauRant;




    public EmployeeManager(ArrayList<Employee> listemployee, Employee nowEmployee, ArrayList<Order> orderArrayList, ArrayList<MealItem> mealItemArrayList, ArrayList<MenuSection> menuSectionArrayList, ArrayList<MenuItem> menuItemArrayList
    ,ArrayList<TableSeat> tableSeatArrayList,ArrayList<TableReservation> tableReservationArrayList,ArrayList<TabLeChart> tabLeChartArrayList,RestauRant restauRant) {
        this.listemployee = listemployee;
        this.nowEmployee = nowEmployee;
        accountManager();
        this.orderArrayList = orderArrayList;
        this.mealItemArrayList = mealItemArrayList;
        this.menuSectionArrayList = menuSectionArrayList;
        this.menuItemArrayList = menuItemArrayList;
        this.tableSeatArrayList = tableSeatArrayList;
        this.tableReservationArrayList = tableReservationArrayList;
        this.tabLeChartArrayList = tabLeChartArrayList;
        this.restauRant = restauRant;
    }

    public EmployeeManager(ArrayList<Employee> listemployee) {
        this.listemployee = listemployee;
        accountManager();
    }


    public EmployeeManager() {
        this.listemployee = new ArrayList<>();
        this.nowEmployee = new Employee();
        accountManager();
        this.orderArrayList = new ArrayList<>();
        this.mealItemArrayList = new ArrayList<>();
        this.menuSectionArrayList = new ArrayList<>();
        this.menuItemArrayList = new ArrayList<>();
        this.tableSeatArrayList = new ArrayList<>();
        this.tableReservationArrayList = new ArrayList<>();
        this.tabLeChartArrayList = new ArrayList<>();
        this.restauRant = new RestauRant();
    }

    public ArrayList<Employee> getListemployee() {
        return listemployee;
    }

    public void setListemployee(ArrayList<Employee> listemployee) {
        this.listemployee = listemployee;
    }

    public Employee getNowEmployee() {
        return nowEmployee;
    }

    public void setNowEmployee(Employee nowEmployee) {
        this.nowEmployee = nowEmployee;
    }

    public ArrayList<Order> getOrderArrayList() {
        return orderArrayList;
    }

    public void setOrderArrayList(ArrayList<Order> orderArrayList) {
        this.orderArrayList = orderArrayList;
    }

    public ArrayList<MealItem> getMealItemArrayList() {
        return mealItemArrayList;
    }

    public void setMealItemArrayList(ArrayList<MealItem> mealItemArrayList) {
        this.mealItemArrayList = mealItemArrayList;
    }

    public ArrayList<MenuSection> getMenuSectionArrayList() {
        return menuSectionArrayList;
    }

    public void setMenuSectionArrayList(ArrayList<MenuSection> menuSectionArrayList) {
        this.menuSectionArrayList = menuSectionArrayList;
    }

    public ArrayList<MenuItem> getMenuItemArrayList() {
        return menuItemArrayList;
    }

    public void setMenuItemArrayList(ArrayList<MenuItem> menuItemArrayList) {
        this.menuItemArrayList = menuItemArrayList;
    }

    public ArrayList<TableSeat> getTableSeatArrayList() {
        return tableSeatArrayList;
    }

    public void setTableSeatArrayList(ArrayList<TableSeat> tableSeatArrayList) {
        this.tableSeatArrayList = tableSeatArrayList;
    }

    public ArrayList<TableReservation> getTableReservationArrayList() {
        return tableReservationArrayList;
    }

    public void setTableReservationArrayList(ArrayList<TableReservation> tableReservationArrayList) {
        this.tableReservationArrayList = tableReservationArrayList;
    }

    public ArrayList<TabLeChart> getTabLeChartArrayList() {
        return tabLeChartArrayList;
    }

    public void setTabLeChartArrayList(ArrayList<TabLeChart> tabLeChartArrayList) {
        this.tabLeChartArrayList = tabLeChartArrayList;
    }

    public void accountManager() {
        Employee employee = new Employee();
        employee.setEmployeeID(001);
        employee.setName("nguyen van a");
        employee.setEmail("nguyenvana@email.com");
        employee.setPhone("906454362");
        employee.setDateJoined(new Date());
        employee.getAccountEmployee().setStatus(AccountStatus.Active);
        employee.getAccountEmployee().getAddress().setSTreetAddress("to 4");
        employee.getAccountEmployee().getAddress().setState("thang binh");
        employee.getAccountEmployee().getAddress().setCounTry("viet nam");
        employee.getAccountEmployee().getAddress().setCity("quang nam");
        employee.getAccountEmployee().getAddress().setZipCode("700000");

        String id = "123456789";

        String password = "123456789";
        employee.setPhonestar("+84");

        employee.getAccountEmployee().setId(id);
        employee.getAccountEmployee().setPassword(password);
        employee.setEmployeeType(EmployeeTypeStatus.Manager);
        listemployee.add(employee);
    }

    public void cancelAccount(Employee nowEmployee) {
        nowEmployee.getAccountEmployee().setStatus(AccountStatus.Canceled);
    }

    public void informationRestaurant(){
        restauRant.setName("tien phat");
    }

    public boolean RegisterAnAccount(Employee employee) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("nhap lai password tuong tu");
        String samepassword = scanner.nextLine();
        while (!checkAccount(employee.getAccountEmployee().getId(), employee.getAccountEmployee().getPassword(), samepassword)) {
            System.out.println(" ");
            System.out.println("vui long nhap lai");
            System.out.println(" ");
            System.out.println("nhap id account");
            String id = scanner.nextLine();
            scanner.nextLine();
            employee.getAccountEmployee().setId(id);
            System.out.println("nhap password account");
            String password = scanner.nextLine();
            employee.getAccountEmployee().setPassword(password);
            System.out.println("nhap lai password tuong tu");
            samepassword = scanner.nextLine();
        }

        while (!checkEmailAccount(employee.getEmail())) {
            System.out.println("vui long nhap lai email");
            String email = scanner.nextLine();
            employee.setEmail(email);
        }

        while (!checkphone(employee.getPhone())) {
            System.out.println("vui long nhap lai phone");
            String phone = scanner.nextLine();
            employee.setPhone(phone);
        }

        while (!checkidEmployee(employee.getEmployeeID())) {
            System.out.println("vui long nhap lai");
            System.out.println("nhap id Employee");
            int idEmployye = scanner.nextInt();
            employee.setEmployeeID(idEmployye);
        }

        System.out.println("chao mung thanh vien moi");
        listemployee.add(employee);
        return true;
    }

    public void loginaccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap id ");
        String id = scanner.nextLine();
        System.out.println("nhap password");
        String password = scanner.nextLine();
        while (!checkAccountLogin(id, password)) {
            System.out.println("vui long nhap lai");
            System.out.println("nhap id ");
            id = scanner.nextLine();
            System.out.println("nhap password");
            password = scanner.nextLine();
        }
    }

    public boolean login() {
        System.out.println(" ");
        System.out.println("login account");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap id ");
        String id = scanner.nextLine();
        System.out.println("nhap password");
        String password = scanner.nextLine();
        while (!checkAccountLogin(id, password)) {
            System.out.println("vui long nhap lai");
            System.out.println("nhap id ");
            id = scanner.nextLine();
            System.out.println("nhap password");
            password = scanner.nextLine();
        }
        boolean tieptuc = true;

        do {
            if (nowEmployee.getEmployeeType().equals("Chef")) {
                System.out.println("chao mung den voi nha hang tien phat");
                menuChef();
            } else if (nowEmployee.getEmployeeType().equals("Waiter")) {
                System.out.println("chao mung den voi nha hang tien phat");
                menuWaiter();
            } else if (nowEmployee.getEmployeeType().equals("Recrptionist")) {
                System.out.println("chao mung den voi nha hang tien phat");
                menuRecrptionist();
            } else if (nowEmployee.getEmployeeType().equals("Manager")) {
                System.out.println("chao mung den voi nha hang tien phat");
                menuManager();
            }
            loginaccount();
        } while (tieptuc);

        return true;
    }

    public boolean checkidEmployee(int idEmployee) {
        for (int i = 0; i < listemployee.size(); i++) {
            if (idEmployee == listemployee.get(i).getEmployeeID()) {
                System.out.println("id nhan vien da ton tai ");
                return false;
            }
        }
        return true;
    }

    public boolean checkphone(String phone) {
        if (phone.length() < 9 || phone.length() > 10) {
            System.out.println("do dai phone  tu 9 den 10 ky tu");
            return false;
        }

        Pattern phonecheck = Pattern.compile("^[0-9]+$");
        if (!phonecheck.matcher(phone).find()) {
            System.out.println("vui long nhap so");
            return false;
        }
        return true;
    }

    public boolean checkEmailAccount(String email) {
        if (email == null) {
            System.out.println("email khong duoc de trong");
            return false;
        }
        if (!email.endsWith("@email.com")) {
            System.out.println("email khong kha dung");
            return false;
        }

        if (email.contains(String.valueOf(' ')) || email.contains(String.valueOf(','))) {
            System.out.println("khong duoc chua ky tu dat biet");
            return false;
        }
        int dem = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == 64) {
                dem++;
            }
            if (email.charAt(i) == 46) {
                dem++;
            }
        }
        if (dem > 2) {
            System.out.println("email khong kha dung");
            return false;
        }
        return true;
    }

    public boolean checkAccount(String id, String password, String samepassword) {
        if (id == null || password == null) {
            System.out.println(" khong duoc de trong");
            return false;
        }

        if (id.contains(String.valueOf(',')) || id.contains(String.valueOf(' ')) || id.contains(String.valueOf("."))
                || id.contains(String.valueOf('@'))) {
            System.out.println("id khong duoc chua ky tu dat biet");
            return false;
        }

        if (id.length() < 4) {
            System.out.println("id phai co do dai tren 4 ky tu ");
            return false;
        }

        if (password.length() < 4) {
            System.out.println("password phai tren 4 ky tu");
            return false;
        }


        if (password.contains(String.valueOf("@")) || password.contains(String.valueOf(" ")) || password.contains(String.valueOf(",")) ||
                password.contains(String.valueOf("."))) {
            System.out.println("password khong duoc chua ky tu dat biet");
            return false;
        }

        for (int i = 0; i < listemployee.size(); i++) {
            if (listemployee.get(i).getAccountEmployee().getId().equals(id)) {
                System.out.println("id da ton tai");
                return false;
            }

        }
        if (!password.equals(samepassword)) {
            System.out.println("password khong trung");
            return false;
        }


        return true;
    }

    public boolean checkAccountLogin(String id, String password) {
        int dem = 0;
        for (int i = 0; i < listemployee.size(); i++) {
            if (id.equals(listemployee.get(i).getAccountEmployee().getId()) && password.equals(listemployee.get(i).getAccountEmployee().getPassword()) && listemployee.get(i).getAccountEmployee().getStatus().equals(AccountStatus.Active)) {
                dem++;
                nowEmployee = listemployee.get(i);
            }
        }
        if (dem != 1) {
            System.out.println("id hoac password khong dung");
            return false;
        } else {
            return true;
        }


    }


    public void menuWaiter() {
        System.out.println("chuc mung waiter da dang nhap thanh cong");
        System.out.println("moi ban chon cac thao tac ");
        Waiter waiter = new Waiter();
        Reserve reserve = new Reserve();
        Table table = new Table();
        TableSeat tableSeat = new TableSeat();
        boolean contuneu = true;
        Menu menu = new Menu();
        Order order = new Order();
        MenuItem menuItem = new MenuItem();
        MenuSection menuSection = new MenuSection();
        Meal meal = new Meal();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1 : Add Meal");
            System.out.println("2 : Add order Item");
            System.out.println("3 : update password");
            System.out.println("4 : update information");
            System.out.println("5 : view account");
            System.out.println("6 : view menu secsion");
            System.out.println("7 : view menu");
            System.out.println("8 : view menu Item");
            System.out.println("9 : view meal");
            System.out.println("10 : view resevation");
            System.out.println("0 : cancel");
            System.out.println("moi chon ");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    meal.nhap();
                    meal.setListMealItem(mealItemArrayList);
                    break;
                case 2:
                    table.input();
                    tableSeat.input();
                    tableSeatArrayList.add(tableSeat);
                    table.setListTableSeat(tableSeatArrayList);
                    order.input();
                    orderArrayList.add(order);
                    table.setListOrder(orderArrayList);
                    waiter.setListOrder(orderArrayList);
                    break;
                case 3:
                    for (int i = 0; i < listemployee.size(); i++) {
                        if (listemployee.get(i) == nowEmployee) {
                            listemployee.get(i).getAccountEmployee().resetPassword();
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < listemployee.size(); i++) {
                        if (listemployee.get(i) == nowEmployee) {
                            System.out.println("nhap name can update");
                            scanner.nextLine();
                            String name = scanner.nextLine();
                            listemployee.get(i).setName(name);
                            System.out.println(" ");


                            System.out.println("nhap email can update");
                            scanner.nextLine();
                            String email = scanner.nextLine();
                            while (!checkEmailAccount(email)) {
                                System.out.println("vui long nhap lai email");
                                email = scanner.nextLine();
                            }
                            listemployee.get(i).setEmail(email);


                            System.out.println("nhap phone can update");
                            String phone = scanner.nextLine();
                            listemployee.get(i).setPhone(phone);
                            System.out.println(" ");


                            System.out.println("nhap StreetAddress can update");
                            scanner.nextLine();
                            String StreetAddress = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setSTreetAddress(StreetAddress);
                            System.out.println(" ");


                            System.out.println("nhap city can update");
                            String city = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setCity(city);
                            System.out.println(" ");

                            System.out.println("nhap State can update ");
                            String State = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setState(State);
                            System.out.println(" ");

                            System.out.println("nhap zipCode can update");
                            String zipCode = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setZipCode(zipCode);
                            System.out.println(" ");

                            System.out.println("nhap counTry can update");
                            String counTry = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setCounTry(counTry);
                        }
                    }
                    break;
                case 5:
                    nowEmployee.output();
                    break;
                case 6:

                    menuSection.setListMenuItem(getMenuItemArrayList());
                    menuSection.output();
                    break;
                case 7 :
                    menu.setListMEnuSection(menuSectionArrayList);
                    menu.output();
                    break;
                case 8 :

                    menuItem.setListMealItem(mealItemArrayList);
                    menuItem.output();
                    break;
                case 9 :

                    meal.setListMealItem(mealItemArrayList);
                    meal.output();
                    break;
                case 10:
                    reserve.setListtableReservation(tableReservationArrayList);
                    for (int i = 0; i < reserve.getListtableReservation().size(); i++){
                        reserve.getListtableReservation().get(i).outPut();
                    }
                    break;
                case 0:
                    nowEmployee = new Employee();
                    System.out.println("hen gap lai");
                    contuneu = false;
                    break;
                default:
                    System.out.println("chon sai xin chon lai");
                    System.out.println("vui long chon tu 0 den 3");
            }
        } while (contuneu);
    }

    public void menuChef() {
        System.out.println("chuc mung chef da dang nhap thanh cong");
        System.out.println(" moi ban chon thao tac");
        Chef chef = new Chef();
        boolean contuneu = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1 : view order");
            System.out.println("2 : view Account");
            System.out.println("3 : update password");
            System.out.println("4 : update information");
            System.out.println("0 : cancel");
            System.out.println("moi chon");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    chef.setListOrder(orderArrayList);
                    chef.output();
                    break;
                case 2:
                    nowEmployee.output();
                    break;
                case 3:
                    for (int i = 0; i < listemployee.size(); i++) {
                        if (listemployee.get(i) == nowEmployee) {
                            listemployee.get(i).getAccountEmployee().resetPassword();
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < listemployee.size(); i++) {
                        if (listemployee.get(i) == nowEmployee) {
                            System.out.println("nhap name can update");
                            scanner.nextLine();
                            String name = scanner.nextLine();
                            listemployee.get(i).setName(name);
                            System.out.println(" ");


                            System.out.println("nhap email can update");
                            scanner.nextLine();
                            String email = scanner.nextLine();
                            while (!checkEmailAccount(email)) {
                                System.out.println("vui long nhap lai email");
                                email = scanner.nextLine();
                            }
                            listemployee.get(i).setEmail(email);
                            System.out.println(" ");


                            System.out.println("nhap phone can update");
                            String phone = scanner.nextLine();
                            listemployee.get(i).setPhone(phone);
                            System.out.println(" ");


                            System.out.println("nhap StreetAddress can update");
                            scanner.nextLine();
                            String StreetAddress = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setSTreetAddress(StreetAddress);
                            System.out.println(" ");


                            System.out.println("nhap city can update");
                            String city = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setCity(city);
                            System.out.println(" ");

                            System.out.println("nhap State can update ");
                            String State = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setState(State);
                            System.out.println(" ");

                            System.out.println("nhap zipCode can update");
                            String zipCode = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setZipCode(zipCode);
                            System.out.println(" ");

                            System.out.println("nhap counTry can update");
                            String counTry = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setCounTry(counTry);
                        }
                    }
                    break;
                case 0:
                    nowEmployee = new Employee();
                    System.out.println("goodbye");
                    contuneu = false;
                    break;
                default:
                    System.out.println("vui long chon tu 0 den 3");
            }
        } while (contuneu);
    }

    public void menuRecrptionist() {
        System.out.println("chuc mung Recrptionist da dang nhap thanh cong");
        System.out.println("moi ban chon thao tac");
        TabLeChart tabLeChart = new TabLeChart();
        Reservation reservation = new Reservation();
        Branch branch = new Branch();
        TableReservation tableReservation = new TableReservation();
        Reserve reserve = new Reserve();
        boolean contuneu = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1 : view Table Chart");
            System.out.println("2 : update Table Chart");
            System.out.println("3 : reserve Table");
            System.out.println("4 : update reservation");
            System.out.println("5 : cancel reservation");
            System.out.println("6 : update password");
            System.out.println("7 :  update information");
            System.out.println("8 : view account");
            System.out.println("9 : wiew branch");
            System.out.println("0 : cancel");
            System.out.println("moi chon ");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    tabLeChart.outPut();
                    break;
                case 2:
                    System.out.println("nhap tabLeChartID ca update");
                    int tabLeChartID = scanner.nextInt();
                    tabLeChart.setTabLeChartID(tabLeChartID);
                    System.out.println("nhap tableChartlmage can update");
                    String tableChartlmage = scanner.nextLine();
                    tabLeChart.setTableChartlmage(tableChartlmage);
                    break;
                case 3:
                    tableReservation.inPut();
                    tableReservationArrayList.add(tableReservation);
                    reserve.setListtableReservation(tableReservationArrayList);
                    break;
                case 4:
                    System.out.println("nhap id can update");
                    int idreservation = scanner.nextInt();
                    for (int i = 0; i < tableReservationArrayList.size(); i++){
                        if (tableReservationArrayList.get(i).getReserVaTion().getReservationID() == idreservation){
                            System.out.println("nhap peopleCount can update");
                            int peopleCount = scanner.nextInt();
                            tableReservationArrayList.get(i).getReserVaTion().setPeopleCount(peopleCount);

                            Date timeOfReservation = new Date();
                            tableReservationArrayList.get(i).getReserVaTion().setTimeOfReservation(timeOfReservation);

                            System.out.println("1 :Requested ");
                            System.out.println("2 :Pending ");
                            System.out.println("3 :Confirmed ");
                            System.out.println("4 :Checked-in ");
                            System.out.println("5 :Canceled ");
                            System.out.println("6 : Abandoned");
                            System.out.println("moi chon");
                            int chonstatus = scanner.nextInt();
                            switch (chonstatus){
                                case 1:
                                    tableReservationArrayList.get(i).getReserVaTion().setStatus(ReservationStatus.Requested);
                                    break;
                                case 2:
                                    tableReservationArrayList.get(i).getReserVaTion().setStatus(ReservationStatus.Pending);
                                    break;
                                case 3:
                                    tableReservationArrayList.get(i).getReserVaTion().setStatus(ReservationStatus.Confirmed);
                                    break;
                                case 4:
                                    tableReservationArrayList.get(i).getReserVaTion().setStatus(ReservationStatus.CheckedIn);
                                    break;
                                case 5:
                                    tableReservationArrayList.get(i).getReserVaTion().setStatus(ReservationStatus.Canceled);
                                    break;
                                case 6:
                                    tableReservationArrayList.get(i).getReserVaTion().setStatus(ReservationStatus.Abandoned);
                                    break;
                                default:
                                    System.out.println("vui long  chon 1 den 6");

                            }

                            System.out.println("nhap notes can update");
                            String notes = scanner.nextLine();
                            tableReservationArrayList.get(i).getReserVaTion().setNotes(notes);

                            Date checkInTime = new Date();
                            tableReservationArrayList.get(i).getReserVaTion().setCheckInTime(checkInTime);

                            System.out.println("nhap ten khach hang can update");
                            String name = scanner.nextLine();
                            tableReservationArrayList.get(i).getReserVaTion().getCusTomer().setName(name);
                            System.out.println("nhap email khach hang can update");
                            String email = scanner.nextLine();
                            while (!checkEmailAccount(email)){
                                System.out.println("email sai dinh dang vui long nhap lai");
                                email = scanner.nextLine();
                            }
                            tableReservationArrayList.get(i).getReserVaTion().getCusTomer().setEmail(email);
                            System.out.println("nhap phone can update");
                            String phone = scanner.nextLine();
                            while (!checkphone(phone)){
                                System.out.println("phone sai dinh dang vui long nhap lai");
                                phone = scanner.nextLine();
                            }
                            tableReservationArrayList.get(i).getReserVaTion().getCusTomer().setPhone(phone);

                            System.out.println("nhap id table can update");
                            int idtable = scanner.nextInt();
                            tableReservationArrayList.get(i).getTable().setTabLeID(idtable);
                            System.out.println("nhap maxCaPaCity can update");
                            int maxCaPaCity = scanner.nextInt();
                            tableReservationArrayList.get(i).getTable().setMaxCaPaCity(maxCaPaCity);
                            System.out.println("nhap locationidentifier can update");
                            int locationidentifier = scanner.nextInt();
                            tableReservationArrayList.get(i).getTable().setLocationidentifier(locationidentifier);
                            System.out.println(" 1: Free");
                            System.out.println(" 2: Reserved");
                            System.out.println(" 3: Occupied");
                            System.out.println(" 4: Other");
                            System.out.println(" vui long chon tu 1 den 4");
                            int chontable = scanner.nextInt();
                            switch (chontable){
                                case 1:
                                    tableReservationArrayList.get(i).getTable().setStatus(TableStatus.Free);
                                    break;
                                case 2:
                                    tableReservationArrayList.get(i).getTable().setStatus(TableStatus.Reserved);
                                    break;
                                case 3:
                                    tableReservationArrayList.get(i).getTable().setStatus(TableStatus.Occupied);
                                    break;
                                case 4:
                                    tableReservationArrayList.get(i).getTable().setStatus(TableStatus.Other);
                                    break;
                                default:
                                    System.out.println("vui long chon 1 tu den 4");
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("nhap id can cancel");
                    int idupdate = scanner.nextInt();
                    for (int i =0; i < tableReservationArrayList.size(); i++){
                        if (tableReservationArrayList.get(i).getReserVaTion().getReservationID() == idupdate){
                            tableReservationArrayList.get(i).getReserVaTion().setStatus(ReservationStatus.Canceled);
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < listemployee.size(); i++) {
                        if (listemployee.get(i) == nowEmployee) {
                            listemployee.get(i).getAccountEmployee().resetPassword();
                        }
                    }
                    break;
                case 7:
                    for (int i = 0; i < listemployee.size(); i++) {
                        if (listemployee.get(i) == nowEmployee) {
                            System.out.println("nhap name can update");
                            scanner.nextLine();
                            String name = scanner.nextLine();
                            listemployee.get(i).setName(name);
                            System.out.println(" ");


                            System.out.println("nhap email can update");
                            scanner.nextLine();
                            String email = scanner.nextLine();
                            while (!checkEmailAccount(email)) {
                                System.out.println("vui long nhap lai email");
                                email = scanner.nextLine();
                            }
                            listemployee.get(i).setEmail(email);
                            System.out.println(" ");


                            System.out.println("nhap phone can update");
                            String phone = scanner.nextLine();
                            listemployee.get(i).setPhone(phone);
                            System.out.println(" ");


                            System.out.println("nhap StreetAddress can update");
                            scanner.nextLine();
                            String StreetAddress = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setSTreetAddress(StreetAddress);
                            System.out.println(" ");


                            System.out.println("nhap city can update");
                            String city = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setCity(city);
                            System.out.println(" ");

                            System.out.println("nhap State can update ");
                            String State = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setState(State);
                            System.out.println(" ");

                            System.out.println("nhap zipCode can update");
                            String zipCode = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setZipCode(zipCode);
                            System.out.println(" ");

                            System.out.println("nhap counTry can update");
                            String counTry = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setCounTry(counTry);
                        }
                    }
                    break;
                case 8:
                    nowEmployee.output();
                    break;
                case 9:
                    branch.setTabLeCharts(tabLeChartArrayList);
                    branch.output();
                case 0:
                    nowEmployee = new Employee();
                    System.out.println("goodbye");
                    contuneu = false;
                    break;
                default:
                    System.out.println("vui long chon tu 0 den 7");
            }
        } while (contuneu);
    }

    public void menuManager() {
        System.out.println("chuc mung manager da dang nhap thanh cong");
        System.out.println("moi chon thao tac");
        Menu menu = new Menu();
        MenuSection menuSection = new MenuSection();
        MenuItem menuItem = new MenuItem();
        Meal meal = new Meal();
        MealItem mealItem = new MealItem();
        Order order = new Order();
        TabLeChart tabLeChart = new TabLeChart();
        Employee employee = new Employee();
        Reserve reserve = new Reserve();
        TableReservation tableReservation = new TableReservation();
        Table table = new Table();
        TableSeat tableSeat = new TableSeat();
        boolean contuneu = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1 : add menu function");
            System.out.println("2 : Modify Menu function");
            System.out.println("3 : Add Table chart");
            System.out.println("4 : Update Table chart");
            System.out.println("5 : Reserve Table");
            System.out.println("6 : update Reservation");
            System.out.println("7 : cancel Reservation");
            System.out.println("8 : Update Order");
            System.out.println("9 : Issue Check");
            System.out.println("10 : View Order");
            System.out.println("11 : view Account");
            System.out.println("12 : Print Menu");
            System.out.println("13 : Process payment");
            System.out.println("14 : Place Order");
            System.out.println("15 : add account");
            System.out.println("16 : delete account");
            System.out.println("17 : update password");
            System.out.println("18 : update information");
            System.out.println("19 : update status account");
            System.out.println("20 : view meal");
            System.out.println("21 : view resevation");
            System.out.println("22 : view restaurant");
            System.out.println("23 : add branch");
            System.out.println("0 : cancel");
            int chon = scanner.nextInt();
            switch (chon) {

                case 1:
                    addMenuFunction();
                    break;
                case 2:
                    modifuMenuFunction(menu,menuSection,menuItem);
                    break;
                case 3:
                    tabLeChart.input();
                    tabLeChartArrayList.add(tabLeChart);
                    break;
                case 4:
                    System.out.println("nhap id can update");
                    int idtable = scanner.nextInt();
                    tabLeChart.setTabLeChartID(idtable);
                    System.out.println("nhap tableChartlmage");
                    String tableChartlmage = scanner.nextLine();
                    tabLeChart.setTableChartlmage(tableChartlmage);
                    break;
                case 5:
                    tableReservation.inPut();
                    tableReservationArrayList.add(tableReservation);
                    reserve.setListtableReservation(tableReservationArrayList);
                    break;
                case 6:
                    System.out.println("nhap id can update");
                    int idreservation = scanner.nextInt();
                    for (int i = 0; i < tableReservationArrayList.size(); i++){
                        if (tableReservationArrayList.get(i).getReserVaTion().getReservationID() == idreservation){
                            System.out.println("nhap peopleCount can update");
                            int peopleCount = scanner.nextInt();
                            tableReservationArrayList.get(i).getReserVaTion().setPeopleCount(peopleCount);

                            Date timeOfReservation = new Date();
                            tableReservationArrayList.get(i).getReserVaTion().setTimeOfReservation(timeOfReservation);

                            System.out.println("1 :Requested ");
                            System.out.println("2 :Pending ");
                            System.out.println("3 :Confirmed ");
                            System.out.println("4 :Checked-in ");
                            System.out.println("5 :Canceled ");
                            System.out.println("6 : Abandoned");
                            System.out.println("moi chon");
                            int chonstatus = scanner.nextInt();
                            switch (chonstatus){
                                case 1:
                                    tableReservationArrayList.get(i).getReserVaTion().setStatus(ReservationStatus.Requested);
                                    break;
                                case 2:
                                    tableReservationArrayList.get(i).getReserVaTion().setStatus(ReservationStatus.Pending);
                                    break;
                                case 3:
                                    tableReservationArrayList.get(i).getReserVaTion().setStatus(ReservationStatus.Confirmed);
                                    break;
                                case 4:
                                    tableReservationArrayList.get(i).getReserVaTion().setStatus(ReservationStatus.CheckedIn);
                                    break;
                                case 5:
                                    tableReservationArrayList.get(i).getReserVaTion().setStatus(ReservationStatus.Canceled);
                                    break;
                                case 6:
                                    tableReservationArrayList.get(i).getReserVaTion().setStatus(ReservationStatus.Abandoned);
                                    break;
                                default:
                                    System.out.println("vui long  chon 1 den 6");

                            }

                            System.out.println("nhap notes can update");
                            String notes = scanner.nextLine();
                            tableReservationArrayList.get(i).getReserVaTion().setNotes(notes);

                            Date checkInTime = new Date();
                            tableReservationArrayList.get(i).getReserVaTion().setCheckInTime(checkInTime);

                            System.out.println("nhap ten khach hang can update");
                            String name = scanner.nextLine();
                            tableReservationArrayList.get(i).getReserVaTion().getCusTomer().setName(name);
                            System.out.println("nhap email khach hang can update");
                            String email = scanner.nextLine();
                            while (!checkEmailAccount(email)){
                                System.out.println("email sai dinh dang vui long nhap lai");
                                email = scanner.nextLine();
                            }
                            tableReservationArrayList.get(i).getReserVaTion().getCusTomer().setEmail(email);
                            System.out.println("nhap phone can update");
                            String phone = scanner.nextLine();
                            while (!checkphone(phone)){
                                System.out.println("phone sai dinh dang vui long nhap lai");
                                phone = scanner.nextLine();
                            }
                            tableReservationArrayList.get(i).getReserVaTion().getCusTomer().setPhone(phone);

                            System.out.println("nhap id table can update");
                            int idupdatetable = scanner.nextInt();
                            tableReservationArrayList.get(i).getTable().setTabLeID(idupdatetable);
                            System.out.println("nhap maxCaPaCity can update");
                            int maxCaPaCity = scanner.nextInt();
                            tableReservationArrayList.get(i).getTable().setMaxCaPaCity(maxCaPaCity);
                            System.out.println("nhap locationidentifier can update");
                            int locationidentifier = scanner.nextInt();
                            tableReservationArrayList.get(i).getTable().setLocationidentifier(locationidentifier);
                            System.out.println(" 1: Free");
                            System.out.println(" 2: Reserved");
                            System.out.println(" 3: Occupied");
                            System.out.println(" 4: Other");
                            System.out.println(" vui long chon tu 1 den 4");
                            int chontable = scanner.nextInt();
                            switch (chontable){
                                case 1:
                                    tableReservationArrayList.get(i).getTable().setStatus(TableStatus.Free);
                                    break;
                                case 2:
                                    tableReservationArrayList.get(i).getTable().setStatus(TableStatus.Reserved);
                                    break;
                                case 3:
                                    tableReservationArrayList.get(i).getTable().setStatus(TableStatus.Occupied);
                                    break;
                                case 4:
                                    tableReservationArrayList.get(i).getTable().setStatus(TableStatus.Other);
                                    break;
                                default:
                                    System.out.println("vui long chon 1 tu den 4");
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("nhap id can cancel");
                    int idupdate = scanner.nextInt();
                    for (int i =0; i < tableReservationArrayList.size(); i++){
                        if (tableReservationArrayList.get(i).getReserVaTion().getReservationID() == idupdate){
                            tableReservationArrayList.get(i).getReserVaTion().setStatus(ReservationStatus.Canceled);
                        }
                    }
                    break;
                case 8:
                    System.out.println("nhap id can update order");
                    int idorder = scanner.nextInt();
                    for (int i = 0; i < orderArrayList.size(); i++){
                        if (orderArrayList.get(i).getOrderID() == idorder){

                        }
                    }
                    break;
                case 9:
                    System.out.println("Issue Check");
                    break;
                case 10:
                    order.output();
                    break;
                case 11:
                    for (int i = 0; i < listemployee.size(); i++) {
                        listemployee.get(i).output();
                    }
                    break;
                case 12:
                    menu.output();
                    break;
                case 13:
                    System.out.println("Process payment");
                    break;
                case 14:
                    PlaceOrder(meal,mealItem,menuItem,order,table,tableSeat);
                    break;
                case 15:

                    boolean contunue = true;
                    do {
                        System.out.println("1 : nhan vien Chef");
                        System.out.println("2 : nhan vien Waiter");
                        System.out.println("3 : nhan vien Recrptionist");
                        System.out.println("4 : nhan vien Manager");
                        System.out.println("moi chon loai nhan vien");
                        int chonloai = scanner.nextInt();
                        switch (chonloai) {
                            case 1:
                                employee.setEmployeeType(EmployeeTypeStatus.Chef);
                                contunue = false;
                                break;
                            case 2:
                                employee.setEmployeeType(EmployeeTypeStatus.Waiter);
                                contunue = false;
                                break;
                            case 3:
                                employee.setEmployeeType(EmployeeTypeStatus.Recrptionist);
                                contunue = false;
                                break;
                            case 4:
                                employee.setEmployeeType(EmployeeTypeStatus.Manager);
                                contunue = false;
                                break;
                            default:
                                System.out.println("ban chon sai hay chon tu 1 den 4");
                                System.out.println("vui long chon lai");
                        }
                    } while (contunue);
                    System.out.println("dang ky tai khoan");
                    employee.input();
                    RegisterAnAccount(employee);
                    if (employee.getEmployeeType().equals(EmployeeTypeStatus.Chef)) {
                        employee = new Chef();
                        ((Chef) employee).setListOrder(orderArrayList);
                    } else if (employee.getEmployeeType().equals(EmployeeTypeStatus.Waiter)) {
                        employee = new Waiter();
                        ((Waiter) employee).setListOrder(orderArrayList);
                    }
                    break;
                case 16:
                    deleteAccount();
                    break;
                case 17:
                    for (int i = 0; i < listemployee.size(); i++) {
                        if (listemployee.get(i) == nowEmployee) {
                            listemployee.get(i).getAccountEmployee().resetPassword();
                        }
                    }
                    break;
                case 18:
                    System.out.println("nhap id account can update");
                    int id = scanner.nextInt();
                    for (int i = 0; i < listemployee.size(); i++) {
                        if (listemployee.get(i).getEmployeeID() == id) {
                            System.out.println("nhap name can update");
                            scanner.nextLine();
                            String name = scanner.nextLine();
                            listemployee.get(i).setName(name);
                            System.out.println(" ");


                            System.out.println("nhap email can update");
                            String email = scanner.nextLine();
                            while (!checkEmailAccount(email)) {
                                System.out.println("vui long nhap lai email");
                                email = scanner.nextLine();
                            }
                            listemployee.get(i).setEmail(email);
                            System.out.println(" ");
                            scanner.nextLine();

                            System.out.println("nhap phone can update");
                            String phone = scanner.nextLine();
                            listemployee.get(i).setPhone(phone);
                            System.out.println(" ");

                            System.out.println("1 : nhan vien Chef");
                            System.out.println("2 : nhan vien Waiter");
                            System.out.println("3 : nhan vien Recrptionist");
                            System.out.println("4 : nhan vien Manager");
                            System.out.println("moi chon loai nhan vien");
                            int chonEmployeeType = scanner.nextInt();
                            switch (chonEmployeeType) {
                                case 1:
                                    listemployee.get(i).setEmployeeType(EmployeeTypeStatus.Chef);
                                    break;
                                case 2:
                                    listemployee.get(i).setEmployeeType(EmployeeTypeStatus.Waiter);
                                    break;
                                case 3:
                                    listemployee.get(i).setEmployeeType(EmployeeTypeStatus.Recrptionist);
                                    break;
                                case 4:
                                    listemployee.get(i).setEmployeeType(EmployeeTypeStatus.Manager);
                                    break;
                                default:
                                    System.out.println("vui long chon 1 den 4");
                                    break;
                            }

                            System.out.println("nhap StreetAddress can update");
                            scanner.nextLine();
                            String StreetAddress = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setSTreetAddress(StreetAddress);
                            System.out.println(" ");

                            System.out.println("nhap city can update");
                            String city = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setCity(city);
                            System.out.println(" ");

                            System.out.println("nhap State can update ");
                            String State = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setState(State);
                            System.out.println(" ");

                            System.out.println("nhap zipCode can update");
                            String zipCode = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setZipCode(zipCode);
                            System.out.println(" ");

                            System.out.println("nhap counTry can update");
                            String counTry = scanner.nextLine();
                            listemployee.get(i).getAccountEmployee().getAddress().setCounTry(counTry);

                        }
                    }
                    break;
                case 19:
                    System.out.println("nhap id nhan vien can update ");
                    int idCheck = scanner.nextInt();
                    for (int i = 0; i < listemployee.size(); i++) {
                        if (listemployee.get(i).getEmployeeID() == idCheck) {
                            int chonstatus = scanner.nextInt();
                            System.out.println("moi chon cac thay doi sau");
                            System.out.println("1 : Active");
                            System.out.println("2 : Closed");
                            System.out.println("3 : Canceled");
                            System.out.println("4 : Blacklisted");
                            switch (chonstatus) {
                                case 1:
                                    listemployee.get(i).getAccountEmployee().setStatus(AccountStatus.Active);
                                    break;
                                case 2:
                                    listemployee.get(i).getAccountEmployee().setStatus(AccountStatus.Closed);
                                    break;
                                case 3:
                                    listemployee.get(i).getAccountEmployee().setStatus(AccountStatus.Canceled);
                                    break;
                                case 4:
                                    listemployee.get(i).getAccountEmployee().setStatus(AccountStatus.Blacklisted);
                                    break;
                                default:
                                    System.out.println("vui long chon tu 1 den 4");
                            }
                        }
                    }
                    break;
                case 20:
                    meal.output();
                    break;
                case 21:
                    reserve.setListtableReservation(tableReservationArrayList);
                    for (int i = 0; i < reserve.getListtableReservation().size(); i++){
                        reserve.getListtableReservation().get(i).outPut();
                    }
                    break;
                case 22:
                    restauRant.output();
                    break;
                case 23:

                case 0:
                    nowEmployee = new Employee();
                    System.out.println("goodbye");
                    contuneu = false;
                    break;
                default:
                    System.out.println("vui long hon tu 0 den 19");
            }
        } while (contuneu);
    }

    public void PlaceOrder(Meal meal, MealItem mealItem, MenuItem menuItem,Order order,Table table,TableSeat tableSeat) {
        boolean contuneu = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1 : Add Meal");
            System.out.println("2 : Add order Item");
            System.out.println("3 : add Meal Item");
            System.out.println("0 : exit");
            System.out.println("moi chon ");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    meal.nhap();
                    break;
                case 2:
                    table.input();
                    tableSeat.input();
                    tableSeatArrayList.add(tableSeat);
                    table.setListTableSeat(tableSeatArrayList);
                    order.input();
                    orderArrayList.add(order);
                    table.setListOrder(orderArrayList);
                    break;
                case 3:
                    mealItem.nhap();
                    getMealItemArrayList().add(mealItem);
                    meal.setListMealItem(getMealItemArrayList());
                    menuItem.setListMealItem(getMealItemArrayList());
                case 0:
                    System.out.println("hen gap lai");
                    contuneu = false;
                    break;
                default:
                    System.out.println("chon sai xin chon lai");
            }
        } while (contuneu);
    }

    public void addMenuFunction() {
        Scanner scanner = new Scanner(System.in);
        boolean contunue = true;
        do {
            System.out.println("1 : Add Menu");
            System.out.println("2 : Add Menu Section");
            System.out.println("3 : Add Menu Item");
            System.out.println("4 : Register new account");
            System.out.println("0 : exit");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Add Menu");
                    break;
                case 2:
                    System.out.println(" Add Menu Section");
                    break;
                case 3:
                    System.out.println("Add Menu Item");
                    break;
                case 4:
                    System.out.println("Register new account");
                    break;
                case 0:
                    System.out.println("tam biet");
                    contunue = false;
                    break;
                default:
                    System.out.println("vui long chon 0 den 4");
            }
        } while (contunue);
    }

    public void modifuMenuFunction(Menu menu, MenuSection menuSection, MenuItem menuItem) {
        Scanner scanner = new Scanner(System.in);
        boolean next = true;
        do {
            System.out.println("1 : Modify Menu ");
            System.out.println("2 : Modify Menu Section");
            System.out.println("3 : Modify Menu item");
            System.out.println("4 : Cancel account");
            System.out.println("0 : exit");
            int chonmodify = scanner.nextInt();
            switch (chonmodify) {
                case 1:
                    System.out.println("moi update title");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    menu.setTitLe(title);
                    System.out.println("moi update description");
                    String description = scanner.nextLine();
                    menu.setDesCription(description);
                    break;
                case 2:
                    System.out.println("1 : add menu secsion");
                    System.out.println("2 : update menu secsion");
                    System.out.println("3 : delete menu secsion");
                    System.out.println(" moi chon");
                    int chonMenuSecsion = scanner.nextInt();
                    switch (chonMenuSecsion){
                        case 1:
                           menuSection.nhap();
                           menuSectionArrayList.add(menuSection);
                           menu.setListMEnuSection(menuSectionArrayList);
                           break;
                        case 2 :
                            System.out.println("moi nhap id can update");
                            int idupdate = scanner.nextInt();
                            for (int i = 0; i < menu.getListMEnuSection().size(); i++){
                                if (menu.getListMEnuSection().get(i).getMenuSectionID() == idupdate){
                                    String titLe = scanner.nextLine();
                                    menu.getListMEnuSection().get(i).setTitLe(titLe);
                                    String descripTion = scanner.nextLine();
                                    menu.getListMEnuSection().get(i).setDesCription(descripTion);
                                }
                            }
                            break;
                        case 3:
                            System.out.println(" moi nhap id can delete");
                            int iddelete = scanner.nextInt();
                            for (int i = 0; i < menu.getListMEnuSection().size(); i++){
                                if (menu.getListMEnuSection().get(i).getMenuSectionID() == iddelete){
                                    menu.getListMEnuSection().remove(i);
                                }
                            }
                            break;
                        default:
                            System.out.println("vui long chon 1 den 3");
                    }
                    break;
                case 3:
                    System.out.println("1 : add menu item");
                    System.out.println("2 : update menu item");
                    System.out.println("3 : delete menu item");
                    System.out.println(" moi chon");
                    int chonMenuItem = scanner.nextInt();
                    switch (chonMenuItem){
                        case 1:
                            menuItem.nhap();
                            menuItemArrayList.add(menuItem);
                            menuSection.setListMenuItem(menuItemArrayList);
                            break;
                        case 2:
                            System.out.println("nhap id menu secsion can update");
                            int idmenusecsion = scanner.nextInt();
                            System.out.println("moi nhap id can update");
                            int idMenuItem = scanner.nextInt();
                            for (int i = 0; i < menu.getListMEnuSection().size(); i++) {
                                for (int j = 0; j < menuSection.getListMenuItem().size(); j++) {
                                    if (menu.getListMEnuSection().get(i).getMenuSectionID() == idmenusecsion) {
                                        if (menuSection.getListMenuItem().get(i).getMenuItemID() == idMenuItem) {
                                            System.out.println("moi update title");
                                            String titeleMenuItem = scanner.nextLine();
                                            menuSection.getListMenuItem().get(i).setTitle(titeleMenuItem);
                                            System.out.println("moi update description");
                                            String descriptionMenuItem = scanner.nextLine();
                                            menuSection.getListMenuItem().get(i).setDesCription(descriptionMenuItem);
                                            System.out.println(" moi update prince");
                                            double price = scanner.nextDouble();
                                            menuSection.getListMenuItem().get(i).setPrice(price);
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.println("moi nhap id can dalete");
                            int iddelateMenuItem = scanner.nextInt();
                            for (int i = 0; i < menuSection.getListMenuItem().size(); i++){
                                if (menuSection.getListMenuItem().get(i).getMenuItemID() == iddelateMenuItem){
                                    menuSection.getListMenuItem().remove(i);
                                }
                            }
                            break;
                        default:
                            System.out.println("vui long chon tu 1 den 3");
                    }
                    break;
                case 4:
                    System.out.println("4 : Cancel account");
                    break;
                case 0:
                    System.out.println("tam biet");
                    next = false;
                    break;
                default:
                    System.out.println("vui long chon 0 den 4");
            }
        } while (next);
    }

    public void deleteAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id can xoa ");
        String id = scanner.nextLine();
        for (int i = 0; i < listemployee.size(); i++) {
            if (listemployee.get(i).getAccountEmployee().getId().equals(id)) {
                listemployee.get(i).getAccountEmployee().setStatus(AccountStatus.Closed);
            }
        }
    }
}