import java.util.Scanner;
public class StudentGradeMan {

 public static int getAverage(int g1, int g2, int g3) {
        int sum = g1 + g2 + g3;

        double average = (double) sum / 3;
        return (int) average;
    }

    public static String getRemark(double average) {
        if (average > 60) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    public static void displayResult(double ave, String remark2) {
        System.out.println("Average:        " + ave);
        System.out.println("Remark:         " + remark2);
        }

public static void main(String[] args) {
    
System.out.println("Enter Grades...");
Scanner scanner = new Scanner(System.in);
System.out.print("Grade 1:    ");
int grade1 = scanner.nextInt();
System.out.print("Grade 2:    ");
int grade2 = scanner.nextInt();
System.out.print("Grade 3:    ");
int grade3 = scanner.nextInt();

    double average = getAverage(grade1, grade2, grade3);
    String remark = getRemark(average);
    displayResult(average, remark);

    }
}

  