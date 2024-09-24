package frontend;

import static frontend.gatewayScreen.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pulldataScreen {

    public static void pulldatascr(){
        JFrame frame = new JFrame("RFMS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 600);
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);
        //
        JButton backbutton = new JButton("PullData Back");
        backbutton.setBounds(70, 70, 400, 100);

        frame.getContentPane().add(backbutton);
        //
        backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                gateway();
                System.out.println("You went back!");
            }
        });

    }


}
