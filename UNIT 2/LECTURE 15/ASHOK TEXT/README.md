Ashok is developing a text processing utility that allows users to insert a substring into an original string at a specified position. The program takes input for the original string, the substring to insert, and the position at which to insert the substring.



Write a program to help Ashok using the methods of the String Builder class.

Input format :
The first line of input contains a string representing the original string.

The second line of input contains a string representing the substring to insert.

The third line of input contains a integer representing the index position to insert the substring (index starts from 0).

Output format :
The output prints a string representing the modified string after inserting the substring.



Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

0 ≤ index position ≤ 50

Sample test cases :
Input 1 :
HelloWorld
New
6
Output 1 :
HelloWNeworld
Input 2 :
Hello
World
0
Output 2 :
WorldHello
Input 3 :
This is an place
amazing
11
Output 3 :
This is an amazingplace
