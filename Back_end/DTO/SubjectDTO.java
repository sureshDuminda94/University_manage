/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Backend_course_entity.SubjectEntity;

/**
 *
 * @author suresh
 */
public class SubjectDTO {
    
    private int id;
    private String subjec_code;
    private String subject_name;
    private String semester;
    private String credits;
    private Double grade_value;

    public SubjectDTO() {
    }

    
      public SubjectEntity getSubjectEntity() {
        return new SubjectEntity(id, subjec_code, subject_name, semester, credits, grade_value);
    }
    public SubjectDTO(int id, String subjec_code, String subject_name, String semester, String credits, Double grade_value) {
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
        return "SubjectDTO{" + "id=" + id + ", subjec_code=" + subjec_code + ", subject_name=" + subject_name + ", semester=" + semester + ", credits=" + credits + ", hours=" + grade_value + '}';
    }
    
    
}
