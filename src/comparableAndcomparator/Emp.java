package comparableAndcomparator;

public class Emp  {
	private String name;
	private int id;
	private int phoneNo;

	/*@Override
	public int compareTo(Emp o) {
		return this.id-o.id;
	}*/


	public Emp(String name, int id, int phoneNo) {
		this.name = name;
		this.id = id;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Emp{" +
				"name='" + name + '\'' +
				", id=" + id +
				", phoneNo=" + phoneNo +
				'}';
	}


}
