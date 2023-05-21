/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bisnes_custom_impl;

import Backend_course_db.HibernateUtil;
import Backend_course_entity.CourseEntity;
import Backend_course_entity.SubjectEntity;
import Business_custom.SubjectBO;
import DTO.CourseDTO;
import DTO.SubjectDTO;
import Dao.DAOFactory;
import Dao_custom.CourseDAO;
import Dao_custom.SubjectDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author suresh
 */
public class SubjectBOImpl implements SubjectBO{
    
    private  SubjectDAO subjectDAO = (SubjectDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUBJECT);
    private  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();


    @Override
    public List<SubjectDTO> getAllSubject() throws Exception {
          System.out.println("Bisnes_custom_impl.CourseBOImpl.getAllsUBJECT()");
        Session session = sessionFactory.openSession();
        subjectDAO.setSession(session);
        session.beginTransaction();
        List<SubjectEntity> allSubject = subjectDAO.findAll();
        List<SubjectDTO> dtos = new ArrayList<>(); 

        for (SubjectEntity subjectEntity : allSubject) {
         SubjectDTO    dto = new SubjectDTO(subjectEntity.getId(),subjectEntity.getSubjec_code(), subjectEntity.getSubject_name(),subjectEntity.getSemester(),subjectEntity.getCredits(),subjectEntity.getGrade_value());
            dtos.add(dto);
        }        
        session.getTransaction().commit();
        session.close();
        return dtos;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean saveSubject(SubjectDTO dto) throws Exception {
       Session session = sessionFactory.openSession();
        
        subjectDAO.setSession(session);
        session.beginTransaction();               
        SubjectEntity subject = new SubjectEntity(dto.getId(),dto.getSubjec_code(),dto.getSubject_name(), dto.getSemester(),dto.getCredits(),dto.getGrade_value());
        boolean result =  subjectDAO.save(subject);
        
        session.getTransaction().commit();
        session.close();       
        return result;
        
    }

    @Override
    public boolean deleteSubject(String subjectID) throws Exception {
      boolean result =false;
        Session session = sessionFactory.openSession();
        subjectDAO.setSession(session);
        session.beginTransaction();  
      SQLQuery query =session.createSQLQuery("delete from SubjectEntity where subjec_code =:id  ");
        String s  = subjectID;
           query.setParameter("id",s );
        //boolean result = subjectDAO.delete(subjectID);
        query.executeUpdate();
        session.getTransaction().commit();
        result = true;
        session.close();
        
        return result; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateSubject(SubjectDTO dto) throws Exception {
                Session session = sessionFactory.openSession();
        subjectDAO.setSession(session);
        session.beginTransaction();      
        
        SubjectEntity subject = new SubjectEntity(dto.getId(),dto.getSubjec_code(),dto.getSubject_name(), dto.getSemester(),dto.getCredits(),dto.getGrade_value());
        
        
        boolean result = subjectDAO.update(subject);
        
         session.getTransaction().commit();
        session.close();
        
        return result; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
