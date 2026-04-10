import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        //First number input
        System.out.print("What's your first number?");
        Scanner scanner1 = new Scanner(System.in);
        int firstNumber = scanner1.nextInt();

        //Second number input
        System.out.print("What's your second number?");
        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner2.nextInt();

        //getting input from user
        System.out.println("Possible Calculations: \n (A)dd \n (S)ubstract \n (M)ultiply \n (D)ivide \n Please select an option: ");
        Scanner scanner3 = new Scanner(System.in);
        String option = scanner3.nextLine();
        //check if it has to Add and prints
        if (option.equals("A")){
            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber) );
        }

        //check if it has to Substract and prints


        if (option.equals("S")){
            System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber) );
        }

        //check if it has to Multiply and prints

        if (option.equals("M")){
            System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber) );
        }

        //check if it has to Divide and prints

        if (option.equals("D")){
            System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber) );
        }




    }

}
