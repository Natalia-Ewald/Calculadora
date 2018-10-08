/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 05025589207
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtusuario;
    @FXML
    private TextField txtsenha;
    @FXML
    private Button btnentrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void entrar(ActionEvent event) throws IOException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
       
        Query query = em.createQuery("SELECT l FROM login as l WHERE l.usuario = :user");
        query.setParameter("user", txtusuario.getText());
        
        
        if(query.getResultList().isEmpty()){
            Alert alert = new Alert (Alert.AlertType.WARNING);
            alert.setHeaderText("O usuário não existe");
            alert.showAndWait();
        } else {
            Calculadora c = (Calculadora) query.getSingleResult();
            if (!c.getSenhalogin().equals(txtsenha.getText())){
                Alert alert = new Alert (Alert.AlertType.WARNING);
                alert.setHeaderText("Senha não confere ");
                alert.showAndWait();
            }
            else{
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("br/edu/ifro/view/login.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setTitle("Login");
                stage.setScene(scene);
                stage.show();
            }           
          }
    }
    }
    

