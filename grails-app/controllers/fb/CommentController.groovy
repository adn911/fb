package fb

class CommentController {

    def add() {
        def user = session.user;

        def newComment = new Comment(user: user, post: Post.get(params.postId),
                content: params.commentContent, dateTime: new Date());

        newComment.save(flush: true);

        redirect(controller: "home");
    }

    def remove() {
        def user = session.user;

        Comment.get(params.commentId).delete(flush: true);

        redirect(controller: "home")
    }
}
