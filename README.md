# FindingGenes
determine if a DNA strand has a gene 

Wrote the method findSimpleGene that has one String parameter dna, representing a string of DNA. This method does the following:

1) Finds the index position of the start codon “ATG”. If there is no “ATG”, it returns the empty string.

2)Finds the index position of the first stop codon “TAA” appearing after the “ATG” that was found. If there is no such “TAA”, it returns the empty string.

3)If the length of the substring between the “ATG” and “TAA” is a multiple of 3, then the program returns the substring that starts with that “ATG” and ends with that “TAA”.

