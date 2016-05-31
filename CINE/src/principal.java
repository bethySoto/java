import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class principal {
	public static JScrollBar sb=new JScrollBar();
	public static JScrollBar sb1=new JScrollBar();
	public static JFrame sala1=new JFrame("Sala1");
	public JFrame sala2=new JFrame("Sala2");
	
	public String nombrePeliculas[]={"Capitán América: Civil War","El libro de la selva"};
	
	public JLabel JL9=new JLabel();
	
	public principal(){
		sala1.setBounds(0, 0, 683, 768);
		sala2.setBounds(683, 0, 683, 768);
		
		sala1.setVisible(true);
		sala2.setVisible(true);
		
		
		pelicula();
		colores();
		asientos();
		
		botones();
		personas();
		
		sala1.add(JL9);
	}
	
	public void pelicula(){
		JLabel JLTitulo=new JLabel("g");
		JPanel JPTitulo=new JPanel();
		JPTitulo.setBounds(20,20, 640, 20);
		JPTitulo.setBackground(Color.red);
		sala1.add(JPTitulo);
		JPTitulo.add(JLTitulo);
		
		//ImageIcon imagen=new ImageIcon("capitanAmerica.jpg");
		//JLabel JLImagen=new JLabel(imagen);
		JPanel fotoPelicula= new JPanel();
		fotoPelicula.setBounds(40, 50, 200, 200);
		fotoPelicula.setBackground(Color.red);
		//fotoPelicula.add(JLImagen);
		sala1.add(fotoPelicula);
		
		JPanel datosPelicula[]=new JPanel[3];
		for(int f=0;f<3;f++){
			datosPelicula[f]=new JPanel();
			datosPelicula[f].setBounds(250,50,400,200);
			datosPelicula[f].setBackground(Color.red);
			
			sala1.add(datosPelicula[f]);
		}
	}
	public void colores(){
		JPanel colores[][]=new JPanel[1][6];
		for(int f=0;f<1;f++){
			for(int c=0;c<6;c++){
				colores[f][c]=new JPanel();
				colores[f][c].setBounds(80+(83*c),270,80,30);
				colores[f][c].setBackground(Color.red);
				
				sala1.add(colores[f][c]);
			}
		}
		
	}
	public void asientos(){
		escucharScrollbar next=new escucharScrollbar();
		JPanel asientos[][]=new JPanel[8][7];
		
		
		sb1.setBounds(20, 310, 29, 295);
		sb1.setValues(7, 0, 1, 0);
		sala1.add(sb1);
		sb.setBounds(50, 580, 310, 29);
		sb.setOrientation(0);
		sb.setValues(7, 0, 1, 0);
		sala1.add(sb);
		
		for(int f=0;f<8;f++){
			for(int c=0;c<7;c++){
				asientos[f][c]=new JPanel();
				asientos[f][c].setBounds(60+(43*c),310+(f*33),40,30);
				asientos[f][c].setBackground(Color.red);
				
				sala1.add(asientos[f][c]);
			}
		}
		asientos[0][0].setBackground(Color.white);
		asientos[6][5].setBackground(Color.white);
		asientos[7][5].setBackground(Color.white);
			for(int c=3;c<8;c++){
				asientos[c][6].setBackground(Color.white);
			}
			
		
		int x=sb.getValue();
		sb.addAdjustmentListener(next);
		int x1=sb1.getValue();
		sb.addAdjustmentListener(next);
	}
	
	public void botones(){
		String nombreBotones[]={"reservar","aceptar", "denegar",
				"en Curso","siguiente","guardar", "cargar", "salir"};
			JButton boton[]=new JButton[8];
		for(int c=0;c<8;c++){
			boton[c]=new JButton("b");
		}
			
		JPanel botones[][]=new JPanel[4][2];
		for(int f=0;f<4;f++){
			for(int c=0;c<2;c++){
				botones[f][c]=new JPanel();
				botones[f][c].setBounds(400+(c*83), 400+(f*43), 80, 40);
				botones[f][c].setBackground(Color.red);
				sala1.add(botones[f][c]);
			}
			botones[f][1].add(boton[f]);
			botones[f][0].add(boton[f+4]);
		}
	}
	public void personas(){
		JPanel personas[]=new JPanel[6];
		JPanel JP=new JPanel();
		JLabel JL=new JLabel("Numero de personas:");
		JP.setBounds(400, 310, 130, 30);
		JP.setBackground(Color.red);
		sala1.add(JP);
		JP.add(JL);
		JButton numero[]=new JButton[6];
		for(int f=1;f<6;f++){
			numero[f]=new JButton(""+f);
		}
		
		for(int f=1;f<6;f++){
			personas[f]=new JPanel();
			personas[f].setBounds(350+(f*43), 350, 41, 40);
			personas[f].setBackground(Color.red);
			numero[f].setBounds(0, 0, 41, 30);
			personas[f].setLayout(null);
			sala1.add(personas[f]);
			personas[f].add(numero[f]);
		}
	}
	public void jornada(){
		String alias[]={"Mañana","Tarde"};
		JPanel turno=new JPanel();
		turno.setBounds(20, 630, 100, 30);
		
		
		JComboBox JCB=new JComboBox(alias); 
		JCB.setSelectedIndex(1);
		JCB.setBounds(0, 0, 90,30);
		turno.add(JCB);
		sala1.add(turno);
		
		
	}
	public static void main(String[] args){
		new principal();
	}
}
