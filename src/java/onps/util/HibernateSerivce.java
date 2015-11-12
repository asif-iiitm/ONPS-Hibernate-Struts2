package onps.util;

import onps.entity.Users;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

public class HibernateSerivce {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            AnnotationConfiguration cfg = new AnnotationConfiguration();
            cfg.addAnnotatedClass(Users.class);
            
            cfg.configure();
            sessionFactory = cfg.buildSessionFactory();
            
          
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static Session getSession(){
     return sessionFactory.openSession();
    }
}
