package org.kuba.clprsrv.sbt;

/**
 *  Кортеж в таблице продутов.
 *  Запись о продукте = Запись + Связанный клиент + Спрос.
 */
public class ProductRecord extends Record{
    private String boundClientUid;
    private int demand;

    /*
        constructors
     */
    public ProductRecord () {

    }

    public ProductRecord (int id, String uid, String name, String boundClientUid, int demand) {
        this.setId(id);
        this.setUid(uid);
        this.setName(name);
        this.setBoundClientUid(boundClientUid);
        this.setDemand(demand);
    }

    /*
        setters
     */
    public void setBoundClientUid (String clientUid) {
        this.boundClientUid = clientUid;
    }

    public void setDemand (int demand) {
        this.demand = demand;
    }

    /*
        getters
     */
    public String getBoundClientUid () {
        return boundClientUid;
    }

    public int getDemand () {
        return demand;
    }

    @Override
    public String toString () {
        int id = this.getId();
        String uid = this.getUid();
        String name = this.getName();
        String boundClientUid = this.getBoundClientUid();
        int demand = this.getDemand();

        return "Product [id=" + id + ", "
                + "uid=" + uid + ", "
                + "name=" + name + ", "
                + "boundClientUid=" + boundClientUid + ", "
                + "demand=" + demand
                + "]";
    }

}
