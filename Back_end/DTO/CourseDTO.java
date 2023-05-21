/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Backend_course_entity.CourseEntity;

/**
 *
 * @author suresh
 */
public class CourseDTO {
   
    private int id;
    private String course_id;
    private String course_name;
    private String semester_count;    
    private String faculty;
    public CourseDTO( int id,String course_id, String course_name, String semester_count, String faculty) {
       this .id  = id;
        this.course_id = course_id;
        this.course_name = course_name;
        this.semester_count = semester_count;
        this.faculty = faculty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CourseDTO() {
    }
    


 
  public CourseEntity getCourseEntity() {
        return new CourseEntity(id, course_id, course_name, semester_count, faculty);
    }


    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getSemester_count() {
        return semester_count;
    }

    public void setSemester_count(String semester_count) {
        this.semester_count = semester_count;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "CourseDTO{" + " course_id=" + course_id + ", course_name=" + course_name + ", semester_count=" + semester_count + ", faculty=" + faculty + '}';
    }


    
    
}
