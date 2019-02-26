/******************************************************************************
 * Program Name:          Lab03
 * Program Description:   Sorting three odd/even integers using logical operators only.                        
 * Program Author:        Jakub K. Winch
 * Date Created:          02/25/2019
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 ******************************************************************************/
package lab03;
import java.util.Scanner; 
public class Lab03 {
  public static void main(String[] args) {
    //Scanner
    Scanner input = new Scanner(System.in);
    
    
    //Ask for integer #1 & #2
    System.out.print("Please enter an integer between 0-99: ");
    int integer1 = input.nextInt();
    
    if (integer1  < 0 || integer1 > 99) { 
        System.out.print("Outside range. Please enter an integer between 0-99: ");
        integer1 = input.nextInt();
    if (integer1  < 0 || integer1 > 99) {
        System.out.print("Outside range. Program ending.");
            
     }
}   else {
        System.out.print("Next, enter another integer between 0-99: ");
        int integer2 = input.nextInt();
        
    if (integer2 < 0 || integer2 > 99) {
        System.out.print("Outside range. Please enter an integer between 0-99: ");
        integer2 = input.nextInt();
    if (integer2 < 0 || integer2 > 99) {
        System.out.print("Outside range. Program ending.");
        return;
    }      
  }  
}       
    //fails negative integer and rest positive test
        
    
    }
    
    }
