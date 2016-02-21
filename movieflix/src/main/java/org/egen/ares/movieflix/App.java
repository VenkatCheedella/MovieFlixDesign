package org.egen.ares.movieflix;

import org.egen.ares.MovieFlixConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new 
        		AnnotationConfigApplicationContext(MovieFlixConfig.class); 
        IDataStore dataStore = (IDataStore)context.getBean("datastore");
        System.out.println("DataStore retrieved" + ((dataStore != null) ? true: false));
        context.close();
    }
}
