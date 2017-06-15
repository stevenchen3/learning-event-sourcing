package models;

public class BankAccount {
  private int id;
  private String owner;
  private double balance;
  
  public BankAccount() {}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof BankAccount)) {
      return false;
    }
    BankAccount other = (BankAccount) obj;
    return this.id == other.id;
  }
}
