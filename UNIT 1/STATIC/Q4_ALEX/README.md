Alex needs a program to determine which of the two points is closer to the origin and to identify the orientation of the line segment connecting these two points. The orientation is determined based on the coordinates of the two points. 



The program should:

Calculate the distance of each point from the origin (0, 0).
Determine which point is closer to the origin.
Identify the orientation of the line segment between the two points based on their coordinates:
Vertical: If the x-coordinates of both points are the same.
Horizontal: If the y-coordinates of both points are the same.
Oblique: If neither the x-coordinates nor the y-coordinates of the two points are the same.


Assist Alex in the program.



Formula:

 distance1 = Math.sqrt(x1 * x1 + y1 * y1)

 distance2 = Math.sqrt(x2 * x2 + y2 * y2)

Input format :
The input consists of four integers representing the coordinates of the two points:

x1 and y1 for the first point.
x2 and y2 for the second point, separated by a space
Output format :
The first line of output prints a double value, representing the distance of the closer point to the origin, formatted to one decimal place.

The second line prints the orientation of the line segment connecting the two points.



Refer to the sample output for the formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

-100 ≤ x1, y1 ≤ 100

-100 ≤ x2, y2 ≤ 100

Sample test cases :
Input 1 :
-2 0 6 0
Output 1 :
Closer Distance: 2.0
Orientation: Horizontal
Input 2 :
3 4 0 0
Output 2 :
Closer Distance: 0.0
Orientation: Oblique
Input 3 :
1 6 1 8
Output 3 :
Closer Distance: 6.1
Orientation: Vertical
