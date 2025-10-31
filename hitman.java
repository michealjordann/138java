import java.util.Scanner;

public class hitman
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are a hitman. You have been assigned a target that is conducting a secret anonymous black market auction in the top floor of his new mansion to sell a pink diamond that our client wants. Your job is to take the auctioneer out, SILENTLY.");
        System.out.println("The target is currently hosting a massive housewarming party as a cover for this auction. We have managed to get you an invite to this party. Use it to get in, and from there silently take down the target and stop the auction. ");
        System.out.println("");
        System.out.println("You have reached the mansion You get inside, and your main goal is to get to the top floor. Will you take the main stairs or go to the bar first?");
        System.out.println("Type in 1 or 2 to choose the first or second option");
        int choice = sc.nextInt();
        if (choice == 1)
        {
            System.out.println("You took the main stairs, in front of the entire crowd of people, and were immediately tackled by a bodyguard. Try again.");
        }
        else if (choice == 2)
        {
            System.out.println("You went to the bar first to scope out the mansion, and you realized you can slip behind the counter into the employees only room. Once you went in, you saw a spare bartender outfit. You put it on, now blending in as a bartender.");
            System.out.println("Now to get to the top floor. You must choose to either take the employee elevator or the emergency stairs.");
            choice = sc.nextInt();
            if (choice == 1)
            {
                System.out.println("You take the elevator, a miracle that nobody else was in there to see you press the button for the top floor, where bartenders are not allowed. You knock out a janitor, hide him in a janitor closet, and put on his uniform.");
            }
            if (choice == 2)
            {
                System.out.println("")
            }
        }
        else
        {
            System.out.println("Type in 1 or 2, please try again.");
        }



    }
}
