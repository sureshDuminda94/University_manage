
package Bisnes_custom_impl;

import Backend_course_db.HibernateUtil;
import java.util.ArrayList;
import java.util.List;


import Business_custom.CourseBO;
import Dao.DAOFactory;
import Dao_custom.CourseDAO;

import DTO.CourseDTO;
import Backend_course_entity.CourseEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class CourseBOImpl implements CourseBO{
    private  CourseDAO courseDAO = (CourseDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Course);
    private  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    
    public List<CourseDTO> getAllCourse() throws Exception {
        System.out.println("Bisnes_custom_impl.CourseBOImpl.getAllCourse()");
        Session session = sessionFactory.openSession();
        courseDAO.setSession(session);
        session.beginTransaction();
        List<CourseEntity> allCustomers = courseDAO.findAll();
        List<CourseDTO> dtos = new ArrayList<>(); 

        for (CourseEntity courseEntity : allCustomers) {
            CourseDTO dto = new CourseDTO(courseEntity.getId(),courseEntity.getCourse_id(), courseEntity.getCourse_name(),courseEntity.getSemester_count(),courseEntity.getFaculty());
            dtos.add(dto);
        }        
        session.getTransaction().commit();
        session.close();
        return dtos;
    }

    public  boolean saveCourse(CourseDTO dto) throws Exception {        
     
        Session session = sessionFactory.openSession();
        
        courseDAO.setSession(session);
        session.beginTransaction();               
        CourseEntity customer = new CourseEntity( dto.getId(),dto.getCourse_id(), dto.getCourse_name(),dto.getSemester_count(),dto.getFaculty());
        boolean result =  courseDAO.save(customer);
        
        session.getTransaction().commit();
        session.close();       
        return result;
        
    }

    public  boolean deleteCourse( Integer id) throws Exception {
        
        Session session = sessionFactory.openSession();
        courseDAO.setSession(session);
        session.beginTransaction();       
        boolean result = courseDAO.delete(id);
        
        session.getTransaction().commit();
        session.close();
        
        return result;
    }
    
    public  boolean  updateCourse(CourseDTO dto) throws Exception {
    
        Session session = sessionFactory.openSession();
        courseDAO.setSession(session);
        session.beginTransaction();      
        
        CourseEntity course = new CourseEntity( dto.getId(),dto.getCourse_id(), dto.getCourse_name(),dto.getSemester_count(),dto.getFaculty());
        boolean result = courseDAO.update(course);
        
         session.getTransaction().commit();
        session.close();
        
        return result;
    }

}
