package application;
import javafx.application.*; import javafx.stage.*; import javafx.scene.*; import javafx.scene.layout.*;
import javafx.scene.control.*; import javafx.event.*;
import javafx.geometry.*;
public class ButtonDemo extends Application{
public static void main(String args[]) { launch(args);
}
public void start(Stage myStage) { myStage.setTitle("Buttons");
FlowPane root=new FlowPane(10,10); Scene myScene=new Scene(root,250,200); myStage.setScene(myScene); root.setAlignment(Pos.CENTER);
Label buttonLabel=new Label("Click a Button"); Button Alpha=new Button("Alpha");
Button Beta=new Button("Beta");
EventHandler<ActionEvent> e1=new EventHandler<ActionEvent>() { public void handle(ActionEvent e) {
                     buttonLabel.setText("Alpha is pressed");
                }
};
EventHandler<ActionEvent> e2=new EventHandler<ActionEvent>() { public void handle(ActionEvent e) {
                     buttonLabel.setText("Beta is pressed");
                }
};
           Alpha.setOnAction(e1);
           Beta.setOnAction(e2);
Separator s=new Separator(); s.setPrefWidth(250);
Label radioLabel=new Label("");
RadioButton Male=new RadioButton("Male"); RadioButton Female=new RadioButton("Female"); RadioButton Other=new RadioButton("Other");
EventHandler<ActionEvent> e3=new EventHandler<ActionEvent>() { public void handle(ActionEvent e) {
                     radioLabel.setText("Male is selected");
                }
};
EventHandler<ActionEvent> e4=new EventHandler<ActionEvent>() { public void handle(ActionEvent e) {
                     radioLabel.setText("Female is selected");
                }
};
EventHandler<ActionEvent> e5=new EventHandler<ActionEvent>() { public void handle(ActionEvent e) {
                     radioLabel.setText("Other is selected");
                }
};
           Male.setOnAction(e3);
           Female.setOnAction(e4);
           Other.setOnAction(e5);
ToggleGroup tog=new ToggleGroup();
           Male.setToggleGroup(tog);
           Female.setToggleGroup(tog);
           Other.setToggleGroup(tog);
root.getChildren().addAll(Alpha,Beta,buttonLabel,s,Male,Female,Other,radi oLabel);
           myStage.show();
     }
}