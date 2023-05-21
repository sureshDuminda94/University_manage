
package DTO;

/**
 *
 * @author suresh
 */
public class GpaDTO {
    int id;
     int marks;
    String course_id;
    String student_id;
    String subject_id;
    String semester;
    String grade;
    Double grade_pont;
    Double gpa;
    String name;

    public GpaDTO(String student_id, String semester, Double gpa) {
        this.student_id = student_id;
        this.semester = semester;
        this.gpa = gpa;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
    
    
    

    public GpaDTO() {
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

    public Double getGrade_pont() {
        return grade_pont;
    }

    public void setGrade_pont(Double grade_pont) {
        this.grade_pont = grade_pont;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GpaDTO{" + "id=" + id + ", marks=" + marks + ", course_id=" + course_id + ", student_id=" + student_id + ", subject_id=" + subject_id + ", semester=" + semester + ", grade=" + grade + ", grade_pont=" + grade_pont + ", name=" + name + '}';
    }
    
 
    
}
