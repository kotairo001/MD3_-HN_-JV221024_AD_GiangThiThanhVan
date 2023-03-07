package exam;

import java.time.Year;
import java.util.Scanner;

public class Student {
    private String studentId;

    private String studentName;
    private int age;
    private String gender;
    private String phone;
    private String address;
    private float html;
    private float css;
    private float javascript;
    private float avgMark;

    public Student() {
    }

    ;

    public Student(String studentId, String studentName, int age, String gender, String phone, String address, float html, float css, float javascript, float avgMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.html = html;
        this.css = css;
        this.javascript = javascript;
        this.avgMark = avgMark;
    }

    public String getStudentId() {
        return studentId;
    }

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

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getHtml() {
        return html;
    }

    public void setHtml(float html) {
        this.html = html;
    }

    public float getCss() {
        return css;
    }

    public void setCss(float css) {
        this.css = css;
    }

    public float getJavascript() {
        return javascript;
    }

    public void setJavascript(float javascript) {
        this.javascript = javascript;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public float calAvgMark () {
        float avgScore = (this.html+this.css+this.javascript*2)/4;
        return avgScore;
    }

    public String displayData () {
        int year = Year.now().getValue();
        return "StudentID: " + studentId + "\n"
                + "Tên sinh viên: " + studentName + "\n"
                + "Năm sinh: " + (year - age) + "\n"
                + "Giới tính: " + gender + "\n"
                + "Điện thoại: " + phone + "\n"
                + "Địa chỉ: " + address + "\n"
                + "Điểm TB: " + calAvgMark() + "\n";
    }

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input studentID: ");
        this.studentId = input.nextLine();
        boolean checkStudentId = false;
        do {
            if (this.studentId.startsWith("RA")) {
                checkStudentId = true;
                setStudentId(this.studentId);
            } else {
                System.out.println("You need to input RA in front of the StudentID");
            }
        } while (!checkStudentId);

        System.out.println("Input student's name");
        this.studentName = input.nextLine();
        boolean checkStudentName = false;
        do {
            if (this.studentName.length() >= 5 && this.studentName.length() <= 50) {
                checkStudentName = true;
                setStudentName(this.studentName);
            } else {
                System.out.println("Student's name must have 20~50 letters");
            }
        } while (!checkStudentName);

        System.out.println("Input student's age");
        this.age = input.nextInt();
        boolean checkAge = false;
        do {
            if (this.age >= 18) {
                checkAge = true;
                setAge(this.age);
            } else {
                System.out.println("Student's name must have 20~50 letters");
            }
        } while (!checkAge);

        System.out.println("Input student's gender");
        input.nextLine();
        this.gender = input.nextLine();
        setGender(this.gender);

        System.out.println("Input student's phone");
        this.phone = input.nextLine();
        boolean checkPhone = false;
        do {
            if (this.phone.length() == 10 && this.phone.startsWith("0")) {
                checkPhone = true;
                setPhone(this.phone);
            } else {
                System.out.println("Student's phone must have 10 letters and start with 0");
            }
        } while (!checkPhone);

        System.out.println("Input student's address");
        this.address = input.nextLine();
        setAddress(this.address);

        System.out.println("Input student's html score");
        this.html = input.nextFloat();
        boolean checkHTML = false;
        do {
            if (this.html>0&&this.html<=10){
                checkHTML = true;
                setHtml(this.html);
            } else {
                System.out.println("Student's html score must have value from 1 to 10");
            }
        } while (!checkHTML);

        System.out.println("Input student's css score");
        this.css = input.nextFloat();
        boolean checkCss= false;
        do {
            if (this.css>0&&this.css<=10){
                checkCss = true;
                setCss(this.css);
            } else {
                System.out.println("Student's css score must have value from 1 to 10");
            }
        } while (!checkCss);

        System.out.println("Input student's JS score");
        this.javascript = input.nextFloat();
        boolean checkJs= false;
        do {
            if (this.javascript>0&&this.javascript<=10){
                checkJs = true;
                setJavascript(this.javascript);
            } else {
                System.out.println("Student's JS score must have value from 1 to 10");
            }
        } while (!checkJs);

    }


}