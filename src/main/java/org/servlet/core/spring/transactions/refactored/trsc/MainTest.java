package org.servlet.core.spring.transactions.refactored.trsc;

public class MainTest {
    public static void main(String[] args) {
        TransactionManager transactionManager = new TransactionManager();
        MyTransactionCallback callback = new MyTransactionCallback();

        transactionManager.executeTransaction(callback);
    }
}
