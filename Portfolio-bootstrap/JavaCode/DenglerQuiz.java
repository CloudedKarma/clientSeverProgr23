import java.util.Scanner;

public class DenglerQuiz
{
   static Scanner input = new Scanner(System.in);
   public static void main(String[] args)
   {
      int choice;
      double score1, score2;
      score1 = Quiz();
      
      System.out.println("Do you wish to do the quiz agian? 1 for Yes 2 for N");
      choice = input.nextInt();
      input.nextLine();
      if(choice == 1)
      {
         score2 = Quiz();
         if(score1 > score2)
         {
            System.out.println("You scored higher in quiz 1 " + score1 + "%");
         }
         else
         {
            System.out.println("You scored higher in quiz 2 " + score2 + "%");  
         }
      }
      else
      {
         System.out.println("You did not wish to do the quiz agian");
      }


   }
   public static double calculateGrade(double correct)
   {
      char grade = ' ';
      double score = (correct / 10) * 100;
      if (score >= 90)
      {
         grade = 'A';
      }
      else if (score >= 80)
      {
         grade = 'B';
      }
      else if (score >= 70)
      {
         grade = 'C';
      }
      else if (score >= 60)
      {
         grade = 'D';
      }
      else
      {
         grade = 'F';
      } 
      System.out.println("You got a "+ score +"% which is a "+ grade);
      return score;
   }
   public static double Quiz()
   {
      String[] questions = 
      {"How   many players on a basketball team?\nA. 5   B.   6    C. 7",
        "How many points for a basket?\nA. 1    B. 2   C. 3",
        "How many points for a free throw?\nA. 1   B. 2   C. 3",
        "You can earn three points when you\nA. Make any basket\n" +
               "B. Throw from inside the three-point line\n" +
               "C. Throw from outside the three-point line",
        "What is the name of Chicago's NBA team?\n" +
              "A. Bulls   B. Bears   C. Cubs",
        "Who may ask a referee about a rule interpretation?\n" +
              "A. Team captain\n" +
              "B. A player who receives a foul\n" +
              "C. Any player on the floor",
        "Suppose a shooter from team A makes a basket\n" +
            "in team B's basket. Who gets credit for the basket?\n" +
            "A. The player who made the basket\n" +
            "B. The last player from team B who made a basket\n" +
            "C. The player from team B nearest the shooter",
        "A basketball game starts with a\n" +
            "A. Jump ball\nB. Throw in from the side\n" +
            "C. Throw in from the end",
        "Bouncing a ball while walking is\n" +
            "A. Slobbering   B. Dribbling   C. Dabbling",
        "Taking steps with the ball without dribbling is called\n" +
              "\nA. Stepping   B. Dunking    C. Travelling"};

     char[] corrAns = {'A', 'B', 'A', 'C', 'A', 'A', 'C', 'A', 'B', 'C' };
     char ans = ' ';
     String str = "";
     int correct = 0;
     String entry = "";
     boolean abcCheck;
     boolean validEntry;
     double score;

     for(int i = 0; i < 10; i++)
     {
         abcCheck = false;
         int firstError = 0;
         while(!abcCheck)
         {
            abcCheck = true;
            validEntry = false;
            while(!validEntry)
            {
              try
              {
                  // i = (int)(Math.random() * 100) % questions.length;
                  System.out.println(questions[i]);
                  System.out.print("Your answer >> ");
                  str = input.nextLine();
                  ans = str.toUpperCase().charAt(0);
                  validEntry = true; // Valid entry flag to make sure we enter a character
              }
              catch(StringIndexOutOfBoundsException ex)
              {
                  System.out.println("Invalid input! >> " + ex.getMessage());

              }  
            }

            if(ans != 'A' && ans != 'B' && ans != 'C')
            {
                  abcCheck = false;
                  if(firstError == 0)
                  {
                       questions[i] = questions[i] +
                          "\nYour answer must be A, B or C.";
                       firstError = 1;
                  }
            }
         }
           if(ans == corrAns[i])
           {
              ++correct;
              System.out.println("Correct!");
           }
           else
           System.out.println("The inputed answer is wrong.");      
     }
     System.out.println("Out of 10 questions: ");
     System.out.println((questions.length -correct) + " wrong");
     System.out.println(correct + " right" );
     score = calculateGrade(correct);
     return score;
   }
}
