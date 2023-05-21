/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend_course_entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author suresh
 */
@Embeddable
public class student_subject_PK implements Serializable{
     private String student_id;
    private String semester_id;

    public student_subject_PK() {
    }

    public student_subject_PK(String student_id, String semester_id) {
        this.student_id = student_id;
        this.semester_id = semester_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.student_id);
        hash = 97 * hash + Objects.hashCode(this.semester_id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final student_subject_PK other = (student_subject_PK) obj;
        return true;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getSemester_id() {
        return semester_id;
    }

    public void setSemester_id(String semester_id) {
        this.semester_id = semester_id;
    }

    @Override
    public String toString() {
        return "student_subject_PK{" + "student_id=" + student_id + ", semester_id=" + semester_id + '}';
    }

  
    
    
    
}
