import javax.swing.JFrame; 
import java.awt.Container; 
import javax.swing.JPanel; 
import javax.swing.JLabel; 
import javax.swing.JTextField;

public class TestJScrollPanel {    
   public static void main(String[] args){ 
      JFrame jframe=new JFrame("JScrollPanel 测试程序");
      JButton ok=new JButton("确定");
	  JButton cancel=new JButton("取消");      
      JTextField tf1 = new JTextField("Text Field Number 1 "); 
      JTextField  tf2 = new JTextField("Text Field Number 2 "); 
	  /*
      JPanel p1 = new JPanel(); 
      p1.add(ok); 
      p1.add(cancel); 
      p1.add(tf1);
      p1.add(tf2);
	  
      JScrollPane p2 = new JScrollPane(); 
      p2.add(p1); 
	  */ 
	  
      JScrollPane p2 = new JScrollPane(); 
      p2.add(ok); 
      p2.add(cancel); 
      p2.add(tf1);
      p2.add(tf2);
	   
      jframe.add(p2);         
      jframe.setBounds( 100, 100, 300, 300); 
      jframe.setVisible(true);        
   } 
} 

