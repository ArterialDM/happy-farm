import javax.swing.*;
import java.awt.*;


public class MyFarme extends JFrame  {

    static myFarme mainJFrame=new myFarme();
    static JLabel show=new JLabel();

    public static void main(String[] args){

        Score myScore=new Score();
        mainJFrame.setTitle("开心农场");
        mainJFrame.setLocationRelativeTo(null);
        mainJFrame.setSize(1920,1080);
        mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainJFrame.setResizable(false);
        Container container=mainJFrame.getContentPane();
        JPanel pn1=new JPanel(new FlowLayout(FlowLayout.CENTER,-30,0));
        pn1.setLayout(null);
        pn1.setBackground(null);
        pn1.setOpaque(false);
        pn1.setLocation(50,170);
        pn1.setSize(232,235);
        JButton btn1=new JButton("1");
        JButton btn2=new JButton("2");
        JButton btn3=new JButton("3");
        JButton btn4=new JButton("5");
        JButton btn5=new JButton("6");
        JButton btn6=new JButton("7");
        JButton btn7=new JButton("9");
        JButton btn8=new JButton("10");
        JButton btn9=new JButton("11");
        JButton btnX=new JButton("12");
        JButton btnAdd=new JButton("4");
        JButton buttonMinus=new JButton("8");
        btn1.addActionListener(new MyActionListener(btn1,myScore,show));
        btn2.addActionListener(new MyActionListener(btn2,myScore,show));
        btn3.addActionListener(new MyActionListener(btn3,myScore,show));
        btn4.addActionListener(new MyActionListener(btn4,myScore,show));
        btn5.addActionListener(new MyActionListener(btn5,myScore,show));
        btn6.addActionListener(new MyActionListener(btn6,myScore,show));
        btn7.addActionListener(new MyActionListener(btn7,myScore,show));
        btn8.addActionListener(new MyActionListener(btn8,myScore,show));
        btn9.addActionListener(new MyActionListener(btn9,myScore,show));
        btnX.addActionListener(new MyActionListener(btnX,myScore,show));
        btnAdd.addActionListener(new MyActionListener(btnAdd,myScore,show));
        buttonMinus.addActionListener(new MyActionListener(buttonMinus,myScore,show));
        show.setBounds(0,0,1920,270);
        show.setHorizontalAlignment(SwingConstants.RIGHT);
        show.setText(myScore.toString());
        show.setFont(new Font("Serief",Font.PLAIN,230));
        btn8.setSize(80,80);
        btnX.setSize(80,80);
        btnAdd.setSize(480,270);            //12
        btnAdd.setLocation(1440,810);
        buttonMinus.setSize(480,270);       //8
        buttonMinus.setLocation(1440,540);
        btnX.setSize(480,270);              //12
        btnX.setLocation(1440,270);
        btn3.setSize(480,270);              //3
        btn3.setLocation(960,810);
        btn6.setSize(480,270);              //7
        btn6.setLocation(960,540);
        btn9.setSize(480,270);              //11
        btn9.setLocation(960,270);
        btn2.setSize(480,270);              //2
        btn2.setLocation(480,810);
        btn5.setSize(480,270);              //6
        btn5.setLocation(480,540);
        btn8.setSize(480,270);              //10
        btn8.setLocation(480,270);
        btn1.setSize(480,270);              //1
        btn1.setLocation(0,810);
        btn4.setSize(480,270);              //5
        btn4.setLocation(0,540);
        btn7.setSize(480,270);              //9
        btn7.setLocation(0,270); 
        pn1.add(show);
        pn1.add(btnX);
        pn1.add(buttonMinus);
        pn1.add(btnAdd);
        pn1.add(btn1);
        pn1.add(btn2);
        pn1.add(btn3);
        pn1.add(btn4);
        pn1.add(btn5);
        pn1.add(btn6);
        pn1.add(btn7);
        pn1.add(btn8);
        pn1.add(btn9);
        pn1.add(btnX);
        container.add(pn1);
        mainJFrame.setVisible(true);
    }
}
