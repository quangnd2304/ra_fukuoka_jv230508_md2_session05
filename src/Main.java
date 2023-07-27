import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ClassName objectName = new Constructor(arguments);
        //Parameter - Tham số vs Argument - Đối số
        //1. Khởi tạo đối tượng student1 mà không khởi tạo bất cứ thông tin gì của sinh viên
        Student student1 = new Student();
        //2. Khơi tạo đối tượng student2 và khởi tạo thông tin mã và tên sinh viên
        Student student2 = new Student("SV002","Nguyễn Văn B");
        //3. Khởi tạo đối tượng student3 và khởi tạo tất cả thông tin sinh viên
        Student student3 = new Student("SV003","Nguyễn Văn C",22,true,9.2F);

        //In ra mã sinh viên và tên sinh viên 3
        System.out.println("Mã và tên sinh viên 3 là: "+student3.getStudentId()+"-"+student3.getStudentName());

        //Sử dụng phương thức inputData để nhập thông tin cho sinh viên 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên 1:");
        student1.inputData(scanner);
        //Sử dụng các phương thức getter/setter nhập thông tin cho sinh viên 2
        System.out.println("Nhập thông tin cho sinh viên 2:");
        System.out.println("Nhập vào tuổi sinh viên 2: ");
        student2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào giới tính của sinh viên 2:");
        student2.setSex(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhập điểm trung bình của sinh viên 2:");
        student2.setAvgMark(Float.parseFloat(scanner.nextLine()));

        //In thông tin các sinh viên
        //Gọi phương thức của đối tượng: objectName.methodName(arguments)
        System.out.println("Thông tin sinh viên 1: ");
        student1.displayData();
        System.out.println("Thông tin sinh viên 2:");
        student2.displayData();
        System.out.println("Thông tin sinh viên 3:");
        student3.displayData();

    }
}