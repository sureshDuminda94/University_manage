/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Business.BOFactory;
import Business_custom.StudentBO;
import DTO.StudentDTO;
import java.util.List;

/**
 *
 * @author suresh
 */
public class ManageStudentController {
    
    public static void st(){}
     private static StudentBO studentBO = (StudentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.STUDENT);
//    
    public static List<StudentDTO> getAllStudent() throws Exception{
        return studentBO.getAllStudent();
    }
//    
    public static boolean saveStudent(StudentDTO dto) throws Exception{
        return studentBO.saveStudent(dto);
    }
    
    public static boolean deleteStudent(Integer studentID) throws Exception{
        return studentBO.deleteStudent(studentID);
    }
     public static boolean updateStudent(StudentDTO dto) throws Exception{
        return studentBO.updateStudent(dto);
    }
}
