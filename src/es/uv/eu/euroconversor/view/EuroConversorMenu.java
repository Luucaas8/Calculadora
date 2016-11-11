/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.euroconversor.view;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author EU (2016)
 */
public class EuroConversorMenu extends JMenuBar{
    private JMenu menu;
    private JMenuItem item, item2;
    
    public EuroConversorMenu(){
        menu = new JMenu("Calculadora");
        item = new JMenuItem("Salir");
        item2 = new JMenuItem("Change Rate");
        
        menu.add(item);
        menu.add(item2);
        add(menu);
    }
    
    public void setActionListener(ActionListener actionListener) {
        item.addActionListener(actionListener);
        item2.addActionListener(actionListener);
    }
}