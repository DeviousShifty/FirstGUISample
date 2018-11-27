package sample.view; //Frame class always looks like this
//IMPORTS
import javax.swing.JFrame;
import GUI.Controller.GUIController;

public class SampleFrame extends JFrame
{
	private GUIController appController;
	private SamplePanel appPanel;
													//constructor initializes the data member
	public SampleFrame(GUIController appController) //constructor in frame class takes the controller as a parameter
	{
		super(); //first line of constructor after every class that uses extends
		
		this.appController = appController; //different color for parameter and data member
		this.appPanel = new SamplePanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame() 
	{
		this.setContentPane(appPanel);
		this.setSize(1000, 500);
		this.setTitle("Second GUI App");
		this.setResizable(false);
		this.setVisible(true);
	}
}
