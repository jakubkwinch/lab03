/** ****************************************************************************
 * Program Name:          Lab03
 * Program Description:   Sorting three odd/even integers using logical operators only.
 * Program Author:        Jakub K. Winch
 * Date Created:          02/25/2019
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 ***************************************************************************** */
package lab03;

import java.util.Scanner;

public class Lab03 {

  public static void main(String[] args) {
    //Scanner
    Scanner input = new Scanner(System.in);

    //Declerations
    int input1;
    int input2;
    int max;
    int min;
    int integer1;
    int integer2;
    int integer3;
    int temp;
    int sum;
    int product;
    int quotient;
    int quotient1;
    int quotient2;

    //Input #1
    System.out.print("Please enter an integer between 0-99: ");
    input1 = input.nextInt();

    if (input1 < 0 || input1 > 99) {
      System.out.print("Outside range. Please enter an integer between 0-99: ");
      input1 = input.nextInt();
      if (input1 < 0 || input1 > 99) {
        System.out.print("Outside range. Program ending.");
        return;
      }
    }

    //Input #2
    System.out.print("Next, enter another integer between 0-99: ");
    input2 = input.nextInt();

    if (input2 < 0 || input2 > 99) {
      System.out.print("Outside range. Please enter an integer between 0-99: ");
      input2 = input.nextInt();
      if (input2 < 0 || input2 > 99) {
        System.out.print("Outside range. Program ending.");
        return;
      }
    }

    //Min / Max
    if (input1 < input2) {
      min = input1;
      max = input2;
    } else {
      min = input2;
      max = input1;
    }

    //Integer creation
    integer1 = min + (int) (Math.random() * (max - min) + 1);
    integer2 = min + (int) (Math.random() * (max - min) + 1);
    integer3 = min + (int) (Math.random() * (max - min) + 1);

    if (integer1 > integer2) {
      temp = integer1;
      integer1 = integer2;
      integer2 = temp;
    } else if (integer2 > integer3) {
      temp = integer2;
      integer2 = integer3;
      integer3 = temp;
    } else if (integer1 > integer2) {
      temp = integer1;
      integer1 = integer2;
      integer2 = temp;
    }

    System.out.println("The range begins at " + min + " ends at " + max);

    System.out.println("Three sorted random integers between " + min + " and " + max + " are " + integer1 + ", " + integer2 + ", & " + integer3);

    if (integer1 % 2 == 0) {
      System.out.println(integer1 + " is even");
    } else {
      System.out.println(integer1 + " is odd.");
    }

    if (integer2 % 2 == 0) {
      System.out.println(integer2 + " is even");
    } else {
      System.out.println(integer2 + " is odd");
    }

    if (integer3 % 2 == 0) {
      System.out.println(integer3 + " is even");
    } else {
      System.out.println(integer3 + " is odd");
    }

    //SUM
    sum = integer1 + integer2 + integer3;

    //PRODUCT
    product = integer1 * integer2 * integer3;

    //QUOTIENT
    quotient1 = integer1 / integer2;
    quotient2 = quotient1 / integer3;
    quotient = quotient2;

    System.out.println("The sum of all the integers is " + sum);
    System.out.println("The product of all the integers is " + product);
    System.out.println("The quotient of all the integers is " + quotient);
  }

}
