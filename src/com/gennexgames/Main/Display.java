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
		
		
		Color viewScreenColor = new Color(0, 148, 255);
		Color codeScreenColor = new Color(0, 100, 255);
		Color commandScreenColor = new Color(0, 100, 200);
		
		
		g.clearRect(0, 0, frame.getWidth(), frame.getHeight());
		
		
		//g.setColor(Color.GREEN);
		g.setColor(codeScreenColor);
		g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
		
		
		//g.setColor(Color.CYAN);
		g.setColor(viewScreenColor);
		g.fillRect(0, 0, boxWidth , boxHeight);
		
		
		//g.setColor(Color.ORANGE);
		g.setColor(commandScreenColor);
		g.fillRect(0, boxHeight, boxWidth , (frame.getHeight()) - boxHeight);
		
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("TimesRoman", Font.PLAIN, ((frame.getWidth() / 8) / 2) + ((frame.getHeight() / 8) / 2)));
		g.drawString(n + "", 0, frame.getHeight() - 100);
	}
}
