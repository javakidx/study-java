package idv.jk.refactoring.organizing.data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by bioyang on 2016/4/6.
 */
public class IntervalWindow extends JFrame {

    private JTextField start;
    private JTextField end;
    private JTextField length;

    public void initialize() {
        FocusListener listener = new IntervalWindow.SymFocus();
        start = new JTextField("0");
        start.addFocusListener(listener);

        end = new JTextField("0");
        length = new JTextField("0");

        IntervalWindow window = new IntervalWindow();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(start, BorderLayout.BEFORE_LINE_BEGINS);
        window.pack();
        window.setVisible(true);
    }

    class SymFocus implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {
            Object object = e.getSource();

            System.out.println(object);
        }
    }

}
