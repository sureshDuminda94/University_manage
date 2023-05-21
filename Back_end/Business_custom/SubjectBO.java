/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Business_custom;

import Business.SuperBO;
import DTO.CourseDTO;
import DTO.SubjectDTO;
import java.util.List;

/**
 *
 * @author suresh
 */
public interface SubjectBO extends SuperBO {

    public List<SubjectDTO> getAllSubject() throws Exception;

    public boolean saveSubject(SubjectDTO dto) throws Exception;

    public boolean deleteSubject(String subjectID) throws Exception;

    public boolean updateSubject(SubjectDTO subjectDTO) throws Exception;

}
