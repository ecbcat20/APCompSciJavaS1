package arrayList;

import java.util.ArrayList;

public class FriendTester {

	public static void main(String[] args) {
		ArrayList<Friend> friend = new ArrayList<>();

		FriendGroup homies = new FriendGroup(friend);
		homies.addFriend(new Friend("Mary", "Roberts", 4));
		homies.addFriend(new Friend("Tam", "Roberts", 2));
		homies.addFriend(new Friend("Tom", "Roberts", 3));
		homies.addFriend(new Friend("Terry", "Roberts", 3));
		homies.addFriend(new Friend("Carrie", "Roberts", 1));

		homies.displayFriends();
		homies.listFriend(2);
		homies.improveFriend("Terry");
		homies.displayFriends();
		homies.improveFriend("Terry");
		homies.listFriend(2);
		homies.removeFriend("Mary");
		homies.listFriend(4);
		homies.improveFriend("Terry");
		homies.removeAll(3);
		homies.displayFriends();
		System.out.println(homies.findFriend("Tam"));
	}

}
