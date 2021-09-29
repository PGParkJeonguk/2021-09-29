package co.park.Friend;

import java.util.Scanner;

public class FriendMain {
	private Scanner sc = new Scanner(System.in);

	public int readInt(String msg) {
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;

	}

	public String readStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	public Friend[] friends;
	public OrignalFriend[] orignalfriends = new OrignalFriend[100];
	public SchoolFriend[] schoolFriend = new SchoolFriend[100];
	public CompanyFriend[] companyFriend = new CompanyFriend[100];

	private void mainMenu() {
		System.out.println("=================");
		System.out.println("=== 1. 입력하기===");
		System.out.println("=== 2. 수정하기===");
		System.out.println("=== 3. 조회하기===");
		System.out.println("=== 4. 종료하기===");
		System.out.println("=================");
		System.out.println("원하는 작업번호를 입력하세요.");
	}

	private void addFriendMenu() {
		System.out.println("친구등록메뉴입니다.");
		System.out.println("어떤친구를 입력하시겠습니까?");
		System.out.println("1.그냥 친구 2. 학교친구 3. 직장동료");
		int choice = readInt("번호를 선택해주세요");

		String name = readStr("친구이름을 입력하세요.");
		String phone = readStr("친구전화번호를 입력하세요.");
		String address = readStr("친구주소를 입력하세요.");

		if (choice == 1) {
			for (int i = 0; i < orignalfriends.length; i++) {
				if (orignalfriends == null) {
					orignalfriends[i] = new OrignalFriend(name, phone, address);
				}
			}

		} else if (choice == 2) {
			for (int i = 0; i < schoolFriend.length; i++) {
				if (schoolFriend[i] == null) {
					String schoolName = readStr("학교이름을 입력하세요");
					schoolFriend[i] = new SchoolFriend(name, phone, address, schoolName);

				}
			}
		} else if (choice == 3) {
			for (int i = 0; i < companyFriend.length; i++) {
				if (companyFriend[i] == null) {
					String companyName = readStr("회사이름을 입력하세요");
					companyFriend[i] = new CompanyFriend(name, phone, address, companyName);
				}
			}
		}
	}

	private void conFriendMenu() {
		System.out.println("어떤친구를 수정하시겠습니까?");
		System.out.println("1. 일반친구 2.학교친구 3. 직장친구 ");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("일반친구수정을 선택하였습니다.");
			for (int i = 0; i < orignalfriends.length; i++) {
				if (orignalfriends[i] != null)
					System.out.println("[" + i + "]" + orignalfriends[i].toString());
			}
			int num = readInt("수정할 친구번호를 선택하세요.");
			orignalfriends[num].modify();
			break;
		case 2:
			System.out.println("학교친구수정을 선택하였습니다.");
			for (int i = 0; i < schoolFriend.length; i++) {
				if (schoolFriend[i] != null)
					System.out.println("[" + i + "]" + schoolFriend[i].toString());
			}
			int num1 = readInt("수정할 친구번호를 선택하세요.");
			schoolFriend[num1].modify();
			break;
		case 3:
			System.out.println("직장친구수정을 선택하였습니다.");
			for (int i = 0; i < companyFriend.length; i++) {
				if (companyFriend[i] != null)
					System.out.println("[" + i + "]" + companyFriend[i].toString());
			}
			int num2 = readInt("수정할 친구번호 선택하세요.");
			companyFriend[num2].modify();
			break;
		}
		System.out.println("수정완료.");
	}

	private void searchFriendMenu() {
		String search = readStr("조회할 친구를 입력하세요");
		for (int i = 0; i < orignalfriends.length; i++) {
			while (orignalfriends[i] != null) {
				if (!search.equals("")) {
					if (orignalfriends[i].getName().indexOf(search) != -1) {
						orignalfriends[i].showInfo();
					}
				}
				break;
			}
			while (schoolFriend[i] != null) {
				if (!search.equals("")) {
					if (schoolFriend[i].getName().indexOf(search) != -1)
						schoolFriend[i].showInfo();
				}
				break;
			}
			while (companyFriend[i] != null) {
				if (!search.equals("")) {
					if (companyFriend[i].getName().indexOf(search) != -1)
						companyFriend[i].showInfo();
				}
				break;
			}
		}
	}

	private void endMenu() {
		System.out.println("========Good Bye=========");
	}

	private void dowhileMenu() {
		boolean b = true;
		do {
			mainMenu();
			int key = sc.nextInt();
			sc.nextLine(); // 버퍼 클리어 역할.
			switch (key) {
			case 1:
				addFriendMenu();
				break;
			case 2:
				conFriendMenu();
				break;
			case 3:
				searchFriendMenu();
				break;
			case 4:
				endMenu();
				b = false; // 여기도 true로 설정.
				break;
			}
		} while (b); // False값으로 설정했을때 b 대신 (!b)로 설정함 - 관례
	}

	public class ScanUtil {

		public int readInt(String msg) {
			System.out.println(msg);
			int num = sc.nextInt();
			sc.nextLine();
			return num;

		}

		public String readStr(String msg) {
			System.out.println(msg);
			return sc.nextLine();
		}
	}

	public void run() {
		orignalfriends[0] = new OrignalFriend("정상수", "1111-1211", "대구광역시");
		orignalfriends[1] = new OrignalFriend("박정욱", "010-6694-6648", "대구광역시 동구");
		schoolFriend[0] = new SchoolFriend("정수아", "2222-1211", "서울특별시", "서울대");
		schoolFriend[1] = new SchoolFriend("서인영", "010-5381-5128", "서울특별시", "중앙대");
		companyFriend[0] = new CompanyFriend("홍수영", "2222-1311", "광주광역시", "기아자동차");
		companyFriend[1] = new CompanyFriend("김수현", "010-5315-1754", "경상북도 상주", "상주고등학교");
		dowhileMenu();
		sc.close();
	}

}
