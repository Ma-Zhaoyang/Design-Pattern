package StudentGrade;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstEnterUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("ѧ���ɼ�����ϵͳ");
		frame.setLayout(new BorderLayout());

		JPanel jp = new JPanel(); // �������
		JLabel label1 = new JLabel("��ѡ�������ʽ��"); // ������ǩ
		JComboBox cmb = new JComboBox(); // ����JComboBox
		cmb.addItem("--��ѡ��--"); // �������б������һ��
		cmb.addItem("¼��ѧ���ɼ�");
		cmb.addItem("�޸�ѧ���ɼ�");
		cmb.addItem("��ѯѧ���ɼ�");
		cmb.addItem("ɾ��ѧ���ɼ�");
		JButton button = new JButton("ȷ��");
		jp.add(label1);
		jp.add(cmb);
		jp.add(button);
		frame.add(jp, BorderLayout.NORTH);
		
		ChooseListener listener = new ChooseListener(cmb,frame);
		button.addMouseListener(listener);
		
		//GradeIn In = new GradeIn();//�ɼ�¼�����
		//GradeCheck check = new GradeCheck();
		//frame.add(check);
		//frame.add(In);
		//GradeChange change = new GradeChange();
		//frame.add(change);
		//GradeDelete delete = new GradeDelete();
		//frame.add(delete);
		
		frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
