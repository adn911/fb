<%--
  Created by IntelliJ IDEA.
  User: bakhtiar.galib
  Date: 3/11/15
  Time: 1:17 PM
  To change this template use File | Settings | File Templates.
--%>
<div class="panel panel-info" style="clear: both">

    <div class="panel-heading">
        Posted by <g:link controller="profile" id="${post.user.id}">${post.user.username}</g:link>
        at ${post.dateTime}
        ${post.user.id}

        <g:if test="${post.user.id == session.user.id}">
            <g:form controller="post"  action="remove" method="post" onsubmit="return confirmAction()">
                <g:hiddenField name="postId" value="${post.id}"/>
                <button type="submit" class="btn pull-right"
                        style="margin-top:-26px;background: transparent;" name="removePostSubmit"><i class="glyphicon glyphicon-trash "></i></button>
            </g:form>
        </g:if>
    </div>

    <div class="panel-body">
        <p>${post.content}</p>
        <span>${post.postLikes.size()}
        <g:form controller="like" action="add"  method="post" >
            <g:hiddenField name="postId" value="${post.id}"/>
            <button class="btn pull-left"
                    style="margin-top:-26px;background: transparent;" name="addLikeSubmit"><i class="glyphicon glyphicon-thumbs-up"></i> </button>
        </g:form>
            </span>
    </div>

</div>


