import java.util.*;

public class denglerSecretPhrase
{
public static void main(String[] args)
{
    Scanner scan = new Scanner(System.in);
    String[] secretP = {"Jaws", "Lord of the Rings", "Pulp fiction", "Shrek", "Star Wars", "The Green Mile", 
                        "O Brother Where Art Thou", "Django", "Pirates of the Caribeean", "Top Gun"};

    String letter = "Enter one letter: \n";
    String sorry= "Sorry letter not present.\n";
    String correct = "Correct!\n";
    String userResponse;
    char guess;// Letter guess
    char ch;    // Letter in movie name
    String displayMovie = "";   // empty string to hold the secret
    int random;
    String selectedP;

    // randomly select a secretP item form the array
    random = (int)(Math.random() * 100) % secretP.length;
    selectedP = secretP[random];
    int len = selectedP.length();
    int i = 0;

    // System.out.println("Slected Movie: " + selectedP);

    // Convert each nonspace character to *
    //Convert each space to a space
    while(i < len)
    {
        if(selectedP.charAt(i) == ' ')
        {
            displayMovie += ' ';
        }
        else
        {
            displayMovie += '*';
        }
        i++;
    }

    // Ask the user to guess the phrase
    System.out.println("What is the name of the movie?\n Enter a letter >> ");

    //Display the new phrase to the user in the format of 
    //**** ******* (pulp Fiction)
    System.out.println("\t" + displayMovie + "\n");
    
    boolean found = false;
    // As long as displayMovie has an * to compare
    // Loop while asking the user to enter a letter
    // to compare with the *

    while(displayMovie.indexOf('*') != -1)
    {
        System.out.println(letter);
        userResponse = scan.nextLine();
        guess = userResponse.charAt(0);  
        found = false;

        // loop through the secretP phrase checking if the guess character is in secretP
        for(int j = 0; j < len; j++)
        {
            ch = selectedP.toLowerCase().charAt(j);
            if(ch == Character.toLowerCase(guess))
            {
                // replace the guess letter with the * at position j
                //Jaws => a
                displayMovie = displayMovie.substring(0,j) + guess + displayMovie.substring(j+1, len);
                //*a** ==> new displayMovie after the above code
                found = true;
            }
        }
        if(!found)
        {
            System.out.println(sorry + guess);
        }
        else
        {
            System.out.println(correct + letter);
        }
    System.out.println("\t" + displayMovie.toUpperCase() + "\n");
    }
    System.out.println("Well done the movie was: " + secretP[random]);
    scan.close();

}
}