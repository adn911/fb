<%--
  Created by IntelliJ IDEA.
  User: bakhtiar.galib
  Date: 3/12/15
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<div class="panel panel-info " style="clear: both">

    <div class="panel-heading">
        <h3>Friends Suggestions</h3>
    </div>

    <div class="panel-body">


        <g:each var="user" in="${usersNotFriends}">

            <div class="friend-panel">
                <div class="picture-div">
                    <img class="img-circle" src="#"
                         width="100px" height="100px" alt="">
                </div>

                <div class="info-div">
                    <p>Username: ${user.username} </p>

                    <p>FullName: ${user.firstName} ${user.lastName} </p>

                    <p>Date Of Birth: ${user.dob} </p>

                    <g:form controller="friend" action="add" method="post">
                        <input type="hidden" name="userId" value="${user.id}"/>
                        <input class="btn btn-default" type="submit" name="addFriendSubmit" value="ADD FRIEND"/>
                    </g:form>

                </div>
            </div>

        </g:each>


    </div>

</div>