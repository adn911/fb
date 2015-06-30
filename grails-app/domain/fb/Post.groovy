package fb

class Post {
    String content;
    Date dateTime;

   /* List likes;
    List comments;*/

    static belongsTo = [user: User];
    static hasMany = [likes: PostLike, comments:Comment];
    static constraints = {
    }
}
