import java.awt.*;
import java.applet.*;

public class paraRect extends Applet {
  public void paint(Graphics g){
    String n = getParameter("color");
    Color col = new Color(Integer.parseInt(n, 16));
    g.setColor(col);
    g.fillRect(Integer.parseInt(getParameter("x")), Integer.parseInt(getParameter("y")), 150, 100);
  }
}

<html>
 <applet code="paraRect.class" width=1200 height=1000>
 <param name="x" value="100">
 <param name="y" value="200">
 <param name="color" value="FF2255">
 </applet>
</html>
