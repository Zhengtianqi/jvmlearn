package com.bjut.BingfaTest;

public class Account {
    // 封装账户编号，账户余额的两个成员变量
    private String accountNo;
    private double balance;

    public Account() {
    }

    // 构造器
    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int hashCode() {
        return accountNo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj != null && obj.getClass() == Account.class) {
            Account target = (Account) obj;
            return target.getAccountNo().equals(accountNo);
        }
        return false;
    }

    /*
     *  getter
     *  setter
     *  --------------start----------------
     *  */
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    /*
     *  getter
     *  setter
     *  --------------end--------------
     *  */
}
