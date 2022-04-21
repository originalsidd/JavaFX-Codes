// JavaFX Different Panes, Frames, Scenes

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class javaFx11 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		GridPane root = new GridPane();
		Button b1 = new Button("Button 1");
		Button b2 = new Button("2");
		Button b3 = new Button("Button 3");
		Button b4 = new Button("4");
		Button b5 = new Button("Button 5");
		root.add(b1, 1, 0, 1, 1);
		root.add(b2, 0, 0, 2, 1);
		root.add(b3, 0, 1, 1, 1);
		root.add(b4, 1, 1, 1, 1);
		root.add(b5, 2, 1, 1, 1);
		root.setVgap(10);
		root.setHgap(10);

		TilePane root1 = new TilePane();
		Button b11 = new Button("Button 1");
		Button b22 = new Button("2");
		Button b33 = new Button("Button 3");
		Button b44 = new Button("4");
		Button b55 = new Button("Button 5");
		root1.getChildren().addAll(b11, b22, b33, b44, b55);
		root1.setVgap(10);
		root1.setHgap(10);

		FlowPane root2 = new FlowPane();
		Button b111 = new Button("Button 1");
		Button b222 = new Button("2");
		Button b333 = new Button("Button 3");
		Button b444 = new Button("4");
		Button b555 = new Button("Button 5");
		root2.getChildren().addAll(b111, b222, b333, b444, b555);
		root2.setVgap(10);
		root2.setHgap(10);
		root2.setOrientation(Orientation.VERTICAL);



		Scene scene = new Scene(root2, 600, 400, Color.rgb(255, 255, 255, 1));

		stage.setTitle("Sample application");
		stage.setScene(scene);
		stage.show();
	}
}