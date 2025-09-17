import java.util.*;

public class StMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        boolean flag = true;
        while (flag) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Name: "); String name = sc.next();
                    System.out.print("Age: "); int age = sc.nextInt();
                    System.out.print("Course: "); String course = sc.next();
                    System.out.print("Grade: "); String grade = sc.next();
                    dao.addStudent(new Student(name, age, course, grade));
                    break;
                case 2:
                    List<Student> list = dao.getAllStudents();
                    list.forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter ID: "); int id = sc.nextInt();
                    System.out.print("New Grade: "); String newGrade = sc.next();
                    dao.updateStudent(id, newGrade);
                    break;
                case 4:
                    System.out.print("Enter ID: "); int delId = sc.nextInt();
                    dao.deleteStudent(delId);
                    break;
                case 5:
                    System.out.println("👋 Exiting...");
                    flag = false;
            }
        }
	}

}
