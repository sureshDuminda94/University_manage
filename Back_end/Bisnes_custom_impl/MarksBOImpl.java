/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bisnes_custom_impl;

import Backend_course_db.HibernateUtil;
import Backend_course_entity.CourseEntity;
import Backend_course_entity.MarksEntity;
import Backend_course_entity.StudentEntity;
import Backend_course_entity.SubjectEntity;
import Business_custom.CourseBO;
import Business_custom.MarksBO;
import DTO.MarksDTO;
import DTO.MarksTransaction;
import Dao.DAOFactory;
import Dao_custom.MarksDAO;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionImpl;
import org.hibernate.query.Query;

/**
 *
 * @author suresh
 */
public class MarksBOImpl implements MarksBO {

    private MarksDAO marksDAO = (MarksDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MARKS);
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public List<MarksTransaction> getAllMarks(String stid) throws Exception {

        List<MarksTransaction> mliist = new ArrayList<>();
        System.out.println("______________________?" + stid);
        String stidr = stid;
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        //SQLQuery query = session.createSQLQuery("SELECT course_id ,subject_id FROM MarksEntity WHERE student_id = 's1' ");
        SQLQuery query = session.createSQLQuery("SELECT  student_id,course_id , subject_id ,semester,marks,grade,grade_point FROM MarksEntity m where m.student_id=:stId");
        //SQLQuery query1 = session2.createSQLQuery("SELECT credits FROM SubjectEntity where subjec_code=:subId");

        query.setParameter("stId", stidr);

        System.out.println("------------------________________");

        List<Object[]> rowss = query.list();
        System.out.println("data____________________________________________________");
        //  System.out.println("++++++++++++++++++" + rowss.get(0).toString());

        for (Iterator it = rowss.iterator(); it.hasNext();) {
            Object[] ra = (Object[]) it.next();
            MarksTransaction mt = new MarksTransaction();

            mt.setStudent_id(stidr);
            mt.setCourse_id(ra[1].toString());

            mt.setSubject_id(ra[2].toString());

            mt.setSemester(ra[3].toString());

            mt.setMarks(Integer.parseInt(ra[4].toString()));
            mt.setGrade(ra[5].toString());
            mt.setGrade_pont(Double.valueOf(ra[6].toString()));

            System.err.println("marks" + mt.getMarks());
            
            mliist.add(mt);
        }

        session.getTransaction().commit();
        session.close();

        return mliist;

    }

    @Override
    public boolean saveMarks(MarksDTO dto) throws Exception {
        Session session = sessionFactory.openSession();

        marksDAO.setSession(session);
        session.beginTransaction();

        MarksEntity marksEntity = new MarksEntity(0, dto.getMarks(), dto.getGrade(), dto.getSemester(), dto.getGrade_point(), dto.getSubject_id(), dto.getCourse_id(), dto.getStudent_id());

        session.save(marksEntity);
        System.out.println("Bisnes_custom_impl.MarksBOImpl.saveMarks()");

        session.getTransaction().commit();

        session.close();
        // session.flush();
        return true;

    }

    @Override
    public boolean deleteMarks(Integer marksId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateMarks(MarksDTO dto) throws Exception {
            Session session = sessionFactory.openSession();

                    
        MarksEntity marksEntity = new MarksEntity(0, dto.getMarks(), dto.getGrade(), dto.getSemester(), dto.getGrade_point(), dto.getSubject_id(), dto.getCourse_id(), dto.getStudent_id());


           marksDAO.update(marksEntity);
                   session.getTransaction().commit();
                   session.close();
                   return  true;

// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
