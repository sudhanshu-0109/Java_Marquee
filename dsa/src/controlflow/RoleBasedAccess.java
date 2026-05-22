package controlflow;

import java.util.Scanner;

public class RoleBasedAccess {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter role: ");

        String role = sc.next();

        switch (role.toLowerCase()) {

            case "admin":
                System.out.println("This is admin page");
                break;

            case "teacher":
                System.out.println("This is teacher page");
                break;

            case "student":
                System.out.println("This is student page");
                break;

            case "guest":
                System.out.println("This is guest page");
                break;

            default:
                System.out.println("Select a valid role");
        }

        sc.close();
    }
}