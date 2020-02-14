import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {

    JButton mybutton;
    Score myScore;
    JLabel myLabel;

    public MyActionListener(JButton newButton,Score newScore,JLabel newLabel){
    
        mybutton=newButton;
        myScore=newScore;
        myLabel=newLabel;
    }



    public void actionPerformed(ActionEvent e) {
    
        Thread myThread= new Thread(new vegetable(mybutton,myScore,myLabel));
        myThread.start();
    }
}
