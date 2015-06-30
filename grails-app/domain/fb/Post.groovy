package fb

class Post {
    String content;
    Date dateTime;

    List postLikes;
    List postComments;

    static belongsTo = [user: User];
    static hasMany = [postLikes: PostLike, postComments:Comment];
    static constraints = {
    }
}
