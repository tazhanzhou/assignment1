package student;

public class student {
	
	int stdId;
	String stdName;
	
	public student() {
		// TODO Auto-generated constructor stub
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	@Override
	public String toString() {
		
		return  "Student [Id=" + stdId + ", Name=" + stdName + "]";
	} 
}
