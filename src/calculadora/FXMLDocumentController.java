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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author W4ND3K0
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField TFNumero;
    @FXML
    private TextField TFDobro;
    @FXML
    private TextField TFTriplo;
    @FXML
    private TextField TFQuadrado;
    @FXML
    private TextField TFCubo;
    @FXML
    private Button BCalcular;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    @FXML
    private void Calcular(ActionEvent event) {
        
        //Pegar número
        double CNum = Double.parseDouble(TFNumero.getText());
        
        //Dobro
        TFDobro.setText(Double.toString(CNum * 2));
        
        //Triplo
        TFTriplo.setText(Double.toString(CNum * 3));
        
        //Quadrado
        TFQuadrado.setText(Double.toString(Math.pow(CNum, 2)));
        
        //Cubo
        TFCubo.setText(Double.toString(Math.pow(CNum, 3)));
        
    }
    
}
