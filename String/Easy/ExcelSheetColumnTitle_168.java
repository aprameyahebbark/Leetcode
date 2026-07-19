package Easy;
import java.util.Scanner;
class ExcelSheetColumnTitle_168 {
    public String convertToTitle(int columnNumber) {
        if (columnNumber == 0) {
            return "";
        }
        columnNumber--;
        return convertToTitle(columnNumber / 26)
                + (char) ('A' + (columnNumber % 26));
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter column number: ");
        int n = sc.nextInt();
        ExcelSheetColumnTitle_168 obj = new ExcelSheetColumnTitle_168();
        String result = obj.convertToTitle(n);
        System.out.println("Excel Column Title = " + result);
        sc.close();
    }
}