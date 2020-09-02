package sample;

import com.gn.lab.GNButton;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SignUpControllers {

    @FXML
    private Label label;

    @FXML
    private AnchorPane apSignUp;

    @FXML
    private JFXTextField newName;

    @FXML
    private JFXPasswordField newPassword;

    @FXML
    private JFXButton exit;

    @FXML
    private GNButton confirm;

    @FXML
    private GNButton goToLogin;

    @FXML
    private JFXTextField newAge;



    @FXML
    void doExit(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    void toLogin() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
        pane.setStyle("-fx-background-radius: 6;");
        apSignUp.getChildren().setAll(pane);
    }

    public JFXTextField getNewName() {
        return newName;
    }

    Users users = new Users();

    @FXML
    void doConfirm(MouseEvent event) {
        if (newName.getText().isEmpty() || newAge.getText().isEmpty() || newPassword.getText().isEmpty()) {
            label.setText("incorrect name, please try again");
        } else {
            label.setText("");
//            Users[] arr = {new Users(newName.getText(), newAge.getText(), newPassword.getText())};
            Users[] arr = {new Users("555", "555", "555")};
            users.setList(Arrays.asList(arr));
            users.setName("777");
            users.setAge("777");
            users.setPassword("777");



        }
    }

}
