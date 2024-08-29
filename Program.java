import java.lang.Math;
import java.util.Scanner;

//Your code here
public class Program{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter integer: ");
        int num1 = input.nextInt();
        System.out.println("Enter another integer: ");
        int num2 = input.nextInt();
        System.out.println("Original numbers are " + num1 + " and " + num2);
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
        int max;
        int min;
        if(num1 <= num2){
            max = num2;
            min = num1;
        }
        else{
            max = num1;
            min = num2;
        }
        int difference = num1 - num2;
        System.out.println("Difference = " + difference);
        int product = num1 * num2;
        System.out.println("Product = " + product);
        double average = (double) sum / 2;
        System.out.println("Average = " + average);
        int distance = max - min;
        System.out.println("Distance = " + distance);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}

//Paste console output below:
/*
Enter integer: 
13
Enter another integer: 
20
Original numbers are 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Distance = 7
Maximum = 20
Minimum = 13

*/
