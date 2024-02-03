import java.util.ArrayList;
import java.util.Scanner;

public class RestauRant {
    private String name;
    ArrayList<Branch> listBranch;

    public RestauRant(String name, ArrayList<Branch> listBranch) {
        this.name = name;
        this.listBranch = listBranch;
    }
    public RestauRant() {
        this.name = null;
        this.listBranch = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Branch> getListBranch() {
        return listBranch;
    }

    public void setListBranch(ArrayList<Branch> listBranch) {
        this.listBranch = listBranch;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap name restaurant");
        name = scanner.nextLine();
        Branch branch = new Branch();
        branch.input();
        listBranch.add(branch);
    }

    public void output(){
        System.out.println("name restaurant : "+getName());
        for (int i = 0; i < listBranch.size();i++){
            listBranch.get(i).output();
        }
    }

    public void addBranch(){
        Branch branch = new Branch();
        branch.input();
        listBranch.add(branch);
    }
}
