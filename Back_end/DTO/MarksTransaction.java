package DTO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author suresh
 */
public class MarksTransaction {
    
    int marks;
    String course_id;
    String student_id;
    String subject_id;
    String semester;
    String grade;
    Double grade_pont;
    String credits;

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }
    String name;
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    

    public Double getGrade_pont() {
        return grade_pont;
    }

    public void setGrade_pont(Double grade_pont) {
        this.grade_pont = grade_pont;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public MarksTransaction() {
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    
    public MarksTransaction(int marks, String course_id, String student_id, String subject_id) {
        this.marks = marks;
        this.course_id = course_id;
        this.student_id = student_id;
        this.subject_id = subject_id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
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

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    @Override
    public String toString() {
        return "MarksTransaction{" + "marks=" + marks + ", course_id=" + course_id + ", student_id=" + student_id + ", subject_id=" + subject_id + '}';
    }
    
    
}
