package arrayList;

import java.util.ArrayList;

public class Launch {

	public static void main(String[] args) {
		ArrayList<Student> studentz = new ArrayList<>();
		Student jack = new Student("jack", 1005);
		Student jane = new Student("Jane", 1007);
		Student janet = new Student("janet", 1009);
		Student jasmin = new Student("jasmin", 1011);

		studentz.add(jack);
		studentz.add(jane);
		studentz.add(janet);
		studentz.add(jasmin);

		System.out.println(studentz);

		ClassRoster roster = new ClassRoster(studentz);
		System.out.println(roster.addStudent("jessie", 1017));
		System.out.println(roster.removeStudent("jane"));

		System.out.println(studentz);

		roster.removeStudent(studentz, 1011);
		roster.retrieveByID(1011);

		roster.retrieveByName("jessie");
	}

}
