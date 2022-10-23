import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyJFrame extends JFrame{
    private JPanel contentPane;
    private static String word;
    MyJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello JFrame");
        setBounds(100,100,280,400);

        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout());

        //圖
        ImageIcon img1 = new ImageIcon("C:\\Users\\天天\\OneDrive\\桌面\\10.21\\0.jpg");
        ImageIcon img2 = new ImageIcon("C:\\Users\\天天\\OneDrive\\桌面\\10.21\\1.jpg");
        ImageIcon img3 = new ImageIcon("C:\\Users\\天天\\OneDrive\\桌面\\10.21\\2.jpg");
        
        
        //標籤
        word = "圖片0";
        JLabel lab1 = new JLabel(word);
        lab1.setBounds(1,1,1,1);
        contentPane.add(lab1);

        JLabel lab2 = new JLabel(img1);
        lab1.setBounds(100,100,100,100);
        contentPane.add(lab2);
       
        
        //按鈕
        JButton btn1 = new JButton("上一張");
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(word == "圖片0"){
                    JOptionPane.showMessageDialog(null, "沒有上一張圖片");
                }
                else if(word == "圖片1"){
                    lab1.setText("圖片0");
                    lab2.setIcon(img1);
                    word = "圖片0"; 
                }
                else if(word == "圖片2"){
                    lab1.setText("圖片1");
                    lab2.setIcon(img2);
                    word = "圖片1"; 
                }
                
                
            }
        });
        contentPane.add(btn1);
        JButton btn2 = new JButton("下一張");
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(word == "圖片0"){
                    lab1.setText("圖片1");
                    lab2.setIcon(img2);
                    word = "圖片1";
                }
                else if(word == "圖片1"){
                    lab1.setText("圖片2");
                    lab2.setIcon(img3);
                    word = "圖片2"; 
                }
                
                else if(word == "圖片2"){
                    JOptionPane.showMessageDialog(null, "沒有圖3");
                }
                

            }
            
        });
        contentPane.add(btn2);


        setVisible(true);
    }
}

public class HW4_picture{
    public static void main(String[] args) throws Exception{
        MyJFrame f1 = new MyJFrame();
    }
}