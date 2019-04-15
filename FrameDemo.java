/************************************************************************************************
 * File Name:   FrameDemo.java
 * 
 * Date:    
 * 
 * Author:      Christopher Mell
 *          Thank you, Naveed Ziarab!
 *          https://www.youtube.com/watch?v=GvTZ2Huo0T4
 * 
 * Program Description:  
 *              
 * 
 * Input:       
 *
 * Output:      
 *
 * Processing:  
 * 
 * **********************************************************************************************/

import javax.swing.*;
import java.awt.*;

public class FrameDemo {

    //declare variables
    private JFrame f;
    private JPanel p;
    private JButton b1, b2;
    private JLabel lab1, lab2;
    private JTextField textbox;
    JMenuBar menu;

    //constructor
    public FrameDemo() {
        gui();
    }//end of constructor

    public void gui() {
        // Create the frame and set title.
        f = new JFrame("Frame Demo");

        // Show it.
        f.setVisible(true);

        //set size
        f.setSize(500, 500);

        // let the user close the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create menu bar
        menu = new JMenuBar();
        menu = createMenuBar();

        //create panel
        p = new JPanel();
        p.setBackground(Color.blue);

        //create components
        b1 = new JButton("Test");
        b2 = new JButton("Submit");
        lab1 = new JLabel("This is test label.");
        lab2 = new JLabel("Enter Data: ");
        textbox = new JTextField("Enter Text", 25);

        //add components to panel
        p.add(b1);
        p.add(lab1);
        p.add(lab2);
        p.add(textbox);
        p.add(b2);

        //add panel & menu to frame
        f.setJMenuBar(menu);
        f.add(p);
    }//end of gui

    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu file, edit;
        JMenuItem newFile, openFile;
        //JMenuItem edit1;

        //instantiate menubar
        menuBar = new JMenuBar();

        //build file menu
        file = new JMenu("File");
        //file.setMnemonic(KeyEvent.VK_N);
        menuBar.add(file);
        //sub-menu items
        newFile = new JMenu("New");
        file.add(newFile);
        openFile = new JMenu("Open");
        file.add(openFile);

        //build edit menu
        edit = new JMenu("Edit");
        menuBar.add(edit);

        return menuBar;        
    }//end of createMenuBar

    public static void main (String [ ] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FrameDemo();
            }
        });
    }//end of main
}//end of public class FrameDemo