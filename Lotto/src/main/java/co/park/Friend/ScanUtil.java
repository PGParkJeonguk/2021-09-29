package co.park.Friend;

import java.util.Scanner;

public class ScanUtil {
	static Scanner scn = new Scanner(System.in);

	public static int readInt(String msg) {
		System.out.println(msg);
		int num = scn.nextInt();
		scn.nextLine();
		return num;

	}

	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

}