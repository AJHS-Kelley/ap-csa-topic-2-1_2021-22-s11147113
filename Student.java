import java.util.Scanner;

// Unit 2, 11/05/21, version 0.4


public class Student {
    // These are INSTANCE VARIABLES.
    private int studentID;
    private int gradeLevel;
    private double gradePointAvg
    private String studentName;


    // Creating a Constructor
    public Student(){   
        this.studentId = 0;
        this.gradeLevel = 0;
        this.gradePointAvg = 0.0;
        this.studentName = "";
    }

    // Value Constructor
    public Student(int studentID, int gradeLevel, double GPA, String studentName) {
        this.studentID = studentID;
        this.gradeLevel = gradeLevel;
        this.gradePointAvg = GPA;
        this.studentName = studentName;
    }

    public Student(int studentID,String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.gradeLevel = 9;
        this.gradePointAvg = 4.0;
    }
    // More than one constructor is known as OVERLOADING






    //Creating Methods

    public static void calcGPA() {
        int grade0;
        int grade1;
        int grade2;
        int grade3;
        double newGPA;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the first grade?");
        grade0 = myScanner.nextInt();
        System.out.println("What is the second grade?");
        grade1 = myScanner.nextInt();
        System.out.println("What is the third grade?");
        grade2 = myScanner.nextInt();
        System.out.println("What is the fourth grade?");
        grade3 = myScanner.nextInt();

    newGPA = (grade0 + grade1 + grade2 + grade3) / 4;
    System.out.print("The new GPA is");
    System.out.println(newGPA)
}

public static void newLine() {
    System.out.println();

}

public static void threeLine() {
    newLine();
    newLine();
    newLine();
}

    // Parameters and Arguments
    public static void assignLunch(int gradeLevel) {
        String lunchPeriod;

        if (gradeLevel == 9) {
            lunchPeriod = "First Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 10) {
            lunchPeriod = "Second Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 11) {
            lunchPeriod = "Third Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else {
            lunchPeriod = "Off Campus Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }


    }

    public static void assignLunchMultiple(int gradeLevel, double gradePointAvg)
        String lunchPeriod;
        // AND, OR, NOT -- Boolean Operators
        // && -- AND
        // || -- OR
        // ! -- NOT

        if (gradeLevel == 9 || gradePointAvg <= 1.5) {
            lunchPeriod = "First Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 10 && gradePointAvg > 2.0){
            lunchPeriod = "Second Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 11 && (gradePointAvg != 0.0)){
            lunchPeriod = "Third Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else {
            lunchPeriod = "Off-Campus Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }