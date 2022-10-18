import javax.management.AttributeChangeNotification;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyJFrame extends JFrame{
    private JPanel contentPane ;
    MyJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBounds(100,100,800,1000);
        setVisible(true);

        contentPane=new JPanel();
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(10,20,500,100);
        contentPane.add(jTextField);

        JButton btn1 = new JButton("1");
        btn1.setBounds(10,210,40,40);
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn1.getText());;
            }
        }
        );
        contentPane.add(btn1);

        JButton btn2 = new JButton("2");
        btn2.setBounds(110,210,40,40);
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn2.getText());;
            }
        }
        );
        contentPane.add(btn2);

        JButton btn3 = new JButton("3");
        btn3.setBounds(210,210,40,40);
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn3.getText());;
            }
        }
        );
        contentPane.add(btn3);

        JButton btn4 = new JButton("4");
        btn4.setBounds(10,310,40,40);
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn4.getText());;
            }
        }
        );
        contentPane.add(btn4);

        JButton btn5 = new JButton("5");
        btn5.setBounds(110,310,40,40);
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn5.getText());;
            }
        }
        );
        contentPane.add(btn5);

        JButton btn6 = new JButton("6");
        btn6.setBounds(210,310,40,40);
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn6.getText());;
            }
        }
        );
        contentPane.add(btn6);

        JButton btn7 = new JButton("7");
        btn7.setBounds(10,410,40,40);
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn7.getText());;
            }
        }
        );
        contentPane.add(btn7);

        JButton btn8 = new JButton("8");
        btn8.setBounds(110,410,40,40);
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn8.getText());;
            }
        }
        );
        contentPane.add(btn8);

        JButton btn9 = new JButton("9");
        btn9.setBounds(210,410,40,40);
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn9.getText());;
            }
        }
        );
        contentPane.add(btn9);

        JButton btn10 = new JButton("+");
        btn10.setBounds(10,510,40,40);
        btn10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn10.getText());;
            }
        }
        );
        contentPane.add(btn10);

        JButton btn11 = new JButton("0");
        btn11.setBounds(110,510,40,40);
        btn11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn11.getText());;
            }
        }
        );
        contentPane.add(btn11);

        JButton btn12 = new JButton("-");
        btn12.setBounds(210,510,40,40);
        btn12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn12.getText());;
            }
        }
        );
        contentPane.add(btn12);

        JButton btn13 = new JButton("x");
        btn13.setBounds(10,610,40,40);
        btn13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn13.getText());;
            }
        }
        );
        contentPane.add(btn13);

        JButton btn14 = new JButton("=");
        btn14.setBounds(110,610,40,40);
        btn14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn14.getText());;
            }
        }
        );
        contentPane.add(btn14);

        JButton btn15 = new JButton("÷");
        btn15.setBounds(210,610,40,40);
        btn15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,btn15.getText());;
            }
        }
        );
        contentPane.add(btn15);



    }
}

public class HW3Calculator{
    public static void main(String[] args) throws Exception{
        MyJFrame f1 = new MyJFrame();
    }
}