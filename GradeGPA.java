// Grading system with gpa

import java.util.Scanner;

class GradeGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.next();

        System.out.print("Mark of Subject 1: ");
        int Sub1 = input.nextInt();

        System.out.print("Mark of Subject 2: ");
        int Sub2 = input.nextInt();

        System.out.print("Mark of Subject 3: ");
        int Sub3 = input.nextInt();

        System.out.println("==============================");
        System.out.println(name);
        System.out.println("==============================");

        String Mark1, Mark2, Mark3;
        if (Sub1 >= 90 && Sub1 <= 100) {
            Mark1 = "A";
            System.out.printf("Subject 1: %s%n", Mark1);
        }
        else {
            if (Sub1 < 90 && Sub1 >= 80) {
                Mark1 = "B";
                System.out.printf("Subject 1: %s%n", Mark1);
            }
            else {
                if (Sub1 < 80 && Sub1 >=50) {
                    Mark1 = "C";
                    System.out.printf("Subject 1: %s%n", Mark1);
                }
                else {
                    if (Sub1 < 50 && Sub1 >= 20) {
                        Mark1 = "D";
                        System.out.printf("Subject 1: %s%n", Mark1);
                    }
                    else {
                        if (Sub1 < 20 && Sub1 >= 0) {
                            Mark1 = "E";
                            System.out.printf("Subject 1: %s%n", Mark1);
                        }
                    }
                }
            }
        }

        if (Sub2 >= 90 && Sub2 <= 100) {
            Mark2 = "A";
            System.out.printf("Subject 2: %s%n", Mark2);
        }
        else {
            if (Sub2 < 90 && Sub2 >= 80) {
                Mark2 = "B";
                System.out.printf("Subject 2: %s%n", Mark2);
            }
            else {
                if (Sub2 < 80 && Sub2 >=50) {
                    Mark2 = "C";
                    System.out.printf("Subject 2: %s%n", Mark2);
                }
                else {
                    if (Sub2 < 50 && Sub2 >= 20) {
                        Mark2 = "D";
                        System.out.printf("Subject 2: %s%n", Mark2);
                    }
                    else {
                        if (Sub2 < 20 && Sub2 >= 0) {
                            Mark2 = "E";
                            System.out.printf("Subject 2: %s%n", Mark2);
                        }
                    }
                }
            }
        }

        if (Sub3 >= 90 && Sub3 <= 100) {
            Mark3 = "A";
            System.out.printf("Subject 3: %s%n", Mark3);
        }
        else {
            if (Sub3 < 90 && Sub3 >= 80) {
                Mark3 = "B";
                System.out.printf("Subject 3: %s%n", Mark3);
            }
            else {
                if (Sub3 < 80 && Sub3 >=50) {
                    Mark3 = "C";
                    System.out.printf("Subject 3: %s%n", Mark3);
                }
                else {
                    if (Sub3 < 50 && Sub3 >= 20) {
                        Mark3 = "D";
                        System.out.printf("Subject 3: %s%n", Mark3);
                    }
                    else {
                        if (Sub3 < 20 && Sub3 >= 0) {
                            Mark3 = "E";
                            System.out.printf("Subject 3: %s%n", Mark3);
                        }
                    }
                }
            }
        }

        System.out.println("------------------------------");

        int total = Sub1 + Sub2 + Sub3;
        System.out.printf("Total: %d%n", total);

        int average = total / 3;
        System.out.printf("Average: %d%n", average);

        String GPA;
        if (average >= 90 && average <= 100) {
            GPA = "A";
            System.out.printf("GPA: %s%n", GPA);
        }
        else {
            if (average < 90 && average >= 80) {
                GPA = "B";
                System.out.printf("GPA: %s%n", GPA);
            }
            else {
                if (average < 80 && average >=50) {
                    GPA = "C";
                    System.out.printf("GPA: %s%n", GPA);
                }
                else {
                    if (average < 50 && average >= 20) {
                        GPA = "D";
                        System.out.printf("GPA: %s%n", GPA);
                    }
                    else {
                        if (average < 20 && average >= 0) {
                            GPA = "E";
                            System.out.printf("GPA: %s%n", GPA);
                        }
                    }
                }
            }
        }
    }
}
