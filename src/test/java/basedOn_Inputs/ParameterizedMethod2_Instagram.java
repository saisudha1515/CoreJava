package basedOn_Inputs;

public class ParameterizedMethod2_Instagram {
	public static void login(String userName, String pwd) {
		if (userName.equals("saisudha@1234") && pwd.equals("213439")) {
			System.out.println("Login Successful");
		} else {
			System.err.println("Invalid User name or Password provided.. ");
		}
	}

	public static void main(String[] args) {
		login("saisudha@1234", "456898");
	}

}
