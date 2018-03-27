/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dario.java.std.calculadoraoop;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author EducaciónIT
 */
public class PantallaCalculadoraController implements Initializable {

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button buttonDiv;

    @FXML
    private Button buttonRaiz;

    @FXML
    private Button buttonPor;

    @FXML
    private Button buttonPot;

    @FXML
    private Button buttonIgual;

    @FXML
    private Label idLabel;

    @FXML
    private Button buttonSuma;

    @FXML
    private Button button0;

    @FXML
    private Button buttonPunto;

    @FXML
    private Button button1;

    @FXML
    void b95151(ActionEvent event) {

    }

    @FXML
    void ejecutarBoton(ActionEvent event) {
        if (event.getSource() == button1) {
            idLabel.setText(idLabel.getText()+" 1");

        } else if (event.getSource() == button2) {
            idLabel.setText(idLabel.getText()+" 2");
        } else if (event.getSource() == button3) {
            idLabel.setText(idLabel.getText()+" 3");
        } else if (event.getSource() == button3) {
            idLabel.setText(idLabel.getText()+" 3");
        } else if (event.getSource() == button4) {
            idLabel.setText(idLabel.getText()+" 4");
        } else if (event.getSource() == button5) {
            idLabel.setText(idLabel.getText()+" 5");
        } else if (event.getSource() == button6) {
            idLabel.setText(idLabel.getText()+" 6");
        } else if (event.getSource() == button7) {
            idLabel.setText(idLabel.getText()+" 7");
        } else if (event.getSource() == button8) {
            idLabel.setText(idLabel.getText()+" 8");
        } else if (event.getSource() == button9) {
            idLabel.setText(idLabel.getText()+" 9");
        } else if (event.getSource() == buttonDiv) {
            idLabel.setText(idLabel.getText()+" /");
        } else if (event.getSource() == buttonPot) {
            idLabel.setText(idLabel.getText()+" ^");
        } else if (event.getSource() == buttonRaiz) {
            idLabel.setText(idLabel.getText()+" ¹");
        } else if (event.getSource() == buttonPor) {
            idLabel.setText(idLabel.getText()+" x");
        } else if (event.getSource() == buttonIgual) {
            idLabel.setText(idLabel.getText()+" =");
        } else if (event.getSource() == button0) {
            idLabel.setText(idLabel.getText()+" 0");
        } else if (event.getSource() == buttonPunto) {
            idLabel.setText(idLabel.getText()+" .");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb
    ) {
        // TODO
    }

}
