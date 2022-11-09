import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyJFrame extends JFrame implements ListSelectionListener  {
    private JLabel jl1 = new JLabel("可選取地名...");
    String[] city = {"台北","宜蘭","桃園","台中","南投","彰化"};
    private JList<String> jta = new JList<>(city);

    MyJFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("各地名山");
        setBounds(50,50,700,500);
        setLayout(null);
        
        JPanel jp1 = new JPanel();
        add(jp1);
        jp1.setBounds(50,30,80,50);
        JLabel jbl1 = new JLabel("找各地名山：");
        jp1.add(jbl1);

        
        add(jl1);
        jl1.setBounds(0,150,470,20);
        jl1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jl1.setBackground(Color.BLUE);
        JScrollPane jsp1 = new JScrollPane(jl1,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp1.setBounds(10,100,300,80);
        add(jsp1);
        
        jta.setBounds(110,20,170,110);
        jta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jta.setSelectedIndex(0);
        jta.addListSelectionListener(this);
        jta.setVisibleRowCount(2);
        add(jta);

        JScrollPane jsp = new JScrollPane(jta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setBounds(150,7,50,80);
        add(jsp);

        setVisible(true);
    }
    
    public void valueChanged(ListSelectionEvent e){
        String lbShow = "";
        if(jta.getSelectedValue()=="台北"){
            lbShow += "台北 名山： 陽明山";
        }
        else if(jta.getSelectedValue()=="宜蘭"){
            lbShow += "宜蘭 名山： 雪山";
        }
        else if(jta.getSelectedValue()=="桃園"){
            lbShow += "桃園 名山： 金面山";
        }
        else if(jta.getSelectedValue()=="台中"){
            lbShow += "台中 名山： 八卦山";
        }
        else if(jta.getSelectedValue()=="南投"){
            lbShow += "南投 名山： 阿里山";
        }
        else if(jta.getSelectedValue()=="彰化"){
            lbShow += "彰化 名山： 八卦山";
        }
        jl1.setText(lbShow);
    }
        
    
    
}


public class HW5 {
    public static void main(String[] args) throws Exception {
        MyJFrame f1=new MyJFrame() ;
    }
}
