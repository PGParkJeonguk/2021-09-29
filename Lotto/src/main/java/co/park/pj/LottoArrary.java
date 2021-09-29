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
				System.out.println("잘못입력하셨습니다.");
			}
		}

	}

	private void mainMenu() {
		System.out.println("=====================");
		System.out.println("여기는 메인메뉴입니다.");
		System.out.println("1. 얼마를 지를건가요?");
		System.out.println("2. 종료입니다.");
		System.out.println("=====================");

	}

	private void InSertLotto() {
		System.out.println("로또를 살 금액을 입력해 주세요.");
		int coin = scn.nextInt();
		int change = coin % 1000;
		// 1234원 = 1000 -> 234
		// 1234 % 1000 = 몫이 1이 나오고 나머지가 234
		scn.nextLine();
		for (int i = 0; i < coin / 1000; i++) {
			if(i%5==0) {
				System.out.println("=====================");
			}
			LottoRandomNumber();
		}
		System.out.println("=====================");
		System.out.println("잔돈은 " + change + "원이 반환되었습니다.");

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
		System.out.println("종료하겠습니다.");
	}

	public void run() {
		LottoMenu();
		scn.close();
	}
}
