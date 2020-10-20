package Conciertopf.Grafica;



import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiGracias extends JFrame{
    
    private static final long serialVersionUID = 1L;
    private JPanel VInicio;
    
    
    
    
    private JLabel TituloIntro;
    private JLabel lbIDerechos;
    

    public GuiGracias() {
        iniciarComponentes();
        
        this.setTitle("f");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void iniciarComponentes(){
        crearPanel();
        colocarLabel();
    }
    
    
    public void crearPanel(){
        VInicio= new JPanel();
        this.getContentPane().setLayout(null);
        this.setBounds(500, 50, 790, 530);
        this.getContentPane().add(VInicio);
        VInicio.setBounds(0, 0, 790, 530);
        VInicio.setBackground(Color.BLACK);
        VInicio.setLayout(null);
    }
    public void colocarLabel(){
        TituloIntro = new JLabel("Gracias por su visita");
        TituloIntro.setBounds(10, 10, 700, 50);
        TituloIntro.setHorizontalAlignment(JLabel.CENTER);
        TituloIntro.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 50));
        TituloIntro.setForeground(Color.WHITE);
        VInicio.add(TituloIntro);
        
        lbIDerechos = new JLabel ("sdgonzalezg@correo.udistrial.edu.co");
        lbIDerechos.setBounds(50,450,700,20);
        lbIDerechos.setHorizontalAlignment(JLabel.CENTER);
        lbIDerechos.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 8));
        lbIDerechos.setForeground(Color.WHITE);
        VInicio.add(lbIDerechos);

    }



   
}