<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Home Page</title>
</head>
<body>

<div class="container">

    <div class="row">

        <g:include view="/templates/postInputBox.gsp"></g:include>
        %{--<%@include file="postInputBox.jsp" %>--}%
    </div>

    <div class="row">

        <div class="col-md-6 col-md-offset-3">

            <g:if test="${posts}">

                <g:forEach items="${posts}" var="post">

                    <%@include file="postPanel.jsp" %>

                    <g:forEach items="${post.comments}" var="comment">
                        %{--<%@include file="commentPanel.jsp" %>--}%
                    </g:forEach>

                    <%@include file="commentInputBox.jsp" %>

                    <hr class="divider">

                </g:forEach>

            </g:if>

        </div>

    </div>
</div>

</body>
</html>