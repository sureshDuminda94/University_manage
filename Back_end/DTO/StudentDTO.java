/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Backend_course_entity.StudentEntity;

/**
 *
 * @author suresh
 */
public class StudentDTO {

    
       public StudentDTO() {
    }
       
         public StudentEntity getStudentEntity() {
        return new StudentEntity(id, student_id, student_name, nic, birth, address, course);
    }
    public StudentDTO(int id, String student_id, String student_name, String nic, String birth, String address,String course) {
        this.id = id;
        this.student_id = student_id;
        this.student_name = student_name;
        this.nic = nic;
        this.birth = birth;
        this.address = address;
        this.course  = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentDTO{" + "id=" + id + ", student_id=" + student_id + ", student_name=" + student_name + ", nic=" + nic + ", birth=" + birth + ", address=" + address + '}';
    }
   
    
    
    
    private int id;
    private String student_id;
    private String student_name;
    private String nic;
    private String birth;
    private String address;
    private String course;

   
    
}
