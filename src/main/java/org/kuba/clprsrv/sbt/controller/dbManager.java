package org.kuba.clprsrv.sbt.controller;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 *  Управление таблицами в базах.
 */
public class dbManager {
    private String dbName;
    private DriverManagerDataSource driver;
    private Connection connection;

    /*
        setters
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public void setDriver(DriverManagerDataSource driver) {
        this.driver = driver;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /*
        getters
     */
    public DriverManagerDataSource getDriver() {
        return driver;
    }

    public Connection getConnection() {
        return connection;
    }

    public String getDbName() {
        return dbName;
    }

    /*
        functions
     */
    public Connection openConnection(DriverManagerDataSource driver) {

        // Для отладки
        // Для логирования
        System.out.println("-- Start Connection --");

        return connection;
    }

    public Connection closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();

            // Для отладки
            // Для логирования
            System.out.println("-- FINISH Connection --");
        }

        return connection;
    }

    public String getDbUrl() {
        String url = "";
        //TODO
        //  сформировать корректный url?
        return url;
    }

}
