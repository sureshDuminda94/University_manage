/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Business.BOFactory;
import Business_custom.MarksBO;
import DTO.MarksDTO;
import DTO.MarksTransaction;
import DTO.SubjectDTO;
import java.util.List;

/**
 *
 * @author suresh
 */
public class ManageMarksController {
    
         private static MarksBO marksBO = (MarksBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.MARKS);
    
    public static List<MarksTransaction> getAllMarks(String stid) throws Exception{
        return marksBO.getAllMarks(stid);
    }
    
    public static boolean saveMarks(MarksDTO marksDTO) throws Exception{
        return marksBO.saveMarks(marksDTO);
    }
    
    public static boolean deleteMarks(Integer marksId) throws Exception{
        return marksBO.deleteMarks(marksId);
    }
     public static boolean updateMarks(MarksDTO marksDTO) throws Exception{
        return marksBO.updateMarks(marksDTO);
    }
    
    
}
