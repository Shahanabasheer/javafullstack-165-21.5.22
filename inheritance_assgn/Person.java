package inheritance_assgn;

class Person{
	private String name;
	private String address;
	
	Person(String name,String address){
		this.name=name;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [" + name + "(" + address + ")]";
	}
	
	
}
