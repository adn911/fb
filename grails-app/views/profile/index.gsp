<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Profile Page</title>
</head>
<body>

<div class="container">

    <div class="row">

        <g:include view="/templates/_postInputBox.gsp"></g:include>

    </div>

    <div class="row">

        <div class="col-md-6 col-md-offset-3">

            <g:if test="${posts}">

                <g:each var="post" in="${posts}" >

                    <g:render template="/templates/postPanel" model="[post:post]"/>

                    <g:each var="comment" in="${post.postComments}">
                        <g:render template="/templates/commentPanel" model="[comment:comment]"/>
                    </g:each>

                    <g:render template="/templates/commentInputBox" model="[post:post]"/>

                    <hr class="divider">

                </g:each>

            </g:if>

        </div>

    </div>
</div>

</body>
</html>