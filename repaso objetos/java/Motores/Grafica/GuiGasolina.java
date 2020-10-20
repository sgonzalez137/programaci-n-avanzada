package Motores.Grafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiGasolina extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;

    private JPanel VDiesel;

    private JButton MotorV;
    private JButton MotorL;
    private JButton MotorW;
    
    private JLabel TituloIntro;
    private JLabel lbIDerechos;
    
    private int WIDTH=250, HEIGHT=150;

    public GuiGasolina() {
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
        MotorL.setActionCommand("MotorL");
        MotorL.addActionListener(this);
        
        MotorV.setActionCommand("MotorV");
        MotorV.addActionListener(this);

        MotorW.setActionCommand("MotorW");
        MotorW.addActionListener(this);
        
    }
    
    public void crearPanel(){
        VDiesel= new JPanel();
        this.getContentPane().setLayout(null);
        this.setBounds(500, 50, 790, 530);
        this.getContentPane().add(VDiesel);
        VDiesel.setBounds(0, 0, 790, 530);
        VDiesel.setBackground(Color.BLACK);
        VDiesel.setLayout(null);
    }
    public void colocarLabel(){
        TituloIntro = new JLabel("Seleccione Motor");
        TituloIntro.setBounds(10, 10, 700, 50);
        TituloIntro.setHorizontalAlignment(JLabel.CENTER);
        TituloIntro.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 50));
        TituloIntro.setForeground(Color.WHITE);
        VDiesel.add(TituloIntro);
        
        lbIDerechos = new JLabel ("sdgonzalezg@correo.udistrial.edu.co");
        lbIDerechos.setBounds(50,450,700,20);
        lbIDerechos.setHorizontalAlignment(JLabel.CENTER);
        lbIDerechos.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 8));
        lbIDerechos.setForeground(Color.WHITE);
        VDiesel.add(lbIDerechos);

        lbIDerechos.setFont(new Font ("Arial", Font.BOLD + Font.ITALIC, 10));
        lbIDerechos.setForeground(Color.WHITE);
    }


    public void colocarBotones(){
        
        MotorL = new JButton();
        MotorL.setBounds(100, 100, WIDTH, HEIGHT);
        MotorL.setText("Motor en linea");
        VDiesel.add(MotorL);
        
        MotorV = new JButton();
        MotorV.setBounds(400, 290, WIDTH, HEIGHT);
        MotorV.setText("Motor en V");
        VDiesel.add(MotorV);

        MotorW = new JButton();
        MotorW.setBounds(100, 290, WIDTH, HEIGHT);
        MotorW.setText("Motor en V");
        VDiesel.add(MotorW);
        
    }
    @Override
    public void actionPerformed(ActionEvent s) {
        if(s.getActionCommand().equals("MotorL")){
            this.dispose();
            GuiCGasolinaL eter = new GuiCGasolinaL();
            eter.setVisible(true);
        }
        else if(s.getActionCommand().equals("MotorV")){
            this.dispose();
            GuiCGasolinaV eter = new GuiCGasolinaV();
            eter.setVisible(true);
        }
        else if(s.getActionCommand().equals("MotorW")){
            this.dispose();
            GuiCGasolinaW eter = new GuiCGasolinaW();
            eter.setVisible(true);
            
        }
        
        
    }
}