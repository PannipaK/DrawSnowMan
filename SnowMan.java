
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class SnowMan extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a circle and set its properties
    Circle circle = new Circle();
    circle.setCenterX(100);
    circle.setCenterY(100);
    circle.setRadius(50);
    circle.setStroke(Color.BLACK);
    circle.setStrokeWidth(3.0);
    circle.setFill(Color.BLUE);
    
    Circle circle2 = new Circle();
    circle2.setCenterX(100);
    circle2.setCenterY(50);
    circle2.setRadius(30);
    circle2.setStroke(Color.BLACK);
    circle2.setStrokeWidth(3.0);
    circle2.setFill(Color.BLUE);

    Circle circle3 = new Circle();
    circle3.setCenterX(100);
    circle3.setCenterY(16);
    circle3.setRadius(10);
    circle3.setStroke(Color.BLACK);
    circle3.setStrokeWidth(3.0);
    circle3.setFill(Color.BLUE);
    
    // Create a pane to hold the circle 
    Pane pane = new Pane();
    pane.getChildren().add(circle);
    pane.getChildren().add(circle2);
    pane.getChildren().add(circle3);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 500, 200);
    primaryStage.setTitle("Snow Man"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  void DrawMyStuff(Pane myPane, Shape myShape)
  {
	  myPane.getChildren().add(myShape);
  }
  
  
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
  
  
}


