package org.kuba.clprsrv.sbt;

/**
 *  Запись в таблице клиентов.
 *  Клиент = Запись + Связанный продукт + балланс
 */
public class Client extends Record {
    private String boundProductUid;
    private double balance;

    /*
        setters
     */
    public void setBoundProductUid (String productUid) {
        this.boundProductUid = productUid;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    /*
        getters
     */
    public String getBoundProductUid () {
        return boundProductUid;
    }

    public double getBalance () {
        return balance;
    }

    public String getClient () {
        int id = this.getId();
        String uid = this.getUid();
        String name = this.getName();
        String boundProductUid = this.boundProductUid;
        double balance = this.balance;

        return new String();
    }
}
