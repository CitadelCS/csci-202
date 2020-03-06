# Assignment 9

## Problem Description

A Java program contains various pairs of grouping symbols, such as:

* Parentheses: `(` and `)`
* Braces: `{` and `}`
* Brackets: `[` and `]`

> Note that the grouping symbols cannot overlap. For example, `(a{b)}` is illegal. Write a program to check whether a Java source-code file has correct pairs of grouping symbols.

## Implementation Details

The goal of this assignment is to begin understanding collections. In order to get credit
for this assignment you must use a `Stack`.

1. Ask the user to enter the file name along with its full path to read in the file. The string input should be used to create a `File` object.
1. Read the file line by line.
    * If the string is `(` or `{` or `[`, then push to the stack.
    * If the string is `)` or `}` or `]`, then pop from the stack.
1. When the end of file is reached, if the stack is empty, then the file has the correct pairs of grouping symbols. Otherwise, the grouping symbols are not balanced. Display an appropriate message for the user.

## Submission Instructions:

1. Finish the assignment from the instructions above
2. Commit your code to your repository

## Total Points: 100

## Grading Rubric

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