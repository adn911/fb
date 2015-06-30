package fb

class FriendController {

    def index() {
        def user = User.findById(session.user.id);

        render(view: "index", model:[friends:user.friends]);
    }

    def showAddable() {
        def user = User.findById(session.user.id);

        def addableFriends = User.list() - user.friends - user;

        render(view: "friendSuggestions", model:[usersNotFriends: addableFriends]);
    }

    def remove() {
        def user = User.findById(session.user.id);

        user.friends.remove(User.get(params.userId));

        user.save(flush: true);

        redirect(controller: "friend" );
    }

    def add() {
        def user = User.findById(session.user.id);

        user.friends.add(User.get(params.userId));

        user.save(flush: true);

        redirect(controller: "friend" );
    }
}
