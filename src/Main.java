import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println(" °°°°° S K I L L   D I C E °°°°°");
        System.out.println("""
                 
                 |  Play a game with your friends
                 |  where you need to guess the 
                 |  right number when rolling 
                 |  your dice.
                 |  Have fun! :) 
                 
                  - Press ENTER for new game! -""");
        String newGame = sc.nextLine();
        if (newGame != null) {
            initialize();
        }
        System.out.println(" - Press ENTER to continue - ");
        String input = sc.nextLine();

        if (input != null) {
            System.out.println("hej");
        }



        //GAME MAIN CODE
        // !!!!!!!!!!!
        // !!!!!!!!!!!


//        Programmet frågar först hur många spelare som vill spela,
//        hur många tärningar varje spelare skall ha  och  hur  många
//        sidor  tärningarna  skall  ha.
//        Det  frågar  sedan  efter  namnen  på  spelarna.
//        Ni  kan anta att användaren matar in korrekta värden,
//        dvs ni behöver ej ha med felhantering.
//
//        Spelet kommer sedan att spelas i fem omgångar.
//        Varje omgång består av att spelarna, en efter en,
//        gissar på ett värde och sedan rullar sina tärningar.
//        Om värdet spelaren gissade på är lika med det sammanlagda
//        värdet på tärningarna, så får spelaren en poäng. En omgång
//        är slut då en sista spelaren har gissat och rullat sina tärningar.
//
//        Spelaren som har flest poäng efter 5 omgångar vinner spelet.




    }

    //Initialisera spelet genom användarinput, samt en lista av spelare som returneras
    private static ArrayList<Player> initialize() {
        ArrayList<Player> playerList = new ArrayList<>();
        System.out.println("How many players want to join the game?");
        int numOfPlayers = sc.nextInt();
        sc.nextLine(); // För att konsumera enter

        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Enter the name of player " + (i + 1) + ":");
            String playerName = sc.nextLine();
            Player player = new Player(playerName);
            playerList.add(player);
        }
        System.out.println("How many sides do you want the die to have?");
        int dieMaxValue = sc.nextInt();
        sc.nextLine();
        Die die = new Die(dieMaxValue);
        System.out.println("\nYou are now " + numOfPlayers + " players and the dice has " + dieMaxValue + " sides.");
        return playerList; // Returnera ArrayList med samtliga spelare
    }

    //Ta emot spelare och spela en omgång
    //loopa genom spelare, rulla tärningarna,
    //fråga efter gissning och öka poängen om rätt svar
    private static void takeTurn(ArrayList<Player> players) {

    }

    //Tar emot spelare och returnerar vinnare
    //vinnare = mest poäng (kan vara flera)
    private static ArrayList<Player> getWinners(ArrayList<Player> players) {
        return getWinners(players);
    }
}