package fb

class SignUpController {

    static allowedMethods = [signUp: "POST"]

    def index() {

    }

    def signUp(User user){
        if(user.hasErrors()){
            params.error = "Signup Failed!";
        }else{
            flash.success = "Signup Successful!";
            user.save();
        }

        render(view: "index", model:[user: user]);
    }
}
