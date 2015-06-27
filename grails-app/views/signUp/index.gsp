<%--
  Created by IntelliJ IDEA.
  User: bakhtiar.galib
  Date: 6/24/15
  Time: 12:21 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SignUp Page</title>
</head>
<body>

<div class="container-fluid">

    <div class="row">

        <div class="col-md-6 col-md-offset-3" style="margin-top: 20px;">

            <g:if test="${params.error}">
                    <div class="alert alert-danger" role="alert">${params.error}.
                        <g:hasErrors bean="${user}">
                                <g:eachError bean="${user}" var="error">
                                    <li><g:message error="${error}"/></li>
                                </g:eachError>
                        </g:hasErrors>
                    </div>
            </g:if>

            <g:if test="${flash.success}">
                <div class="alert alert-success" role="alert">${flash.success}.
                </div>
            </g:if>



            <div class="panel panel-info">

                <div class="panel-heading">
                    <h3 class="panel-title text-center">Signup</h3>
                </div>

                <div class="panel-body">

                    <g:form action="signUp">
                        <g:textField name="username" id="username" class="form-control" placeholder="Enter Username"/> <br>
                        <g:textField name="email" id="email" class="form-control" placeholder="Enter Email"/> <br>
                        <g:passwordField name="password" id="password" class="form-control" placeholder="Enter Password"/> <br>

                        <div class="form-control">
                            <p style="display: inline-block">Date Of Birth:  </p> &nbsp;&nbsp;<g:datePicker name="dob" id="dob" precision="day"  style="padding: 10px;" /> <br>
                        </div>

                        <br>
                        <g:textField name="firstName" id="firstName" class="form-control" placeholder="Enter FirstName"/> <br>
                        <g:textField name="lastName" id="lastName" class="form-control" placeholder="Enter lastName"/> <br>

                        <g:submitButton name="signUpSubmit" value="submit" class="btn btn-default"/>
                    </g:form>

                </div>

            </div>

        </div>

    </div>

</div>
</body>
</html>