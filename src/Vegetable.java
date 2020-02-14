import javax.swing.*;
import java.lang.Thread;
public class vegetable implements Runnable {

    JButton myButton;
    Score myScore;
    JLabel myLabel;

    public vegetable(JButton newButton,Score newScore,JLabel newLabel){
    
        myButton=newButton;
        myScore=newScore;
        myLabel=newLabel;
    }

    public void run() {
    
        myButton.setIcon(new ImageIcon("/Users/arterialdm/Downloads/修改2.jpg"));
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            System.out.println(e.toString());
        }
        myButton.setIcon(new ImageIcon("/Users/arterialdm/Downloads/修改3.jpg"));
        try {
            Thread.sleep(5000);

        }
        catch (InterruptedException e){
            System.out.println(e.toString());
        }
        myButton.setIcon(new ImageIcon("/Users/arterialdm/Downloads/修改1.jpg"));
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            System.out.println(e.toString());
        }
        myButton.setIcon(new ImageIcon("/Users/arterialdm/Downloads/修改4.jpg"));
        myScore.add(30,100);
        myLabel.setText(myScore.toString());
    }
}
