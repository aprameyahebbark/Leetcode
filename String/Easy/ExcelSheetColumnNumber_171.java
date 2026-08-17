package Easy;

public class ExcelSheetColumnNumber_171 {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int value = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
    public static void main(String[] args){
        String columnTitle = "AAP";
        int result = titleToNumber(columnTitle);
        System.out.println(result);
    }
}


