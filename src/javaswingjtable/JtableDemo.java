/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingjtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author MSI
 */


    /**
     * @param args the command line arguments
     */
    public class JtableDemo extends JFrame {

    public JtableDemo() {
        String[] studentMenager = new String[]{"ID", "NAME", "BIRTHDAY", "PHONE", "EMAIL", "CLASSNAMER"};

        Object[][] student = new Object[][]{
            {"D00424", "Trần Quốc Toản", "18/03/1989", "0983518883", "quoctoan1803@gmail.com", "C1702G"},
            {"D00313", "Nguyễn Văn A", "12/12/2003", "0983173142", "vana@gmail.com", "C1702G"},
            {"D00313", "Nguyễn Văn A", "12/12/2003", "0983173142", "vana@gmail.com", "C1702G"},
            {"D00313", "Nguyễn Văn A", "12/12/2003", "0983173142", "vana@gmail.com", "C1702G"},
            {"D00313", "Nguyễn Văn A", "12/12/2003", "0983173142", "vana@gmail.com", "C1702G"}};

        JTable table = new JTable(student, studentMenager);

        this.setSize(1000, 300);
        this.setTitle("Student Menager");
        this.add(new JScrollPane(table));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        JtableDemo td = new JtableDemo();
    }
    
}
