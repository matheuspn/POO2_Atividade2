/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

/**
 * Classe onde a tela, seus elementos e interações são criados.
 * 
 * @author matpr
 * @version 2021
 * 
 *
 */
public class Tela extends JFrame implements ActionListener{
	
	private JTextField txtPlacaMae;
	private JLabel lblProcessador;
	private JLabel lblPlacaMae;
	private JLabel lblHD;
	private JLabel lblSSD;
	private JLabel lblRAM;
	private JLabel lblPlacaVideo;
	private JComboBox cmbProcessador;
	private JComboBox cmbPlacaVideo;
	private JRadioButton rbtnRAM1;
	private JRadioButton rbtnRAM2;
	private JRadioButton rbtnRAM3;
	private JRadioButton rbtnRAM4;
	private JRadioButton rbtnHD500;
	private JRadioButton rbtnHD1;
	private JRadioButton rbtnHD2;
	private JRadioButton rbtnSSD240;
	private JRadioButton rbtnSSD480;
	private JRadioButton rbtnSSD1;
        private JRadioButton rbtnMongo;
        private JRadioButton rbtnDB;
	private ButtonGroup btgRAM;
	private ButtonGroup btgHD;
	private ButtonGroup btgSSD;
	private JButton btnEnter;
	
	private String tipoProcessador[] = {"I9 9900k", "I9 10900", "Ryzen9 3900x", "Ryzen7 5600x"};
	private String tipoPlacaVideo[] = {"RTX 3090", "RTX 3080", "RX 580", "RX 6700 XT"};

	/**
         *  Construtor onde a tela é criada, juntamente com seus elementos e suas interações. 
         * @throws java.text.ParseException
        */
        
        public Tela() throws ParseException{
		
		// configs de janel
		setSize(600, 500);
		setName("Montando Computador");
		setLayout(null);
		
		// label placa mae
		lblPlacaMae = new JLabel("Placa m�e");
		lblPlacaMae.setBounds(10, 10, 100, 25);
		getContentPane().add(lblPlacaMae);
		
		// texto placa mae
		txtPlacaMae = new JTextField();
		txtPlacaMae.setBounds(100, 10, 150, 25);
		getContentPane().add(txtPlacaMae);
		
		// label processador
		lblProcessador = new JLabel("Processador");
		lblProcessador.setBounds(300, 10, 100, 25);
		getContentPane().add(lblProcessador);
		
		// combobox processador
		cmbProcessador = new JComboBox(tipoProcessador);
		cmbProcessador.setBounds(400, 10, 150, 25);
		getContentPane().add(cmbProcessador);
		
		// label ram
		lblRAM = new JLabel("Mem�ria RAM(pentes)");
		lblRAM.setBounds(10, 60, 150, 25);
		getContentPane().add(lblRAM);
		
		// radiobuttons ram
		rbtnRAM1 = new JRadioButton("1");
		rbtnRAM1.setBounds(10, 80, 50, 25);
		rbtnRAM1.setSelected(true);
		getContentPane().add(rbtnRAM1);
		
		rbtnRAM2 = new JRadioButton("2");
		rbtnRAM2.setBounds(60, 80, 50, 25);
		getContentPane().add(rbtnRAM2);
		
		rbtnRAM3 = new JRadioButton("3");
		rbtnRAM3.setBounds(110, 80, 50, 25);
		getContentPane().add(rbtnRAM3);
		
		rbtnRAM4 = new JRadioButton("4");
		rbtnRAM4.setBounds(160, 80, 50, 25);
		getContentPane().add(rbtnRAM4);
		
		// label HD
		lblHD = new JLabel("HD");
		lblHD.setBounds(300, 60, 100, 25);
		getContentPane().add(lblHD);
		
		// radiobuttons hd
		rbtnHD500 = new JRadioButton("500GB");
		rbtnHD500.setBounds(300, 80, 75, 25);
		rbtnHD500.setSelected(true);
		getContentPane().add(rbtnHD500);
		
		rbtnHD1 = new JRadioButton("1TB");
		rbtnHD1.setBounds(375, 80, 50, 25);
		getContentPane().add(rbtnHD1);
		
		rbtnHD2 = new JRadioButton("2TB");
		rbtnHD2.setBounds(450, 80, 50, 25);
		getContentPane().add(rbtnHD2);
		
		// label placa de v�deo
		lblPlacaVideo = new JLabel("Placa de v�deo");
		lblPlacaVideo.setBounds(10, 130, 100, 25);
		getContentPane().add(lblPlacaVideo);
		
		// combobox placa de video
		cmbPlacaVideo = new JComboBox(tipoPlacaVideo);
		cmbPlacaVideo.setBounds(100, 130, 150, 25);
		getContentPane().add(cmbPlacaVideo);
		
		// label SSD
		lblSSD = new JLabel("SSD");
		lblSSD.setBounds(300, 130, 75, 25);
		getContentPane().add(lblSSD);
		
		// radioButtons SSD
		rbtnSSD240 = new JRadioButton("500GB");
		rbtnSSD240.setBounds(300, 150, 75, 25);
		rbtnSSD240.setSelected(true);
		getContentPane().add(rbtnSSD240);
		
		rbtnSSD480 = new JRadioButton("480GB");
		rbtnSSD480.setBounds(375, 150, 75, 25);
		getContentPane().add(rbtnSSD480);
		
		rbtnSSD1 = new JRadioButton("1TB");
		rbtnSSD1.setBounds(450, 150, 75, 25);
		getContentPane().add(rbtnSSD1);
                
                // radioButtons bases
                rbtnDB = new JRadioButton("MySQL");
                rbtnDB.setBounds(200, 250, 100, 50);
                getContentPane().add(rbtnDB);
                
                rbtnMongo = new JRadioButton("MongoDB");
                rbtnMongo.setBounds(300, 250, 100, 50);
                getContentPane().add(rbtnMongo);
		
		btnEnter = new JButton("Enviar");
                btnEnter.setBounds(225, 200, 100, 25);
                btnEnter.addActionListener(this);
                getContentPane().add(btnEnter);
		
		// grupos de bot�es
		btgHD = new ButtonGroup();
		btgRAM = new ButtonGroup();
		btgSSD = new ButtonGroup();
		
		// adicionando bot�es ao grupos
		btgRAM.add(rbtnRAM1);
		btgRAM.add(rbtnRAM2);
		btgRAM.add(rbtnRAM3);
		btgRAM.add(rbtnRAM4);
		
		btgHD.add(rbtnHD500);
		btgHD.add(rbtnHD1);
		btgHD.add(rbtnHD2);
		
		btgSSD.add(rbtnSSD240);
		btgSSD.add(rbtnSSD480);
		btgSSD.add(rbtnSSD1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
		
	}
	
	/**
         * Inicializa a classe Tela, onde a tela e seus elementos são criados.
         * @param args
         * @throws ParseException 
         */
        public static void main(String[] args) throws ParseException {
		
		Tela tela = new Tela();

	}
	/**
         * Método onde as interações do usuário são tratadas.
         * 
         * @param e Ação a ser realizada 
         */
	 @Override
	public void actionPerformed(ActionEvent e) {
		 
		 String placa_mae = txtPlacaMae.getText();
		 String processador = (String) cmbProcessador.getSelectedItem();
		 String placa_video = (String) cmbPlacaVideo.getSelectedItem();
		 int ram = 0;
		 String hd = "";
		 String ssd = "";
		 
		 if (rbtnRAM1.isSelected()) {
			ram = 1;
		 } else if (rbtnRAM2.isSelected()) {
			ram = 2;
		 } else if (rbtnRAM3.isSelected()) {
			ram = 3;
		 } else {
			ram = 4;
		 }
		 
		 if (rbtnHD500.isSelected()) {
			 hd = "500GB";
		 } else if (rbtnHD1.isSelected()) {
			 hd = "1TB";
		 } else {
			 hd = "2TB";
		 }
		 
		 if (rbtnSSD240.isSelected()) {
			 ssd = "240GB";
		 } else if (rbtnSSD480.isSelected()) {
			 ssd = "480GB";
		 } else {
			 ssd = "1TB";
		 }
		 
                if (rbtnDB.isSelected()){
                    ConectaBD conecta = ConectaBD.getConectaBD();
                    conecta.setParams(placa_mae, processador, ram, hd, ssd, placa_video);
                    conecta.insere();
                } 
                if (rbtnMongo.isSelected()){
                    ConectaMongodb conectaMongo = ConectaMongodb.getConectaMongoBD();
                    conectaMongo.setParams(placa_mae, processador, ram, hd, ssd, placa_video);
                    conectaMongo.insere();
                }
                
	}
	 
}

