import java.util.Random;

public class Die {
    private int dieCurrentValue;
    private int dieMaxValue;
    Random ra = new Random();

    //Sätter sidorna på tärningen i konstruktören (fråga i början)
    public Die(int dieMaxValue){
        this.dieMaxValue = dieMaxValue;
    }

    //Getter för att komma åt sidorna på tärningen
    public int getDieMaxValue() {
        return dieMaxValue;
    }

    public void setDieMaxValue(int dieMaxValue) {
        this.dieMaxValue = dieMaxValue;
    }

    //Använd slumpgenerator för att förändra dieCurrentValue inom dieMaxValue
    public void roll(){
        dieCurrentValue = ra.nextInt(dieMaxValue)+1;
    }
}
