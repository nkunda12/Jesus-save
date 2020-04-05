package myConstructor;

public class NoMain {
	static int a;
	
	public NoMain(int x){
		a =x;
	}
	public NoMain(String a) {
		System.out.println("a");
	}
	public NoMain() {
		System.out.println("Baby");
	}
	public NoMain(String x, int v) {
		this (02,"Hello");
		System.out.println("x + v");
	}
	public NoMain(int p, String k) {
		System.out.println("p + k");
	}
	public NoMain(String H, String y) {
		System.out.println("H + y");
	}
	
	public void abc(String input){
		System.out.println("input");
	}
}
