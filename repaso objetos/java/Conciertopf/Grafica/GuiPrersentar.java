package Conciertopf.Grafica;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiPrersentar extends JFrame{
    
    private static final long serialVersionUID = 1L;
    private JPanel VInicio;
    
    
    
    
    private JLabel TituloIntro;

    private JLabel TituloIntr;
    private JLabel TituloInt;
    private JLabel lbIDerechos;
    

    public GuiPrersentar(String m,String c1,String c2) {
        String n=m;
        String c3=c1;
        String c4=c2;
        iniciarComponentes(n,c3,c4);
        
        this.setTitle("Presentando");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void iniciarComponentes(String n,String c3,String c4){
        String m=n;
        String c1=c3;
        String c2=c4;
        crearPanel();
        colocarLabel(m,c1,c2);
        
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
    public void colocarLabel(String m,String c1,String c2){
        String n=m;
        String c3=c1;
        String c4=c2;
        
        TituloIntro = new JLabel("Mi nombre es"+ n);
        TituloIntro.setBounds(10, 10, 700, 50);
        TituloIntro.setHorizontalAlignment(JLabel.CENTER);
        TituloIntro.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 50));
        TituloIntro.setForeground(Color.WHITE);
        VInicio.add(TituloIntro);
        TituloIntr = new JLabel(c3);
        TituloIntr.setBounds(10, 50, 700, 50);
        TituloIntr.setHorizontalAlignment(JLabel.CENTER);
        TituloIntr.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 50));
        TituloIntr.setForeground(Color.WHITE);
        VInicio.add(TituloIntr);
        TituloIntro = new JLabel(c4);
        TituloIntro.setBounds(10, 150, 700, 50);
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