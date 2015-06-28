package fb

class HomeController {

    def index() {
        def user = User.findById(session.user.id,[fetch:[posts: "join"]]);

        render(view: "index", model: [posts:user.posts])
    }
}
