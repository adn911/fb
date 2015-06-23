package fb

class Post {
    String content;
    Date dateTime;

    static belongsTo = [user: User];
    static hasMany = [likes: Like, comments:Comment];
    static constraints = {
    }
}
