package frontend;

import static frontend.clockinScreen.*;
import static frontend.clockoutScreen.*;
import static frontend.loginScreen.*;
import static frontend.pulldataScreen.*;
import static frontend.setupScreen.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gatewayScreen{

public static void gateway(){
        JFrame frame = new JFrame("RFMS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 600);

        JButton cinbutton = new JButton("Clock In");
        cinbutton.setBounds(70, 70, 400, 100); // Set the location and size of the button

        JButton coutbutton = new JButton("Clock Out");
        coutbutton.setBounds(70, 190, 400, 100);

        JButton loginbutton = new JButton("Log In");
        loginbutton.setBounds(70, 310, 400, 100);

        JButton setupbutton = new JButton("Setup");
        setupbutton.setBounds(540, 70, 400, 100);

        JButton pulldatabutton = new JButton("Pull Data");
        pulldatabutton.setBounds(540, 190, 400, 220);

        frame.getContentPane().setLayout(null); // Set the layout to null
        frame.getContentPane().add(cinbutton);
        frame.getContentPane().add(coutbutton);
        frame.getContentPane().add(loginbutton);
        frame.getContentPane().add(setupbutton);
        frame.getContentPane().add(pulldatabutton);

        frame.setVisible(true);
        //
        cinbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                clockin();
                System.out.println("You're Clocked In Button");
            }
        });
        coutbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                clockout();
                System.out.println("You're Clocked Out Button");
            }
        });
        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                loginscr();
                System.out.println("You're Login Button");
            }
        });
        pulldatabutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                pulldatascr();
                System.out.println("You're Pull Data Button");
            }
        });
        setupbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                setupscr();
                System.out.println("You're setup Button");
            }
        });
    }
}