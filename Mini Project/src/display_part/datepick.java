package display_part;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class datepick extends JFrame {
	public datepick() {
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		
		add(datePicker);
		setBounds(200, 200, 300, 300);
		setVisible(true);
		

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// LookAndFeel Windows 스타일 적용
			SwingUtilities.updateComponentTreeUI(datePanel);
		} catch (Exception e) {

		}
		System.out.println(model.getYear()+"/"+(model.getMonth()+1)+"/"+model.getDay());
	}

	public static void main(String[] args) {

		new datepick();
		
		
		
	}
}
