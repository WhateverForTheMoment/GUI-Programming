package com.gennexgames.Main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Frame extends JFrame{

	public JMenuBar menuBar;
	final public Display display;
	
	public int scrollDirection;
	
	public static void main(String[] args) {
		new Frame();
	}
	
	public Frame(){
		new JFrame();
		this.setSize(800, 600);
		this.setTitle("GUI Programming");
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
		
		display = new Display(this);
		display.setSize(this.getWidth(), this.getHeight() - 20);
		display.setLocation(0, 20);
		this.add(display);
		
		new MainHandler(this,display);
		
		this.addMouseWheelListener(new MouseWheelListener(){
            @Override
			public void mouseWheelMoved(MouseWheelEvent e) {
            	scrollDirection = scrollDirection + (int) (e.getPreciseWheelRotation() * 2);
			};
		});
		//menu bar stuff
		menuBar = new JMenuBar();
		
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenuItem newItem = new JMenuItem("New");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem loadItem = new JMenuItem("Load");
		JMenuItem undoItem = new JMenuItem("Undo");
		JMenuItem redoItem = new JMenuItem("Redo");
		newItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				display.n++;
			}
		});
		saveItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				display.n--;
			}
		});
		loadItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				display.n = 0;
			}
		});
		file.add(newItem);
		file.add(saveItem);
		file.add(loadItem);
		edit.add(undoItem);
		edit.add(redoItem);
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.setLocation(0, 0);
		menuBar.setSize(this.getWidth(), 20);
		this.add(menuBar);
		
		
		this.setVisible(true);
		this.setMinimumSize(new Dimension(800, 600));
	}
	
}
