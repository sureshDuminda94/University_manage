/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Front_end_main.Main_screen;
import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author suresh
 */
public class Main {
    
    
    
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_screen().setVisible(true);
                new Main_screen().setLocationRelativeTo(null);
            }
        });
        
    }
    
}
