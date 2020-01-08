
/**
 * The method findSimpleGene from Part1 has one parameter for the DNA string named dna. For Part2 I modified findSimpleGene to 
 * add two additional parameters,one named startCodon for the start codon and one named stopCodon for the stop codon. 
 * 
 * Modified the findSimpleGene method to work with DNA strings that are either all uppercase letters such as “ATGGGTTAAGTC” 
 * or all lowercase letters such as “gatgctataat”. 
 * 
 * Calling findSimpleGene with “ATGGGTTAAGTT” returns the answer with uppercase letters, 
 * the gene “ATGGGTTAA”, and calling findSimpleGene with “gatgctataac” returns the answer 
 * with lowercase letters, the gene “atgctataa”.
 * 
 * Michiko Feehan
 * Jan 8, 2020
 */
public class Part2 {

   public String findSimpleGene(String dna, String startCodon, String stopCodon){
       String gene = "";
       int atg = dna.indexOf(startCodon);
       int taa = dna.indexOf(stopCodon,atg);
       char a = dna.charAt(0);
       
       if (atg == -1){ //no ATG or TAA  
           return gene; 
       }  
        else if(taa == -1){
            return gene;
            }
       else{ 
           gene = dna.substring(atg,(taa + 3));
           if(gene.length() % 3 == 0) {
                if(Character.isUpperCase(a)){
                    return gene.toUpperCase(); //returns as uppercase if uppercase string input as dna
                    }
                else{ return gene.toLowerCase(); //returns as lowercase if lowercase string input as dna 
                     }
                    }
           else { gene = "";   
             }
        } 
          return gene;
     }
 

public void testSimpleGene(){
String dna1= "tgatgtgaccgtaa"; //lowercase option
String dna2="AGGATGGAACGTCTTACTTAA";// has both ATG and TAA and is multiple of 3
String dna3 ="GCTTAGATGTAG";  // no TAA
String dna4="TGATGATGCGATGTAA"; // no taa multiple of 3
String dna5 = "CCATGTGATGAGCGTGTAAGT"; //both atg and taa but not a multiple of 3

String start = "atg";
String stop = "taa";

System.out.println();
System.out.println("dna string is " + dna1);
findSimpleGene(dna1,start,stop);
System.out.println("The gene is: " + findSimpleGene(dna1, start,stop));
System.out.println();

start = "ATG";
stop = "TAA";

System.out.println("dna string is " + dna2);
findSimpleGene(dna2,start,stop);
System.out.println("The gene is: " + findSimpleGene(dna2,start,stop));
System.out.println();

System.out.println("dna string is " + dna3);
findSimpleGene(dna3, start,stop);
System.out.println("The gene is: " + findSimpleGene(dna3,start,stop));
System.out.println();

System.out.println("dna string is " + dna4);
findSimpleGene(dna4, start,stop);
System.out.println("The gene is: " + findSimpleGene(dna4,start,stop));
System.out.println();

System.out.println("dna string is " + dna5);
findSimpleGene(dna5, start,stop); 
System.out.println("The gene is: " + findSimpleGene(dna5, start,stop));

}

}
       
        
        
        
        


