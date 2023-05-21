/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend_course_entity;

import DTO.SubjectDTO;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author ranjith-suranga
 */
@Entity
public class SubjectEntity implements Serializable {
    
        
        @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String subjec_code;
    private String subject_name;
    private String semester;
    private String credits;
    private Double grade_value;
    private  MarksEntity marksEntity;

//    @OneToOne(cascade = CascadeType.ALL)
//    public MarksEntity getMarksEntity() {
//        return marksEntity;
//    }
    
    
    
      
    public SubjectDTO getDTO() {
        return new SubjectDTO(id, subjec_code, subject_name, semester, credits, grade_value);
    }

    public SubjectEntity() {
    }

    public SubjectEntity(int id, String subjec_code, String subject_name, String semester, String credits, Double grade_value) {
        this.id = id;
        this.subjec_code = subjec_code;
        this.subject_name = subject_name;
        this.semester = semester;
        this.credits = credits;
        this.grade_value = grade_value;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjec_code() {
        return subjec_code;
    }

    public void setSubjec_code(String subjec_code) {
        this.subjec_code = subjec_code;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public Double getGrade_value() {
        return grade_value;
    }

    public void setGrade_value(Double grade_value) {
        this.grade_value = grade_value;
    }

 
    @Override
    public String toString() {
        return "SubjectEntity{" + "id=" + id + ", subjec_code=" + subjec_code + ", subject_name=" + subject_name + ", semester=" + semester + ", credits=" + credits + ",  grade_value=" + grade_value + '}';
    }

 
    
    
}
