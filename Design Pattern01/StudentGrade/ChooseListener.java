package StudentGrade;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ChooseListener implements MouseListener {
	private String choose;
	private JComboBox cmb;
	public JFrame frame;

	public ChooseListener(JComboBox cmb, JFrame frame) {
		this.cmb = cmb;
		this.frame = frame;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		choose = (String)cmb.getSelectedItem();
		if(choose == "¼��ѧ���ɼ�") {
		//System.out.println(choose);
		GradeIn In = new GradeIn();
		frame.add(In);
	   }else if(choose == "�޸�ѧ���ɼ�") {
		 GradeChange change = new GradeChange();
		 frame.add(change);
	   }else if(choose == "��ѯѧ���ɼ�") {
		  GradeCheck check = new GradeCheck();
		  frame.add(check);
	   }else {
		   GradeDelete delete = new GradeDelete();
		   frame.add(delete);
	   }
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
