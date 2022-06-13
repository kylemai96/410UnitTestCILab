package artifact;

public class CILab implements CILabInterface {
	private String string;

	public String getString() {
		// TODO Auto-generated method stub
		return string;
	}

	public void setString(String string) {
		// TODO Auto-generated method stub
		this.string = string;
	}

	public boolean detectCapitalUse() {
		// TODO Auto-generated method stub
		for(char c: string.toCharArray()) {
			if(Character.isUpperCase(c)) return true;
		}
		return false;
	}
	

}
