<%--
  Created by IntelliJ IDEA.
  User: bakhtiar.galib
  Date: 3/11/15
  Time: 1:17 PM
  To change this template use File | Settings | File Templates.
--%>

<div class="panel panel-info col-md-offset-1" style="clear: both">

    <div class="panel-body">

        Commented by <g:link controller="profile" id="${comment.user.id}">${comment.user.username}</g:link>
        on ${comment.dateTime}
        <g:if test="${comment.user.id == session.user.id}">

            <g:form controller="comment" action="remove" method="post" onsubmit="return confirmAction()">
                <g:hiddenField name="commentId" value="${comment.id}"/>
                <button type="submit" name="removeCommentSubmit" class="glyphicon glyphicon-trash btn pull-right"
                        style="margin-top:-26px;background: transparent;"></button>
            </g:form>
        </g:if>
        <p>${comment.content}</p>
    </div>

</div>


