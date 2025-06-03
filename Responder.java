import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder {

    private Random random;
    private ArrayList<String> randomResponses;
    private HashMap<String, String> responseMap;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random();
        randomResponses = new ArrayList<String>();
        responseMap = new HashMap<String, String>();
        randomResponsesList();
        responsesList();
    }

    private void randomResponsesList() 
    {
        randomResponses.add("That sounds interesting. Tell me more...");
        randomResponses.add("Ok, any other information about it?..");
        randomResponses.add("Oh, tell me about it in detail please...");
    }
    
    private void responsesList()
    {
        responseMap.put("slow", 
                        "I think this had to do with your hardware.\n" +
                        "Upgrading your prosessor should solve all performance problems.\n" +
                        "Have you got a problem woth your software?");
        responseMap.put("bug",
                        "Well, you know, all software has some bugs.\n" +
                        "But our software engineers are working very hard to fix them.\n" +
                        "Can you describe the problem a little further?");
        responseMap.put("expensive",
                        "The cost of our product is quite competitive.\n" +
                        "Looked around and really compared our features?");
    }
    
    public String generateResponse(HashSet<String> word)
    {
        String response = responseMap.get(word);
        if (response != null) {
            return response;
        } else {
            return defaultResponses();
        }
    }
    
    private String defaultResponses()
    {
        int numberResponse = random.nextInt(randomResponses.size());
        String whatResponse = randomResponses.get(numberResponse);
        return whatResponse;
    }
}
