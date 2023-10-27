package Rutu_week2_Extra;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please Enter the length of the triangle  :");
        int length =scanner.nextInt();
        areaOfTringle(length,length);
        // closing the scanner object
        scanner.close();
    }
    //Calculating the area of triangle with no return type with parameter method
    public static void areaOfTringle(int lenght,int height){
        int area =(lenght *height);
        System.out.println("The Area of a tringle is :"  + area);
    }
}
