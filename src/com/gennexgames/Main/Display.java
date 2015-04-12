package com.gennexgames.Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import com.gennexgames.Resources.RecourceLoader;


public class Display extends JPanel {

	BufferedImage block1;
	BufferedImage block2;
	BufferedImage block3;
	BufferedImage block4;
	BufferedImage block5;
	BufferedImage viewScreenBox;
	BufferedImage codeScreenBox;
	BufferedImage commandScreenBox;
	
	public int n = 0;
	
	
	Frame frame;
	
	
	public Display(Frame frame){
		this.frame = frame;
		block1 = RecourceLoader.loadImage("box1.png");
		block2 = RecourceLoader.loadImage("box2.png");
		block3 = RecourceLoader.loadImage("box3.png");
		block4 = RecourceLoader.loadImage("box4.png");
		block5 = RecourceLoader.loadImage("box5.png");
		viewScreenBox = RecourceLoader.loadImage("viewScreenBox.png");
		codeScreenBox = RecourceLoader.loadImage("codeScreenBox.png");
		commandScreenBox = RecourceLoader.loadImage("commandScreenBox.png");
	}
	
	
	@Override
	public void paintComponent(Graphics g){
		g.clearRect(0, 0, frame.getWidth(), frame.getHeight());
		
		
		int boxWidth = (int) (frame.getWidth() * (9d/14d));
		int boxHeight = (int) (frame.getHeight() * (9d/14d));
		
		g.drawImage(codeScreenBox, boxWidth, 0, boxWidth, frame.getHeight(), null);
		
		
		g.drawImage(viewScreenBox, 0, 0, boxWidth, boxHeight, null);
		
		
		g.drawImage(commandScreenBox, 0, boxHeight, boxWidth, frame.getHeight() - boxHeight, null);
		
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("TimesRoman", Font.PLAIN, ((frame.getWidth() / 8) / 2) + ((frame.getHeight() / 8) / 2)));
		g.drawString(n + "", 0, frame.getHeight() - 100);
		
		
		g.drawImage(block1, 10, boxHeight + 10, 130, 50, null);
		g.drawImage(block2, 10, boxHeight + 60, 130, 50, null);
		g.drawImage(block3, 10, boxHeight + 110, 130, 50, null);
		g.drawImage(block4, 10, boxHeight + 160, 130, 50, null);
		g.drawImage(block5, 10, boxHeight + 210, 130, 50, null);
	}
}
