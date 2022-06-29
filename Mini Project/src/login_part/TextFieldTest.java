package login_part;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest implements ActionListener {
	 private Button bLogin;
	   private TextField tfMsg;
	   private TextField id, pwd, deptcode ;
	   private final String correct_id = "A12345"; //사번
	   private final String correct_pwd = "gr12345";
	   private final String correct_deptcode = "M3LO";

	
	public TextFieldTest() {
	      Frame f = new Frame("Login");
	      f.setSize(400, 200);
	      f.setLayout(new FlowLayout());

	      Label lid = new Label("ID : ", Label.RIGHT);
	      Label lpwd = new Label("Password : ", Label.RIGHT);
	      Label ldeptcode = new Label("DeptCode : ", Label.RIGHT);

	      id = new TextField(10);
	      pwd = new TextField(10);
	      deptcode = new TextField(10);
	      pwd.setEchoChar('*');
	     

	      bLogin = new Button("Login");
	      bLogin.addActionListener(this);
	      tfMsg = new TextField(40);
	      tfMsg.setEditable(false);
	      tfMsg.setFocusable(false);

	      
	      f.add(lid);
	      f.add(id);
	      f.add(lpwd);
	      f.add(pwd);
	      f.add(ldeptcode);
	      f.add(deptcode);
	      f.add(bLogin);
	      f.add(tfMsg);
	      f.setVisible(true);
	   }
	   
	   public static void main(String[] args) {
	       new TextFieldTest();
	   }

	   @Override
	   public void actionPerformed(ActionEvent e) {
	      if(id.getText().equals("")) {
	         tfMsg.setText("ID를 입력하세요.");
	      }else if(pwd.getText().equals("")) {
	         tfMsg.setText("Password를 입력하세요.");
	      }else if(deptcode.getText().equals("")) {
		         tfMsg.setText("DeptCode를 입력하세요.");
	      }else if(id.getText().equals(correct_id) && pwd.getText().equals(correct_pwd) 
	    		  && deptcode.getText().equals(correct_deptcode)) {
	         tfMsg.setText("로그인 되었습니다.");
	      }else {
	         tfMsg.setText("로그인 정보를 확인하세요!");
	      }
	   }
	}