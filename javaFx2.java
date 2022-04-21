// JavaFX root nodes, Image/Label, orientation

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import java.io.*;
// import javafx.scene.Group;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;

public class javaFx2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage stage) throws Exception {
		// HBox root = new HBox(10);
		// VBox root = new VBox();
		FlowPane root = new FlowPane(); // wrap around screen, like flexbox with flexWrap
		
		Button b1 = new Button("Submit");
		Button b2 = new Button("Cancel");
		Button b3 = new Button("Save");
		Button b4 = new Button("Exit");

		FileInputStream fis = new FileInputStream("E:\\Pics\\github_tile.png");
		Image i = new Image(fis, 400, 150, true, true);
		// img_file, width, height, preserve aspect ratio, smooth
		// aspect ratio maintained acc. to height
		ImageView iv = new ImageView(i);
		// iv.setFitWidth(500);
		// iv.setFitHeight(300);

		Label lb = new Label("Hello There!", iv);
		// Label lb = new Label("", iv);
		lb.setContentDisplay(ContentDisplay.BOTTOM);


		// Group root = new Group();
		root.getChildren().addAll(lb, b1, b2, b3, b4);

		Scene scene = new Scene(root, 600, 400, Color.rgb(255, 255, 255, 1));

		stage.setTitle("Sample application");
		stage.setScene(scene);
		stage.show();
	}
}