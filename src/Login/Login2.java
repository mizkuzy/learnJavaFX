package Login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("VDO Roadlog Fleet Online USB Sync Application Login");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label companyID = new Label("Company ID");
        grid.add(companyID, 0, 0);

        TextField companyIDTextField = new TextField();
        grid.add(companyIDTextField, 1, 0);

        Label userName = new Label("User name");
        grid.add(userName, 0, 1);

        TextField userNameTextField = new TextField();
        grid.add(userNameTextField, 1, 1);

        Label pw = new Label("Password");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        CheckBox checkBox = new CheckBox("Remember me");
        grid.add(checkBox, 1, 3);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 5);

        Button cancelBtn = new Button("Cancel");
        cancelBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                actiontarget.setFill(Color.DARKCYAN);
                actiontarget.setText("canscel button pressed");
            }
        });

        Button loginBtn = new Button("Login");
        loginBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("login button pressed");
            }
        });
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(cancelBtn);
        hbBtn.getChildren().add(loginBtn);
        grid.add(hbBtn, 1, 6);

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
