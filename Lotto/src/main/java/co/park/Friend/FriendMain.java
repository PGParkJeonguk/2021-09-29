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
				if (orignalfriends == null) {
					orignalfriends[i] = new OrignalFriend(name, phone, address);
				}
			}

		} else if (choice == 2) {
			for (int i = 0; i < schoolFriend.length; i++) {
				if (schoolFriend[i] == null) {
					String schoolName = readStr("�б��̸��� �Է��ϼ���");
					schoolFriend[i] = new SchoolFriend(name, phone, address, schoolName);

				}
			}
		} else if (choice == 3) {
			for (int i = 0; i < companyFriend.length; i++) {
				if (companyFriend[i] == null) {
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
			}
			int num = readInt("������ ģ����ȣ�� �����ϼ���.");
			orignalfriends[num].modify();
			break;
		case 2:
			System.out.println("�б�ģ�������� �����Ͽ����ϴ�.");
			for (int i = 0; i < schoolFriend.length; i++) {
				if (schoolFriend[i] != null)
					System.out.println("[" + i + "]" + schoolFriend[i].toString());
			}
			int num1 = readInt("������ ģ����ȣ�� �����ϼ���.");
			schoolFriend[num1].modify();
			break;
		case 3:
			System.out.println("����ģ�������� �����Ͽ����ϴ�.");
			for (int i = 0; i < companyFriend.length; i++) {
				if (companyFriend[i] != null)
					System.out.println("[" + i + "]" + companyFriend[i].toString());
			}
			int num2 = readInt("������ ģ����ȣ �����ϼ���.");
			companyFriend[num2].modify();
			break;
		}
		System.out.println("�����Ϸ�.");
	}

	private void searchFriendMenu() {
		String search = readStr("��ȸ�� ģ���� �Է��ϼ���");
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
		orignalfriends[0] = new OrignalFriend("�����", "1111-1211", "�뱸������");
		orignalfriends[1] = new OrignalFriend("������", "010-6694-6648", "�뱸������ ����");
		schoolFriend[0] = new SchoolFriend("������", "2222-1211", "����Ư����", "�����");
		schoolFriend[1] = new SchoolFriend("���ο�", "010-5381-5128", "����Ư����", "�߾Ӵ�");
		companyFriend[0] = new CompanyFriend("ȫ����", "2222-1311", "���ֱ�����", "����ڵ���");
		companyFriend[1] = new CompanyFriend("�����", "010-5315-1754", "���ϵ� ����", "���ְ���б�");
		dowhileMenu();
		sc.close();
	}

}
