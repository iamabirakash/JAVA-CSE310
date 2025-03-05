Alice is managing an online store and wants to implement a program using inheritance to calculate the selling price of products after applying discounts. 



Guide her by following the instructions:

Create a base class called Product with a public double attribute price.
Create a subclass called DiscountedProduct, which extends Product and includes a private double attribute discountRate.This subclass has a method called calculateSellingPrice() to determine the final selling price after applying the discount.


Formula: Discounted selling price = price * (1 - discount rate)

Input format :
The first line of input consists of a double value p, the initial price of the product.

The second line consists of a double value d, the discount rate.

Output format :
The output prints "Rs. X", where X is a double value, representing the calculated discounted selling price, rounded off to two decimal places.

If the discount rate is greater than 1, print "Not applicable".



Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1.00 ≤ p ≤ 1000.00

0.00 ≤ d ≤ 1.00

Sample test cases :
Input 1 :
50.00
0.20
Output 1 :
Rs. 40.00
Input 2 :
399.50
1.23
Output 2 :
Not applicable
Input 3 :
1000.0
0.01
Output 3 :
Rs. 990.00
