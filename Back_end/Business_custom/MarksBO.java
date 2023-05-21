/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Business_custom;

import Business.SuperBO;
import DTO.MarksDTO;
import DTO.MarksTransaction;
import java.util.List;

/**
 *
 * @author suresh
 */
public interface MarksBO extends SuperBO{
    
        public List<MarksTransaction> getAllMarks(String stid)throws Exception;

    public boolean saveMarks(MarksDTO dto) throws Exception;

    public boolean deleteMarks(Integer marksId) throws Exception;

    public boolean updateMarks(MarksDTO dto) throws Exception;
    
    
    

}
