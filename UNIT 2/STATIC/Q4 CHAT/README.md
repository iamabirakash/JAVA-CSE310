You are building a chat application where users can send and receive messages. To optimize the storage and transmission of messages, you can implement encoding and decoding methods. When a user sends multiple messages, you can encode them into a single string, which is sent to the recipient. On the recipient's side, the encoded string is decoded back into individual messages for display.

Input format :
For encoding, a sequence of strings separated by a delimiter ("#" only ) is provided as input.

For decoding, a single string containing the encoded data is provided as input.

Output format :
For encoding, a single string is output, representing the encoded data.

For decoding, a sequence of strings separated by a delimiter is output, representing the decoded data.



Refer to the sample output for format specifications.

Code constraints :
0 ≤ Length of each string ≤ 100

Sample test cases :
Input 1 :
Coding is fun
Output 1 :
Encoded: Coding#is#fun
Decoded: 
Coding
is
fun
Input 2 :
Programming@123
Output 2 :
Encoded: Programming@123
Decoded: 
Programming@123
