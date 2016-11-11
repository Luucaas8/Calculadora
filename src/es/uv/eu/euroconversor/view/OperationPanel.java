package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author 
 */
public class OperationPanel extends JPanel{
    private JRadioButton rb1, rb2;
    private JButton boton;
    private ButtonGroup grupo;
    private BorderFactory borde1, borde2;
    
    public OperationPanel(){
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        grupo = new ButtonGroup();
        
        rb1 = new JRadioButton("Dolar-Euro", true);
        rb2 = new JRadioButton("Euro-Dolar");
        
        boton = new JButton("Convert");
        Font f = new Font("Arial", Font.BOLD, 15);
        boton.setForeground(Color.blue);
        
        boton.setFont(f);
        
        grupo.add(rb1);
        grupo.add(rb2);
        
        add(rb1);
        add(rb2);
        add(boton);
    }
    
    public String isSelected(){
        String s = "";
        if(rb1.isSelected()){
            s = "Dolar-Euro";
        }
        else if(rb2.isSelected()){
            s = "Euro-Dolar";
        }
        
        return s;
    } 

    
    public void setActionListener(ActionListener actionListener) {
        boton.addActionListener(actionListener);
    }
    
    public void setItemListener(ItemListener b){
        rb1.addItemListener(b);
        rb2.addItemListener(b);
    }

   
}