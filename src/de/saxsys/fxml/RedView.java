package de.saxsys.fxml;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class RedView {

	@FXML
	private Button button2;

	@FXML
	private Button button1;

	public void foo(String foo) {
		System.out.println(foo);
	}
}
