import java.awt.*;
import java.applet.*;
 
public class BarChart extends Applet
{
 int n=0;
 String label[];
 int value[];
 
 public void init() {
  
  setBackground(Color.pink);
  try {
   
   int n = Integer.parseInt(getParameter("Columns"));
   label = new String[n];
   value = new int[n];
   label[0]  = getParameter("label1");
   label[1]  = getParameter("label2");
   label[2]  = getParameter("label3");
   label[3]  = getParameter("label4");
   value[0] = Integer.parseInt(getParameter("c1"));
   value[1] = Integer.parseInt(getParameter("c2"));
   value[2] = Integer.parseInt(getParameter("c3"));
   value[3] = Integer.parseInt(getParameter("c4"));
  }
  catch(NumberFormatException e){}
 }
 public void paint(Graphics g)
 {
  for(int i=0;i<4;i++) {
   g.setColor(Color.black);
   g.drawString(label[i],20,i*50+30);
   g.setColor(Color.red);
   g.fillRect(50,i*50+10,value[i],40);
  }
 }
}