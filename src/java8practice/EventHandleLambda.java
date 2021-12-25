package java8practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EventHandleLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Event Handling using Java 8 Lambda expressions
		// Without Lambda Expression
		JButton show =  new JButton("Show");
		show.addActionListener(new ActionListener() {
		     @Override
		     public void actionPerformed(ActionEvent e) {
		           System.out.println("Event handling without lambda expressions");
		        }
		     });
		// With Lambda Expression
		/*
		 * show.addActionListener((e) -> {
		 * System.out.println("Event Handling using Lambda expressions"); });
		 */

	}

}
