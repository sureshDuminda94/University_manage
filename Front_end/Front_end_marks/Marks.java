/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Front_end_marks;

import Backend_course_db.HibernateUtil;
import Backend_course_entity.MarksEntity;
import Bisnes_custom_impl.MarksBOImpl;
import Controller.ManageMarksController;
import DTO.MarksDTO;
import DTO.MarksTransaction;
import Dao.DAOFactory;
import Dao_custom.SubjectDAO;
import Dao_custom_impl.MarksDAOImpl;
import Encript.Loarding_data;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author suresh
 */
public class Marks extends javax.swing.JPanel {

    /**
     * Creates new form Marks
     */
    public Marks() throws Exception {

        initComponents();
        String stid = stu_selector.getSelectedItem().toString();
        new Loarding_data().LoadDataInCombobox(course_selector, "course");
        new Loarding_data().LoadDataInCombobox(subject_code_selector, "subject");
        new Loarding_data().LoadDataInCombobox(stu_selector, "student");
        new Loarding_data().LoadDataInCombobox(semester_selector, "semester");
        new Loarding_data().loadAllCourse(marksTable, "marks", stid);
    }
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        course_selector = new javax.swing.JComboBox<>();
        stu_selector = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        semester_selector = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        marksTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        update_btn = new javax.swing.JToggleButton();
        serch_btn = new javax.swing.JToggleButton();
        removeBtn = new javax.swing.JToggleButton();
        newBtn = new javax.swing.JToggleButton();
        Grade = new javax.swing.JLabel();
        grade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        grade_pont = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        marksTable = new javax.swing.JTable();
        subject_code_selector = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        course_selector.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        course_selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select_corse" }));
        course_selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_selectorActionPerformed(evt);
            }
        });

        stu_selector.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        stu_selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "student_selector", " " }));
        stu_selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_selectorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel3.setText("Select_course_code");

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel4.setText("Select_subject"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel5.setText("Student Id");

        semester_selector.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        semester_selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "semester_select", " ", " " }));

        jLabel6.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel6.setText("Enter_marks");

        marksTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marksTxtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel7.setText("Select_semester");

        update_btn.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        update_btn.setText("update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        serch_btn.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        serch_btn.setForeground(new java.awt.Color(0, 0, 255));
        serch_btn.setText("Stu_Id_for_search");
        serch_btn.setActionCommand("Select \nStudent\nId for\nSearch"); // NOI18N
        serch_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serch_btnActionPerformed(evt);
            }
        });

        removeBtn.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        removeBtn.setText("remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        newBtn.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        newBtn.setText("New");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        Grade.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        Grade.setForeground(new java.awt.Color(0, 0, 0));
        Grade.setText("Grade");

        grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("grade_point");

        marksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "StudentID", "Course", "Subject", "Semester", "Mark", "Grade", "G-point"
            }
        ));
        marksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(marksTable);

        subject_code_selector.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        subject_code_selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select_subject" }));
        subject_code_selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject_code_selectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(marksTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(116, 116, 116)
                                    .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stu_selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(course_selector, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(Grade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subject_code_selector, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(grade_pont, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(semester_selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addComponent(serch_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stu_selector, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(course_selector, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(semester_selector, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(subject_code_selector, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(serch_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Grade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marksTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grade_pont, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 0));
        jLabel1.setText("Marks_calculation");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void course_selectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_selectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_selectorActionPerformed

    private void stu_selectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_selectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stu_selectorActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed

         MarksTransaction mt = new MarksTransaction();
        marksTxt.setText(marksTable.getValueAt(marksTable.getSelectedRow(), 4).toString());
       mt.setGrade( marksTable.getValueAt(marksTable.getSelectedRow(), 5).toString());
        grade_pont.setText(marksTable.getValueAt(marksTable.getSelectedRow(), 6).toString());
        System.err.println(">>>>>>>>>>>>>>>>>" + marksTxt.getText());
            
        
        grade.setText(mt.getGrade());
           String g  =grade.getText();
           
        String value= grade.getText();
        Double g_val = Double.valueOf(this.grade_pont.getText());

     //   System.err.println(">>>>>>>>>>>>>>>>>" + marks);
        System.err.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^6" + g);
       System.err.println(">>>>>>>>>>>>>>>>>" + value.getClass().getSimpleName());

        String stuid = stu_selector.getSelectedItem().toString();
       // String subid_ = subject_code_selector.getSelectedItem().toString();

    
        mt.setGrade(g);
        
        Session s = sessionFactory.openSession();
        s.clear();
        Transaction t = s.beginTransaction();
        System.out.println("||||||||||||||||||"+mt.getGrade());
        String hql = "UPDATE MarksEntity set grade =:gradeI WHERE student_id =:stId ";
        Query q = s.createQuery(hql);
        q.setParameter("gradeI",g);
        
        q.setParameter("stId", stuid);
        
            
      
         
  
        int result = q.executeUpdate();

        t.commit();
        grade.setText("");
        s.close();
        try{
              new Loarding_data().loadAllCourse(marksTable, "marks", stuid);
        }catch(Exception e){}
        if(result!=0){
        
            JOptionPane.showMessageDialog(this, "updated ok");
        
        }else{
        
        JOptionPane.showMessageDialog(this, "updated no ");
        
        }

    }//GEN-LAST:event_update_btnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        boolean result = false;
        SubjectDAO subjectDAO = (SubjectDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUBJECT);
        Session session = sessionFactory.openSession();

        subjectDAO.setSession(session);
        session.beginTransaction();
        SQLQuery query = session.createSQLQuery("delete from MarksEntity where subject_id =:id  ");
        String s = subject_code_selector.getSelectedItem().toString();
        System.err.println("________________" + s);
        query.setParameter("id", s);
        //boolean result = subjectDAO.delete(subjectID);
        query.executeUpdate();
        session.getTransaction().commit();
        result = true;
        if (result) {
            JOptionPane.showMessageDialog(this, "remove ok");

        } else {

            JOptionPane.showMessageDialog(this, "remove not ok");
        }
        session.close();
        try {
            new Loarding_data().loadAllCourse(marksTable, "subject", subject_code_selector.getSelectedItem().toString());
        } catch (Exception ex) {
            Logger.getLogger(Marks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void serch_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serch_btnActionPerformed
        try {
            String stid = stu_selector.getSelectedItem().toString();

            new Loarding_data().loadAllCourse(marksTable, "marks", stid);
        } catch (Exception ex) {
            Logger.getLogger(Marks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_serch_btnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed

        String s = "a";
        String student_str = (String) stu_selector.getSelectedItem();
        String course_str = (String) course_selector.getSelectedItem();
        String subject_str = (String) subject_code_selector.getSelectedItem();
        String semester_str = (String) semester_selector.getSelectedItem();
        int marks = Integer.parseInt(marksTxt.getText().toString());
        Double grade_pont = Double.valueOf(this.grade_pont.getText());
        String grade = this.grade.getText();

        MarksDTO marksDTO = new MarksDTO(0, marks, subject_str, course_str, student_str, semester_str, grade, grade_pont);

        System.out.println("Front_end_marks.Marks.newBtnActionPerformed()" + student_str);

        try {
            boolean result = ManageMarksController.saveMarks(marksDTO);
            if (result) {
                JOptionPane.showMessageDialog(this, "Course has been saved successfully");
            }
            new Loarding_data().LoadDataInCombobox(course_selector, "course");
            new Loarding_data().LoadDataInCombobox(semester_selector, "semester");
            new Loarding_data().LoadDataInCombobox(subject_code_selector, "subject");
            new Loarding_data().loadAllCourse(marksTable, "marks", student_str);
            this.grade.setText("");
            this.grade_pont.setText("");
            marksTxt.setText("");

            String stid = stu_selector.getSelectedItem().toString();

        } catch (Exception ex) {
            Logger.getLogger(Marks.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_newBtnActionPerformed

    private void gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeActionPerformed

    private void marksTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marksTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marksTxtActionPerformed

    private void subject_code_selectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject_code_selectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subject_code_selectorActionPerformed

    private void marksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marksTableMouseClicked

        marksTxt.setText(marksTable.getValueAt(marksTable.getSelectedRow(), 4).toString());
        grade.setText(marksTable.getValueAt(marksTable.getSelectedRow(), 5).toString());
        grade_pont.setText(marksTable.getValueAt(marksTable.getSelectedRow(), 6).toString());

// TODO add your handling code here:
    }//GEN-LAST:event_marksTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Grade;
    private javax.swing.JComboBox<String> course_selector;
    private javax.swing.JTextField grade;
    private javax.swing.JTextField grade_pont;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable marksTable;
    private javax.swing.JTextField marksTxt;
    private javax.swing.JToggleButton newBtn;
    private javax.swing.JToggleButton removeBtn;
    private javax.swing.JComboBox<String> semester_selector;
    private javax.swing.JToggleButton serch_btn;
    private javax.swing.JComboBox<String> stu_selector;
    private javax.swing.JComboBox<String> subject_code_selector;
    private javax.swing.JToggleButton update_btn;
    // End of variables declaration//GEN-END:variables
}
