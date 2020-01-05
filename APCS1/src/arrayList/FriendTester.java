package arrayList;

import java.util.ArrayList;

public class FriendTester {

	public static void main(String[] args) {
		ArrayList<Friend> friend = new ArrayList<>();

		// Declare and add initial friends
		FriendGroup homies = new FriendGroup(friend);
		homies.addFriend(new Friend("Mary", "Roberts", 4));
		homies.addFriend(new Friend("Tam", "Roberts", 2));
		homies.addFriend(new Friend("Tom", "Roberts", 3));
		homies.addFriend(new Friend("Terry", "Roberts", 3));
		homies.addFriend(new Friend("Carrie", "Roberts", 1));

		// display, then list all in level 2
		homies.displayFriends();
		homies.listFriend(2);

		// improve Terry to next level, then display friends
		homies.improveFriend("Terry");
		homies.displayFriends();

		// improve Terry again, then display friends in level 2
		homies.improveFriend("Terry");
		homies.listFriend(2);

		homies.removeFriend("Mary");
		homies.listFriend(4);

		// improve Terry yet again, then remove all friends in level 3
		homies.improveFriend("Terry");
		homies.removeAll(3);

		// display friends
		homies.displayFriends();

		// output the result of findFriend with firstname Tam
		System.out.println(homies.findFriend("Tam"));
	}

}
