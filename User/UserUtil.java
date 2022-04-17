package User;
import java.util.HashSet;
import java.util.LinkedList;

public class UserUtil implements UsersData {
    public UserUtil() {
    }

    public static LinkedList<User> generateFriendsList(int n){
       LinkedList<User> friends = new LinkedList<User>();
       for(int i=0; i<n; i++){
           int num = (int) (Math.random()* arr_name.length);
           User tempUser = new User(arr_name[num]);
           friends.add(tempUser);
       }
       return friends;
   }
   public static LinkedList<User> generateUsersList(int n){
        LinkedList<User> users = new LinkedList<User>();
        for (int i =0;i<n; i++){
            int num2 = (int) (Math.random()* arr_name.length);
            User tempUser = new User(arr_name[num2]);
            users.add(tempUser);
        }
       return users;
        }

        public static void printList(LinkedList<User> list){
            for (User user:list) {
                System.out.println(user);
            }
        }
        public static LinkedList<User> findAllFriends(LinkedList<User> list){
            HashSet<User> tempHS = new HashSet<User>();
            for (User user:list) {
                for (User friend : user.getFriends()){
                    tempHS.add(friend);
                }
            }
            return new LinkedList<User>(tempHS);
        }
}
