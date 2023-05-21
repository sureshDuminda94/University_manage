/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Bisnes_custom_impl.CourseBOImpl;
import Bisnes_custom_impl.GpaBOImpl;
import Bisnes_custom_impl.MarksBOImpl;
import Bisnes_custom_impl.StudentBOImpl;
import Bisnes_custom_impl.SubjectBOImpl;



/**
 *
 * @author ranjith-suranga
 */
public class BOFactory {
    
    public enum BOTypes{
        COURSE, SUBJECT,STUDENT,MARKS,GPA;

        private BOTypes() {
        }
    }
    
    private static BOFactory bOFactory;
    
    private BOFactory(){
        
    }
    
    public static BOFactory getInstance(){
        if (bOFactory == null){
            bOFactory = new BOFactory();
        }
        return bOFactory;
    }
    
    public SuperBO getBO(BOTypes type){
        switch(type){
            case COURSE:
                return new CourseBOImpl();
                       
                    case SUBJECT:
                return new SubjectBOImpl();
                
                    case STUDENT:
                return new StudentBOImpl();
                
                     case MARKS:
                return new MarksBOImpl();
                
                    case GPA:
                return new GpaBOImpl();
                
            default:
                return null;
     }
    }
    
}
