/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;


import Front_end_main.Main_screen;
import Front_end_course.*;
import Front_end_gpa.Smester_GPA;
import Front_end_marks.Marks;

import Front_end_student.Crud_student;
import Front_end_subject.Crud_subject;
import javax.swing.JPanel;

/**
 *
 * @author suresh
 */
public class Model_UI {
    
   public void getForms(JPanel loard ,String a) throws Exception{
    
       switch(a){
       
        case "new_course":
        New_course new_course = new New_course();
        loard.removeAll();
        loard.repaint();
        loard.revalidate();
        loard.add(new_course);
        new Thread() {
            public void run() {
                for (int i = -10; i < 1; i++) {
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
//                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //new_course.setLocation(i, 0);
                }
            }
        }.start();
        break;
        case "search_course":
        Search_course  search_course = new Search_course();
        loard.removeAll();
        loard.repaint();
        loard.revalidate();
        loard.add(search_course);
        new Thread() {
            public void run() {
                for (int i = -10; i < 1; i++) {
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
//                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //new_course.setLocation(i, 0);
                }
            }
        }.start();
            
                   break;
        case "crud_subject":
            Crud_subject crud_subject = new Crud_subject();
        loard.removeAll();
        loard.repaint();
        loard.revalidate();
        loard.add(crud_subject);
        new Thread() {
            public void run() {
                for (int i = -10; i < 1; i++) {
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
//                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //new_course.setLocation(i, 0);
                }
            }
        }.start();  
        
        
                   break;
        case "crud_student":
            Crud_student crud_student = new Crud_student();
        loard.removeAll();
        loard.repaint();
        loard.revalidate();
        loard.add(crud_student);
        new Thread() {
            public void run() {
                for (int i = -10; i < 1; i++) {
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
//                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //new_course.setLocation(i, 0);
                }
            }
        }.start();  
        
        
                           break;
        case "crud_marks":
            Marks marks = new Marks();
        loard.removeAll();
        loard.repaint();
        loard.revalidate();
        loard.add(marks);
        new Thread() {
            public void run() {
                for (int i = -10; i < 1; i++) {
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
//                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //new_course.setLocation(i, 0);
                }
            }
        }.start();  
        
        
        
        
                           break;
        case "Gpa":
            Smester_GPA smester_GPA =  new Smester_GPA();
            System.out.println("d__________________________________");
        loard.removeAll();
        loard.repaint();
        loard.revalidate();
        loard.add(smester_GPA);
        new Thread() {
            public void run() {
                for (int i = -10; i < 1; i++) {
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
//                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //new_course.setLocation(i, 0);
                }
            }
        }.start();  
        
       
       
       }}}
//    New_course new_course = new New_course();
//        loard.removeAll();
//        loard.repaint();
//        loard.revalidate();
//        loard.add(new_course);
//        new Thread() {
//            public void run() {
//                for (int i = -10; i < 1; i++) {
//                    try {
//                        Thread.sleep(5);
//                    } catch (InterruptedException ex) {
////                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                    //new_course.setLocation(i, 0);
//                }
//            }
//        }.start();
   //}    
   
//    public void getSerch(JPanel loard) throws Exception{
//    
//   
//        Search_course search_course = new Search_course();
//        loard.removeAll();
//        loard.repaint();
//        loard.revalidate();
//        loard.add(search_course);
//        new Thread() {
//            public void run() {
//                for (int i = -10; i < 1; i++) {
//                    try {
//                        Thread.sleep(5);
//                    } catch (InterruptedException ex) {
////                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                    //new_course.setLocation(i, 0);
//                }
//            }
//        }.start();
//   }    
//}
