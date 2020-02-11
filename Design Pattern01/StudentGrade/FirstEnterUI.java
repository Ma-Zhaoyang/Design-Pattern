package StudentGrade;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstEnterUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("学生成绩管理系统");
		frame.setLayout(new BorderLayout());

		JPanel jp = new JPanel(); // 创建面板
		JLabel label1 = new JLabel("请选择操作方式："); // 创建标签
		JComboBox cmb = new JComboBox(); // 创建JComboBox
		cmb.addItem("--请选择--"); // 向下拉列表中添加一项
		cmb.addItem("录入学生成绩");
		cmb.addItem("修改学生成绩");
		cmb.addItem("查询学生成绩");
		cmb.addItem("删除学生成绩");
		JButton button = new JButton("确定");
		jp.add(label1);
		jp.add(cmb);
		jp.add(button);
		frame.add(jp, BorderLayout.NORTH);
		
		ChooseListener listener = new ChooseListener(cmb,frame);
		button.addMouseListener(listener);
		
		//GradeIn In = new GradeIn();//成绩录入界面
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
