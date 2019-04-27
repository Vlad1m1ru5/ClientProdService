package org.kuba.clprsrv.sbt;

/**
 *  Запись в таблице продутов.
 *  Продукт = Запись + Связанный клиент + Спрос.
 */
public class Product extends Record{
    private String boundClientUid;
    private int demand;

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

    public String getProduct () {
        int id = this.getId();
        String uid = this.getUid();
        String name = this.getName();
        String boundClientUid = this.boundClientUid;
        int demand = this.demand;

        try {
            return "id=" + String.valueOf(id) + " "
                    + "uid=" + uid + " "
                    + "name=" + name + " "
                    + "boundClientUid=" + boundClientUid + " "
                    + "demand=" + String.valueOf(demand);
        } catch (NullPointerException e) {
            return "id=" + String.valueOf(id) + " "
                    + "uid=" + uid + " "
                    + "name=" + name + " "
                    + "boundClientUid=" + boundClientUid + " "
                    + "demand=" + "UnexpectedValue";
        }
    }
}
