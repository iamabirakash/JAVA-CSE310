Ram is a data scientist who is preparing a report on AI model training for their team's daily meeting. He wants to create a program that reads the model's name, training epochs, batch size, learning rate, and whether the training was successful and then displays a formatted summary for the meeting.



Can you assist Ram in this?

Input format :
The input consists of:

Model Name (String)
Training Epochs (int)
Batch Size (int)
Learning Rate (float)
Training Success Status (boolean)
Output format :
The first line of output prints the model name.

The second line prints the number of training epochs.

The third line prints the batch size.

The fourth line prints the learning rate, rounded off to two decimal places.

The fifth line prints the training success status.



Refer to the sample output for the exact text and format.

Code constraints :
The model name is a non-empty string.

1 ≤ epoch, batch size ≤ 500

0.0 ≤ learning rate ≤ 10.0

Sample test cases :
Input 1 :
GPT-4
100
64
2.56
true
Output 1 :
Model Name: GPT-4
Training Epochs: 100
Batch Size: 64
Learning Rate: 2.56
Training Successful: true
Input 2 :
BERT
50
32
7.015
false
Output 2 :
Model Name: BERT
Training Epochs: 50
Batch Size: 32
Learning Rate: 7.01
Training Successful: f
