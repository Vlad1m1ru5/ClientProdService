package org.kuba.clprsrv.sbt;

/**
 *  Кортеж в таблице клиентов.
 *  Запись о лкиенте = Запись + Связанный продукт + Балланс.
 */
public class ClientRecord extends Record {
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

    public void setClient (int id, String uid, String name, String boundProductUid, double balance) {
        this.setId(id);
        this.setUid(uid);
        this.setName(name);
        this.setBoundProductUid(boundProductUid);
        this.setBalance(balance);
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
        String boundProductUid = this.getBoundProductUid();
        double balance = this.getBalance();

        return "id=" + String.valueOf(id) + " "
                + "uid=" + uid + " "
                + "name=" + name + " "
                + "boundClientUid=" + boundProductUid + " "
                + "demand=" + String.valueOf(balance);
    }

}
