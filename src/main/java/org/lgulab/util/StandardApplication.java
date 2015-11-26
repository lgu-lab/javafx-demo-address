package org.lgulab.util;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

public abstract class StandardApplication extends Application {

	public URL getLocation(String fxmlFileName, Class<?> clazz) {
		System.out.println("getLocation('" + fxmlFileName + "')" );
		URL location = clazz.getResource(fxmlFileName);
		System.out.println("getLocation('" + fxmlFileName + "') : " + location );
		return location ;
	}
	
	public Node loadView( String fxmlFileName, FxmlController controller) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation( getLocation( fxmlFileName, controller.getClass() ) );
        loader.setController(controller);
        
        try {
			return loader.load();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Cannot load " + fxmlFileName );
		}
	}
}
