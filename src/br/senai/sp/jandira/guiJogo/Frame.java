package br.senai.sp.jandira.guiJogo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldObs;
	private JTextField textFieldValor;
	private JTextField txtFieldZerado;
	private JTextField txtFieldNome;


	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGestorJogos = new JLabel(" Gestor de Jogos");
		lblGestorJogos.setFont(new Font("Dialog", Font.BOLD, 30));
		lblGestorJogos.setBounds(145, 30, 255, 45);
		contentPane.add(lblGestorJogos);
		
		JLabel lblZerado = new JLabel(" Zerado");
		lblZerado.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblZerado.setBounds(48, 216, 73, 20);
		contentPane.add(lblZerado);
		
		JLabel lblconsole = new JLabel(" Console");
		lblconsole.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblconsole.setBounds(48, 252, 73, 20);
		contentPane.add(lblconsole);
		
		JLabel lblValor = new JLabel(" Valor Estimado");
		lblValor.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblValor.setBounds(48, 283, 97, 20);
		contentPane.add(lblValor);
		
		JLabel lblObs = new JLabel(" Observa\u00E7\u00F5es");
		lblObs.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblObs.setBounds(48, 314, 89, 20);
		contentPane.add(lblObs);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(349, 138, 194, 247);
		contentPane.add(scrollPane);
		
		JList listJogos = new JList();
		scrollPane.setViewportView(listJogos);
		
		JLabel lblMeusJogos = new JLabel(" Meus Jogos");
		lblMeusJogos.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblMeusJogos.setBounds(349, 115, 97, 20);
		contentPane.add(lblMeusJogos);
		
		JLabel lblFabricante = new JLabel(" Fabricante");
		lblFabricante.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblFabricante.setBounds(44, 171, 69, 20);
		contentPane.add(lblFabricante);
		
		JLabel lblNome = new JLabel(" Nome");
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNome.setBounds(44, 140, 77, 20);
		contentPane.add(lblNome);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(0, 204, 0));
		btnSalvar.setFont(new Font("Dialog", Font.BOLD, 13));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setBounds(48, 426, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.setFont(new Font("Dialog", Font.BOLD, 13));
		btnVoltar.setBounds(349, 396, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnProsseguir = new JButton(">");
		btnProsseguir.setFont(new Font("Dialog", Font.BOLD, 13));
		btnProsseguir.setBounds(454, 396, 89, 23);
		contentPane.add(btnProsseguir);
		
		txtFieldObs = new JTextField();
		txtFieldObs.setBounds(48, 333, 236, 82);
		contentPane.add(txtFieldObs);
		txtFieldObs.setColumns(10);
		
		textFieldValor = new JTextField();
		textFieldValor.setBounds(153, 284, 86, 20);
		contentPane.add(textFieldValor);
		textFieldValor.setColumns(10);
		
		txtFieldZerado = new JTextField();
		txtFieldZerado.setBounds(153, 217, 86, 20);
		contentPane.add(txtFieldZerado);
		txtFieldZerado.setColumns(10);
		
		txtFieldNome = new JTextField();
		txtFieldNome.setBounds(153, 137, 131, 20);
		contentPane.add(txtFieldNome);
		txtFieldNome.setColumns(10);
		
		JComboBox comboConsole = new JComboBox();
		comboConsole.setBounds(153, 252, 131, 22);
		contentPane.add(comboConsole);
		
		JComboBox comboFabricante = new JComboBox();
		comboFabricante.setBounds(153, 171, 131, 22);
		contentPane.add(comboFabricante);
	}

}
