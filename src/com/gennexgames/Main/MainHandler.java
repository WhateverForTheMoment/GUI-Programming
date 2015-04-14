package com.gennexgames.Main;

import java.awt.Dimension;

public class MainHandler implements Runnable{

	Frame frame;
	Display display;
	
	public static boolean running = true;
	public static Dimension frameSize;
	
	public MainHandler(Frame frame, Display display){
		new Thread(this).start();
		this.frame = frame;
		this.display = display;
		frameSize = new Dimension(800,600);
	}
	
	@Override
	public void run(){
		while(running){
			display.repaint();
			if(frameSize.getWidth() != frame.getWidth() || frameSize.getHeight() != frame.getHeight()){
				frameSize = frame.getSize();
				updateSize();
			}
		}
	}
	
	public void updateSize(){
		frame.menuBar.setSize(frame.getWidth(), 20);
		display.setSize(frame.getWidth(), frame.getHeight() - 20);
	}
	
}
