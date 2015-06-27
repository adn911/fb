package fb

class SignUpController {

    static allowedMethods = [signUp: "POST"]

    def index() {

    }

    def signUp(User user){
        if(user.hasErrors()){
            params.error = "Signup Failed!";

            render(view: "index", model:[user: user]);
        }else{
            user.save();

            flash.success = "Signup Successful!";

            redirect(controller: "signUp");
        }
    }
}
