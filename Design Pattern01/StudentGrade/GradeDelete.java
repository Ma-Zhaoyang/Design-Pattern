package StudentGrade;

import java.awt.Button;

import javax.swing.*;

public class GradeDelete extends JPanel{
   public GradeDelete() {
	   setLayout(null);
       
	   JLabel label = new JLabel("É¾³ý£º");
	   label.setBounds(100, 100, 90, 45);
	   JTextField field = new JTextField();
	   field.setBounds(150, 100, 150, 30);
	   
       Button button = new Button("¶¯ÊÖ");
       button.setBounds(150, 300, 70, 40);
       
       DeleteListener listener = new DeleteListener(field);
       button.addMouseListener(listener);
       
       add(label);
       add(field);
       add(button);
   }
}
