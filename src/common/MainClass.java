package common;

import java.util.Scanner;

import remote.TestRemote;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TestRemote remote = new TestRemote();
		int choice;
		System.out.println("main project 시작");
		System.out.println("1.에어컨 2.리모컨 3.계산기");
		choice = sc.nextInt();
		switch(choice) {
		case 1 : break;
		case 2 :
			remote.setButton(sc.nextInt());
			remote.channelInput();
			break;
		case 3 : break;
		}
	}

}
