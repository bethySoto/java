import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class escucharScrollbar implements AdjustmentListener{
	public void adjustmentValueChanged(AdjustmentEvent e){
		System.out.println("Barra valor vertical: "+ principal.sb.getValue());
		System.out.println("Barra valor horizontal: "+principal.sb1.getValue());
	}

}
