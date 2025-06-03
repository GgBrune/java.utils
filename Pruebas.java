import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
/**
 * Class full of methods from differents activities of the book.
 * 
 * @Brunella 
 * @2025
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
     * Constructor for objects of class Pruebas.
     */
    public Pruebas()
    {
        randomNumbers = new ArrayList<Integer>();
        responses = new ArrayList<String>();
        random = new Random();
        
        contacts = new HashMap<String, String>();
        
        words = new HashSet<String>();
    }
    
    /**
     * It returns the text without any space on 
     * the first part or the last part of the word.
     */
    public String apellido(String text)
    {
        this.text = text;
        text = text.trim();
        return text;
    }
    
    /**
     * It prints a random number.
     */
    public void printOneRandom() {
        int randomNumber = random.nextInt();
        System.out.println(randomNumber);
    }
    
    /**
     * It prints the number of random numbers entered as a parameter.
     */
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
     * It is a simulation of a dice.
     */
    public int throwDice() {
        int throwed = random.nextInt(6);
        if (throwed == 0) {
          throwed = random.nextInt(6);
        }
        return throwed;
    }
    
    /**
     * It returns a random response from the list.
     */
    public String getResponse() {
        int numberResponse = random.nextInt(3);
            responses.add("yes");
            responses.add("no");
            responses.add("maybe");
        String whatResponse = responses.get(numberResponse);
        return whatResponse;
    }
    
    /**
     * It returns a random number from the bound entered as a parameter.
     */
    public int randomNumber(int max, int min) {
        int number = random.nextInt(max);
        while (number < min) {
          number = random.nextInt(max);
        }
        return number;
    }
    
    /**
     * It adds a name with the corresponding telephone number
     * to a collection.
     */
    public void enterNumber(String name, String number) {
        contacts.put(name, number);
    }
    
    /**
     * It searchs the telephone number that matchs with
     * the name entered.
     */
    public String lookUpNumber(String name) {
        String telephone = contacts.get(name);
        return telephone;
    }
    
    /**
     * Nothing.
     */
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
