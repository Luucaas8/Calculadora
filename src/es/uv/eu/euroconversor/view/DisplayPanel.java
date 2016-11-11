package es.uv.eu.euroconversor.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author
 */
public class DisplayPanel extends JPanel{
    private JLabel arriba, abajo;
    private BorderFactory borde;
    
    public DisplayPanel(){
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        
        arriba = new JLabel("0", SwingConstants.RIGHT);
        abajo = new JLabel("Exchange rate: 1.11253", SwingConstants.LEFT);
        arriba.setAlignmentX(SwingConstants.NORTH_EAST);
        abajo.setAlignmentX(SwingConstants.SOUTH_WEST);
        
        this.setBorder(borde.createLineBorder(Color.BLACK, 7));
        this.setBackground(new Color(180, 170, 105));
        
        Font f = new Font("Arial", Font.BOLD, 40);
        Font q = new Font("Arial", Font.PLAIN, 10);
        
        arriba.setFont(f);
        abajo.setFont(q);
        
        add(arriba);
        add(abajo);
    }

    public void setEtiqueta(String e){
        arriba.setText(e);
    }
    
    public void setRate(String e){
        abajo.setText("Excange rate: " + e);
    }
}