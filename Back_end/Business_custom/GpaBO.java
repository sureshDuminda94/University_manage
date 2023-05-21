/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Business_custom;

import Backend_course_entity.GpaEntity;
import Business.SuperBO;
import DTO.GpaDTO;

import DTO.MarksTransaction;
import DTO.SubjectDTO;
import java.util.List;

/**
 *
 * @author suresh
 */
public interface GpaBO extends SuperBO{
    
    public String getCredits(String id)throws Exception;
       

    public  List<MarksTransaction> getStudentMarksById(String stId, String semesterId) throws Exception;
     public  String getGpaByid(String stId, String semesterId) throws Exception;
    public boolean saveGpa(GpaDTO dto) throws Exception;

    public boolean deleteGpa(Integer marksId) throws Exception;

    public boolean updateGpa(GpaDTO dto) throws Exception;
    

}
