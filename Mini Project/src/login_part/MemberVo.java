package login_part;

public class MemberVo {
	private String id;
	private String password;


	public MemberVo() {

	}

	public MemberVo(String id, String password, String deptcode) {
		this.id = id;
		this.password = password;

	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

}