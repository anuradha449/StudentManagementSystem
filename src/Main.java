import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDAO dao = new StudentDAO();

        while(true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter department: ");
                    String department = sc.nextLine();

                    Student s = new Student(name, email, department);

                    dao.addStudent(s);

                    break;

                case 2:

                    dao.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID to Delete: ");

                    int id = sc.nextInt();

                    dao.deleteStudent(id);

                    break;

                case 4:

                    System.out.println("Exiting Application...");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}