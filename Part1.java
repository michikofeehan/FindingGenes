
/**
 * Write a description of Part1 here.
 * 
 * Michiko Feehan
 * Jan 7, 2020
 */
public class Part1 {

   public String findSimpleGene(String dna){
       String gene = "";
       int atg = dna.indexOf("ATG");
       int taa = dna.indexOf("TAA",atg);
       
       if (((atg == -1)||(taa == -1))){ //no ATG or TAA  
           return gene; 
       }  
       else{ 
        gene = dna.substring(atg,(taa + 3));
        if(gene.length() % 3 == 0) {
           return gene;
        }
        gene = "";
       }
        
    return gene;
}

public void testSimpleGene(){
String dna1= "TGATGTGACCCGTAA"; //no ATG
String dna2="AGGATGGAACGTCTTACTTAA";// has both ATG and TAA and is multiple of 3
String dna3 ="GCTTAGATGTAG";  // no TAA
String dna4="TGATGATGCGATGTAA"; // no taa multiple of 3
String dna5 = "CCATGTGATGAGCGTGTAAGT"; //both atg and taa but not a multiple of 3

System.out.println();
System.out.println("dna string is " + dna1);
findSimpleGene(dna1);
System.out.println("The gene is: " + findSimpleGene(dna1));
System.out.println();

System.out.println("dna string is " + dna2);
findSimpleGene(dna2);
System.out.println("The gene is: " + findSimpleGene(dna2));
System.out.println();

System.out.println("dna string is " + dna3);
findSimpleGene(dna3);
System.out.println("The gene is: " + findSimpleGene(dna3));
System.out.println();

System.out.println("dna string is " + dna4);
findSimpleGene(dna4);
System.out.println("The gene is: " + findSimpleGene(dna4));
System.out.println();

System.out.println("dna string is " + dna5);
findSimpleGene(dna5);
System.out.println("The gene is: " + findSimpleGene(dna5));

}

}
       
        
        
        
        

