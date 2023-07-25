import java.util.Scanner;

class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number");
        double num2 = sc.nextDouble();
        System.out.println("Enter third number");
        double num3 = sc.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println(num3 + " is the largest number.");
        }

        double avg = (num1 + num2 + num3)/3;
        System.out.println("The average of the numbers is "+ avg);
        sc.close();
    }
    
}