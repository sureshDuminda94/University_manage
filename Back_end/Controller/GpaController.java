/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Business.BOFactory;
import Business_custom.GpaBO;
import DTO.GpaDTO;
import java.util.List;

/**
 *
 * @author suresh
 */
public class GpaController {
    
        
    private static GpaBO  g= (GpaBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.GPA);
    
 
    public static String getAllgPA (String stId , String semester)throws Exception {
        return  g.getGpaByid( stId , semester);
    }
    
    public static boolean saveGpa(GpaDTO gpa) throws Exception{
        return g.saveGpa(gpa);
    }
    
    public static boolean deleteGpa(Integer id ) throws Exception{
        return g.deleteGpa(id);
    }
     public static boolean updateGpa(GpaDTO gpaDTO) throws Exception{
        return g.updateGpa(gpaDTO);
    }
    
    
}
