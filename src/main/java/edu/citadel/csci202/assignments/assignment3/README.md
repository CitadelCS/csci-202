
# Programming Assignment 3

## Problem Description

1. Modify the class named `Document` within the `assignment3` package to have an instance variable of type `String` 
named `text` that stores any textual content for the document. 
2. Create a method named `toString` that returns the `text` field and also include a method to set this value.
3. Next, define a class for `Email` within the `assignment3` package that is derived from `Document` and include instance
variables for the `sender`, `recipient`, and `title` of an email message.
4. Implement appropriate accessor and mutator methods. The body of the email message should be stored in the inherited
variable `text`. Redefine the `toString` method to concatenate all text fields.
5. Similarly, define a class for `File` within the `assignment3` package that is derived from `Document` and includes an instance variable for the `pathname`.
The textual contents of the file should be stored in the inherited `text`. Redefine the `toString` method to concatenate
all text fields.
6. Finally, create several sample objects of type `Email` and `File` in the main method of `MyDocuments`. Test your objects
by passing them to the method `containsKeyword` within `MyDocuments`. The method returns true if the object contains the 
provided keyword in the `text` property.

## Submission Instructions:

1. Finish the assignment from the instructions above
2. Commit your code to your repository

## Total Points: 100

## Grading Rubic

|               |  5  |  4  |  3  |  2  |  1  | Points |
|---------------|:---:|:---:|:---:|:---:|:---:|:------:|
| Coding Style  |     |     |     |     |     |        |
| Accuracy      |     |     |     |     |     |        |
| Maintain      |     |     |     |     |     |        |
| Efficiency    |     |     |     |     |     |        |

## Overall Grade

| Letter Grade   | Points |
|:--------------:|:------:|
|     -          |   -    |