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

        <g:if test="${post.user.id == user.id}">
            <g:form controller="post"  action="remove" method="post" onsubmit="return confirmAction()">
                <g:hiddenField name="postId" value="${post.id}"/>
                <g:submitButton class="glyphicon glyphicon-trash btn pull-right"
                        style="margin-top:-26px;background: transparent;" name="removePostSubmit"/>
            </g:form>
        </g:if>
    </div>

    <div class="panel-body">
        <p>${post.content}</p>
        <span>%{--${post.likes.length}--}%
        <g:form controller="likes" action="add"  method="post" >
            <g:hiddenField name="postId" value="${post.id}"/>
            <g:submitButton class="glyphicon glyphicon-thumbs-up btn pull-left"
                    style="margin-top:-26px;background: transparent;" name="addLikeSubmit"/>
        </g:form>
            </span>
    </div>

</div>


