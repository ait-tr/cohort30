package practice;

public class BankAccount {
    // Идентификатор аккаунта
    private String accountId;

    // Баланс на аккаунте
    private double balance;

    // Процентная ставка по всем аккаунтам
    private static double interestRate;

    // Общее количество аккаунтов в банке
    private static int totalAccounts;

    // Конструктор
    public BankAccount(String accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
    }

    // Метод для пополнения баланса
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Метод для снятия средств
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    // Метод для получения текущего баланса
    public double getBalance() {
        return balance;
    }

    // Метод для установки процентной ставки
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    // Метод для получения процентной ставки
    public double getInterestRate() {
        return interestRate;
    }

    // Метод для получения общего количества аккаунтов
    public int getTotalAccounts() {
        return totalAccounts;
    }
}
