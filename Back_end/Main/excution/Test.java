/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.excution;
import Backend_course_db.HibernateUtil;
import Bisnes_custom_impl.GpaBOImpl;
import org.hibernate.SessionFactory;
public class Test {
    public static void main(String[] args) throws Exception {
        
        SessionFactory sessionFactory = new HibernateUtil().getSessionFactory();
        new GpaBOImpl().getStudentMarksById("st1","sem1");
        new GpaBOImpl().getCredits("sb1");
      
    }
    
}
