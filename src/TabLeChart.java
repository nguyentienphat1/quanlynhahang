import java.sql.Blob;
import java.util.Scanner;

public class TabLeChart {
    private int tabLeChartID;
    private String tableChartlmage;

    public TabLeChart(int tabLeChartID, String tableChartlmage) {
        this.tabLeChartID = tabLeChartID;
        this.tableChartlmage = tableChartlmage;
    }
    public TabLeChart() {
        this.tabLeChartID = 0;
        this.tableChartlmage = null ;
    }

    public int getTabLeChartID() {
        return tabLeChartID;
    }

    public void setTabLeChartID(int tabLeChartID) {
        this.tabLeChartID = tabLeChartID;
    }

    public String getTableChartlmage() {
        return tableChartlmage;
    }

    public void setTableChartlmage(String tableChartlmage) {
        this.tableChartlmage = tableChartlmage;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tabLeChartID");
        tabLeChartID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhap tableChartlmage");
        tableChartlmage = scanner.nextLine();
    }

    public void outPut(){
        System.out.println("tabLeChartID : "+getTabLeChartID());
        System.out.println("tableChartlmage : "+getTableChartlmage());
    }


}
