package fb

class LikeController {

    def add() {
        def user = User.findById(session.user.id);
        def post = Post.get(params.postId);

        PostLike postLike = PostLike.findByUserAndPost(user,post)

        if(postLike){
            postLike.delete(flush:true);
        }else{
            def newLike = new PostLike(user: user,
                    post: post,
                    dateTime: new Date(),
                    active: true);

            newLike.save();
        }

        redirect(controller: "home")
    }
/*
    def remove() {
        def user = User.findById(session.user.id);

        Post.get(params.postId).delete(flush: true);

        redirect(controller: "home")
    }*/
}
