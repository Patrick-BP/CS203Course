import java.util.*;

public class ComparisonTest {
	public static void main(String[] args) {
		Grade g1 = new Grade(58, "Ben");
		Grade g2 = new Grade(75, "Taye");
		Grade g3 = new Grade(28, "Jen");
		Grade g4 = new Grade(75, "Joel");
		Grade g5 = new Grade(97, "Ronnie");
		Grade g6 = new Grade(25, "Liam");
		Grade g7 = new Grade(65, "Xavier");
		
		List<Grade> gradesList = new ArrayList<Grade>();
		gradesList.add(g1);
		gradesList.add(g2);
		gradesList.add(g3);
		gradesList.add(g4);
		gradesList.add(g5);
		gradesList.add(g6);
		gradesList.add(g7);
		
		
		NameAscending ascendingNmae = new NameAscending();
		NameDescending descendingName = new NameDescending();
		GradeAscending ascendingGrade = new GradeAscending();
		GradeDescending descendingGrade = new GradeDescending();
		
		System.out.println("Before: " + gradesList);
		Collections.sort(gradesList, ascendingNmae);
		System.out.println("Name Ascending:  " + gradesList);
		Collections.sort(gradesList, descendingName);
		System.out.println("Name Descending:  " + gradesList);
		Collections.sort(gradesList, ascendingGrade);
		System.out.println("Grade Ascending:  " + gradesList);
		Collections.sort(gradesList, descendingGrade);
		System.out.println("Grade Descending:  " + gradesList);
		
	}
}
