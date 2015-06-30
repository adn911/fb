<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Login Page</title>
</head>
<body>

<div class="container-fluid">

    <div class="row">

        <div class="col-md-4 col-md-offset-4" style="margin-top: 20px;">

            <g:if test="${error}">
                <div class="alert alert-danger" role="alert">${error}.</div>
            </g:if>

            <div class="panel panel-info">

                <div class="panel-heading">
                    <h3 class="panel-title text-center">Login</h3>
                </div>

                <div class="panel-body">

                    <g:form action="login" method="POST">
                         <g:textField name="email" id="email" class="form-control" placeholder="Email" /><br>
                         <g:passwordField name="password" id="password" class="form-control" placeholder="Password" /> <br>
                         <g:submitButton name="loginSubmit" class="form-control btn btn-info" value="login"/> <br>

                        <div class="text-center">
                           <g:link controller="signUp">Don't have an account? signup</g:link>
                        </div>
                    </g:form>

                </div>
            </div>


        </div>


    </div>

</div>

</body>
</html>