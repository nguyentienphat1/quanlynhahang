import java.util.ArrayList;
import java.util.Scanner;

public class KitChen {
    private String name;
    private ArrayList<Employee> listChef;

    public KitChen(String name, ArrayList<Employee> listChef) {
        this.name = name;
        this.listChef = listChef;
    }
    public KitChen() {
        this.name = null;
        this.listChef = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getListChef() {
        return listChef;
    }

    public void setListChef(ArrayList<Employee> listChef) {
        this.listChef = listChef;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap name kitchen");
        name = scanner.nextLine();
    }

    public void output(){
        System.out.println("name kitchen : "+getName());
        for (int i = 0; i < listChef.size(); i++){
            System.out.println(listChef.get(i));
        }

    }

    public void addChef(){
        Chef chef = new Chef();
        chef.input();
        listChef.add(chef);
    }

//    public boolean assigChef(){
//        Chef chef = new Chef();
//        Scanner scanner = new Scanner(System.in);
//       if (chef.getListOrder() == null){
//           return false;
//       }
//       else {
//           System.out.println("nhap id order can tim kiem");
//           int id = scanner.nextInt();
//           for (int i = 0; i < listChef.size();i++){
//              for (int j = 0; j < chef.getListOrder().size(); j++){
//                  if (chef.getListOrder().get(j).getOrderID() == id){
//                      System.out.println("id nhan vien bep " +listChef.get(i).getListOrder().get(j).getChef().getEmployeeID());
//                      System.out.println("ten nhan vien bep "+listChef.get(i).getListOrder().get(j).getChef().getName());
//                  }
//              }
//           }
//       }
//        return true;
//    }
}
