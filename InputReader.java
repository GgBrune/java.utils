import java.util.HashSet;
import java.util.Scanner;
/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    //No me toma el el texto ingresado en el parámetro como un conjunto HashSet
    public HashSet<String> getInput()
    {
        System.out.print("> ");
        String inputLine = reader.nextLine().trim().toLowerCase();
        
        String[] wordArray = inputLine.split(" ");
        
        HashSet<String> words = new HashSet<String>();
        for (String word : wordArray) {
            words.add(word);
        }
        
        return words;
    }
}
