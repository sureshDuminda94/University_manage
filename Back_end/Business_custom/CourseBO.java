/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_custom;

import java.util.List;
import Business.SuperBO;
import Backend_course_entity.CourseEntity;
import DTO.CourseDTO;

/**
 *
 * @author ranjith-suranga
 */
public interface CourseBO extends SuperBO{
    
     public List<CourseDTO> getAllCourse() throws Exception;
     
     public  boolean saveCourse(CourseDTO dto) throws Exception;
     
     public  boolean deleteCourse(Integer customerID) throws Exception;
      public  boolean updateCourse(CourseDTO courseDTO) throws Exception;
    
}
