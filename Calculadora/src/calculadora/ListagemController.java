/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * FXML Controller class
 *
 * @author 05025589207
 */
public class ListagemController implements Initializable {

    @FXML
    private TableView<?> tbHistorico;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
      EntityManager em = emf.createEntityManager();
        
        Query query = em.createQuery("SELECT a FROM Calculadora a");
        List<Calculadora> calculadoras = query.getResultList();
        
        ObservableList oCalculadora = FXCollections.observableArrayList(calculadoras);
        tbHistorico.setItems(oCalculadora);
        
        
    }    
    
}
