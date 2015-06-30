package fb

class CommentController {

    def add() {
        def user = User.findById(session.user.id);;

        def newComment = new Comment(user: user, post: Post.get(params.postId),
                content: params.commentContent, dateTime: new Date());

        newComment.save(flush: true);

        redirect(controller: "home");
    }

    def remove() {
        def user = User.findById(session.user.id);

        Comment.get(params.commentId).delete(flush: true);

        redirect(controller: "home")
    }
}
