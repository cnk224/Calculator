package view;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainCalculatriceFxml implements Initializable{
	@FXML
	private Button button0;
	@FXML
	private Button button1;
	@FXML
	private Button button2;
	@FXML
	private Button button3;
	@FXML
	private Button button4;
	@FXML
	private Button button5;
	@FXML
	private Button button6;
	@FXML
	private Button button7;
	@FXML
	private Button button8;
	@FXML
	private Button button9;
	@FXML
	private Button percentageButton;
	@FXML
	private Button soustractButton;
	@FXML
	private Button addButton;
	@FXML
	private Button divideButton;
	@FXML
	private Button comaButton;
	@FXML
	private Button equalButton;
	
	@FXML
	private TextField display;
	
	@FXML
	private Button[] buttonTab = new Button[15];
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
	@FXML
	void handleActionButton(ActionEvent event) {
		System.out.println(event.getSource());
		if(event.getSource() == button1) {
			System.out.println("Bouton 1");
		}
		
	}
	
	
	
}
