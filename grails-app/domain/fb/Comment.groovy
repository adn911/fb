package fb

class Comment {
    String content;
    Date dateTime;

    static belongsTo = [user: User, post:Post];
    static constraints = {
    }
}
