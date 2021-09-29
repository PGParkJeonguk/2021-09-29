package co.park.pj;

import java.util.Arrays;
import java.util.Scanner;

public class LottoArrary {
	int lotto[] = new int[6];
	private static Scanner scn = new Scanner(System.in);

	private void LottoMenu() {
		while (true) {
			mainMenu();
			int key = scn.nextInt();
			scn.nextLine();
			if (key == 1) {
				InSertLotto();
			} else if (key == 2) {
				endMenu();
				break;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}

	}

	private void mainMenu() {
		System.out.println("=====================");
		System.out.println("����� ���θ޴��Դϴ�.");
		System.out.println("1. �󸶸� �����ǰ���?");
		System.out.println("2. �����Դϴ�.");
		System.out.println("=====================");

	}

	private void InSertLotto() {
		System.out.println("�ζǸ� �� �ݾ��� �Է��� �ּ���.");
		int coin = scn.nextInt();
		int change = coin % 1000;
		// 1234�� = 1000 -> 234
		// 1234 % 1000 = ���� 1�� ������ �������� 234
		scn.nextLine();
		for (int i = 0; i < coin / 1000; i++) {
			if(i%5==0) {
				System.out.println("=====================");
			}
			LottoRandomNumber();
		}
		System.out.println("=====================");
		System.out.println("�ܵ��� " + change + "���� ��ȯ�Ǿ����ϴ�.");

	}

	private void LottoRandomNumber() {
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(lotto);
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("");
	}

	private void endMenu() {
		System.out.println("�����ϰڽ��ϴ�.");
	}

	public void run() {
		LottoMenu();
		scn.close();
	}
}
