
/**
 * I wrote the method called twoOccurrences that has two String parameters named stringa and stringb. 
 * This method returns boolean true if stringa appears at least twice in stringb, otherwise this method returns false. 
 * For example, the call twoOccurrences(“hello”, “hellogoodbyehello”) returns true as there are two occurrences of “hello”, this is shown in the output screen. 
 * 
 * The call twoOccurrences(“ohno”, “hellogoodbyehello”) returns false as there are no occurrences of “ohno”. 
 * 
 * 
 * @Michiko 
 * @January 31, 2020
 */
public class Part3 {
    int firstA = 0;
    public boolean twoOccurrences(String stringa, String stringb){
    if(stringb.indexOf(stringa) != -1){
           firstA = stringb.indexOf(stringa);// where is the string A located in string B?
           int lengthA = stringa.length(); // how long is string A?
           String part2 = stringb.substring(firstA+lengthA); // cut the string B after where the first occurance of string A ends   
           if ((part2.indexOf(stringa)) != -1){
               return true;
            }
            else { // the string a does not occur a second time in string b
                return false;
            }
            
        }
    else{ return false; // the string a never occurs in string b
    }
}
    
   public String lastPart(String stringa, String stringb){
        if(stringb.indexOf(stringa) != -1){ 
           firstA = stringb.indexOf(stringa);// where is the string A located in string B?
           int lengthA = stringa.length(); // how long is string A?
           String part2 = stringb.substring(firstA+lengthA);
           return part2;
        }
        else{
            return stringa;
        }   
    }


    public void testing(){
      String resultab = "";
      String resultcb="";
      String stringa= "hello";
      String stringb="hellogoodbyehello";
      
        
        System.out.println("string A is " + stringa);
        System.out.println("string B is " + stringb);
        System.out.println();
        twoOccurrences(stringa,stringb); //example that will return true
        System.out.println("String A occurs twice in string B: "+ twoOccurrences(stringa,stringb));
        resultab = lastPart(stringa,stringb);
        System.out.println(); 
        System.out.println("The part of the string after "+stringa+ " in " + stringb +" is " + resultab );
     
       
        String stringc= "ohno";
        String stringd="hellogoodbyehello";
        System.out.println();
        resultcb = lastPart(stringc,stringb);
        System.out.println("string C is " + stringc);
        System.out.println("string B is " + stringb);
        twoOccurrences(stringc,stringb); //example that will return false
        System.out.println("string C occurs twice in string B: "+ twoOccurrences(stringc,stringb));
        System.out.println();
        System.out.println("The part of the string after "+stringc+ " in " + stringb +" is " + resultcb );// since stringc does not exist within stringb, this should only return string b
        
    
     
     
      } 
}
 

