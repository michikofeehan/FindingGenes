# FindingGenes
Determines if a DNA strand has a gene. 

Part 1: 

Wrote the method findSimpleGene that has one String parameter dna, representing a string of DNA. This method does the following:

Finds the index position of the start codon “ATG”. If there is no “ATG”, it returns the empty string. Finds the index position of the first stop codon “TAA” appearing after the “ATG” that was found. If there is no such “TAA”, it returns the empty string. If the length of the substring between the “ATG” and “TAA” is a multiple of 3, then the program returns the substring that starts with that “ATG” and ends with that “TAA”.

![Output](https://github.com/michikofeehan/FindingGenes/blob/master/Output%20FindingGenes%20Michiko.png)



Part 2:

Modified the findSimpleGene method to work with DNA strings that are either all uppercase letters such as “ATGGGTTAAGTC” or all lowercase letters such as “gatgctataat”. 
 
Calling findSimpleGene with “ATGGGTTAAGTT” returns the answer with uppercase letters, the gene “ATGGGTTAA”, and calling findSimpleGene with “gatgctataac” returns the answer with lowercase letters, the gene “atgctataa”

![Output](https://github.com/michikofeehan/FindingGenes/blob/master/outputPart2.png)
