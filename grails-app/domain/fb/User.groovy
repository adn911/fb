package fb

import grails.validation.Validateable

@Validateable
class User {
    String username;
    String firstName;
    String lastName;
    String email;
    Date dob;
    String password;

    List posts;
    List comments;
    List likes;

    static hasMany = [posts:Post,comments:Comment,likes:PostLike,friends:User];
    static mappedBy  = [ friends: 'friends' ]

    static constraints = {
        username nullable: false, blank: false, size:3..99
        firstName nullable: false,blank: false, size:3..99
        lastName nullable: false, blank: false, size:3..99
        email nullable: false, email: true, size:3..99
        dob nullable: false, blank: false
        password nullable: false, blank:false, size:3..99
    }



}
