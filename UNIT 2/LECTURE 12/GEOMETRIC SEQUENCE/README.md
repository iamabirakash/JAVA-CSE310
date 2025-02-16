Imagine you're developing a Java class called GeometricSequence that offers constructors to calculate either the Nth term or the sum of the first N terms in a geometric sequence. The class provides two constructors:



GeometricSequence(int a, int r, int N): This constructor takes the first term (a), common ratio (r), and the number of terms (N), calculating the Nth term by default.



GeometricSequence(int a, int r, int N, String operation): This constructor allows you to specify an operation type ("term" or "sum") in addition to the parameters.

Input format :
The first line of the input is an integer representing the first term (a) of the geometric sequence.

The second line contains an integer indicating the common ratio (r) of the sequence.

The third line contains an integer specifying the number of terms (N) in the sequence.

An optional fourth line allows you to specify the operation type as a string, either "term" or "sum."

Output format :
If the operation is "term", the output should display the Nth term of the geometric sequence.

If the operation is "sum", the output should display the sum of the first N terms of the geometric sequence.

If the operation is invalid, the output should be "Invalid operation specified.".



Refer to the sample output for formatting specifications.

Code constraints :
1 ≤ a ≤ 100

1 ≤ r ≤ 100

1 ≤ N ≤ 100



Note: Refer to the sample output for the format specification.

Sample test cases :
Input 1 :
2
3
5
sum
Output 1 :
Result: 242.0
Input 2 :
3
-2
4
term
Output 2 :
Result: -24.0
Input 3 :
3
-2
4
sum
Output 3 :
Result: -15.0
