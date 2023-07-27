import java.util.Scanner;

public class Session04_Baitap02 {
    public static void main(String[] args) {
        //B1. Nhập chuỗi từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi:");
        String str = scanner.nextLine();
        //B2. In ra các ký tự chỉ xuất hiện duy nhất 1 lần trong chuỗi
        //2.1. Thống kê các ký tự xuất hiện trong chuỗi (Rikkeii --> R i k e) --> Lưu các ký tự vào 1 mảng arrCharacter
        //---Khởi tạo mảng arrCharacter lưu trữ các ký tự xuất hiện trong chuỗi
        char[] arrCharacter = new char[str.length()];
        //---Duyệt chuỗi str, lấy các ký tự xuất hiện trong chuỗi lưu vào mảng arrCharacter
        int arrIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            //Kiểm tra ký tự i với các ký tự sau xem có bị trùng hay không, nếu trùng không lưu, ngược thì lưu
            boolean isExist = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isExist = true;
                    break;
                }
            }
            //Không trùng --> lưu vào mảng arrCharacter
            if (!isExist) {
                arrCharacter[arrIndex] = str.charAt(i);
                arrIndex++;
            }
        }
        // R k e i
        //2.2. Thống kê tần suất xuất hiện của các ký tự trong chuỗi --> Lưu tần suất ra 1 mảng arrCountChar
        //---Khai báo mảng chứa số lần xuất hiện của từng ký tự trong chuỗi
        int[] arrCountChar = new int[arrIndex];
        //---Duyệt mảng arrCharacter - duyệt các ký tự có trong chuỗi
        for (int i = 0; i < arrIndex; i++) {
            //---Duyệt ký tự của chuỗi str để tính số lần xuất hiện
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (arrCharacter[i] == str.charAt(j)) {
                    cnt++;
                }
            }
            //Lưu tần suất xuất hiện của ký tự ra mảng arrCountChar
            arrCountChar[i] = cnt;
        }
        //2.3. Duyệt mảng arrCharacter và arrCountChar để in ra các ký tự xuất hiện 1 lần
        System.out.println("Các ký tự xuất hiện duy nhất 1 lần trong chuỗi: ");
        boolean isCheck = true;
        for (int i = 0; i < arrIndex; i++) {
            if (arrCountChar[i] == 1) {
                System.out.printf("%c\t", arrCharacter[i]);
                isCheck = false;
            }
        }
        System.out.printf("\n");
        if (isCheck){
            System.out.println("Không có ký tự nào xuất hiện 1 lần");
        }

    }
}
