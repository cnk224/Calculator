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
	private Button multipleButton;
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
	
	private int operate = -1;
	private float result;
	private float firstNumber;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
	@FXML
	void handleActionButton(ActionEvent event) {
		
		if(event.getSource() == button0) {
			display.setText(display.getText() + "0");
		}else
		if(event.getSource() == button1) {
			display.setText(display.getText() + "1");
		}else
		
		if(event.getSource() == button2) {
			display.setText(display.getText() + "2");
		}else
		
		if(event.getSource() == button3) {
			display.setText(display.getText() + "3");
		}else
		
		if(event.getSource() == button4) {
			display.setText(display.getText() + "4");
		}else
		
		if(event.getSource() == button5) {
			display.setText(display.getText() + "5");
		}else
		
		if(event.getSource() == button6) {
			display.setText(display.getText() + "6");
		}else
		
		if(event.getSource() == button7) {
			display.setText(display.getText() + "7");
		}else
		
		if(event.getSource() == button8) {
			display.setText(display.getText() + "8");
		}else
		
		if(event.getSource() == button9) {
			display.setText(display.getText() + "9");
		}else
		
		if(event.getSource() == addButton) {
			firstNumber = Float.parseFloat(display.getText());
			operate = 1;
			display.setText("");
		}else
		
		if(event.getSource() == soustractButton) {
			firstNumber = Float.parseFloat(display.getText());
			operate = 2;
			display.setText("");
			
		}else
		
		if(event.getSource() == multipleButton) {
			firstNumber = Float.parseFloat(display.getText());
			operate = 3;
			display.setText("");
		}else
		
		if(event.getSource() == divideButton) {
			firstNumber = Float.parseFloat(display.getText());
			operate = 4;
			display.setText("");
		}else if(event.getSource() == equalButton) {
			float secondNumber = Float.parseFloat(display.getText());
			
			switch(operate) {
			case 1:
				result = firstNumber + secondNumber;
				display.setText(String.valueOf(result));
				System.out.println("firstNumber: "+firstNumber);
				break;
			case 2:
				result = firstNumber + secondNumber;
				display.setText(String.valueOf(result));
				System.out.println("firstNumber: "+firstNumber);
				break;
			case 3:
				result = firstNumber * secondNumber;
				display.setText(String.valueOf(result));
				System.out.println("firstNumber: "+firstNumber);
				break;
			case 4:
				result = firstNumber / secondNumber;
				display.setText(String.valueOf(result));
				System.out.println("firstNumber: "+firstNumber);
				break;
			}
			
			
		}
		
	}
	
}
