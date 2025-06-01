import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class Pruebas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pruebas
{
    // instance variables - replace the example below with your own
    private String text;
    private ArrayList<Integer> randomNumbers;
    private Random random;

    /**
     * Constructor for objects of class Pruebas
     */
    public Pruebas()
    {
        randomNumbers = new ArrayList<>();
        Random random = new Random();
    }

    public String apellido(String text)
    {
        this.text = text;
        text = text.trim();
        return text;
    }
    
    public void printOneRandom() {
        int randomNumber = random.nextInt();
        System.out.println(randomNumber);
    }
    
    public void printMultiRandom(int howMany) {
        int i = 0;
        while (i < howMany) {
           int randomNumber = random.nextInt();
           randomNumbers.add(new Integer(randomNumber));
           i++;
        }
        System.out.println(randomNumbers);
        randomNumbers.clear();
    }
    
    /**
     * public int throwDice() {
        int throwed = random.nextInt(6);
        if (throwed == 0) {
          throwed = random.nextInt(6);
        }
        return throwed;
        }
     */
}
