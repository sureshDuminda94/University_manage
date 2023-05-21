/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bisnes_custom_impl;

import Backend_course_db.HibernateUtil;
import Backend_course_entity.StudentEntity;
import Backend_course_entity.SubjectEntity;
import Business_custom.StudentBO;
import DTO.StudentDTO;
import DTO.SubjectDTO;
import Dao.DAOFactory;
import Dao_custom.StudentDAO;
import Dao_custom.SubjectDAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author suresh
 */
public class StudentBOImpl implements StudentBO {

    private StudentDAO studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public List<StudentDTO> getAllStudent() throws Exception {

        System.out.println("Bisnes_custom_impl.CourseBOImpl.getAllsUBJECT()");
        Session session = sessionFactory.openSession();
        studentDAO.setSession(session);
        session.beginTransaction();
        List<StudentEntity> allStudent = studentDAO.findAll();
        List<StudentDTO> dtos = new ArrayList<>();

        for (StudentEntity studentEntity : allStudent) {

            //StudentDTO    dto = new StudentDTO(studentEntity.getId(),studentEntity.getStudent_id(), studentEntity.getNic(),studentEntity.getBirth(),studentEntity.getAddress());
            StudentDTO studentDTO = new StudentDTO(studentEntity.getId(), studentEntity.getStudent_id(), studentEntity.getStudent_name(), studentEntity.getNic(), studentEntity.getBirth(), studentEntity.getAddress(),studentEntity.getCourse());
            dtos.add(studentDTO);
        }
        session.getTransaction().commit();
        session.close();
        return dtos;

    }

    @Override
    public boolean saveStudent(StudentDTO dto) throws Exception {
        Session session = sessionFactory.openSession();

        studentDAO.setSession(session);
        session.beginTransaction();
        StudentEntity student = new StudentEntity(0, dto.getStudent_id(), dto.getStudent_name(), dto.getNic(), dto.getBirth(), dto.getAddress(),dto.getCourse());

        boolean result = studentDAO.save(student);

        session.getTransaction().commit();
        session.close();
        return result;
    }

    @Override
    public boolean deleteStudent(Integer studentID) throws Exception {
        Session session = sessionFactory.openSession();
        studentDAO.setSession(session);
        session.beginTransaction();
        boolean result = studentDAO.delete(studentID);

        session.getTransaction().commit();
        session.close();

        return result;
    }

    @Override
    public boolean updateStudent(StudentDTO dto) throws Exception {

        Session session = sessionFactory.openSession();
        studentDAO.setSession(session);
        session.beginTransaction();

        StudentEntity student = new StudentEntity(dto.getId(), dto.getStudent_id(), dto.getStudent_name(), dto.getNic(), dto.getBirth(), dto.getAddress(),dto.getCourse());

        boolean result = studentDAO.update(student);

        session.getTransaction().commit();
        session.close();

        return result;

// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
