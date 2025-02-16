Sophia is working on a program to combine two strings into a new one by concatenating their characters while ensuring that no character is repeated in the final result. 



Write a program to merge two strings into one by retaining only unique characters in the order they first appear String builder class.

Input format :
The first line contains a string representing the firstString﻿ which consist of alphanumeric characters, spaces, and symbols.

The second line contains a string representing the secondString, with the same format as firstString.

Output format :
The output prints a single string containing all unique characters from firstString and secondString in the order of their first appearance.



Refer to the sample output for format specifications.

Code constraints :
In the given scenario, the test cases fall under the following constraints:

1 ≤ Length of each string ≤ 250 characters

The input strings are case-sensitive.

Sample test cases :
Input 1 :
heLlo@123
world@456
Output 1 :
heLlo@123wrd456
Input 2 :
aabbccddeeffgghhiijj
jjiihhggffeeddccbbaa
Output 2 :
abcdefghij
Input 3 :
Harry Potter
Child Play
Output 3 :
Hary PoteChild
