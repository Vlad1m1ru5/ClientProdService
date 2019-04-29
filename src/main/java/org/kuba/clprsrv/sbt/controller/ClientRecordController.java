package org.kuba.clprsrv.sbt.controller;

import org.kuba.clprsrv.sbt.model.ClientRecord;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *  Контроллер ресурсов клента.
 *
 */
public class ClientRecordController implements Controllable {
    private DriverManagerDataSource driver;
    private Connection connection;
    private String quarry;
    private String url;
    private String userName;
    private String userPass;

    /*
        constructors
     */
    ClientRecordController () {

    }

    ClientRecordController (DriverManagerDataSource driver) throws SQLException {
        setConnection(driver);
    }

    ClientRecordController (Connection connection) {
        setConnection(connection);
    }

    /*
        setters
     */
    public void setDriver (DriverManagerDataSource driver) {
        this.driver = driver;
    }

    public void setConnection (Connection connection) {
        this.connection = connection;
    }

    public void setConnection (DriverManagerDataSource driver) throws SQLException {
        setUrl(driver.getUrl());
        setUrl(driver.getUsername());
        setUrl(driver.getPassword());
        Connection connection = driver.getConnection();
        setConnection(connection);
    }

    public void setQuarry (String quarry) {
        this.quarry = quarry;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    /*
        getters
     */
    public DriverManagerDataSource getDriver () {
        return driver;
    }

    public Connection getConnection () {
        return connection;
    }

    public String getQuarry () {
        return quarry;
    }

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPass() {
        return userPass;
    }

    /*
        functions
     */
    public void input (ClientRecord clientRecord) {
        // Для отладки
        // Для логгирования
        System.out.println("-- START Client record  input --");

        try {
            // TODO
            //  1. проверить подключение -> бд -> таблица
            //  2. сформировать поля для отправки
            //  3. сформировать запрос (quarry)
            //  4. отправить запрос на добавление записи


        } catch (Exception anyException) {
            // TODO
            //  exception behavior?
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    // TODO
                    //  SET LOGGER INFO
                }
            }

            // Для отладки
            // Для логгирования
            System.out.println("-- FINISH Client record  input --");
        }
    }

    public void output (ClientRecord clientRecord) {
        // Для отладки
        // Для логгирования
        System.out.println("-- Client record output --");


    }

    public void update (ClientRecord clientRecord) {
        // Для отладки
        // Для логгирования
        System.out.println("-- Client record update --");


    }

    public void delete(ClientRecord clientRecord) {
        // Для отладки
        // Для логгирования
        System.out.println("-- Client record delete --");


    }
}
