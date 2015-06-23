package fb

class Like {
    boolean active;
    Date dateTime;

    static belongsTo = [user:User, post:Post];
    static constraints = {
    }
}
