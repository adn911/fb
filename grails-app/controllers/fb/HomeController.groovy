package fb

class HomeController {

    def index() {
        def user = User.findById(session.user.id);

        def newsFeedPosts = user.posts;

        user.friends.each { friend ->
            newsFeedPosts.addAll(friend.posts)
        }

        newsFeedPosts.sort{ Post p1,Post p2 ->
               p2.dateTime.time - p1.dateTime.time
        }

        render(view: "index", model: [posts: newsFeedPosts])
    }
}
