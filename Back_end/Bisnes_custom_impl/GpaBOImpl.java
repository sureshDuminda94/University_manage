/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bisnes_custom_impl;

import Backend_course_db.HibernateUtil;
import Backend_course_entity.GpaEntity;
import Business_custom.GpaBO;
import DTO.GpaDTO;
import DTO.MarksTransaction;
import DTO.SubjectDTO;
import Dao.DAOFactory;
import Dao_custom.CourseDAO;
import Dao_custom.GpaDAO;
import Dao_custom.MarksDAO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author suresh
 */
public class GpaBOImpl implements GpaBO {

    private CourseDAO courseDAO = (CourseDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Course);
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    List<MarksTransaction> mlist = new ArrayList<>();
  
    @Override
    public List<MarksTransaction> getStudentMarksById(String stId, String semesterId) throws Exception {

        System.out.println("Bisnes_custom_impl.CourseBOImpl.getAllmarks()");
        Session session = sessionFactory.openSession();
        Session session2 = sessionFactory.openSession();
        session.beginTransaction();
        session2.beginTransaction();
        // SQLQuery query = session.createSQLQuery("SELECT course_id ,subject_id FROM MarksEntity WHERE student_id = 's1' ");

        //SQLQuery query1 = session.createSQLQuery("SELECT credits FROM SubjectEntity where subject_id=:");
        SQLQuery query = session.createSQLQuery("SELECT student_name,subject_id, course_id ,grade, grade_point ,semester,marks FROM MarksEntity m, StudentEntity s where " + "m.student_id=:stId  AND s.student_id=:stId");
        //SQLQuery query1 = session2.createSQLQuery("SELECT credits FROM SubjectEntity where subjec_code=:subId");
        query.setParameter("stId", stId);
        

        

        List<Object[]> rows = query.list();
        System.out.println("++++++++++++++++++" + rows.toString());

        for (Iterator it = rows.iterator(); it.hasNext();) {
            Object[] ra = (Object[]) it.next();
            MarksTransaction mt = new MarksTransaction();
           
            System.out.println("===============================0====" + ra[0]);
            mt.setName(ra[0].toString());
            System.out.println("===============================1====" + ra[1]);
            mt.setSubject_id(ra[1].toString());
            System.out.println("===============================2====" + ra[2]);
            mt.setCourse_id(ra[2].toString());

            System.out.println("===============================3====" + ra[3]);
            mt.setGrade(ra[3].toString());
            System.out.println("===============================4=====" + ra[4]);
            mt.setGrade_pont(Double.valueOf(ra[4].toString()));
            System.out.println("===============================5=====" + ra[5]);
            mt.setSemester(ra[5].toString());
            System.out.println("===============================6" + ra[6]);
            mt.setMarks(Integer.parseInt(ra[6].toString()));
            mt.setStudent_id(stId);
            

            mlist.add(mt);
        }

        session.getTransaction().commit();
        session.close();
        return mlist;

    }
    Double gpa =.0;
    
    public Double calculateGpa(String stId, String semesterId) throws Exception{
        
          List<MarksTransaction> allMarks = getStudentMarksById(stId, semesterId);
    for (MarksTransaction m : allMarks){
    
        System.out.println("Bisnes_custom_impl.GpaBOImpl.calculateGpa()"+m.getGrade_pont());
        System.out.println("Bisnes_custom_impl.GpaBOImpl.calculateGpa()"+m.getCredits().toString());
        // gpa  +=  m.getGrade_pont()*Integer.parseInt(m.getCredits());
        System.out.println("asddasdasdasdasd"+gpa);
    
    }
   
    return  Double.MAX_VALUE;
    }
    
    
    
    private GpaDAO gpadao = (GpaDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.GPA);
    private SessionFactory SessionFactory  = HibernateUtil.getSessionFactory();
    

    @Override
    public boolean saveGpa(GpaDTO dto) throws Exception {
        boolean result;
        try (Session session = sessionFactory.openSession()) {
            gpadao.setSession(session);
            session.beginTransaction();
            GpaEntity gpaEntity =   new GpaEntity(dto.getGpa(), dto.getSemester(), dto.getStudent_id());
            result = gpadao.save(gpaEntity);
            session.getTransaction().commit();
        }       
        return result;
    }

    @Override
    public boolean deleteGpa(Integer marksId) throws Exception {

        return true;

    }

    @Override
    public boolean updateGpa(GpaDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    @Override
    public String getGpaByid(String stId, String semesterId) throws Exception {
         List<GpaDTO> gpaList = new ArrayList<>();
        System.out.println("_______________________start");
      Session session =  SessionFactory.openSession();
    SQLQuery query =session.createSQLQuery("SELECT gpa FROM GpaEntity g WHERE "+"g.student_id=:stId AND g.semester_id=:semId");
    query.setParameter("stId",stId);
    query.setParameter("semId",semesterId);
    session.beginTransaction();   
    System.err.println("?????????????????????????????/////////////");
    List<Object[]> data = query.list();
       session.getTransaction().commit();
   
        System.err.println("{}{}{}{}{}{}");
   System.out.println("__________________________data"+data.get(1));
    
      
        session.close();
        return ""+data.get(1);
        
    }

    @Override
    public String getCredits(String id) throws Exception {
       
           MarksTransaction mt = new MarksTransaction();
        System.out.println("subjec_id=====()"+id);
       
       Session session = sessionFactory.openSession();
            session.beginTransaction();
            // SQLQuery query = session.createSQLQuery("SELECT course_id ,subject_id FROM MarksEntity WHERE student_id = 's1' ");
           
            SQLQuery query = session.createSQLQuery("SELECT credits FROM SubjectEntity where subjec_code=:id_ ");
            
            query.setParameter("id_",id );
            
           List<Object[]> rows = query.list();
           Object credits =rows.get(0);
           System.out.println("************************"+credits);
           
           String dr = (String) credits;
              System.out.println("infinty work"+credits);
           

           
           
        //   String credit_count= rows.get(0);
            System.out.println("+++++++++????/////////////////////{}+++++++++subject Id"+rows.get(0));
            
//            String credits="";
//              for (Iterator it = rows.iterator(); it.hasNext();) {
//            Object[] ra =  (Object[]) it.next();   
//            MarksTransaction mt = new MarksTransaction();
//            System.out.println("===============================credits++++++++++"+ ra[1]);
//            mt.setCredits(ra[0].toString());
//            
         //  credits = mt.getCredits();
            
//
//             mt.setCredits(ra[0].toString());
//            System.out.println("===============================0" + ra[0]);
//            mt.setName(ra[0].toString());
//            System.out.println("===============================1" + ra[1]);
//            mt.setSubject_id(ra[1].toString());
//            System.out.println("===============================2" + ra[2]);
//            mt.setCourse_id(ra[2].toString());
//
//            System.out.println("===============================3" + ra[3]);
//            mt.setGrade(ra[3].toString());
//            System.out.println("===============================4" + ra[4]);
//            mt.setGrade_pont(Double.valueOf(ra[4].toString()));
//            System.out.println("===============================5" + ra[5]);
//            mt.setSemester(ra[5].toString());
//            System.out.println("===============================6" + ra[6]);
//            mt.setMarks(Integer.parseInt(ra[6].toString()));

          //mlist.add(mt);
  //}
  
 

session.getTransaction().commit();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+rows.toString());

        return  dr;
    }

}
