package sample;

import com.gn.lab.GNButton;
import com.jfoenix.controls.JFXButton;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SignInControllers {

    @FXML
    private AnchorPane apSignIn;

    @FXML
    private JFXTextField loginNick;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton exit;

    @FXML
    private GNButton buttonSignIn;

    @FXML
    private GNButton signUpButton;

    @FXML
    private Button inButtonSignUp;


    @FXML
    void doExit(MouseEvent event) {
        System.exit(0);
    }


    Users users = new Users();

    @FXML
    void login(MouseEvent event)  {
        System.out.println(users.getList());
    }


    @FXML
    void signUpPage(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        pane.setStyle("-fx-background-radius: 6;");
        apSignIn.getChildren().setAll(pane);
    }




    @FXML
    void initialize(ActionEvent event) {

    }
}
