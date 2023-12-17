package org.kodnest.hibernate_demo1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf=new Configuration();
    	conf.configure();
    	
    	SessionFactory factory=conf.buildSessionFactory();
    	
        System.out.println( "Hibernate started successfully! "+factory.toString() );
    }
}
