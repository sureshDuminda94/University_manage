/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend_course_entity;

import DTO.StudentDTO;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author suresh
 */
@Entity
public class StudentEntity implements Serializable {
    
           
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String student_id;
    private String student_name;
    private String nic;
    private String birth;
    private String address;
    private String course;
    
    private MarksEntity marksEntity;
//    @OneToOne(cascade = CascadeType.ALL)
//    public MarksEntity getMarksEntity() {
//        return marksEntity;
//    }
    
    public StudentEntity(int id, String student_id, String student_name, String nic, String birth, String address ,String course) {
        this.id = id;
        this.student_id = student_id;
        this.student_name = student_name;
        this.nic = nic;
        this.birth = birth;
        this.address = address;
        this.course = course;
    
    }

          
    public StudentDTO getDTO() {
        return new StudentDTO(id, student_id, student_name, nic, birth, address, course);
    }
    public StudentEntity() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
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
        return "StudentEntity{" + "id=" + id + ", student_id=" + student_id + ", student_name=" + student_name + ", nic=" + nic + ", birth=" + birth + ", address=" + address + '}';
    }
   
    
}
