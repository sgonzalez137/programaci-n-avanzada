package Motores.Grafica;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiCGasolinaL extends JFrame implements ActionListener{
    
    private static final long serialVersionUID = 1L;
    private JPanel VInicio;
    
    
    private JButton BComprar;
    private JButton BVolver;
    
    private JLabel TituloIntro;
    private JLabel lbIDerechos;
    
    private int WIDTH=250, HEIGHT=150;

    public GuiCGasolinaL() {
        iniciarComponentes();
        Acciones(); 
        this.setTitle("Crea tu propio carro");
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
        BComprar.setActionCommand("Comprar");
        BComprar.addActionListener(this);

        BVolver.setActionCommand("Volver");
        BVolver.addActionListener(this);
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
        TituloIntro = new JLabel("A seleccionado un carro Gasolina con motor en L");
        TituloIntro.setBounds(10, 10, 700, 50);
        TituloIntro.setHorizontalAlignment(JLabel.CENTER);
        TituloIntro.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 20));
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
        
        BComprar = new JButton();
        BComprar.setBounds(250, 100, WIDTH, HEIGHT);
        BComprar.setText("Comprar");
        VInicio.add(BComprar);

        BVolver = new JButton();
        BVolver.setBounds(250, 300, WIDTH, HEIGHT);
        BVolver.setText("Volver");
        VInicio.add(BVolver);
    }
    

    @Override
    public void actionPerformed(ActionEvent s) {
        if(s.getActionCommand().equals("Comprar")){
            this.dispose();
            GuiCompra eter = new GuiCompra();
            eter.setVisible(true);
            
        }
        else if(s.getActionCommand().equals("Volver")){
            this.dispose();
            GuiIntro eter = new GuiIntro();
            eter.setVisible(true);
        }
    }
}