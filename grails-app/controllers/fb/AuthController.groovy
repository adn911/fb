package fb

class AuthController {

    def index() {}

    def login(){
        def email = params.email;
        def password = params.password;

        def user = User.findByEmailAndPassword(email,password);

        if(!user){
            render (view: "index", model: [error:"INVALID CREDINTIALS"])
        }else{
            session.user = user;
            redirect (controller: "home");
        }
    }

    def logout(){
        session.invalidate();
        redirect (controller: "auth");
    }
}
