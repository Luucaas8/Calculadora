package es.uv.eu.euroconversor.view;


import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class EuroConversorView extends JFrame{
    private ClearPanel clear;
    private DisplayPanel display;
    private NumberPanel numeros;
    private OperationPanel operaciones;
    private EuroConversorMenu menu;
    private BorderFactory borde;

    public EuroConversorView(){

        setLayout(new BorderLayout());

        clear = new ClearPanel();
        display = new DisplayPanel();
        numeros = new NumberPanel();
        operaciones = new OperationPanel();
        menu = new EuroConversorMenu();
        
        add(clear, BorderLayout.SOUTH);
        add(display, BorderLayout.NORTH);
        add(numeros, BorderLayout.CENTER);
        add(operaciones, BorderLayout.EAST);

        setJMenuBar(menu);
       
        
        
    }
    
    public void setActionListener(ActionListener a){
        menu.setActionListener(a);
        clear.setActionListener(a);
        numeros.setActionListener(a);
        operaciones.setActionListener(a);
    }
    
    public void setItemListener(ItemListener e){
        operaciones.setItemListener(e);
    }
    
   public void setEtiqueta(String e){
       display.setEtiqueta(e);
   }
   
   public void setRate(String e){
       display.setRate(e);
   }
   
   public String isSelect(){
       String s = operaciones.isSelected();
       
       return s;
   }

}
    

