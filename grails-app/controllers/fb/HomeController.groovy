package fb

class HomeController {

    def index() {
        def user = User.findById(session.user.id);

        def newsFeedPosts = user.posts;

        user.friends.each {friend->
            newsFeedPosts.addAll(friend.posts)
        }

        render(view: "index", model: [posts: newsFeedPosts])
    }
}
