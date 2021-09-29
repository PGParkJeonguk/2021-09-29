package co.park.Friend;

public class CompanyFriend extends Friend {
	public String company;

	public CompanyFriend(String name, String phone, String address, String company) {
		super(name, phone, address);
		this.company = company;
	}

	@Override
	public void modify() {
			this.name = ScanUtil.readStr("바꿀이름을 입력하세요.");
			this.phone = ScanUtil.readStr("바꿀 전화번호를 입력하세요.");
			this.address = ScanUtil.readStr("바꿀주소를 입력하세요.");
			this.company = ScanUtil.readStr("바꿀직장을 입력하세요.");
	}

	@Override
	public void search(Friend[] friends) {
		CompanyFriend[] companyFriend = (CompanyFriend[]) friends;
		System.out.println("친구목록");
		String search = ScanUtil.readStr("이름을 입력하세요.");
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
		System.out.println("이름은 " + name + " 휴대폰번호: " + phone + " 주소: " + address + " 학교이름 : " + company);
	}

}
