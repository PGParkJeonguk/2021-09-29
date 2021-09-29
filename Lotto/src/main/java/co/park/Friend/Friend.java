package co.park.Friend;

public abstract class Friend {
	protected String name;
	protected String phone;
	protected String address;

	public Friend(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public abstract void search(Friend[] friends);
	public abstract void modify();
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ",address " + address + "]";
	}

}
