package co.park.Friend;

public class OrignalFriend extends Friend {

	public String school;

	public OrignalFriend(String name, String phone, String address) {
		super(name, phone, address);

	}

	public void search(Friend[] friends) {
		OrignalFriend[] orignalfriends = (OrignalFriend[]) friends;
		String search = ScanUtil.readStr("이름을 입력하세요.");
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
		this.name = ScanUtil.readStr("바꿀이름을 입력하세요.");
		this.phone = ScanUtil.readStr("바꿀 전화번호를 입력하세요.");
		this.address = ScanUtil.readStr("바꿀주소를 입력하세요.");
	}

	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ",address " + address + "]";
	}

}
