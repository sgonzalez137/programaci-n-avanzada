package Motores.Grafica;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiIntro extends JFrame implements ActionListener{
    
    private static final long serialVersionUID = 1L;
    private JPanel VInicio;
    
    
    private JButton BDiesel;
    private JButton BGasolina;
    
    private JLabel TituloIntro;
    private JLabel lbIDerechos;
    
    private int WIDTH=250, HEIGHT=150;

    public GuiIntro() {
        iniciarComponentes();
        Acciones(); 
        this.setTitle("Crea tu Auto");
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
        BDiesel.setActionCommand("MotorDiesel");
        BDiesel.addActionListener(this);
        
        BGasolina.setActionCommand("MotorGasolina");
        BGasolina.addActionListener(this);
        
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
        TituloIntro = new JLabel("Crea tu propio carro");
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
        
        BDiesel = new JButton();
        BDiesel.setBounds(250, 100, WIDTH, HEIGHT);
        BDiesel.setText("Diesel");
        VInicio.add(BDiesel);
        
        BGasolina = new JButton();
        BGasolina.setBounds(250, 290, WIDTH, HEIGHT);
        BGasolina.setText("Gasolina");
        VInicio.add(BGasolina);
        
    }
    

    @Override
    public void actionPerformed(ActionEvent s) {
        if(s.getActionCommand().equals("MotorDiesel")){
            this.dispose();
            GuiDiesel eter = new GuiDiesel();
            eter.setVisible(true);
            
        }
        else if(s.getActionCommand().equals("MotorGasolina")){
            this.dispose();
            GuiGasolina eter = new GuiGasolina();
            eter.setVisible(true);
            
        }
        
        
    }
}
