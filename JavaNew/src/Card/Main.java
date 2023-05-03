package Card;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String[]> cards = new ArrayList<>();
        while(true)
        {
            System.out.println("---------------------------");
            System.out.println("1) Add Card");
            System.out.println("2) Display Cards");
            System.out.println("3) Quit");
            System.out.print("Enter your choice: ");
            System.out.println();
            String choice = input.nextLine();
            if(choice.equalsIgnoreCase("3"))
                break;
            switch (choice)
            {
                case "1":
                    Card newCard = new Card();
                    System.out.print("Enter Owner of card: ");
                    newCard.cardOwner = input.nextLine();
                    System.out.print("Enter card number: ");
                    newCard.cardNumber = input.nextLine();
                    System.out.print("Enter expire date: ");
                    newCard.expireDate = input.nextLine();
                    System.out.print("Enter cvv2: ");
                    newCard.cvv2 = Integer.parseInt(input.nextLine());
                    String[] cardInfo = {newCard.cardOwner, newCard.cardNumber,
                            newCard.expireDate, Integer.toString(newCard.cvv2)};
                    cards.add(cardInfo);
                    break;
                case "2":
                    for (var card : cards) {
                        String str = String.format("%s  %s  %s  %s", card[0], card[1], card[2], card[3]);
                        System.out.println(str);
                    }
                    break;
                default:
                    System.out.println("Your entry is not valid!");
            }
        }
    }

}

