package StudentGrade;

import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GradeIn extends JPanel {

	public GradeIn() {
		setLayout(null);

		JLabel label01 = new JLabel("����:");//name
		label01.setBounds(100, 100, 90, 45);
		JLabel label02 = new JLabel("ѧ��:");//ID
		label02.setBounds(100, 150, 90, 45);
		JLabel label03 = new JLabel("����:");//age
		label03.setBounds(100, 200, 90, 45);
		JLabel label04 = new JLabel("�༶:");//clas
		label04.setBounds(100, 250, 90, 45);

		JTextField field01 = new JTextField();
		field01.setBounds(150, 110, 150, 30);
		// ��������
		JTextField field02 = new JTextField();
		field02.setBounds(150, 160, 150, 30);
		// ����ѧ��
		JTextField field03 = new JTextField();
		field03.setBounds(150, 210, 150, 30);
		// ��������
		JTextField field04 = new JTextField();
		field04.setBounds(150, 260, 150, 30);
		// ����༶

		Button button = new Button("ȷ��");
		button.setBounds(150, 300, 70, 40);
        
		InListener listener = new InListener(field01,
				field02,field03,field04);
		button.addMouseListener(listener);
		
		add(label01);
		add(field01);
		add(label02);
		add(field02);
		add(label03);
		add(field03);
		add(label04);
		add(field04);
		add(button);
	}
}
