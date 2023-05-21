package Backend_course_db;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Backend_course_entity.Account;
import Backend_course_entity.CourseEntity;
import Backend_course_entity.GpaEntity;
import Backend_course_entity.MarksEntity;
import Backend_course_entity.StudentEntity;
import Backend_course_entity.SubjectEntity;
import java.io.File;
import Main.excution.*;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.MetadataSource;



public class HibernateUtil {
    
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory(){
        
        File configFile = new File("Resources/application.properties");
        System.out.println("_______________________");
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().loadProperties(configFile).build();
        System.out.println("++++++++++++++++++");
        Metadata metaData = new MetadataSources(registry)
                
                .addAnnotatedClass(CourseEntity.class)
                .addAnnotatedClass(SubjectEntity.class)
                .addAnnotatedClass(StudentEntity.class)
                .addAnnotatedClass(MarksEntity.class)
                  .addAnnotatedClass(GpaEntity.class)
                .addAnnotatedClass(Account.class)
              
               
                .buildMetadata();
                System.out.println("++++++++++++++++++++++++++++()");

        return metaData.getSessionFactoryBuilder().build();
        
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
}
