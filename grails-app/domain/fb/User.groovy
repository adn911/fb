package fb

import grails.validation.Validateable

@Validateable
class User {
    String username;
    String firstName;
    String lastName;
    String email;
    String password;

    static hasMany = [posts:Post,comments:Comment,likes:Like];

    static constraints = {
        username blank: false, size:3..99
        firstName blank: false, size:3..99
        lastName blank: false, size:3..99
        email email: true, size:3..99
        password blank:false, size:3..99
    }
}
