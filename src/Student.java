import java.util.Scanner;

public class Student {
    /*1. Fields - Attributes: Mô tả đặc điểm của đối tượng
        Syntax: Access Modifier + Datatype + fieldName;
        Access Modifier: public, protected, default, private
        public: ở đâu cũng truy cập đuược
        protected, default: trong cùng package truy cập được
        private: trong cùng lớp truy cập đươc - Tính bao đóng
    */
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private float avgMark;

    /*
        2. Constructors - Hàm tạo - Khởi tạo đối tượng
        Syntax: public ClassName(params)
    * */
    //Constructor không có tham số - Không khởi tạo thông tin sinh viên - Default Constructor
    public Student() {
    }

    //Constructor có 2 tham số - khởi tạo thông tin cho mã sinh viên và tên sinh viên
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    //Constructor khởi tạo tất cả thông tin của đối tượng
    public Student(String studentId, String studentName, int age, boolean sex, float avgMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.avgMark = avgMark;
    }

    /*
     * 3. Methods - Hành vi đối tượng
     * Syntax: Access Modifier + ReturnData + methodName(params)
     * methodName: quy tắc đặt tên giống đặt tên biến
     * Trả về duy nhất 1 kiểu dữ liệu (void)    *
     * */
    //3.1. Getter/Setter: Giúp truy cập các thuộc tính từ bên ngoài
    //Lấy dữ liệu ra
    public String getStudentId() {
        return studentId;
    }

    //Gán giá trị cho thuộc tính
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    //3.2. Methods - mô tả hành vi của đối tượng
    public void hello() {
        System.out.println("Xin chào các bạn");
    }

    //Tính tổng 2 số nguyên
    public int add(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    public void talk(String name) {
        System.out.println("Hello " + name);
    }

    //Viết phương thức cho phép nhập thông tin sinh viên
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên: ");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên: ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên: ");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập điểm trung bình sinh viên: ");
        this.avgMark = Float.parseFloat(scanner.nextLine());
    }

    //Viết phương thức hiển thị thông tin sinh viên
    public void displayData() {
        System.out.printf("Mã sinh viên: %s - Tên sinh viên: %s - Tuổi: %d\n", this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính: %b - Điểm trung bình: %f\n",this.sex,this.avgMark);
    }
}
