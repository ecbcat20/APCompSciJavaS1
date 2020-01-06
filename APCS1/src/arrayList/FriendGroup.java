package arrayList;

import java.util.ArrayList;

public class FriendGroup {

	ArrayList<Friend> friends = new ArrayList<>();

	public FriendGroup(ArrayList<Friend> list) {
		friends = list;
	}

	public FriendGroup() {

	}

	public void displayFriends() {
		for (Friend f : friends) {
			System.out.print("\n" + f + ", ");
		}
	}

	public Friend findFriend(String first) { // returns Friend s
		Friend returnedFriend = null;
		for (Friend f : friends) {
			if (f.firstName.equalsIgnoreCase(first)) {
				returnedFriend = f;
			}
		}
		return returnedFriend;
	}

	public ArrayList<Friend> listFriend(int level) {
		ArrayList<Friend> returnedFriends = new ArrayList<>();
		for (Friend f : friends) {
			if (f.getLevel() == level) {
				returnedFriends.add(f);
			}
		}
		return returnedFriends;
	}

	public void addFriend(Friend aFriend) {
		friends.add(aFriend);
	}

	public void addFriend(String first, String last, int level) {
		friends.add(new Friend(first, last, level));
	}

	public void removeFriend(Friend aFriend) {
		if (findFriend(aFriend.firstName) != null) {
			friends.remove(aFriend);
		}
	}

	public void removeFriend(String first) {
		if (findFriend(first) != null) {
			friends.remove(findFriend(first));
		}
	}

	public void removeAll(int level) {
		for (int i = 0; i < friends.size(); i++) {
			int friendLevel = friends.get(i).getLevel();

			if (friendLevel == level) {
				friends.remove(friends.get(i));
			}
		}
	}

	public boolean improvable(String first) {
		Friend returnedFriend = null;
		boolean isImprovable = false;
		returnedFriend = findFriend(first);

		if (returnedFriend.getLevel() < returnedFriend.MAX_LEVEL) {
			isImprovable = true;
		}

		return isImprovable;
	}

	public void improveFriend(String first) {
		Friend s = null;
		s = findFriend(first);

		if (s.getLevel() < s.MAX_LEVEL) {
			s.improveFS();
		}
	}
}
