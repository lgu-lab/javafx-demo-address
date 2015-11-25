package org.lgulab.address;

import org.lgulab.address.model.Person;
import org.lgulab.address.view.ViewProvider;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {
	
    private Stage primaryStage;
    
    private BorderPane rootLayout;
    
//    private ObservableList<Person> personData = FXCollections.observableArrayList();

    /**
     * Constructor
     */
    public MainApp() {
    	ObservableList<Person> personData = DataHolder.getInstance().getPersonData() ; // Added
    	
        // Add some sample data
        personData.add(new Person("Hans", "Muster"));
        personData.add(new Person("Ruth", "Mueller"));
        personData.add(new Person("Heinz", "Kurz"));
        personData.add(new Person("Cornelia", "Meier"));
        personData.add(new Person("Werner", "Meyer"));
        personData.add(new Person("Lydia", "Kunz"));
        personData.add(new Person("Anna", "Best"));
        personData.add(new Person("Stefan", "Meier"));
        personData.add(new Person("Martin", "Mueller"));
    }

//    /**
//     * Returns the data as an observable list of Persons. 
//     * @return
//     */
//    public ObservableList<Person> getPersonData() {
//        return personData;
//    }
    
	/* 
	 * Cette m�thode est automatiquement appel�e lors du lancement de l'application (launch) avec la m�thode main
	 * main : Application.launch() --> this.start()
	 * 
	 * En param�tre l'objet Stage est le conteneur principal qui est habituellement 
	 * une fen�tre avec des bordures et qui a les boutons habituels pour minimiser, maximiser et fermer. 
	 * 
	 * Dans le Stage, vous ajoutez une Scene qui peut, bien s�r, �tre �chang�e avec un autre object Scene. 
	 * Sont ajout�s dans la Scene les noeuds JavaFX actuels comme AnchorPane, TextBox, etc.
	 */
	@Override
	public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();

        showPersonOverview();		
	}
	
    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
//        try {
//            // Load root layout from fxml file.
//            FXMLLoader loader = new FXMLLoader();
//            //loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
//            loader.setLocation( getLocation("RootLayout.fxml") );
//            rootLayout = (BorderPane) loader.load();
//
//            rootLayout = (BorderPane) ViewProvider.getRootNode();
//            
//            // Show the scene containing the root layout.
//            Scene scene = new Scene(rootLayout);
//            primaryStage.setScene(scene);
//            primaryStage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        rootLayout = (BorderPane) ViewProvider.getRootNode();
        
        // Show the scene containing the root layout.
        Scene scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showPersonOverview() {
//        try {
//            // Load person overview.
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(MainApp.class.getResource("view/PersonOverview.fxml"));
//            AnchorPane personOverview = (AnchorPane) loader.load();
//
//            // Set person overview into the center of root layout.
//            rootLayout.setCenter(personOverview);
//
//            // Give the controller access to the main app.
//            PersonOverviewController controller = loader.getController();
//            controller.setMainApp(this);
//            
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        AnchorPane personOverview = (AnchorPane) ViewProvider.getViewNode("PersonOverview.fxml");
        
        // Set person overview into the center of root layout.
        rootLayout.setCenter(personOverview);

//        // Give the controller access to the main app.
//        PersonOverviewController controller = loader.getController();
//        controller.setMainApp(this);
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

	public static void main(String[] args) {
		launch(args); // method defined in "Application" class
	}
}
