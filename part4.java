import edu.duke.*;
/**
 * Use URL resource to read file word by word
 * The URLResource class opens a connection to a URL and allows access to the 
 * contents of the web page a line at a time, using the method lines. or a word
 * at a time, using the method words. These strings can then be iterated over using 
 * a for loop.
 * 
 * Michiko
 * Feb. 1, 2020
 */ 

    
public class Part4 {
     
    public void findLink(){
    URLResource ur = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html"); 
    for (String s: ur.words()){
       if (s.indexOf("youtube.com")!= -1){  // means Youtube link was found
           int you = s.indexOf("youtube.com"); 
           int startQ= s.lastIndexOf("\"",you) + 1; // find location of first quatation and the character after that
           int endQ= s.lastIndexOf("\""); // find location of last location
           String link = s.substring(startQ,endQ); // substring is the link in between the two quation marks excluding the quation marks themselves
           System.out.println(link);
           System.out.println();
        }   
    
  }
 } 

}