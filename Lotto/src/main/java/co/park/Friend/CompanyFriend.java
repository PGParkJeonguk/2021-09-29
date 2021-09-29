package co.park.Friend;

public class CompanyFriend extends Friend {
	public String company;

	public CompanyFriend(String name, String phone, String address, String company) {
		super(name, phone, address);
		this.company = company;
	}

	@Override
	public void modify() {
			this.name = ScanUtil.readStr("�ٲ��̸��� �Է��ϼ���.");
			this.phone = ScanUtil.readStr("�ٲ� ��ȭ��ȣ�� �Է��ϼ���.");
			this.address = ScanUtil.readStr("�ٲ��ּҸ� �Է��ϼ���.");
			this.company = ScanUtil.readStr("�ٲ������� �Է��ϼ���.");
	}

	@Override
	public void search(Friend[] friends) {
		CompanyFriend[] companyFriend = (CompanyFriend[]) friends;
		System.out.println("ģ�����");
		String search = ScanUtil.readStr("�̸��� �Է��ϼ���.");
		for (int i = 0; i < companyFriend.length; i++) {
			if (companyFriend[i] != null)
				if (!search.equals("")) {
					if (companyFriend[i].getName().indexOf(search) != -1) {
						System.out.println(companyFriend[i].toString());
					}
				}
		}
	}

	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ",address " + address + ", CompanyName= " + company + "]";
	}

	@Override
	public void showInfo() {
		System.out.println("�̸��� " + name + " �޴�����ȣ: " + phone + " �ּ�: " + address + " �б��̸� : " + company);
	}

}
