package main;

import dao.SubscriberDAO;
import entities.Subscriber;
import java.sql.SQLException;

public class Test {
	
	
	public Test() {
		Subscriber subscriber = new Subscriber("Ken", "password2022");
		SubscriberDAO subscriberdao = new SubscriberDAO(); 
		subscriberdao.persistSubscriber(subscriber);
	}
	
	public static void main(String[] args) {
		new Test();
	}
}
