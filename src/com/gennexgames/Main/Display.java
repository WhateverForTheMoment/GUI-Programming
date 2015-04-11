package com.gennexgames.Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Display extends JPanel {

	public int n = 0;
	
	public void setN(int n){
		this.n = n;
	}
	
	@Override
	public void paintComponent(Graphics g){
		g.clearRect(0,0,800,580);
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, 800, 580);
		g.setColor(Color.BLACK);
		g.setFont(new Font("TimesRoman",Font.PLAIN,100));
		g.drawString(n + "", 0, 500);
	}
	
}
