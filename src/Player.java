import java.util.ArrayList;

public class Player {
    String playerName;
    int playerPoints;
    ArrayList<Die> playerDiceList = new ArrayList<>();

    public Player(String playerName){
        this.playerName = playerName;
    }
    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    //Rulla samtliga tärningar i spelarens lista
    public void playerRollDice(){

    }

    //Summera och returnera värdet på spelarens tärningar
    public int getDieValue(){
        return 1;
    }

    //Öka spelarens poäng med 1
    public void increasePlayerScore(){
        playerPoints++;
    }

    //Lägg till en ny tärning
    public void addDie(int sides){
       // playerDiceList.add(sides);
    }



}
