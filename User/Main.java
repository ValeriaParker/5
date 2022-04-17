package User;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<User> users = UserUtil.generateUsersList(3);
        UserUtil.printList(users);
        LinkedList<User> f1 = UserUtil.findAllFriends(users);
        System.out.println();
        UserUtil.printList(f1);
    }


}
