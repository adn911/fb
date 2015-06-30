<%--
  Created by IntelliJ IDEA.
  User: bakhtiar.galib
  Date: 3/12/15
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<div class="panel panel-info " style="clear: both">

    <div class="panel-heading">
        <h3>List Of Friends</h3>
    </div>

    <div class="panel-body">

        <g:each var="friend" in="${friends}">

            <div class="friend-panel">

                <div class="picture-div">
                    <img class="img-circle" src="#" width="100px" height="100px">
                </div>

                <div class="info-div">
                    Username: <g:link controller="profile" id="${friend.id}">${friend.username}</g:link>

                    <p>FullName: ${friend.firstName} ${friend.lastName} </p>

                    <p>Date Of Birth: ${friend.dob} </p>

                    <g:form controller="friend" action="remove" method="post" onsubmit="return confirmAction()">
                        <g:hiddenField name="userId" value="${friend.id}"/>
                        <g:submitButton class="btn btn-default" name="removeFriendSubmit" value="REMOVE"/>
                    </g:form>
                </div>

            </div>

        </g:each>

    </div>

</div>