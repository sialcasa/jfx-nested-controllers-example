package de.saxsys.fxml;

import javafx.fxml.FXML;
import javafx.scene.Parent;

public class MainView {

	@FXML
	private Parent embeddedRedView;

	@FXML
	private RedView embeddedRedViewController;

	public void initialize() {
		System.out.println(embeddedRedViewController);
		System.out.println(embeddedRedView);
	}
}
