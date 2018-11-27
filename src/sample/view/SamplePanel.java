package sample.view;

//IMPORTS
import GUI.Controller.GUIController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.*;

public class SamplePanel extends JPanel {
	private GUIController appController;

	private JButton colorButton;
	private JLabel textLabel;

	public SamplePanel(GUIController appController) {
		super();

		this.appController = appController;

		colorButton = new JButton("Click to change the color");
		textLabel = new JLabel("This is a color app");

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel() {
		this.setBackground(Color.MAGENTA);
		this.add(textLabel);
		this.add(colorButton);
	}

	private void setupLayout() {

	}

	private void setupListeners() {
		colorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent mouseClick) 
			{
				System.out.println("I clicked a button! :)");
			}
		});
	}
}
