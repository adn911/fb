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

    </div>

    <div class="row">

        <div class="col-md-6 col-md-offset-3">

            <g:if test="${posts}">

                <g:each var="post" in="${posts}" >

                    <g:render template="/templates/postPanel" model="[post:post]"/>

                    %{--<%@include file="_postPanel.gsp" %>--}%

                  %{--  <g:each in="${post.comments}" var="comment">

                        <g:include view="/templates/commentPanel.jsp"/>
                        --}%%{--<%@include file="commentPanel.jsp" %>--}%%{--
                    </g:each>

                    <g:include view="/templates/commentInputBox.jsp"/>
                    --}%%{--<%@include file="commentInputBox.jsp" %>--}%%{--

                    <hr class="divider">--}%

                </g:each>

            </g:if>

        </div>

    </div>
</div>

</body>
</html>