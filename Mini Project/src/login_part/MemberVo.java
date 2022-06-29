package login_part;


public class MemberVo {
	private String id;
	private String password;
	private String deptcode;

	public MemberVo() {

	}

	public MemberVo(String id, String password, String deptcode) {
		this.id = id;
		this.password = password;
		this.deptcode = deptcode;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}
	
	public String getDeptCode() {
		return deptcode;
	}
}