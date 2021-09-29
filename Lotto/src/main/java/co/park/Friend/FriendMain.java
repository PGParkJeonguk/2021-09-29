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
	OrignalFriend[] orignalfriends = new OrignalFriend[100];
	SchoolFriend[] schoolFriend = new SchoolFriend[100];
	CompanyFriend[] companyFriend = new CompanyFriend[100];

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
				if (i == 0) {
					orignalfriends[i] = new OrignalFriend(name, phone, address);
				}
			}

		} else if (choice == 2) {
			for (int i = 0; i < schoolFriend.length; i++) {
				if (i == 0) {
					String schoolName = readStr("학교이름을 입력하세요");
					schoolFriend[i] = new SchoolFriend(name, phone, address, schoolName);

				}
			}
		} else if (choice == 3) {
			for (int i = 0; i < companyFriend.length; i++) {
				if (i == 0) {
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
				int num = readInt("수정할 친구를 선택하세요.");
				orignalfriends[num].modify();
				break;
			}
			break;
		case 2:
			System.out.println("학교친구수정을 선택하였습니다.");
			for (int i = 0; i < schoolFriend.length; i++) {
				if (schoolFriend[i] != null)
					System.out.println("[" + i + "]" + schoolFriend[i].toString());
				int num = readInt("수정할 친구를 선택하세요.");
				schoolFriend[num].modify();
				break;
			}
			break;
		case 3:
			System.out.println("직장친구수정을 선택하였습니다.");
			for (int i = 0; i < companyFriend.length; i++) {
				if (companyFriend[i] != null)
					System.out.println("[" + i + "]" + companyFriend[i].toString());
				int num = readInt("수정할 친구를 선택하세요.");
				companyFriend[num].modify();
				break;
			}
			break;
		}
		System.out.println("수정완료.");
	}

	private void searchFriendMenu() {
		System.out.println("어떤 친구를 찾겠습니까?");
		System.out.println("1. 일반친구 2.학교친구 3. 직장친구 ");
		String key = sc.nextLine();
		if(!key.equals("")) {
			System.out.println("일반친구조회를 선택하였습니다.");
			String search =readStr("이름을 입력하세요.");
			//orignalfriends[searchr].search(orignalfriends);
			//for문 이용해서 이름으로 equals 배열내에 찾아서 그배열의 번호(index)를 search값으로 넣어서 그안에 있는 모든정보를 showinfo로사용을 해서 보여준다. 
		}else if(!key.equals("")) {
			System.out.println("학교친구조회를 선택하였습니다.");
			int num = readInt("이름을 입력하세요.");
			schoolFriend[num].search(schoolFriend);
		}else if(!key.equals("")) {
			System.out.println("직장친구조회를 선택하였습니다.");
			int num = readInt("이름을 입력하세요.");
			companyFriend[num].search(companyFriend);
		}else {
			System.out.println("잘못입력하였습니다.");
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

	public void run() {
		dowhileMenu();
		sc.close();
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
}
