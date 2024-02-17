package GUI;

import javax.swing.JFrame;

import Constants.CommonConstants;

public class Form extends JFrame {
    //create a constructor
    public Form(String title){
       //set the title of the jframe bar
        super(title);
        //set the size of the frame
        setSize(520,680);
       //confugure GUI to end process after closing
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       //set layout to null to disable default layout management
       //to place components whatever we want
       setLayout(null);
       //login GUI in the center of the screen

       //create the background color of GUI
         getContentPane().setBackground(CommonConstants.PRIMARY_COLOR);
       
    }

}
