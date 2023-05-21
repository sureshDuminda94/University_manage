/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encript;

import Backend_course_db.HibernateUtil;
import Bisnes_custom_impl.GpaBOImpl;
import Controller.GpaController;
import Controller.ManageCourseController;
import Controller.ManageMarksController;
import Controller.ManageStudentController;
import Controller.ManageSubjectContrller;
import DTO.CourseDTO;

import DTO.MarksDTO;
import DTO.MarksTransaction;
import DTO.StudentDTO;
import DTO.SubjectDTO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author suresh
 */
public class Loarding_data {

    public void LoadDataInCombobox(JComboBox jComboBox, String a) throws Exception {

        switch (a) {

            case "course":
                List<CourseDTO> allCourse = ManageCourseController.getAllCourse();

                for (CourseDTO customer : allCourse) {

                    jComboBox.addItem(customer.getCourse_id());
                }

                break;
            case "subject":
                List<SubjectDTO> allSubject = ManageSubjectContrller.getAllSubject();

                for (SubjectDTO subject : allSubject) {
                    System.err.println("item" + subject.getSubjec_code());
                    jComboBox.addItem(subject.getSubjec_code());
                }
                break;

            case "student":
                List<StudentDTO> allStudent = ManageStudentController.getAllStudent();

                for (StudentDTO student : allStudent) {

                    jComboBox.addItem(student.getStudent_id());
                }
                break;

            case "semester":
                List<SubjectDTO> allSubjects = ManageSubjectContrller.getAllSubject();

                for (SubjectDTO subject : allSubjects) {

                    jComboBox.addItem(subject.getSemester());
                    System.out.println("Encript.Loarding_data.LoadDataInCombobox()__________________" + subject.getSemester());
                }
                break;

        }
    }

    public void loadAllCourse(JTable jTable, String a, String stid) throws Exception {
        DefaultTableModel dtm = (DefaultTableModel) jTable.getModel();
        switch (a) {

            case "course":
                List<CourseDTO> allCourse = ManageCourseController.getAllCourse();

                dtm.setRowCount(0);

                for (CourseDTO courseDTO : allCourse) {
                    Object[] rowData = {courseDTO.getCourse_id(),
                        courseDTO.getCourse_name(),
                        courseDTO.getSemester_count(),
                        courseDTO.getFaculty(),
                        courseDTO.getId()

                    };
                    dtm.addRow(rowData);
                }
                break;
            case "subject":
                List<SubjectDTO> allSubject = ManageSubjectContrller.getAllSubject();

                dtm.setRowCount(0);

                for (SubjectDTO subject : allSubject) {

                    Object[] rowData = {subject.getSubjec_code(),
                        subject.getSubject_name(),
                        subject.getCredits(),
                        subject.getSemester(),
                        subject.getGrade_value(),
                        subject.getId()

                    };
                    dtm.addRow(rowData);
                }

                break;

            case "student":
                List<StudentDTO> alltudent = ManageStudentController.getAllStudent();

                dtm.setRowCount(0);

                for (StudentDTO studentDTO : alltudent) {

                    Object[] rowData = {studentDTO.getStudent_id(),
                        studentDTO.getStudent_name(),
                        studentDTO.getBirth(),
                        studentDTO.getNic(),
                        studentDTO.getAddress(),
                        studentDTO.getCourse(),};
                    dtm.addRow(rowData);
                }

                break;

            case "marks":
                System.out.println("+in marks table lording");
                List<MarksTransaction> allMarks = ManageMarksController.getAllMarks(stid);
                System.err.println("++++++++++++++++++++++++++++");
                dtm.setRowCount(0);

                System.out.println("______________________________________");
                for (MarksTransaction mt : allMarks) {

                    Object[] rowData = {
                        mt.getStudent_id(),
                        mt.getCourse_id(),
                        mt.getSubject_id(),
                        mt.getSemester(),
                        mt.getMarks(),
                        mt.getGrade(),
                        mt.getGrade_pont()

                    };
                    dtm.addRow(rowData);
                }
                break;

            case "gpa":
                MarksTransaction M = new MarksTransaction();

                List< MarksTransaction> m = new GpaBOImpl().getStudentMarksById(M.getStudent_id(), M.getSemester());

                dtm.setRowCount(0);

                for (MarksTransaction mt : m) {
                    String sbId = mt.getSubject_id();

                    String credits = new GpaBOImpl().getCredits(sbId);
                    mt.setCredits((String) credits);
                    Object[] rowData = {
                        mt.getStudent_id(),
                        mt.getCourse_id(),
                        mt.getSubject_id(),
                        mt.getSemester(),
                        mt.getMarks(),
                        mt.getCredits(),
                        mt.getGrade(),
                        mt.getGrade_pont()

                    };

                    dtm.addRow(rowData);

                    int count = dtm.getRowCount();

                    System.out.println("**************************" + count);
                }
                break;

        }
    }

    public Double gpaValue(String stId) {
        System.err.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Double data=0.0;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
 Session session2 = sessionFactory.openSession();
            session2.beginTransaction();
            
            SQLQuery query1 = session2.createSQLQuery("SELECT gpa FROM GpaEntity where student_id =:stId");
              query1.setParameter("stId", stId);
            
            List<Object[]> gpaData = query1.list();
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            if(gpaData.size()!=0){
          
            for (int i = 0; i < 20; i++) {
                
                Object v = gpaData.get(i);
                
                Double gpadata = (Double) v;
                System.out.println("gpa___------------------" + gpadata);
                
                if (gpadata != 0.0) {
                    
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^gpa" + gpadata);
                    data = gpadata;
                   return gpadata;
                }
                
            }
            }
            session2.getTransaction().commit();
            session2.close();
            System.err.println("ending.............................");
       
       return  data;
    }

}
