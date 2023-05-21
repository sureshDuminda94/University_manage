/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.excution;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import Backend_course_db.HibernateUtil;

/**
 *
 * @author Sanu
 */
public class HibOneToOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session openSession = sessionFactory.openSession();
        Transaction tans = openSession.beginTransaction();
        
        Passport p= new Passport();
        p.setName("Police");
           Passport p3= new Passport();
        p3.setName("pukis");
        
        Man m= new Man();
        m.setName("Sanu Vithanageee");
        
        
       // m.setPass(p2);
        //p.setMan(m);
        openSession.save(m);
        tans.commit();
        openSession.close();
    }
    
}
