package StudentGrade;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import javax.swing.JTextField;

public class InListener implements MouseListener {
	private JTextField field01;
	private JTextField field02;
	private JTextField field03;
	private JTextField field04;
	private String name;
	private String ID;
	private String age;
	private String clas;

	public InListener(JTextField field01, JTextField field02, JTextField field03, JTextField field04) {
		super();
		this.field01 = field01;
		this.field02 = field02;
		this.field03 = field03;
		this.field04 = field04;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		this.name = field01.getText();
		this.ID = field02.getText();
		this.age = field03.getText();
		this.clas = field04.getText();

		Student student = new Student(name, ID, age, clas);

		// System.out.println(name + ID + age + clas);

		try {
			SQLlinkInsert sql = new SQLlinkInsert(student);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
