/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend_course_entity;

import DTO.CourseDTO;
import DTO.MarksDTO;
import DTO.StudentDTO;
import DTO.SubjectDTO;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import Backend_course_entity.student_subject_PK;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author suresh
 */
@Entity
public class MarksEntity implements Serializable {

   // @Column(nullable = false)
    
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    


     
     
     
    int marks;

    String grade;

    String semester;

    public MarksEntity(int marks, String grade, Double grade_point) {
        this.marks = marks;
        this.grade = grade;
        this.grade_point = grade_point;
    }

    public String getGrade() {
        return grade;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Double getGrade_point() {
        return grade_point;
    }

    public void setGrade_point(Double grade_point) {
        this.grade_point = grade_point;
    }

    Double grade_point;

    String subject_id;
    String course_id;
   String student_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MarksEntity() {
    }

    
    
    
    public MarksEntity(int id, int marks, String grade, String semester, Double grade_point, String subject_id, String course_id, String student_id) {
        this.id = id;
        this.marks = marks;
        this.grade = grade;
        this.semester = semester;
        this.grade_point = grade_point;
        this.subject_id = subject_id;
        this.course_id = course_id;
        this.student_id = student_id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
    
    
    
    

}
