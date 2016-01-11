package ms.model;

import java.io.Serializable;



public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6190571611246371934L;
	private String account;
	private String name;
	private String address;
	public String getAccount() {
		return account;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
