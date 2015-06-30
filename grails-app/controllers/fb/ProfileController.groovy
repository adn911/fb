package fb

class ProfileController {

    def index(Integer id) {
        def user = User.findById(id ?:session.user.id);

        def profilePosts = user.posts;

        render(view: "index", model: [posts: profilePosts])
    }
}
