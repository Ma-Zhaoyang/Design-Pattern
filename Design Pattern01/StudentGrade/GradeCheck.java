package StudentGrade;

import java.awt.Button;

import javax.swing.JPanel;

public class GradeCheck extends JPanel {
	public GradeCheck() {
        setLayout(null);
        
        Button button = new Button("≤È—Ø");
        button.setBounds(150, 300, 70, 40);
        
        CheckListener listener = new CheckListener();
        button.addMouseListener(listener);
        
        add(button);
	}
}
