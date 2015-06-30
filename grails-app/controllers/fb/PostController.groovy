package fb

class PostController {

    def add() {
        def user = (User) session.user;

        println(user.id);

        def newPost = new Post(content: params.postContent, user: user, dateTime: new Date())
        newPost.save();

        redirect(controller: "home")
    }

    def remove() {
        def user = session.user;

        Post.get(params.postId).delete(flush: true);

        redirect(controller: "home")
    }
}
