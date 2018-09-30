package online_shopping_store;

public interface Validation {
	public static boolean isMailExist(String email) {
		return false;
	}
	public static boolean matchPassword(String pwd, String rpwd) {
		if(pwd.equals(rpwd))
			return true;
		return false;
	}

}
