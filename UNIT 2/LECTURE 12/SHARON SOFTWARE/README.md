Sharon, a software developer, is working on a project to automate velocity calculations for various objects. She wants to create a class named VelocityCalculator with overloaded methods calculateVelocity to calculate the velocity. One method will accept distance in meters and time in seconds as integers, while another will accept distance and time as doubles.



Help her in completing the project.



Formula: Velocity = distance / time

Input format :
The first line of input consists of an integer, representing the distance in meters (for the integer method).

The second line consists of an integer, representing the time in seconds (for the integer method).

The third line consists of a double value, representing the distance in meters (for the double method).

The fourth line consists of a double value, representing the time in seconds (for the double method).

Output format :
The first line of output prints "Velocity with integer inputs:" followed by the calculated velocity for the integer inputs.

The second line prints Velocity with double inputs:" followed by the calculated velocity for double inputs, rounded off to two decimal places.



Refer to the sample output for formatting specifications.

Code constraints :
In this scenario, the test cases fall under the following constraints:

1 ≤ Integer distance ≤ 100000

1 ≤ Integer time ≤ 100000

1.0 ≤ double distance ≤ 100000.0

1.0 ≤ double time ≤ 100000.0

Sample test cases :
Input 1 :
100
10
100.5
10.2
Output 1 :
Velocity with integer inputs: 10 m/s
Velocity with double inputs: 9.85 m/s
Input 2 :
500
30
300.5
25.2
Output 2 :
Velocity with integer inputs: 16 m/s
Velocity with double inputs: 11.92 m/s
Input 3 :
10000
3600
876.5
3600.7
Output 3 :
Velocity with integer inputs: 2 m/s
Velocity with double inp
