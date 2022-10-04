import dao.SubscriberDAO;
import entities.Subscriber;

public class Test {
	
	
	public Test() {
		Subscriber subscriber = new Subscriber("Mary", "password1996");
		
		SubscriberDAO subscriberdao = new SubscriberDAO(); 
		subscriberdao.persistSubscriber(subscriber);
	}
	
	public static void main(String[] args) {
		new Test();
	}
}
