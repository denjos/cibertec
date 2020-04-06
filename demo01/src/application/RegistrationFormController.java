package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegistrationFormController implements Initializable{

	@FXML
	Button button;
	
	@FXML
	TextField num1;
	
	@FXML
	TextField num2;
	
	private void handleButtonClick(ActionEvent event) {
		System.out.println("RegistrationFormController.handleButtonClick()"+num1.getText());
		System.out.println("RegistrationFormController.handleButtonClick()"+num2.getText());
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		button.setOnAction(this::handleButtonClick);
		
	}

}
