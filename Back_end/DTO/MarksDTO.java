/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author suresh
 */
public class MarksDTO {

    public MarksDTO() {
    }
    
    public int id;
    int marks;
   
    String subject_id;
    String course_id;
    String student_id;

    String semester;
    String grade;

    public MarksDTO(int marks, String grade, Double grade_point) {
        this.marks = marks;
        this.grade = grade;
        this.grade_point = grade_point;
    }
    Double grade_point;

    public MarksDTO(int id, int marks, String subject_id, String course_id, String student_id, String semester, String grade, Double grade_point) {
        this.id = id;
        this.marks = marks;
        this.subject_id = subject_id;
        this.course_id = course_id;
        this.student_id = student_id;
        this.semester = semester;
        this.grade = grade;
        this.grade_point = grade_point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getGrade() {
        return grade;
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

    @Override
    public String toString() {
        return "MarksDTO{" + "id=" + id + ", marks=" + marks + ", subject_id=" + subject_id + ", course_id=" + course_id + ", student_id=" + student_id + ", semester=" + semester + ", grade=" + grade + ", grade_point=" + grade_point + '}';
    }

 

 
    
    
}
