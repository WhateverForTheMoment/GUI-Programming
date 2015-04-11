package com.gennexgames.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Frame extends JFrame{

	public static void main(String[] args) {
		new Frame();
	}
	
	public Frame(){
		new JFrame();
		this.setSize(800, 600);
		this.setTitle("GUI Programming");
		this.setVisible(true);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		final Display display = new Display();
		display.setSize(this.getWidth(), this.getHeight() - 20);
		display.setLocation(0, 20);
		this.add(display);
		
		new MainHandler(this,display);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem newItem = new JMenuItem("New");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem loadItem = new JMenuItem("Load");
		newItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setN(display.n + 1);
			}
		});
		saveItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setN(display.n - 1);
			}
		});
		loadItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setN(display.n = 0);
			}
		});
		file.add(newItem);
		file.add(saveItem);
		file.add(loadItem);
		menuBar.add(file);
		menuBar.setLocation(0, 0);
		menuBar.setSize(MainHandler.ReturnBarWidth(), 20);
		this.add(menuBar);
	}
	
}
