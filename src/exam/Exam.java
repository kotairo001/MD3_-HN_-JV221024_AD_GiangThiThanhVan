package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.inputData();
//        System.out.println("Student's Information: " + "\n" + student1.displayData());

        int size = 200;
        Student obj[] = new Student[size];
        int choice = 0;
        Scanner input = new Scanner(System.in);
        boolean formInput = false;
        do {
            System.out.println("****************HACKATHON-JAVA-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập số sinh viên và nhập thông tin cho các sinh viên");
            System.out.println("2. In thông tin các sinh viên đang quản lý");
            System.out.println("3. Sắp xếp các sinh viên theo điểm trung bình tăng dần");
            System.out.println("4. Nhập vào tên sinh viên và tìm kiếm sinh viên theo tên");
            System.out.println("5. Thống kê số sinh viên nam, nữ đang quản lý");
            System.out.println("6. In ra thông tin các sinh viên xếp loại giỏi và trung bình");
            System.out.println("7. Thoát");
            System.out.println("Nhập sự lựa chọn của bạn");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng sinh viên");
                    size = input.nextInt();
                    for (int i = 0; i < size; i++) {
                        System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
                        obj[i] = new Student();
                        obj[i].inputData();
                    }
                    formInput = true;
                    ;
                    break;
                case 2:
                    if (formInput) {
                        for (int i = 0; i < size; i++) {
                            System.out.println("Thông tin sinh viên thứ " + (i + 1) + ": " + "\n" + obj[i].displayData() + "\n");
                        }
                    } else {
                        System.out.println("Không có danh sách sinh viên");

                    }
                    ;
                    break;
                case 3:
                    if (formInput) {
                        for (int i = 0; i < size - 1; i++) {
                            for (int j = i + 1; j < size; j++) {
                                if (obj[i].calAvgMark() < obj[j].calAvgMark()) {
                                    Student temp = obj[i];
                                    obj[i] = obj[j];
                                    obj[j] = temp;
                                }
                            }
                        }
                    } else {
                        System.out.println("Không có danh sách sinh viên");

                    }

                    break;
                case 4:
                    if (formInput) {
                        System.out.println("Nhập tên sinh viên cần tìm");
                        input.nextLine();
                        String name = input.nextLine();
                        for (int i = 0; i < size; i++) {
                            if (obj[i].getStudentName().equalsIgnoreCase(name)) {
                                System.out.println("Sinh viên cần tìm: " + obj[i].displayData());
                                break;
                            }
                        }
                    } else {
                        System.out.println("Không có danh sách sinh viên");
                    }

                    break;
                case 5:
                    if (formInput) {
                        for (int i = 0; i < size; i++) {
                            if (obj[i].isGender().equalsIgnoreCase("nu")) {
                                System.out.println("Danh sách các bạn nữ: " + "\n" + obj[i].displayData());
                            } else {
                                System.out.println("Danh sách các bạn nam: " + "\n" + obj[i].displayData());
                            }
                        }
                    } else {
                        System.out.println("Không có danh sách sinh viên");
                    }

                    break;
                case 6:
                    if (formInput) {
                        for (int i = 0; i < size; i++) {
                            if (obj[i].calAvgMark() >= 5 && obj[i].calAvgMark() <= 7) {
                                System.out.println("Danh sách sinh viên TB: " + "\n" + obj[i].displayData());
                            } else if (obj[i].calAvgMark() >= 8 && obj[i].calAvgMark() <= 9) {
                                System.out.println("Danh sách sinh viên Giỏi: " + "\n" + obj[i].displayData());
                            }
                        }
                    } else {
                        System.out.println("Không có danh sách sinh viên");

                    }

                    break;
                case 7:
                    System.exit(0);
                    break;
            }

        } while (choice < 8);
    }
}
