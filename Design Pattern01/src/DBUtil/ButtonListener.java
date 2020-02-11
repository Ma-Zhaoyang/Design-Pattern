package DBUtil;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import javax.swing.JTextField;

import UserDAO.SQLLinkCompare;

public class ButtonListener implements MouseListener{
    private JTextField usernamefield;
    private JTextField codefield;
    private String nameString;
    private String codeString;
    
    public ButtonListener(JTextField field01, JTextField field02) {
    	super();
    	usernamefield = field01;
    	codefield = field02;
    	//nameString = field01.getText();
    	//codeString = field02.getText();
		// TODO Auto-generated constructor stub
	}
    
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		nameString = usernamefield.getText();
		codeString = codefield.getText();
		
		try {
			SQLLinkCompare sqlLinkCompare = new SQLLinkCompare(nameString, codeString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
