import java.util.Scanner;

public class Session04_Baitap07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi");
        String str = scanner.nextLine();
        System.out.println("Chuoi sau khi loai bo ky tu trung lap: ");
        for (int i = 0; i < str.length(); i++) {
            if (i>0) {
                boolean isDuplicate = false;
                for (int j = i - 1; j >=0; j--) {
                    if (str.charAt(i)==str.charAt(j)){
                        isDuplicate = true;
                    }
                }
                if (!isDuplicate){
                    System.out.printf("%c\t",str.charAt(i));
                }
            }else{
                System.out.printf("%c\t",str.charAt(i));
            }
        }
        System.out.printf("\n");
    }
}
