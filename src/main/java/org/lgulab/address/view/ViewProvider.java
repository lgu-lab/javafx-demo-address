package org.lgulab.address.view;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class ViewProvider {

	private final static String ROOT_LAYOUT = "RootLayout.fxml" ;
			
	public static URL getLocation(String fxmlFileName) {
		System.out.println("getLocation('" + fxmlFileName + "')" );
		
//		String resourceFullName = "view/" + fxmlFileName ;
		
//		System.out.println("getLocation('" + fxmlFileName + "') : search " + resourceFullName );
		
//		URL location = MainApp.class.getResource(resourceFullName );
		URL location = ViewProvider.class.getResource(fxmlFileName);
		
		System.out.println("getLocation('" + fxmlFileName + "') : " + location );
		return location ;
	}
	
	public static Parent getRootNode() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation( getLocation(ROOT_LAYOUT) );
        
        try {
			return loader.load();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Cannot load " + ROOT_LAYOUT );
		}
	}

	public static Node getViewNode( String fxmlFileName ) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation( getLocation( fxmlFileName ) );
        
        try {
			return loader.load();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Cannot load " + fxmlFileName );
		}
	}
}
