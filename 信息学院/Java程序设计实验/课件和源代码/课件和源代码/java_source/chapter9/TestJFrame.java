import java.awt.*;
import javax.swing.*;
public class TestJFrame{
  public static void main(String[] args){
     JFrame jframe=new JFrame("JFrame 测试程序 ");
     jframe.setBounds(100,100,300,300);
	 //将窗口框架的左上角位置设置为坐标点100，100，宽为width,高为height大小

      jframe.setVisible(true);
	 //显示窗口框架
     
   }
}