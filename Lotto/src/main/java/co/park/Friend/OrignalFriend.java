package co.park.Friend;

public class OrignalFriend extends Friend {

	public String school;

	public OrignalFriend(String name, String phone, String address) {
		super(name, phone, address);

	}

	public void search(Friend[] friends) {
		OrignalFriend[] orignalfriends = (OrignalFriend[]) friends;
		String search = ScanUtil.readStr("�̸��� �Է��ϼ���.");
		for (int i = 0; i < orignalfriends.length; i++) {
			if (orignalfriends[i] != null)
				if (!search.equals("")) {
					if (orignalfriends[i].getName().indexOf(search) != -1);
					System.out.println(orignalfriends[i].toString());
				} else if (!search.equals("")) {
					if (orignalfriends[i].getName().indexOf(search) != -1) {
						System.out.println(orignalfriends[i].toString());
					}
				} 
		}
	}

	public void modify() {
		this.name = ScanUtil.readStr("�ٲ��̸��� �Է��ϼ���.");
		this.phone = ScanUtil.readStr("�ٲ� ��ȭ��ȣ�� �Է��ϼ���.");
		this.address = ScanUtil.readStr("�ٲ��ּҸ� �Է��ϼ���.");
	}

	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ",address " + address + "]";
	}

}
