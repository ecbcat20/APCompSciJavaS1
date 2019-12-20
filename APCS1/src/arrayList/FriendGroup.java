package arrayList;

import java.util.ArrayList;

public class FriendGroup {

	ArrayList<Friend> friends = new ArrayList<>();

	public FriendGroup(ArrayList<Friend> list) {
		friends = list;
	}

	public void displayFriends() {
		for (Friend f : friends) {
			System.out.print(f + ", ");
		}
	}

	public Friend findFriend(String first) {
		Friend s = null;
		for (Friend f : friends) {
			if (f.firstName.equalsIgnoreCase(first)) {
				s = f;
			}
		}
		return s;
	}

	public ArrayList<Friend> listFriend(int level) {
		ArrayList<Friend> returned = new ArrayList<>();
		for (Friend f : friends) {
			if (f.getLevel() == level) {
				returned.add(f);
			}
		}

		return returned;
	}

	public void addFriend(Friend aFriend) {
		friends.add(aFriend);
	}

	public void addFriend(String first, int level) {
		friends.add(new Friend(first, null, level));
	}

	public void removeFriend(Friend aFriend) {
		if (findFriend(aFriend.firstName) != null) {
			friends.remove(aFriend);
		}
	}

	public void removeAll(int level) {
		for (Friend f : friends) {
			if (f.getLevel() == level) {
				friends.remove(f);
			}
		}
	}

	public boolean improvable(String first) {
		Friend s = null;
		boolean x = false;
		s = findFriend(first);

		if (s.getLevel() < s.MAX_LEVEL) {
			x = true;
		}

		return x;
	}

	public void improveFriend(String first) {
		Friend s = null;
		s = findFriend(first);

		if (s.getLevel() < s.MAX_LEVEL) {
			s.improveFS();
		}
	}
}
