<%--
  Created by IntelliJ IDEA.
  User: bakhtiar.galib
  Date: 3/10/15
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>

<div class="container">
    <%--
        <div class="row">
            <%@include file="postInputBox.jsp" %>
        </div>--%>

    <div class="row">

        <div class="col-md-2 col-md-offset-1">

            <div>

                <img class="img-circle" src="/FacebookSpringJpa/resources/uploads/photoes/${user.profilePicture}"
                     class="img-thumbnail"
                     width="100px" height="100px" alt="${user.profilePicture}"><br><br>

            </div>

        </div>

        <div class="col-md-6">

            <g:if test="${posts}">

                <g:each var="post" in="${posts}" >

                    <g:render template="/templates/postPanel" model="[post:post]"/>

                    <g:each var="comment" in="${post.comments}">
                        <g:render template="/templates/commentPanel" model="[comment:comment]"/>
                    </g:each>

                    <g:render template="/templates/commentInputBox" model="[post:post]"/>

                    <hr class="divider">

                </g:each>

            </g:if>


        </div>

    </div>

</div>
