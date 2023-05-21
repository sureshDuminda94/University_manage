
package Dao;


import Dao_custom_impl.CourseDAOImpl;
import Dao_custom.CourseDAO;
import Dao_custom_impl.GpaDAOImpl;
import Dao_custom_impl.MarksDAOImpl;
import Dao_custom_impl.StudentDAOImpl;
import Dao_custom_impl.SubjectDAOImpl;


/**
 *
 * @author ranjith-suranga
 */
public class DAOFactory {
    
    public enum DAOTypes{
        Course,SUBJECT,STUDENT,MARKS,GPA
    }
    
    private static DAOFactory dAOFactory;
    
    private DAOFactory(){
        
    }
    
    public static DAOFactory getInstance(){
        if (dAOFactory == null){
            dAOFactory = new DAOFactory();
        }
        return dAOFactory;
    }
    
    public SuperDAO getDAO(DAOTypes daoType){
        switch(daoType){
            case Course:
                return new CourseDAOImpl();
                
                  case  SUBJECT:
                return new SubjectDAOImpl();
                  case  STUDENT:
                return new StudentDAOImpl();
                  case  MARKS:
                return new MarksDAOImpl();
                  case GPA:
                      return  new GpaDAOImpl();
         
            default:
                return null;
        }
    }
    
}