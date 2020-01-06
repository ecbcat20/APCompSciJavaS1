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
		boolean contains = false;
		for (Student s : students) {
			if (s.name == name) {
				contains = true;
			}
		}

		return contains;
	}

	boolean containsStudent(int id) {
		boolean contain = false;
		for (Student s : students) {
			if (s.id == id) {
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
		boolean added = false;

		if (containsStudent(studentName) == false && students.size() <= MAX_NUM) {
			students.add(new Student(studentName, studentID));
			added = true;
		}

		return added;
	}

	boolean removeStudent(ArrayList<Student> s, int id) {
		int loc = 10000;
		boolean removed = false;
		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).id == id) {
				loc = i;
			}
		}

		if (containsStudent(id)) { // containsstudent by id
			s.remove(s.get(loc));
			removed = true;
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
