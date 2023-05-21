/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend_course_entity;

import DTO.CourseDTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
public class CourseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String course_id;
    private String course_name;
    private String semester_count;
    


    private MarksEntity mark;
    
    
//   @OneToOne(cascade = {CascadeType.ALL})
//    public MarksEntity getMark() {
//        return mark;
//    }
    
    
          
    public CourseDTO getDTO() {
        return new CourseDTO(id, course_id, course_name, semester_count, faculty);
    }
    
    private String faculty;

    public CourseEntity() {
    }
    
    
    

    public CourseEntity( int id,String course_id, String course_name, String semester_count, String faculty) {
        
        this.id = id;
        this.course_id = course_id;
        this.course_name = course_name;
        this.semester_count = semester_count;
        this.faculty = faculty;
        
    }

    
    
    
    /**
     * @return the id
     */

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the course_id
     */
    public String getCourse_id() {
        return course_id;
    }

    /**
     * @param course_id the course_id to set
     */
    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    /**
     * @return the course_name
     */
    public String getCourse_name() {
        return course_name;
    }

    /**
     * @param course_name the course_name to set
     */
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    /**
     * @return the semester_count
     */
    public String getSemester_count() {
        return semester_count;
    }

    /**
     * @param semester_count the semester_count to set
     */
    public void setSemester_count(String semester_count) {
        this.semester_count = semester_count;
    }

    /**
     * @return the faculty
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * @param faculty the faculty to set
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", course_id=" + course_id + ", course_name=" + course_name + ", semester_count=" + semester_count + ", faculty=" + faculty + '}';
    }

    public int getId() {
        return id;
    }
    

  


    
    
    
    
}
