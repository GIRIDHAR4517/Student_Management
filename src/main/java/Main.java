import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
         int choice;
        System.out.println("**************************");
        System.out.println("   Welcome To School🏫   ");
        System.out.println("**************************");
    do {
            System.out.println("Enter 1 to Add Student ");
            System.out.println("Enter 2 to Get Student Details");
            System.out.println("Enter 3 to Get Students Data");
            System.out.println("Enter 4 to Update Student Name");
            System.out.println("Enter 5 to Update Student Gmail ");
            System.out.println("Enter 6 to delete Student");
            System.out.println("Enter 0 to Exit \n");

            System.out.print("Enter Your Option : - ");
            choice =sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Student Name :- ");
                    String name = sc.next();
                    System.out.print("Enter Student Gmail:- ");
                    String gmail = sc.next();
                    System.out.print("Enter Math marks :- ");
                    int math = sc.nextInt();
                    System.out.print("Enter Social marks :- ");
                    int social = sc.nextInt();
                    System.out.print("Enter science marks :- ");
                    int science = sc.nextInt();
                    System.out.print("Enter english marks :- ");
                    int english = sc.nextInt();
                    Marks m = new Marks();
                    m.marksSetter(math, science, social, english);

                    Student s = new Student();
                    s.setName(name);
                    s.setGmail(gmail);

                    if (Manager.addStudent(s, m)) System.out.println("Student Added Successfully✅");


                }

                case 2 -> {
                    System.out.print("Enter Student id :- ");
                    int id = sc.nextInt();
                    System.out.println(Manager.studentDetails(id));
                }

                case 3 -> {
                    for (Object o : Manager.studentsData()) System.out.println(o);
                }
                case 4 -> {
                    System.out.print("Enter Student id :- ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name to Update :- ");
                    String name = sc.next();

                    if (Manager.updateName(id, name)) System.out.println("Data Updated✅");
                }
                case 5 -> {
                    System.out.print("Enter Student id :- ");
                    int id = sc.nextInt();
                    System.out.print("Enter gmail to Update :- ");
                    String gmail = sc.next();

                    if (Manager.updateGmail(id, gmail)) System.out.println("Data Updated✅");

                }
                case 6 ->{
                    System.out.print("Enter Student id to delete :- ");
                    int id = sc.nextInt();
                    if(Manager.delete(id)) System.out.println("Student Deleted✅");
                }
                case 0 -> EntityUtility.shutdown();

                default -> System.out.println("Enter valid option");

            }
        }while (choice!=0);

        System.out.println("**************************");
        System.out.println("   See You Again 😊   ");
        System.out.println("**************************");

    }
}
