/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Business.BOFactory;
import Business_custom.SubjectBO;
import DTO.SubjectDTO;
import java.util.List;

/**
 *
 * @author suresh
 */
public class ManageSubjectContrller {
    
     private static SubjectBO subjectBO = (SubjectBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.SUBJECT);
    
    public static List<SubjectDTO> getAllSubject() throws Exception{
        return subjectBO.getAllSubject();
    }
    
    public static boolean saveSubject(SubjectDTO subjectDTO) throws Exception{
        return subjectBO.saveSubject(subjectDTO);
    }
    
    public static boolean deleteSubject(String subjectID) throws Exception{
        return subjectBO.deleteSubject(subjectID);
    }
     public static boolean updateSubject(SubjectDTO subjectDTO) throws Exception{
        return subjectBO.updateSubject(subjectDTO);
    }
    
}
