import java.util.*;

public class triangleRecursive
{
   public static void main(String args[])
   {
    Scanner input = new Scanner(System.in);
    int lines, spaces;
    int currentLine = 0;
    int letters = 1;

    System.out.println("Enter the number of lines to display >> ");
    lines = input.nextInt();
    spaces = lines;

    printTriangle(lines, currentLine, spaces ,letters);

    input.close();
   }

   public static void printTriangle(int lines, int currentLine, int spaces, int letters)
   {
    if(currentLine == lines)
    {
        return;
    }
    else
    {
        // Print the spaces
        for(int i = 0; i < spaces; i++)
        {
            System.out.print(" ");
        }

        // Print the letters
        for(int i = 0; i < letters; i++)
        {
            System.out.print("T");
        }

        System.out.println();

        spaces--;
        currentLine++;
        letters+=2;
        printTriangle(lines, currentLine, spaces, letters);
    }
   }
}