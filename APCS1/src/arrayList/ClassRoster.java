package arrayList;

import java.util.ArrayList;

public class ClassRoster {

	final int MAX_NUM = 10;
	ArrayList<Student> students = new ArrayList<>();

	public ClassRoster() {
		for (int i = 0; i < MAX_NUM; i++) {
			students.get(i).name = "";
		}
	}

	public ClassRoster(ArrayList<Student> arr) {
		students = arr;
	}

	boolean containsStudent(String name) {
		boolean contain = false;
		for (Student s : students) {
			if (s.name == name) {
				contain = true;
			}
		}

		return contain;
	}

	String retrieveByID(int id) {
		String nm = "";
		for (Student s : students) {
			if (s.id == id) {
				nm = s.name;
			}
		}

		return nm;
	}

	int retrieveByName(String student) {
		int receivedID = 0;
		for (Student s : students) {
			if (s.name == student) {
				receivedID = s.id;
			}
		}
		return receivedID;
	}

	boolean addStudent(String studentName, int studentID) {
		boolean contains = false;
		boolean added = false;
		for (Student s : students) {
			if (s.name == studentName) {
				contains = true;
			}
		}

		if (contains == false && students.size() <= MAX_NUM) {
			students.add(new Student(studentName, studentID));
			added = true;
		}

		return added;
	}

	boolean removeStudent(int id) {
		boolean contains = false;
		boolean removed = false;
		for (Student s : students) {
			if (s.id == id) {
				contains = true;
				if (contains == true) {
					students.remove(s);
					removed = true;
				}
			}
		}

		return removed;
	}

	boolean removeStudent(String name) {
		boolean contains = false;
		boolean removed = false;
		for (Student s : students) {
			if (s.name == name) {
				contains = true;
				if (contains == true) {
					students.remove(s);
					removed = true;
				}
			}
		}
		return removed;
	}

}
