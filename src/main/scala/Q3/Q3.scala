package Q3

object Q3 {
  class Account(private var balance: Double) {

    // Deposit
    def deposit(amount: Double): Unit = {
      if (amount > 0) {
        balance += amount
        println(s"Deposited $amount. New balance: $balance")
      } else {
        println("Invalid deposit amount. Amount must be greater than 0.")
      }
    }

    // Withdraw
    def withdraw(amount: Double): Unit = {
      if (amount > 0 && amount <= balance) {
        balance -= amount
        println(s"Withdrew $amount. New balance: $balance")
      } else {
        println("Invalid withdrawal amount or insufficient funds.")
      }
    }

    // Transfer
    def transfer(toAccount: Account, amount: Double): Unit = {
      if (amount > 0 && amount <= balance) {
        withdraw(amount)
        toAccount.deposit(amount)
        println(s"Transferred $amount to another account.")
      } else {
        println("Invalid transfer amount or insufficient funds.")
      }
    }

    // Get the current balance
    def getBalance: Double = balance
  }

  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000.0)
    val account2 = new Account(500.0)

    println(s"Account 1 Balance: ${account1.getBalance}")
    println(s"Account 2 Balance: ${account2.getBalance}\n")

    account1.deposit(200.0)
    account1.withdraw(100.0)
    account1.transfer(account2, 300.0)

    println(s"\nAccount 1 Balance: ${account1.getBalance}")
    println(s"Account 2 Balance: ${account2.getBalance}")
  }
}
