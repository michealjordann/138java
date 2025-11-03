import java.util.Scanner;

public class hitman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("You are a hitman. You have been assigned a target that is conducting a secret anonymous black market auction in the top floor of his new mansion to sell a pink diamond that our client wants. Your job is to take the auctioneer out, SILENTLY.");
        System.out.println("The target is currently hosting a massive housewarming party as a cover for this auction. Your organization has managed to get you an invite to this party under a different name. Use it to get in, and from there silently take down the target and stop the auction. ");
        System.out.println("");
        System.out.println("You have reached the mansion. You get inside, and your main goal is to get to the top floor. Will you take the main stairs or go to the bar first?");
        System.out.println("Type true for stairs, false for bar");

        String input = sc.next();
        boolean choice;
        if (input.equals("true"))
        {
            choice = true;
        }
        else if (input.equals("false"))
        {
            choice = false;
        }
        else
        {
            System.out.println("Type in either true or false. Try again");
            sc.close();
            return;
        }

        if (choice)
        {
            System.out.println("You took the main stairs, in front of the entire crowd of people, and were immediately tackled by a bodyguard. Try again.");
        }
        else
        {
            System.out.println("You went to the bar first to scope out the mansion, and you realized you can slip behind the counter into the employees only room. Once you went in, you saw a spare bartender outfit. You put it on, now blending in as a bartender.");
            System.out.println("You take the elevator to the top floor, stealing a janitor's uniform from a locker. You walk down the hall and find the room where the secret auction is taking place.");
            System.out.println("Go in now or blend in as a bidder?");
            System.out.println("Type true for go in, false for wait");

            input = sc.next();
            if (input.equals("true"))
            {
                choice = true;
            }
            else if (input.equals("false"))
            {
                choice = false;
            }
            else
            {
                System.out.println("Type in either true or false. Try again");
                sc.close();
                return;
            }

            if (choice)
            {
                System.out.println("Janitors were not allowed in the room. Try again.");
            }
            else
            {
                System.out.println("You wait and blend in as a bidder.");
                System.out.println("While waiting, you look around for a distraction and see the fire alarm. Set off the alarm or try to be the highest bidder?");
                System.out.println("Type true for alarm, false for bidding");

                input = sc.next();
                if (input.equals("true"))
                {
                    choice = true;
                }
                else if (input.equals("false"))
                {
                    choice = false;
                }
                else
                {
                    System.out.println("Type in either true or false. Try again");
                    sc.close();
                    return;
                }

                if (choice)
                {
                    System.out.println("You pull the alarm, and in the chaos knock out a bodyguard and take his disguise.");
                    System.out.println("Now disguised as the bodyguard, you get a moment alone with the target. Do you shoot him now or tell him fake news to cancel the auction?");
                    System.out.println("Type true to shoot, false for fake news");

                    input = sc.next();
                    if (input.equals("true"))
                    {
                        choice = true;
                    }
                    else if (input.equals("false"))
                    {
                        choice = false;
                    }
                    else
                    {
                        System.out.println("Type in either true or false. Try again");
                        sc.close();
                        return;
                    }

                    if (choice)
                    {
                        System.out.println("You shoot him in the office, however there were security cameras. You got caught. Try again.");
                    }
                    else
                    {
                        System.out.println("You tell him his mother has suffered from a stroke. He panics and calls off the auction. You both get in the car, and you do what you do best. Mission accomplished.");
                    }
                }
                else
                {
                    System.out.println("You become the highest bidder, and you are taken to a private room to pay. However you cannot attack the target due to his bodyguards being in the room. Try again.");
                }
            }
        }

        sc.close();
    }
}
