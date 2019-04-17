/************************************************************************************************
 * File Name:   Home.java
 * 
 * Date:    4/15/19
 * 
 * Author:      Christopher Mell
 *          Thank you, Naveed Ziarab!
 *          https://www.youtube.com/watch?v=GvTZ2Huo0T4
 * 
 * Program Description:  opens the home page for SLC Events Database
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

public class Home {

    //declare variables
    private JFrame f;
    private JPanel p;
    private JPanel buttonPanel = new JPanel();
    private JButton jbRead, jbCreate, jbUpdate, jbDelete;
    private JLabel lab1;
    JMenuBar menu;

    //constructor
    public Home() {
        gui();
    }//end of constructor

    public void gui() {
        // make the frame and set title.
        f = new JFrame("ASLC Events Database");
        f.setLayout(new GridLayout(2,1));
        f.setVisible(true);
        f.setSize(800, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //make menu bar
        menu = new JMenuBar();
        menu = createMenuBar();

        //make panel for text
        p = new JPanel();
        p.setBackground(Color.blue);
        lab1 = new JLabel("<html>Welcome to the ASLC Events Database.<br> Here you can View, Add, Edit, or Remove entries.<br> Which would you like to do today?</html>");
        p.add(lab1);

        //make buttons & add action listeners (.java)
        //read button (view)
        jbRead = new JButton("View");
        jbRead.addActionListener(new Read());
        //add button (create)
        jbCreate = new JButton("Add");
        jbCreate.addActionListener(new Create());
        //edit button (update)
        jbUpdate = new JButton("Edit");
        jbUpdate.addActionListener(new Update());
        //remove button (delete)
        jbDelete = new JButton("Remove");
        jbDelete.addActionListener(new Delete());

        //make button panel layout
        buttonPanel.setLayout(new GridLayout(2,2,20,20));
        buttonPanel.add(jbRead);
        buttonPanel.add(jbCreate);
        buttonPanel.add(jbUpdate);
        buttonPanel.add(jbDelete);

        //add panels & menu to frame
        f.setJMenuBar(menu);
        f.add(p);
        f.add(buttonPanel);
        
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
                new Home();
            }
        });
    }//end of main
}//end of public class Home