Ram is tasked with creating a basic calculator application that supports three fundamental mathematical operations: addition, subtraction, and multiplication. The application will consist of a parent class Calculator and a child class AdvancedCalculator. The program will take user input for the operation choice and two numeric values, then calculate and display the result.

Input format :
The first line of input contains an integer representing the choice of operation:

1 for Addition
2 for Subtraction
3 for Multiplication
The second line of input contains an integer num1, which is the first numeric value for the calculation.

The third line of input contains an integer num2, which is the second numeric value for the calculation.

Output format :
If the choice is 1 (Addition): the output prints "Addition: " followed by the addition result of num1 and num2.

If the choice is 2 (Subtraction): the output prints "Subtraction: " followed by the subtraction result of num1 and num2.

If the choice is 3 (Multiplication): the output prints "Multiplication: " followed by the multiplication result of num1 and num2.

If the choice is other: the output prints "Invalid".



Refer to the sample output for format specification

Code constraints :
The given test cases fall under the following constraints:

0 ≤ num1 , num2 ≤ 106

Sample test cases :
Input 1 :
1
5
3
Output 1 :
Addition: 8
Input 2 :
2
10
4
Output 2 :
Subtraction: 6
Input 3 :
3
7
9
Output 3 :
Multiplication: 63
Input 4 :
4
3
5
Output 4 :
Invalid
