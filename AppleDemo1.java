import java.applet.*;
import java.awt.*;
/*<applet code="AppleDemo1.class" width="300" height="300"></applet>*/

public class AppleDemo1 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Hellp world!",100,150);
		g.drawLine(150,300,250,300);
		g.drawLine(175,350,175,550);
		g.setColor(Color.magenta);
		g.fillOval(200,400,100,150);
		g.setColor(Color.cyan);
		g.fillOval(300,350,200,200);
	}
}
