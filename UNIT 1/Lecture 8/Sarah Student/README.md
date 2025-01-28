Sarah, a student, struggles with math and wants to create a simple calculator. She asks for your help to build a program that rounds decimal numbers to different precision levels. Use a switch-case statement in Java to make it user-friendly. Walk Sarah through the process of rounding a decimal number to the nearest whole number, one decimal place, or two decimal places. Help her gain confidence in her math skills!

Input format :
The first line of input contains the decimal number to be rounded to different precise levels in double type.

The second line of input contains the integer representing the choice of precision.

Output format :
The output is printed based on the choices.

If the choice is 1, output prints "Rounded to the nearest whole number: "

If the choice is 2, output prints "Rounded to one decimal place: "

If the choice is 3, output prints "Rounded to two decimal place: "



Refer to the sample outputs for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ choice ≤ 3

1.0 ≤ precision value ≤ 100.0

Sample test cases :
Input 1 :
12.8
1
Output 1 :
Rounded to the nearest whole number: 13.0
Input 2 :
3.456
2
Output 2 :
Rounded to one decimal place: 3.5
Input 3 :
9.12345
3
Output 3 :
Rounded to two decimal places: 9.12
Input 4 :
7.25
4
Output 4 :
Invalid choice.
