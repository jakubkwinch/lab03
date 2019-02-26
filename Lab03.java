package lab03;
import java.util.Scanner; 
public class Lab03 {
  public static void main(String[] args) {
    //Scanner
    Scanner input = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    
    //Ask for integer #1
    System.out.print("Please enter an integer between 0-99: ");
    int integer1 = input.nextInt();

    if (integer1  < 0 || integer1 > 99) {
        System.out.print("Outside range. Please enter an integer between 0-99: ");
    }   else {
        //Asks for integer #2 
        System.out.print("Please enter an integer between 0-99: ");
        
    }
    
    int integer2 = input.nextInt();
    
    if (integer2  < 0 || integer2 > 99) {
        System.out.print("Outside range. Closing program");
        return;
    }
    
    
