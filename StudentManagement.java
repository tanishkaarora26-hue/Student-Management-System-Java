import java.util.Scanner;

class Student {
    int roll;
    String name;
    int marks;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    void display() {
        System.out.println("Roll No: " + roll + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[100];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    s[count] = new Student();
                    s[count].input();
                    count++;
                    break;

                case 2:
                    System.out.println("Roll  Name  Marks");
                    for (int i = 0; i < count; i++) {
                        s[i].display();
                    }
                    break;

                case 3:
                    System.out.print("Enter roll to search: ");
                    int r = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (s[i].roll == r) {
                            s[i].display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Student not found");
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}