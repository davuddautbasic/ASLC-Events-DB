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
import java.awt.event.*;

public class Delete implements ActionListener {
    
    public void actionPerformed (ActionEvent e) {
        JFrame f = new JFrame("Remove");
        JPanel p = new JPanel();
        JLabel lab1 = new JLabel("You clicked Remove!");
        f.setVisible(true);
        f.setSize(200,200);
        p.add(lab1);
        f.add(p);
    }
}//end of public class Delete