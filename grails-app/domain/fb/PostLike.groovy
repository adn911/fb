package fb

class PostLike {
    boolean active;
    Date dateTime;

    static belongsTo = [user:User, post:Post];
    static constraints = {
    }
}
