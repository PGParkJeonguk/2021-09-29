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
		System.out.println("=== 1. �Է��ϱ�===");
		System.out.println("=== 2. �����ϱ�===");
		System.out.println("=== 3. ��ȸ�ϱ�===");
		System.out.println("=== 4. �����ϱ�===");
		System.out.println("=================");
		System.out.println("���ϴ� �۾���ȣ�� �Է��ϼ���.");
	}

	private void addFriendMenu() {
		System.out.println("ģ����ϸ޴��Դϴ�.");
		System.out.println("�ģ���� �Է��Ͻðڽ��ϱ�?");
		System.out.println("1.�׳� ģ�� 2. �б�ģ�� 3. ���嵿��");
		int choice = readInt("��ȣ�� �������ּ���");

		String name = readStr("ģ���̸��� �Է��ϼ���.");
		String phone = readStr("ģ����ȭ��ȣ�� �Է��ϼ���.");
		String address = readStr("ģ���ּҸ� �Է��ϼ���.");

		if (choice == 1) {
			for (int i = 0; i < orignalfriends.length; i++) {
				if (i == 0) {
					orignalfriends[i] = new OrignalFriend(name, phone, address);
				}
			}

		} else if (choice == 2) {
			for (int i = 0; i < schoolFriend.length; i++) {
				if (i == 0) {
					String schoolName = readStr("�б��̸��� �Է��ϼ���");
					schoolFriend[i] = new SchoolFriend(name, phone, address, schoolName);

				}
			}
		} else if (choice == 3) {
			for (int i = 0; i < companyFriend.length; i++) {
				if (i == 0) {
					String companyName = readStr("ȸ���̸��� �Է��ϼ���");
					companyFriend[i] = new CompanyFriend(name, phone, address, companyName);
				}
			}
		}
	}

	private void conFriendMenu() {
		System.out.println("�ģ���� �����Ͻðڽ��ϱ�?");
		System.out.println("1. �Ϲ�ģ�� 2.�б�ģ�� 3. ����ģ�� ");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("�Ϲ�ģ�������� �����Ͽ����ϴ�.");
			for (int i = 0; i < orignalfriends.length; i++) {
				if (orignalfriends[i] != null)
					System.out.println("[" + i + "]" + orignalfriends[i].toString());
				int num = readInt("������ ģ���� �����ϼ���.");
				orignalfriends[num].modify();
				break;
			}
			break;
		case 2:
			System.out.println("�б�ģ�������� �����Ͽ����ϴ�.");
			for (int i = 0; i < schoolFriend.length; i++) {
				if (schoolFriend[i] != null)
					System.out.println("[" + i + "]" + schoolFriend[i].toString());
				int num = readInt("������ ģ���� �����ϼ���.");
				schoolFriend[num].modify();
				break;
			}
			break;
		case 3:
			System.out.println("����ģ�������� �����Ͽ����ϴ�.");
			for (int i = 0; i < companyFriend.length; i++) {
				if (companyFriend[i] != null)
					System.out.println("[" + i + "]" + companyFriend[i].toString());
				int num = readInt("������ ģ���� �����ϼ���.");
				companyFriend[num].modify();
				break;
			}
			break;
		}
		System.out.println("�����Ϸ�.");
	}

	private void searchFriendMenu() {
		System.out.println("� ģ���� ã�ڽ��ϱ�?");
		System.out.println("1. �Ϲ�ģ�� 2.�б�ģ�� 3. ����ģ�� ");
		String key = sc.nextLine();
		if(!key.equals("")) {
			System.out.println("�Ϲ�ģ����ȸ�� �����Ͽ����ϴ�.");
			String search =readStr("�̸��� �Է��ϼ���.");
			//orignalfriends[searchr].search(orignalfriends);
			//for�� �̿��ؼ� �̸����� equals �迭���� ã�Ƽ� �׹迭�� ��ȣ(index)�� search������ �־ �׾ȿ� �ִ� ��������� showinfo�λ���� �ؼ� �����ش�. 
		}else if(!key.equals("")) {
			System.out.println("�б�ģ����ȸ�� �����Ͽ����ϴ�.");
			int num = readInt("�̸��� �Է��ϼ���.");
			schoolFriend[num].search(schoolFriend);
		}else if(!key.equals("")) {
			System.out.println("����ģ����ȸ�� �����Ͽ����ϴ�.");
			int num = readInt("�̸��� �Է��ϼ���.");
			companyFriend[num].search(companyFriend);
		}else {
			System.out.println("�߸��Է��Ͽ����ϴ�.");
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
			sc.nextLine(); // ���� Ŭ���� ����.
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
				b = false; // ���⵵ true�� ����.
				break;
			}
		} while (b); // False������ ���������� b ��� (!b)�� ������ - ����
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
