import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
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
    private ArrayList<String> responses;
    
    private HashMap<String, String> contacts;
    
    private HashSet<String> words;

    /**
     * Constructor for objects of class Pruebas
     */
    public Pruebas()
    {
        randomNumbers = new ArrayList<Integer>();
        responses = new ArrayList<String>();
        random = new Random();
        
        contacts = new HashMap<String, String>();
        
        words = new HashSet<String>();
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
    
    public int throwDice() {
        int throwed = random.nextInt(6);
        if (throwed == 0) {
          throwed = random.nextInt(6);
        }
        return throwed;
    }
    
    public String getResponse() {
        int numberResponse = random.nextInt(3);
            responses.add("yes");
            responses.add("no");
            responses.add("maybe");
        String whatResponse = responses.get(numberResponse);
        return whatResponse;
    }
    
    public int randomNumber(int max, int min) {
        int number = random.nextInt(max);
        while (number < min) {
          number = random.nextInt(max);
        }
        return number;
    }
    
    public void enterNumber(String name, String number) {
        contacts.put(name, number);
    }
    
    public String lookUpNumber(String name) {
        String telephone = contacts.get(name);
        return telephone;
    }
    
    public HashSet<String> exampleHash(String bracket)
    {
        String text = bracket.trim().toLowerCase();
        String[] wordArray = text.split(" ");
        for (String word : wordArray) {
            words.add(word);
        }
        return words;
    }
}
