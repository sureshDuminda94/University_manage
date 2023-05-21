/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend_course_entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author suresh
 */
@Entity
public class GpaEntity {
    
    @EmbeddedId
    private student_subject_PK s_s_PK;
    
    private Double gpa;
    
  

    public GpaEntity() {
    }

    public GpaEntity(student_subject_PK s_s_PK, Double gpa) {
        this.s_s_PK = s_s_PK;
        this.gpa = gpa;
       
    }

    public GpaEntity(Double gpa, String semester_id, String st_id) {
        this.gpa = gpa;

        this.s_s_PK =  new student_subject_PK(st_id, semester_id);
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }


   
    
   
    
    


    
    
}
