package org.kuba.clprsrv.sbt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Vladimir
 *
 */
public class WebApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
    }
}
