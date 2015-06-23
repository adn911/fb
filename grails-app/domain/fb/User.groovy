package fb

class User {
    String username;
    String firstName;
    String lastName;
    Date dob;
    String email;
    String password;

    static hasMany = [posts:Post,comments:Comment,likes:Like];

    static constraints = {
    }
}
