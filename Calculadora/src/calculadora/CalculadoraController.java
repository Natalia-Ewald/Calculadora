/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 05025589207
 */
public class CalculadoraController implements Initializable {

    @FXML
    private TextField txtvalor1;
    @FXML
    private TextField txtvalor2;
    @FXML
    private Button btnsoma;
    @FXML
    private Button subtracao;
    @FXML
    private Button divisao;
    @FXML
    private Button multiplicacao;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void somar(ActionEvent event) {
    }

    @FXML
    private void subtracao(ActionEvent event) {
    }

    @FXML
    private void divisao(ActionEvent event) {
    }

    @FXML
    private void multiplicacao(ActionEvent event) {
    }
    
}
