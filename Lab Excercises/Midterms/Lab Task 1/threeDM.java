import java.util.Scanner;

//1. Class Declared
public class threeDM {
    public static void main(String[] args) {
       boolean flag = true; //unused
       String option = ""; //0.1 Declares string "option" for y/n input
do {

        //2. Declared Array
int three[][] = new int[3][3];

//3. Declare the Scanner as "input"
 Scanner input = new Scanner(System.in);
 //4. Prompt the user to enter the elements of the array
        System.out.println("Input 9 elements: ");
        
        //5. Traverse all rows and columns of the array
        for (int row = 0; row < 3; row++) { //5.1 For traversing each row 
            for (int col = 0; col < 3; col++) { //5.2 For traversing each column
                three[row][col] = input.nextInt(); //6. Takes the user input and assigns it to a coordinate inside the array as it traverses all the available slots
            }
        } 

        //7. After all loops returns as "false" it will now terminate the loop as there are no more valid condition 
        
        //8. It will then output each value for each coordinate (Row and Column) 
        System.out.println("Display: Here are the Numbers and the required output.");
        System.out.println("===========================================================");
        System.out.printf("%36s%n", "Row Sum:");
        System.out.println();

        for (int i = 0; i < 3; i++) { //9.0 "i" represents the row and "j" represents the column
    int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += three[i][j];
                System.out.printf("%8d", three[i][j]); //9.1 It traverses each coordinate and outputs the value of each coordinate in the array
            }
            System.out.printf("%12d%n", sum); //9.2 It outputs each sum per
        }


// COLUMN SUM
 System.out.print("\nColumn Sum: ");
for (int i = 0; i < three[0].length; i++) { //10. It traverses each column
    int sum2 = 0;
    for (int j = 0; j < three.length; j++) { //10.1 It traverses each row
        sum2 += three[j][i];
    }
    System.out.printf("%8d", sum2); //10.2 prints out every sum for each column 
}

  System.out.println("\n===========================================================");

//11. Declares the placeholder for each diagonal summation
        int diagonal1 = 0;
        int diagonal2 = 0;
 
    //12. Calculate diagonal summations

        for (int i = 0; i < 3; i++) {
            diagonal1 += three[i][i];
            diagonal2 += three[i][2 - i];
        }
        
 //13. It outputs every diagonal summations   
        System.out.println("Diagonal sum 1: " + diagonal1);
        System.out.println("Diagonal sum 2: " + diagonal2);
        System.out.println("Display Total Elements: " + (three.length * three[0].length)); //It calls the length of the arrays (rows and columns) and multiplies each other 
//14. Prompts the user to continue(y) or not (n or anything else)
 System.out.print("Do you want to continue? (y/n): ");
 option = input.next();
    } while (option.equalsIgnoreCase("y")); //15. This serves as a flag, if "option" is equals to ("y" or "Y") it will return as "true."
    }}