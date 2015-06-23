<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Grails Facebook"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-retina.png')}">

        <asset:stylesheet src="bootstrap.css"/>
        <asset:stylesheet src="custom.css"/>
        <asset:javascript src="bootstrap.js"/>
		<g:layoutHead/>
	</head>
	<body>

    <div id="header" class="clearfix">

        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">

            <div class="container-fluid">

                <div class="navbar-header">

                    <button type="button" class="navbar-toggle collapsed"
                            data-toggle="collapse" data-target="#navbar" aria-expanded="false"
                            aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span> <span
                            class="icon-bar"></span> <span class="icon-bar"></span> <span
                            class="icon-bar"></span>
                    </button>

                    <a class="navbar-brand" href="#">FB</a>

                </div>

                <div id="navbar" class="collapse navbar-collapse mynavbar">

                    <ul class="nav navbar-nav ">

                        <li><g:link controller="home">home</g:link></li>
                        <li><g:link controller="profile">profile</g:link> </li>
                        <li><g:link controller="friends">friends</g:link> </li>

                    </ul>

                    <g:if test="${!user}">
                        <span class="pull-right" style="margin-top: -80px;">
                            <g:link controller="auth" action="logout" class="btn btn-primary">logout</g:link>
                        </span>
                    </g:if>

                    <g:if test="${user}">
                        <span class="pull-right" style="margin-top: -80px;">
                            <g:link controller="auth" action="login" class="btn btn-primary">Login</g:link>
                            <g:link controller="signup" class="btn btn-primary">Signup</g:link>
                        </span>
                    </g:if>


                </div>
                <!--/.nav-collapse -->

            </div>
        </nav>

    </div>



        <g:layoutBody/>

    <div id="footer" class="clearfix">

        <nav class="navbar navbar-default footer" role="navigation">

            <div class="container-fluid">

                <p class="text-center"></p>
                <!--/.nav-collapse -->

            </div>

        </nav>

    </div>


    </body>
</html>
