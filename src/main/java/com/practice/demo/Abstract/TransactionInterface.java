package com.practice.demo.Abstract;

import com.practice.demo.models.TransactionType;

import java.util.Date;
public interface TransactionInterface {


    public long getTransactionID();
    public void setTransactionID(long transactionID);
    public BankAccount getAccount();
    public void setAccount(BankAccount account);
    public TransactionType getType();
    public void setType(TransactionType type);
    public double getTransactionAmt();
    public void setTransactionAmt(double transactionAmt);
    public Date getTransactionDate();
    public void setTransactionDate(Date transactionDate);

}

