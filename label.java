package application;
import javafx.application.*; import javafx.stage.*; import javafx.scene.*; import javafx.scene.layout.*;
import javafx.scene.text.*; import javafx.scene.control.*; import javafx.event.*;
import javafx.geometry.*;
public class JavaFx extends Application{
public static void main(String args[]) { launch(args);
}
public void start(Stage myStage) { myStage.setTitle("JavaFX");
GridPane root=new GridPane();
Scene myScene=new Scene(root,250,200); myStage.setScene(myScene); root.setAlignment(Pos.CENTER);
Button SignIn=new Button("SignIn");
Text Username=new Text("Username");
Text Password=new Text("PassWord");
Label label=new Label("Enter Username and Password"); TextField UsernameField=new TextField();
TextField PasswordField=new TextField();
EventHandler<ActionEvent> e1=new EventHandler<ActionEvent>() { public void handle(ActionEvent arg0) {
                     String name=UsernameField.getText();
root.getChildren().removeAll(Username,UsernameField,Password,PasswordFiel
d,SignIn);
}
};
label.setText("Welcome "+name);
           SignIn.setOnAction(e1);
           root.setVgap(5);
           root.setHgap(5);
           root.add(Username, 0, 0);
           root.add(UsernameField, 1, 0);
           root.add(Password, 0, 1);
           root.add(PasswordField, 1, 1);
           root.add(label, 1, 2);
           root.add(SignIn, 3, 3);
           myStage.show();
     }
}