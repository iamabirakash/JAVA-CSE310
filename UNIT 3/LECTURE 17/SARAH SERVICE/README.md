Sarah's courier service calculates the total cost of sending parcels based on their size, weight, and whether they are fragile. The basic cost of sending a parcel is determined by its size and weight. For fragile items, additional packing and insurance costs are applied.

Write a program using single-level inheritance to:

Create a base class Parcel that calculates the basic cost of sending a parcel.
Derive a subclass FragileParcel from Parcel that adds additional packing and insurance costs for fragile parcels.
The program should take user input for the basic cost, extra packing cost, and insurance cost, and display the total cost for both regular and fragile parcels.
Implement the inheritance to calculate and display the total cost for regular and fragile parcels.

Input format :
The first line of input contains an integer representing the regular cost for the parcel.

The second line of input contains an integer representing the extra packing cost for the fragile parcel.

The third line of input contains an integer representing the insurance cost for the fragile parcel.

Output format :
The output displays the total cost for regular and fragile parcels, each in a separate line.



Refer to the sample outputs for format specifications.

Code constraints :
The given test cases fall under the following constraints:

The costs of the parcel should be integers and should not contain any letters or symbols.

0 ≤ Regular cost, Extra packing cost, Insurance cost ≤ 106

Sample test cases :
Input 1 :
10
5
3
Output 1 :
Regular Parcel Cost: 10 rupees
Fragile Parcel Cost: 18 rupees
Input 2 :
10000
5000
3000
Output 2 :
Regular Parcel Cost: 10000 rupees
Fragile Parcel Cost: 18
