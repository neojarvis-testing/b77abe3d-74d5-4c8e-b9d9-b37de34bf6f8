public class SavingsAcc2

{

private double balance;

private double interest;

 

 public SavingsAcc2()

{

balance = 0.0;

interest = 6.17;

}

 public SavingsAcc2(double initBalance, double interested)

{

balance = initBalance;

interest = interested;

 }

 public SavingsAcc2 deposit(double amount)

{

balance = balance + amount;

return;

}

 public SavingsAcc2 withdraw(double amount)

{

balance = balance - amount;

return;

}

 public SavingsAcc2 addInterest(double interest)

{

balance = balance * (interest / 100) + balance;

return;

}

 public double getBalance()

{

return balance;

}

}
