package com.example.whatsup;

import com.example.paquete.Paquete;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class ContactosController {



    @FXML
    void ckmigue(ActionEvent event) throws IOException {//escojo el chat de Miiguel
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        root=fxmlLoader.load();
        HelloController helloController=fxmlLoader.getController();
        helloController.userChat("");
        //instanciar paquet
        helloController.Establecer(new Paquete("",9002,9003, 10002));
//stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void cksanty(ActionEvent event) throws IOException {//escojo el chat de Santiago
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        root=fxmlLoader.load();
        HelloController helloController=fxmlLoader.getController();
        helloController.userChat("");
        helloController.Establecer(new Paquete("",9002,9001, 10001));
        //chatController.Establecer_Paquete(datos);
//stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    private Stage stage;
    private Scene scene;
    private Parent root;
}
