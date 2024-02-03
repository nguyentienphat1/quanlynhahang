import java.util.Scanner;

public class Person {
    private String name,email;
    private String phone;
    private String phoneStar;



    public Person(String name, String email, String phone,String phoneStar) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.phoneStar = phoneStar;
    }
    public Person() {
        this.name = null;
        this.email = null;
        this.phone = null;
        this.phoneStar = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneStar() {
        return phoneStar;
    }

    public void setPhonestar(String phoneStar) {
        this.phoneStar = phoneStar;
    }

    public void inPut(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap name");
        name = scanner.nextLine();
        System.out.println("nhap email");
        email = scanner.nextLine();

        System.out.println("1 :viet nam +84");
        System.out.println("2 :usa +24");
        System.out.println("3 :anh + 56");
        System.out.println("vui long chon ma vung cua phone");
        int chon = scanner.nextInt();
        switch (chon){
            case 1 :
                setPhonestar("+84");
                break;
            case 2 :
                setPhonestar("+24");
                break;
            case 3:
                setPhonestar("+56");
                break;
            default:
                System.out.println("vui long chon tu 1 den 3");
        }
        scanner.nextLine();
        System.out.println("nhap phone");
        phone = scanner.nextLine();
    }

    public void outPut(){
        System.out.println("name : "+getName());
        System.out.println("email : "+getEmail());
        System.out.println("phone : "+getPhoneStar()+" "+getPhone());
    }
}
