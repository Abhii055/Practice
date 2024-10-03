package featuresTestNG;

//import java.time.Duration;

import org.testng.annotations.Test;



public class featuresofTestNG {
	

	
	@Test
	public void login() {
		System.out.println("Login done");
//		int i = 9/0;
	}
	@Test
	public void HomePage() {
		System.out.println("Home Page loaded");
	}
	@Test
	public void chatPage() {
		System.out.println("Chat page is working fine");
//		int j =8/0;
	}
	@Test
	public void messagePage() {
		System.out.println("Message sent to the respective users");
	}
	@Test(priority =1)
	public void close() {
		System.out.println("working finished");
	}
	@Test
	public void messageppage() {
		System.out.println("Message sent to the respective users");
	}
}
