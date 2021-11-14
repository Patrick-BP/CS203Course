import java.util.Comparator;

public class GradeDescending implements Comparator<Grade>{

	@Override
	public int compare(Grade o1, Grade o2) {
		return (o1.points - o2.points) *-1;
	}

}
