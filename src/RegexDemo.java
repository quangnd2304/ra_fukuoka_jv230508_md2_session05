import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String strRegex = "RikkeiAcademy[0-9]{2,5}";
        System.out.println(Pattern.matches(strRegex, "RikkeiAcademy4"));
        //Bài tập ứng dụng: Viết chuỗi bắt định dạng email Quangnd5@gmail.com
        String emailRegex = "[a-zA-Z0-9]{6,}@[a-zA-Z0-9]{3,10}.[a-zA-Z]{2,3}";
        System.out.println("Email Regex: "+Pattern.matches(emailRegex,"quangnd2@rikkeisoft1.com"));
    }
}
