// JavaFX CheckBox, ToggleGroup and RadioButton

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class javaFx9 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		VBox groot = new VBox(10);

		HBox root1 = new HBox(10);

		CheckBox cb1 = new CheckBox("Java");
		CheckBox cb2 = new CheckBox("C++");

		Button b1 = new Button("Submit");

		TextField tf1 = new TextField();

		root1.getChildren().addAll(tf1, cb1, cb2, b1);

		// cb1.setOnAction(ae -> {
		// 	if (cb1.isSelected()) {
		// 		cb2.setSelected(false);
		// 	}
		// });
		
		// cb2.setOnAction(ae -> {
		// 	if (cb2.isSelected()) {
		// 		cb1.setSelected(false);
		// 		}
		// });
		// for working like a radio button

		b1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				String s="";
				if (cb1.isSelected()) {
					s += cb1.getText();
				}
				if (cb2.isSelected()) {
					s += cb2.getText();
				}
				tf1.setText(s);
			}
		});

		HBox root2 = new HBox(10);

		ToggleGroup tg1 = new ToggleGroup();
		ToggleGroup tg2 = new ToggleGroup();

		RadioButton rb1 = new RadioButton("BTech");
		RadioButton rb2 = new RadioButton("MTech");
		rb1.setToggleGroup(tg1);
		rb2.setToggleGroup(tg1);

		RadioButton r1 = new RadioButton("1");
		RadioButton r2 = new RadioButton("2");
		RadioButton r3 = new RadioButton("3");
		RadioButton r4 = new RadioButton("4");
		r1.setToggleGroup(tg2);
		r2.setToggleGroup(tg2);
		r3.setToggleGroup(tg2);
		r4.setToggleGroup(tg2);

		Button b2 = new Button("Submit");

		TextField tf2 = new TextField();

		root2.getChildren().addAll(tf2, rb1, rb2, r1, r2, r3, r4, b2);
		
		groot.getChildren().addAll(root1, root2);

		b2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				String s="";
				if (tg1.getSelectedToggle() != null)
				s += ((RadioButton)tg1.getSelectedToggle()).getText();
				if (tg2.getSelectedToggle() != null)
				s += ((RadioButton)tg2.getSelectedToggle()).getText();
				tf2.setText(s);
			}
		});

		Scene scene = new Scene(groot, 600, 400, Color.rgb(255, 255, 255, 1));

		stage.setTitle("Sample application");
		stage.setScene(scene);
		stage.show();
	}
}