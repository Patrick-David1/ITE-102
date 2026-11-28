import java.util.Scanner;
class StudentGradeManVersion2 {

    public static void studInfo(String SNum, String SNam, String SCor, String SYr) {

    System.out.println("Student Number       : " + SNum);
    System.out.println("Student Name         : " + SNam);
    System.out.println("Course               : " + SCor);
    System.out.println("Year level           : " + SYr);
    System.out.println("----------------------------------------------------");
 }

 public static double getAverage(int g1, int g2, int g3) {
        double sum = g1 + g2 + g3;

        double average = sum / 3;
        return average;
    }

    public static String getRemark(double average) {
        if (average > 60) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    public static void displayResult(double ave, String remark2, String rating) {
        System.out.printf("Average              : %.2f%n", ave);
        System.out.println("Letter Grade is      : " + rating);
        System.out.println("Remark               : " + remark2);
        System.out.println("-------------------Nothing Follows------------------");

        }

        public static String getEquiv(double ave, char choice) {
            String rating = "";

            switch (choice) {
                case 'L':
                    if (ave >= 90) {
                        rating = "A";
                    } else if (ave >= 83) {
                        rating = "B";
                    } else if (ave >= 75) {
                        rating = "C";
                    } else if (ave >= 60) {
                        rating = "D";
                    } else {
                        rating = "F";
                    }
                break;
                case 'N':
                    if (ave >= 96) {
                        rating = "4.00";
                    } else if (ave >= 90) {
                       rating = "3.50";
                    } else if (ave >= 84) {
                        rating = "3.00";
                    } else if (ave >= 77) {
                        rating = "2.50";
                    } else if (ave >= 70) {
                          rating = "2.00";
                    } else {
                          rating = "1.00";
                    }
                break;
                default:
                        System.out.println("No Matching Cases");
                break;

            }

            return rating;
        }


public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("----------------------------------------------------");
System.out.print("Student Number       : ");
String SNum = scanner.nextLine();

System.out.print("Student Name         : ");
String SNam = scanner.nextLine();

System.out.print("Course               : ");
String SCor = scanner.nextLine();

System.out.print("Year level           : ");
String SYr = scanner.nextLine();


System.out.println("----------------------------------------------------");

System.out.println("Enter Grades: ");

System.out.print("Grade 1              : ");
int grade1 = scanner.nextInt();
System.out.print("Grade 2              : ");
int grade2 = scanner.nextInt();
System.out.print("Grade 3              : ");
int grade3 = scanner.nextInt();

System.out.println("----------------------------------------------------");
System.out.print("Enter [N] for Numeric Grade Output or [L] for Alphabetical Grade Output: ");
char choice = scanner.next().toUpperCase().charAt(0);
System.out.println("----------------------------------------------------");


    studInfo(SNum, SNam, SCor, SYr);
    double average = getAverage(grade1, grade2, grade3);
    String remark = getRemark(average);
    getEquiv(average, choice);
    

    String rating = getEquiv(average, choice);
    displayResult(average, remark, rating);
    
    scanner.close();

    }
}

  