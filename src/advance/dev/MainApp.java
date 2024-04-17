package advance.dev;

import java.util.Scanner;

class Student {
	String name;
	int age;
	String address;
	String phoneNumber;
	double averageScore;
}

public class MainApp {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Student[] students = new Student[10];

		// Nhập thông tin cho 10 sinh viên
		input(students);

		// In ra thông tin của 10 sinh viên
		print(students);
	}

	// Phương thức nhập thông tin cho mảng sinh viên
	static void input(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");

			System.out.print("Tên: ");
			student.name = scanner.nextLine();

			System.out.print("Tuổi: ");
			student.age = scanner.nextInt();
			scanner.nextLine(); // Đọc bỏ kí tự '\n' trong buffer

			System.out.print("Địa chỉ: ");
			student.address = scanner.nextLine();

			System.out.print("Số điện thoại: ");
			student.phoneNumber = scanner.nextLine();

			System.out.print("Điểm trung bình: ");
			student.averageScore = scanner.nextDouble();
			scanner.nextLine(); // Đọc bỏ kí tự '\n' trong buffer

			students[i] = student;
		}
	}

	// Phương thức in thông tin của mảng sinh viên
	static void print(Student[] students) {
		System.out.println("Danh sách sinh viên:");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Sinh viên thứ " + (i + 1) + ":");
			System.out.println("Tên: " + students[i].name);
			System.out.println("Tuổi: " + students[i].age);
			System.out.println("Địa chỉ: " + students[i].address);
			System.out.println("Số điện thoại: " + students[i].phoneNumber);
			System.out.println("Điểm trung bình: " + students[i].averageScore);
			System.out.println();
		}
	}
}
