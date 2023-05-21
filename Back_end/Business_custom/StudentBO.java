/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Business_custom;

import Business.SuperBO;
import DTO.StudentDTO;
import DTO.SubjectDTO;
import java.util.List;

/**
 *
 * @author suresh
 */
public interface StudentBO  extends SuperBO{
     public List<StudentDTO> getAllStudent() throws Exception;

    public boolean saveStudent(StudentDTO dto) throws Exception;

    public boolean deleteStudent(Integer subjectID) throws Exception;

    public boolean updateStudent(StudentDTO dto) throws Exception;
}
