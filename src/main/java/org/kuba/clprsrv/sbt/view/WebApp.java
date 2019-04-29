package org.kuba.clprsrv.sbt.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *  @author Vladimir
 *  Первый web сервис.
 *  База клиентов и продуктов.
 */
public class WebApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    }
}
