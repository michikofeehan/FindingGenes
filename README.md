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


Part 3: is Solving problems with Strings

I wrote two methods to solve some problems using strings and a third method to test these two methods.

Specifically, I did the following:

1. I created a new Java Class named Part3 in this project and put the following methods in this class.

2. I wrote the method called twoOccurrences that has two String parameters named stringa and stringb. This method returns boolean true if stringa appears at least twice in stringb, otherwise this method returns false. For example, the call twoOccurrences(“hello”, “hellogoodbyehello”) returns true as there are two occurrences of “hello”, this is shown in the output screen. The call twoOccurrences(“ohno”, “hellogoodbyehello”) returns false as there are no occurrences of “ohno”. I could probably do more test cases later...

3. I also wrote the void method named testing that has no parameters and this method calls twoOccurrences on several pairs of strings and print the strings and the result of calling twoOccurrences (true or false) for each pair. Please see my output.

4. I wrote the method named lastPart that has two String parameters named stringa and stringb. This method finds the first occurrence of stringa in stringb, and returns the part of stringb that follows stringa. If stringa does not occur in stringb, then return stringb. For example, the call lastPart(“hello”, “hellogoodbyehello”) returns the string “goodbyehello”, the part of the string after the first “hello”. The call lastPart(“ohno”, “hellogoodbyehello”) returns the string “hellogoodbyehello” since “ohno” does not appear in that word.

5. I added code to the method testing to call the method lastPart with several pairs of strings. For each call I  printed the strings passed in and the result. For example, the output for the two calls above might be:

The part of the string after an in bananana is anana.
The part of the string after michiko in ocean is ocean.

![Output](https://github.com/michikofeehan/FindingGenes/blob/master/Part3%20output.png)
