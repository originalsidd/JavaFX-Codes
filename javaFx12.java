// JavaFX Ellipse Simulation using Keys

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
// import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
// import javafx.scene.input.*;
import javafx.event.*;

public class javaFx12 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		FlowPane root = new FlowPane();

		Button b1 = new Button("b1");

		root.getChildren().addAll(b1);

		b1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				HBox root2 = new HBox();

				TextField t1 = new TextField("Enter your text here");
				TextField t2 = new TextField();
				Button b2 = new Button("Click");

				root2.getChildren().addAll(t1, t2, b2);

				b2.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent ae) {
						t2.setText(t1.getText());
						System.out.println(t1.getText());
					}
				});

				Stage stage2 = new Stage();

				Scene scene2 = new Scene(root2, 400, 200, Color.rgb(30, 30, 30, 1));

				// stage2.initModality(Modality.APPLICATION_MODAL); // all other frames disabled
				stage2.initModality(Modality.WINDOW_MODAL); // parent frame disabled
				stage2.setX(stage.getX() + 100);
				stage2.setY(stage.getY() + 100);
				stage2.initOwner(stage);
				stage2.setTitle("Second Frame");
				stage2.setScene(scene2);
				stage2.show();
			}
		});

		Scene scene = new Scene(root, 600, 400, Color.rgb(255, 255, 255, 1));

		stage.setTitle("Sample application");
		stage.setScene(scene);
		stage.show();
	}
}