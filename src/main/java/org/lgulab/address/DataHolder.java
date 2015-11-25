package org.lgulab.address;

import org.lgulab.address.model.Person;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataHolder {

	private final static DataHolder instance = new DataHolder() ;
	
	public final static DataHolder getInstance() {
		return instance ;
	}
	
    private ObservableList<Person> personData = FXCollections.observableArrayList();
	
    /**
     * Returns the data as an observable list of Persons. 
     * @return
     */
    public ObservableList<Person> getPersonData() {
        return personData;
    }
	
}
