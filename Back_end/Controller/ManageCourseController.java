
package Controller;


import java.util.List;
import Business.BOFactory;
import Business_custom.CourseBO;
import DTO.CourseDTO;

/**
 *
 * @author ranjith-suranga
 */
public class ManageCourseController{
    
    
    private static CourseBO courseBO = (CourseBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.COURSE);
    
    public static List<CourseDTO> getAllCourse() throws Exception{
        return courseBO.getAllCourse();
    }
    
    public static boolean saveCustomer(CourseDTO customer) throws Exception{
        return courseBO.saveCourse(customer);
    }
    
    public static boolean deleteCourse(Integer customerId) throws Exception{
        return courseBO.deleteCourse(customerId);
    }
     public static boolean updateCourse(CourseDTO courseDTO) throws Exception{
        return courseBO.updateCourse(courseDTO);
    }
    
}
