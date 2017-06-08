import java.util.Scanner;

public class BallotUI
{

    // instance variables
    private Scanner keyboard;

    private BallottingUnit ballot=new BallottingUnit("seema","ashley","craig","dolcy");
 //   private Candidate c1;
    
    private String votingMessage;

 
    public BallotUI()
    {
        keyboard = new Scanner(System.in);
    }

    public void menu()   
    {

        int command = -1;
        while(command != 0)       
        {
            displayMainMenu();
            command = getCommand();

            execute(command);
        }

    }

    private void displayMainMenu()
    {

        System.out.println("Options are");
        System.out.println("  vote for Seema     Enter 1");
        System.out.println("  vote for Ashley    Enter 2");
        System.out.println("  vote for Dolcy     Enter 3");
        System.out.println("  vote for Craig     Enter 4");
        System.out.println("To close    Enter 0");
    }
 

    private void execute(int command)

    {
        if(command == 1)
       {
            ballot.candidate1.incrementVoteCount();
        }
        else if(command == 2)
        {

            ballot.candidate2.incrementVoteCount();
        }
        else if(command == 3)
        {
            ballot.candidate3.incrementVoteCount();
        }
        else if(command == 4)
        {
            ballot.candidate4.incrementVoteCount();

        }           
        else if(command == 0)

        {

            System.out.println(" Program closing down");
            ballot.reportResults();

        }

        else

        {

            System.out.println("Unknown command");

        //    candidate.castVote();

        }

    }

    private int getCommand()

    {

        System.out.print("Enter command: ");

        return keyboard.nextInt();

    }

 
    /*
    private void setupBallot()

    {

        return displayMainMenu();

    }

 

    private void setupVoteMessage(String vote)
    {

    }
*/
}
