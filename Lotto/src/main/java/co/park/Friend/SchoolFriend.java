package co.park.Friend;

public class SchoolFriend extends Friend {

	public String school;

	public SchoolFriend(String name, String phone, String address, String school) {
		super(name, phone, address);
		this.school = school;

	}

	public void modify() {
//		  저희가 수정하려는게 뭔지 ?
//		  번호를 바꿀건지, 주소를 바꿀건지, 학교이름을 바꿀건지를 입력받아서
//		 Str()으로 입력을 받아서
		this.name = ScanUtil.readStr("바꿀이름을 입력하세요.");
		this.phone = ScanUtil.readStr("바꿀 전화번호를 입력하세요.");
		this.address = ScanUtil.readStr("바꿀주소를 입력하세요.");
		this.school = ScanUtil.readStr("바꿀학교를 입력하세요.");

	}

	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ",address " + address + ", SchoolName= " + school + "]";
	}

	@Override
	public void search(Friend[] friends) {
		SchoolFriend[] schoolFriend = (SchoolFriend[]) friends;
		System.out.println("친구목록");
		String search = ScanUtil.readStr("이름을 입력하세요.");
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
		System.out.println("이름은 " + name + " 휴대폰번호: " + phone + " 주소: " + address + " 학교이름 : " + school);
	}

}
