package generic;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Screenshot {

	public static void capturedesktop(String imgpath) {
	try
	{
		Robot robot=new Robot();
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenrect=new Rectangle(screensize);
		BufferedImage screenshot=robot.createScreenCapture(screenrect);
		ImageIO.write(screenshot, "jpg", new File(imgpath));
	}
	catch(Exception e)
	{
		
	}
	}

}
