 import java.util.Scanner;
 public class StudentManagement {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");

        System.out.print("Enter Student ID: ");
        int id = in.nextInt();

        in.nextLine();

        System.out.print("Enter Student Name: ");
        String name = in.nextLine();

        System.out.print("Enter Age: ");
        int age = in.nextInt();

        in.nextLine();

        System.out.print("Enter Branch: ");
        String branch = in.nextLine();

        System.out.println("\n----- STUDENT DETAILS -----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);

        in.close();
    }
}
    

