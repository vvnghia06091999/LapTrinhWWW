package vn.edu.iuh.aop;

public class HelloAOP {
	public void method1() {
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("method 1");
	}
	public void method2() {
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("method 2");
	}
	public void method3() throws IllegalAccessException {
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("method 3");
		throw new IllegalAccessException();
	}
}
