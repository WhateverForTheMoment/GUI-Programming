package com.gennexgames.Resources;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.ImageIcon;

public class RecourceLoader {

	public static URL getPath(String name) {
		  return ClassLoader.getSystemResource("res/" + name);
		 }

		 public static BufferedImage loadImage(String name) {
		  Image img = new ImageIcon(getPath(name)).getImage();
		  BufferedImage bImg = new BufferedImage(img.getWidth(null),img.getHeight(null),BufferedImage.TRANSLUCENT);
		  bImg.getGraphics().drawImage(img, 0, 0, null);
		  return bImg;
		 }

		 public static File getFile(String name) {
		  File file = null;
		  try {
		   System.out.println(name);
		   file = new File(getPath(name).toURI());
		  } catch (URISyntaxException e) {
		   e.printStackTrace();
		  }
		  return file;
		 }
	
}
