package org.lgulab.tuto1.view1;

import java.net.URL;
import java.util.ResourceBundle;

import org.lgulab.util.FxmlController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Tuto1Controller extends FxmlController implements Initializable {

	@FXML 
	private Button myButton ;
	
	@FXML 
	private void doSomething(ActionEvent actionEvent) {
		System.out.println("Click");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("initialize...");
		
	}

}
