package Conciertopf.Grafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Conciertopf.Fabrica_especial2.Factory;

public class GuiSeleccion extends JFrame implements ActionListener{
    public static Factory b= new Factory();
    private static final long serialVersionUID = 1L;
    private JPanel VInicio;
    
    
    private JButton BEscuchar;
    
    
    private JLabel TituloIntro;
    private JLabel lbIDerechos;
    
    private int WIDTH=250, HEIGHT=150;

    public GuiSeleccion() {
        iniciarComponentes();
        Acciones(); 
        this.setTitle("Seleccion");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void iniciarComponentes(){
        crearPanel();
        colocarLabel();
        colocarBotones();
    }
    public void Acciones(){
        BEscuchar.setActionCommand("Escuchar");
        BEscuchar.addActionListener(this);
        
       
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
        TituloIntro = new JLabel("Presentando");
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


    public void colocarBotones(){
        
        BEscuchar = new JButton();
        BEscuchar.setBounds(250, 100, WIDTH, HEIGHT);
        BEscuchar.setText("Presentar");
        VInicio.add(BEscuchar);
        
    }
    

    @Override
    public void actionPerformed(ActionEvent s) {
        if(s.getActionCommand().equals("Escuchar")){
            this.dispose();
            b.agregarMusico("Sebastian");
            b.agregarMusico("Fernando");
            b.agregarMusico("Miguel");
            b.presentarBanda();
            
        }
    }
}
