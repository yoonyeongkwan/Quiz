package Test_Air;

import java.util.Scanner;

class Test_01 {
	private int temperature;
	
	public void setTemperature(int temp) {
		temperature = temp;
	} 
	
	public int getTemperature() {
		return temperature;
	}
}

public class Test_Air{
	
	public static void main(String[] args) {
		Test_01 t = new Test_01();		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("에어컨 버튼 기능");
		System.out.println("1. 온도 올리기");
		System.out.println("2. 온도 내리기");
		int choice = sc.nextInt();
		
		if (choice == 1) {
			// 온도 올리는 기능
			int currentTemp = t.getTemperature();
			t.setTemperature(currentTemp + 1);
			System.out.println("온도가 1도 올라갔습니다. 현재 온도: " + t.getTemperature());
		} else if (choice == 2) {
			// 온도 내리는 기능
			int currentTemp = t.getTemperature();
			t.setTemperature(currentTemp - 1);
			System.out.println("온도가 1도 내려갔습니다. 현재 온도: " + t.getTemperature());
		} else {
			System.out.println("잘못된 선택입니다.");
		}
	}
}
