package fb

/**
 * Created by galib on 6/29/15.
 */
class UserFriend {
    User user;
    User friend;

    static belongsTo = [ user: User]
}
