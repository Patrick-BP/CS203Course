import java.util.Comparator;

public class NameDescending implements Comparator<Grade>{

	@Override
	public int compare(Grade o1, Grade o2) {
		return o1.name.compareTo(o2.name)*-1;
	}

}
