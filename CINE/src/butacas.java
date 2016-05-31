import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class butacas {
	escucharScrollbar next=new escucharScrollbar();
	JPanel asientos[][]=new JPanel[8][7];
	public static JScrollBar sb=new JScrollBar();
	public static JScrollBar sb1=new JScrollBar();
	public void asientos(){
		sb1.setBounds(20, 310, 29, 295);
		sb1.setValues(7, 0, 1, 0);
		principal.sala1.add(sb1);
		sb.setBounds(50, 580, 310, 29);
		sb.setOrientation(0);
		sb.setValues(7, 0, 1, 0);
		principal.sala1.add(sb);
		
		for(int f=0;f<8;f++){
			for(int c=0;c<7;c++){
				asientos[f][c]=new JPanel();
				asientos[f][c].setBounds(60+(43*c),310+(f*33),40,30);
				asientos[f][c].setBackground(Color.red);
				
				principal.sala1.add(asientos[f][c]);
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
}
