package entity;

public class Admin_im {
	private int admin_id;
	private String admin_username;
	private String admin_password;
	private String admin_name;
	private String admin_phone;
	private String admin_email;
	private Admin_action admin_action;
	public Admin_im(){}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_username() {
		return admin_username;
	}
	public void setAdmin_username(String admin_username) {
		this.admin_username = admin_username;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_phone() {
		return admin_phone;
	}
	public void setAdmin_phone(String admin_phone) {
		this.admin_phone = admin_phone;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public Admin_action getAdmin_action() {
		return admin_action;
	}
	public void setAdmin_action(Admin_action admin_action) {
		this.admin_action = admin_action;
	}
}
