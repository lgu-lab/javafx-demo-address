package org.lgulab.tuto1;

import org.lgulab.tuto1.view1.Tuto1Controller;
import org.lgulab.util.StandardApplication;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class Tuto1App extends StandardApplication {
		
	@Override
	public void start(Stage primaryStage) {

		Parent parent = (Parent) loadView("Tuto1.fxml", new Tuto1Controller() );
		Scene myScene = new Scene(parent);

		primaryStage.setScene(myScene);
        primaryStage.setTitle("App");
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);
        primaryStage.show();
	}
 
	public static void main(String[] args) {
		launch(args);
	}
}