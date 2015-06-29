package fb

class Post {
    String content;
    Date dateTime;

    static belongsTo = [user: User];
    static hasMany = [likes: PostLike, comments:Comment];
    static constraints = {
    }
}
