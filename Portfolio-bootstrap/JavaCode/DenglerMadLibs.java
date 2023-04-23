import java.util.Scanner;
public class DenglerMadLibs
{
    public static void main(String[] args)
    {
        int num;
        String animal;
        String direction;
        Scanner scan = new Scanner(System.in);
        
        //Get user input
        System.out.print("Enter a animal >> ");
        animal = scan.nextLine();    
        
        System.out.print("Enter a direction >> ");
        direction = scan.nextLine();    
        
        System.out.print("Enter a number >> ");
        num = scan.nextInt();
        
        //Call the function
        displayMadLibs(num, animal, direction);
    }
    public static void displayMadLibs(int num, String animal, String direction) 
    {
        // Write the body of your function   

        System.out.println("Hickory Dickory Dock.");
        System.out.println("The " + animal + " ran up the clock.");
        System.out.println("The clock struck " + num + ".");
        System.out.println("The "+animal + " ran "+ direction +".");
        System.out.println("Hickory Dickory Dock.");
    }
}