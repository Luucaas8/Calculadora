package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author
 */
public class NumberPanel extends JPanel{
    private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9, b10,b11;
    private BorderFactory border;
    
    public NumberPanel(){
        setLayout(new GridLayout(3,4,5,5));
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton(".");
        b11 = new JButton("C");
        //b1.setBorder(border.createLineBorder(Color.LIGHT_GRAY, 1));
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
    }
    
    public void setActionListener(ActionListener actionListener) {
        b0.addActionListener(actionListener);
        b1.addActionListener(actionListener);
        b2.addActionListener(actionListener);
        b3.addActionListener(actionListener);
        b4.addActionListener(actionListener);
        b5.addActionListener(actionListener);
        b6.addActionListener(actionListener);
        b7.addActionListener(actionListener);
        b8.addActionListener(actionListener);
        b9.addActionListener(actionListener);
        b10.addActionListener(actionListener);
        b11.addActionListener(actionListener);
        
    }
}