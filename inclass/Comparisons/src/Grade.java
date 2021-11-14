
public class Grade implements Comparable<Grade>{
	int points;
	String name;
	public Grade(int points, String name) {
		this.points = points;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return name +": "+points;
	}


	@Override
	public int compareTo(Grade o) {
		return name.compareTo(o.name);
	}
}
