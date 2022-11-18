
package methode;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import javax.swing.*;


public abstract class MaFenetre extends JFrame{
    JLabel Jbl = new JLabel("Nom:");
    JTextField Jtf = new JTextField(12);
    JButton Jbt1 = new JButton("add");
    JButton Jbt2 = new JButton("supp"); 
    List liste1 = new List();
    List liste2 = new List();
    
    public MaFenetre(){
    
        this.setLayout(new BorderLayout());//la division principale 
        JPanel jp1 = new JPanel();
        jp1.setLayout(new FlowLayout());//le panel seras centré
        jp1.add(Jbl);jp1.add(Jtf);jp1.add(Jbt1);jp1.add(Jbt2);
    // on vient de cree un paneau avec tous options precisé haut à l'interieure 
        this.add(jp1,BorderLayout.NORTH); // metons le paneau vers le nord
        
        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout());
        jp2.add(liste1);
        jp2.add(liste2);
        
        this.add(jp2,BorderLayout.CENTER);
        this.setBounds(10, 10, 500, 500);// la dimenssion de la fenetre 
        
    }
}
