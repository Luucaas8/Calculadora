package es.uv.eu.euroconversor.controller;

import es.uv.eu.euroconversor.model.EuroConversorModel;
import es.uv.eu.euroconversor.view.EuroConversorView;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


/**
 *
 * @author EU (2016)
 */
public class EuroConversorController {
    private EuroConversorView vista;
    private EuroConversorModel modelo;
    
    public EuroConversorController(EuroConversorModel modelo, EuroConversorView vista){
        
        this.modelo = modelo;
        this.vista = vista;
        
        vista.setActionListener(new CalculadoraControllerActionListener());
        vista.setItemListener(new CalculadoraControllerItemListener());
        vista.addWindowListener(new CalculadoraControllerWindowListener());
        
    }
    
    class CalculadoraControllerWindowListener extends WindowAdapter {
    
        public void windowClosing(WindowEvent e) {
        System.out.println( " PeliculaController : Cerrar ventana.");
        System.exit(0);
        }
    } 
    class CalculadoraControllerActionListener implements ActionListener{
        
        public void actionPerformed(ActionEvent a){
            String opcion = a.getActionCommand();
            
            switch(opcion){
                
                case "Salir": 
                    System.exit(0);
                    break;
                    
                case "Change Rate":
                    float cambio = Float.parseFloat(JOptionPane.showInputDialog(null, "Indica el nuevo exchange rate: "));
                    modelo.setExchangeRate(cambio);
                    vista.setRate(modelo.getExchangeRate());
                    break;
                    
                case "CLEAR":
                String e = modelo.reset();
                vista.setEtiqueta(e);
                break;
                
                case "Convert":
                if(vista.isSelect() == "Euro-Dolar"){      
                    String mult = modelo.convertmult();
                    vista.setEtiqueta(mult);
                }
                else if(vista.isSelect() == "Dolar-Euro"){
                    String div = modelo.convertdiv();
                    vista.setEtiqueta(div);
                }
                break;
                      
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case ".":
                case "C":
                    String s = modelo.addDigit(opcion);
                    vista.setEtiqueta(s);
                    break;
                    
                default:
                    break;
  
            }                       
        }          
    }
    
    class CalculadoraControllerItemListener implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            JRadioButton r = (JRadioButton)e.getSource();
            
            if(vista.isSelect() == "Euro-Dolar" ){
                String reset = modelo.reset();
                vista.setEtiqueta(reset);
            }
            else {
                String reset2 = modelo.reset();
                vista.setEtiqueta(reset2);
            }
        }
    }
}



    
