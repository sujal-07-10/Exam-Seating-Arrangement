import java.util.Scanner;

class ExamSeating {

    int[] class1 = new int[10];
    int[] class2 = new int[10];
    String[] name1 = new String[10];
    String[] name2 = new String[10];

    void addStudent(int roll, String name) {

        // Classroom 1 : Roll 1-10
        if (roll >= 1 && roll <= 10) {

            if (class1[roll - 1] != 0) {
                System.out.println("Seat already occupied in Classroom 1");
                return;
            }

            class1[roll - 1] = roll;
            name1[roll - 1] = name;
            System.out.println("Assigned Seat " + roll + " in Classroom 1");
        }

        // Classroom 2 : Roll 11-20
        else if (roll >= 11 && roll <= 20) {

            System.out.println("This class seat is full, go to next class");

            int seat = roll - 10;   // 11 → 1, 12 → 2 … 20 → 10

            if (class2[seat - 1] != 0) {
                System.out.println("Seat already occupied in Classroom 2");
                return;
            }

            class2[seat - 1] = roll;
            name2[seat - 1] = name;
            System.out.println("Assigned Seat " + seat + " in Classroom 2");
        }

        else {
            System.out.println("Invalid roll number");
        }
    }

    void display() {

        boolean showClass1 = false;
        boolean showClass2 = false;

        for (int i = 0; i < 10; i++) {
            if (class1[i] != 0) showClass1 = true;
            if (class2[i] != 0) showClass2 = true;
        }

        if (showClass1) {
            System.out.println("\n--- Classroom 1 ---");
            for (int i = 0; i < 10; i++) {
                if (class1[i] != 0) {
                    System.out.println("Seat " + (i + 1)
                            + " Roll " + class1[i]
                            + " Name " + name1[i]);
                }
            }
        }

        if (showClass2) {
            System.out.println("\n--- Classroom 2 ---");
            for (int i = 0; i < 10; i++) {
                if (class2[i] != 0) {
                    System.out.println("Seat " + (i + 1)
                            + " Roll " + class2[i]
                            + " Name " + name2[i]);
                }
            }
        }

        if (!showClass1 && !showClass2) {
            System.out.println("No students seated yet");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamSeating es = new ExamSeating();
        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Seating");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Roll No: ");
                int roll = sc.nextInt();

                System.out.print("Enter Name: ");
                String name = sc.next();

                es.addStudent(roll, name);
            }

            else if (choice == 2) {
                es.display();
            }

            else if (choice == 3) {
                System.out.println("Thanks for checking");
            }

            else {
                System.out.println("Wrong choice");
            }

        } while (true);
    }
}