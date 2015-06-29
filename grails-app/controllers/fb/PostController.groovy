package fb

class PostController {

    def add(){
         def user = session.user;

         def newPost = new Post(content: params.postContent,user: user,dateTime: new Date())
         newPost.save();

         redirect(controller: "home")
    }

    def remove(){
        def user = session.user;

        Post.get(params.postId).delete(flush: true);

        redirect(controller: "home")
    }
}
