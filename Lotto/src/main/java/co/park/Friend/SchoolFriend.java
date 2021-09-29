package co.park.Friend;

public class SchoolFriend extends Friend {

	public String school;

	public SchoolFriend(String name, String phone, String address, String school) {
		super(name, phone, address);
		this.school = school;

	}

	public void modify() {
//		  ���� �����Ϸ��°� ���� ?
//		  ��ȣ�� �ٲܰ���, �ּҸ� �ٲܰ���, �б��̸��� �ٲܰ����� �Է¹޾Ƽ�
//		 Str()���� �Է��� �޾Ƽ�
		this.name = ScanUtil.readStr("�ٲ��̸��� �Է��ϼ���.");
		this.phone = ScanUtil.readStr("�ٲ� ��ȭ��ȣ�� �Է��ϼ���.");
		this.address = ScanUtil.readStr("�ٲ��ּҸ� �Է��ϼ���.");
		this.school = ScanUtil.readStr("�ٲ��б��� �Է��ϼ���.");

	}

	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ",address " + address + ", SchoolName= " + school + "]";
	}

	@Override
	public void search(Friend[] friends) {
		SchoolFriend[] schoolFriend = (SchoolFriend[]) friends;
		System.out.println("ģ�����");
		String search = ScanUtil.readStr("�̸��� �Է��ϼ���.");
		for (int i = 0; i < schoolFriend.length; i++) {
			if (schoolFriend[i] != null)
				if (!search.equals("")) {
					if (schoolFriend[i].getName().indexOf(search) != -1) {
						System.out.println(schoolFriend[i].toString());
					}
				}
		}
	}
	@Override
	public void showInfo() {
		System.out.println("�̸��� " + name + " �޴�����ȣ: " + phone + " �ּ�: " + address + " �б��̸� : " + school);
	}

}
