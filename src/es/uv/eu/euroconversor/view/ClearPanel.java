

package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author EU (2016)
 */
public class ClearPanel extends JPanel{
    private JButton boton;
    
    public ClearPanel(){
        setLayout(new GridLayout(1,1));
        boton = new JButton("CLEAR");
        Font f = new Font("Arial", Font.BOLD, 15);
        boton.setForeground(Color.blue);
        
        boton.setFont(f);
        add(boton);
        
    }
    
    public void setActionListener(ActionListener actionlistener){
        boton.addActionListener(actionlistener);
    }
}