package com.gennexgames.Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Display extends JPanel {

	public int n = 0;
	
	Frame frame;
	
	public Display(Frame frame){
		this.frame = frame;
	}
	
	
	@Override
	public void paintComponent(Graphics g){
		int boxWidth = (int) (frame.getWidth() * (9d/14d));
		int boxHeight = (int) (frame.getHeight() * (9d/14d));
		
		g.clearRect(0,0,frame.getWidth(),frame.getHeight());
		
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
		
		
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, (int)boxWidth , (int)boxHeight);
		
		
		g.setColor(Color.ORANGE);
		g.fillRect(0, (int)boxHeight, (int)boxWidth , (frame.getHeight()) - (int)boxHeight);
		
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("TimesRoman",Font.PLAIN,100));
		g.drawString(n + "", 0, 500);
	}
	
}
