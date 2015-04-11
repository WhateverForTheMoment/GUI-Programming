package com.gennexgames.Main;

public class MainHandler implements Runnable{

	Frame frame;
	Display display;
	
	boolean running = true;
	
	public MainHandler(Frame frame, Display display){
		new Thread(this).start();
		this.frame = frame;
		this.display = display;
	}
	
	@Override
	public void run(){
		while(running){
			display.repaint();
		}
	}
	
}
