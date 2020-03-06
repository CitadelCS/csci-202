# Objectives
The objective of this assignment is to understand the concepts of inheritance, abstract classes, exception handling, and interfaces in Java. You will develop a simple bank application containing five classes: `Bank`, abstract class `Account`, `SavingsAccount`,  `CheckingAccount`, and `IllegalAmountException`.  Additionally, you will write a `Teller` class with a `main` method that uses your bank classes.  Descriptions for each class are provided below.

# IllegalAmountException class
`IllegalAmountException` extends the `Exception` class.  

List of attributes:
- `private double amount`

List of methods
- `public IllegalAmountException(String message, double amount)` This method should call the super constructor with the message parameter and set the instance variable amount.

# Account class
`Account` is an abstract class that implements the `Comparable` interface.

List of attributes:
- `protected String id;` Some form of account identification
- `protected double balance;` Stores the current balance

Implement the following constructor:
- `public Account(String id, double balance)` Note that even though the abstract class cannot be directly instantiated, this constructor will be used from a sub-class's constructor.

List of methods:
- `public String getID()` Returns the account id.
- `public double getBalance()` Returns the current balance.
- `public String toString()` Returns a string that contains the id and balance. For example, if the id is "ghosh" and balance is "120.30", the string returned is as follows (identical punctuation and spaces):
`ID: ghosh, Balance: 120.30`  The number of decimal digits must be exactly two.
- `public abstract void withdraw(double amount) throws IlleagalAmountException` This method will be implemented in the subclasses to allow withdrawal from ATMs as well as other electronic withdrawals (e.g., account to account transfer).
- `public abstract void deposit(double amount)` This method will be implemented in the subclasses to allow deposits at ATMs as well as other electronic deposits (e.g., account to account transfer).
- `public int compareTo(Account acct)` This method compares `this` account to another account based on the account balances.
# SavingsAccount class
`SavingsAccount` extends `Account`. A `SavingsAccount` requires a minimum of $10 in the account at any time. This account allows for depositing or withdrawing from ATM machines and electronic transfers. No fees are charged for depositing. Withdrawing money incurs a transaction fee of $2 per withdrawal that is taken out of the balance. Any withdrawal that causes the balance to go below $10 (because of the amount to be withdrawn plus the fee) is disallowed. Interest amount is calculated and added to the balance by the bank.

List of attributes:
- No new attributes are needed.

Implement the following constructor:
- `public SavingsAccount(String id, double initialDeposit)` Assume that the initial deposit passed will be at least $10. If the initial deposit is $10,000 or above, the bank adds an extra $200.00 as part of its ongoing promotion. You must call super to use the code of the Account superclass. Note that super must be called before anything else happens in the constructor.

List of methods:
- `public boolean withdraw(double amount)` Implement the withdraw method to take out the provided amount from the account balance. Incorporate the transaction fee for withdrawals. A withdrawal that potentially lowers the balance below $10 is not allowed.  A withdraw that is not allowed should not alter the balance and instead throw an IllegalAmountException. 
- `public void deposit(double amount)` The provided amount is added to the account as a result of an ATM transaction. No transaction fees apply.  If the amount is a negative number then an IllegalAmountException should be thrown.
- `public double addInterest(double rate)` The monthly rate is provided as a percentage by the caller of the method. The method calculates the interest on the balance and adds the interest to the balance. The method returns the interest that was calculated. Note that the caller takes care of determining when interest is due to be added. The addInterest method only needs to be aware of the formula to calculate interest (= balance*rate_in_percent/100). For example, if the monthly rate of interest is 0.25%, and the balance is $10,000, then the interest is $25, and the new balance becomes $10,025.

# CheckingAccount class
`CheckingAccount` extends `Account`. This account does not give any interest. It allows deposit and withdrawals through ATM machines and electronic transactions, both of which incur a fee of $1 per transaction, which is deducted from the balance. The balance cannot go below $0 using ATM or electronic transaction. Thus, the minimum amount that can be deposited is also $1. Assume that we will not try to deposit anything less than that.

Checks may be used to make withdrawals. The first three check uses in a month are free, but subsequent uses add a fee of $2 to each check withdrawal. Checks are allowed to take the balance to -$10 (i.e., an overdraft). One or more checks can bring the balance down to -$10, but not lower. If a check use potentially lowers the balance below -$10, the check is disallowed.

Tracking how many checks are used in a month requires a new attribute and methods. 

Implement the following attribute:
- `private int numberOfChecksUsed` Stores the number of checks used every month. Starts at 0, and can be reset using a method below.

The constructor should be of the form:
`public CheckingAccount(String id, double initialBalance)` Assume that the initial balance will not be negative. This constructor should use super to use the code in the superclass.

List of Methods:
- `public void withdraw(double amount)` Implement the withdraw method via ATMs to take out the provided amount from the account balance. Incorporate the transaction fee for ATM/electronic withdrawals. A withdrawal that potentially lowers the balance below $0 is not allowed. In such cases the balance remains unchanged but the method throws an IllegalAmountException. 
- `public void deposit(double amount)` The provided amount is added to the account as a result of an ATM transaction. Applicable transaction fees are deducted from the balance.  If the amount is less than the transaction fee then an `IllegalAmountException` should be thrown.
- `public void resetChecksUsed()` This method makes the numberOfChecksUsed zero.
- `public int getChecksUsed()` This method returns the numberOfChecksUsed.
- `public void withdrawUsingCheck(double amount) throws IllegalAmountException` This method allows one to use checks to withdraw cash. It updates the balance according to the rules described above. If the balance could fall below -$10 because of the amount and/or fees, the method doesn't change the balance, does not increment the number of checks used but throws an `IllegalAmountException`. A successful withdrawal results in updating the balance and number of checks used.

# Bank class
The bank class keeps information on all its accounts in an `ArrayList`. The bank class can retrieve a particular account using an account ID and perform deposits and withdrawals. It can perform monthly maintenance tasks such as resetting the number of checks in CheckingAccounts and adding interest in SavingsAccounts.

List of attributes:
- `private ArrayList<Account> accounts;` ArrayList of Accounts (including subclasses)
- `private double savingsInterestRate;` Rate of interest for `SavingsAccount` in percent

Constructors
- `public Bank()` Initializes the ArrayList.

List of methods:
- `public void setSavingsInterest(double rate)` Sets the rate in percent
- `public int numberOfAccounts()` Return the number of accounts active in the bank (not the capacity of the ArrayList accounts)
- `public void addAccount(Account a)` Add the provided account to the accounts ArrayList
- `public Account getAccount(String accountID)` Return the first Account object (could be a subclass) corresponding to the accountID. If the account does not exist for the specified accountID, then return null.
- `public boolean deposit(String accountID, double amount)` Deposit provided amount into the account specified by accountID. If account is not found return false.  If an exception occurs, then print the exceptions error message and return false.  Otherwise, return true.
- `public boolean withdraw(String accountID, double amount)` Withdraw provided amount from the account specified by accountID. If account is not found return false.  If an exception occurs, then print the exceptions error message and return false.  Otherwise, return true.
- `public boolean transfer(String fromAccountID, String toAccountID, double amount)` Withdraw from provided fromAccountID and deposit to specified toAccountID. If either accountId is not found, the method must return false and no deposit/withdrawal should occur. Both withdraw and deposit must succeed. If withdraw fails, then do not deposit (even it		 were to succeed) and vice versa. Return true if both succeed, false otherwise. Note that this method will call the deposit and withdraw methods declared in the abstract Account class. The transaction fees corresponding to concrete implementations of withdraw and deposit will apply.
- `public void addInterest()` Iterate through all accounts and add interest to the eligible accounts (i.e., all SavingsAccounts) using the rate set in the class.
- `public void reset()` Iterate through all accounts and reset the number of checks for applicable accounts (i.e., all CheckingAccounts)

# Teller class
Create a menu driven application that creates a `Bank` instance and presents the user with options to create accounts, delete accounts, list accounts, deposit, withdrawal, transfer, add interest rate, and reset checks used.  Your menu should look similar to the sample execution provided below:

```
Welcome to The Citadel Bank

Menu
----
1. Create Account
2. Delete Account
3. List Accounts
4. Deposit
5. Withdrawal
6. Transfer
7. Add Interest
8. Reset Checks Used
9. Exit

Choice: 
```

## Menu Option Descriptions

- **Create Account** should prompt for an account type (e.g., Checking or savings) and an initial balance.  It should then generate a random id, create the correct `Account` object and add it to the bank.
- **Delete Account** should prompt for an account id and remove it from the bank.
- **List Accounts** should sort the bank based on the balance and then print the `toString()` of each account.
- **Deposit** should prompt for an account id and amount and then attempt to deposit the amount into the account.  If the deposit is unsuccessful, alert the user with a message.
- **Withdrawal** should prompt for an account id and amount and then attempt to withdrawal the amount from the account.  If the withdrawal is unsuccessful, alert the user with a message.
- **Transfer** should prompt the user for an account id to transfer from, an account id to transfer to, and an amount.  If the transfer is unsuccessful then alert the user with a message.
- **Add interest** should iterate over each account in the bank and add interest to each `SavingsAccount`.
- **Reset Checks Used** should iterate over each account in the bank and reset the number of checks used for each `CheckingAccount`.
- **Exit** should terminate the program.

<sub>This assignment was adapted from https://www.cs.colostate.edu/~cs161/Summer15/more_assignments/P4/P4.html</sub>