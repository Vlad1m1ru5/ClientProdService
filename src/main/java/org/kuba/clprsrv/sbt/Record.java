package org.kuba.clprsrv.sbt;

/**
 *  Абстрактный класс для записи информации
 *  в кортеже базы данных.
 *
 */
public abstract class Record {
    private int id;
    private String uid;
    private String name;

    /*
        setters
     */
    public void setId (int id) {
        this.id = id;
    }

    public void setUid (String uid) {
        this.uid = uid;
    }

    public void setName (String name) {
        this.name = name;
    }

    /*
        getters
     */
    public int getId () {
        return id;
    }

    public String getUid () {
        return uid;
    }

    public String getName () {
        return name;
    }
}
