<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Grails Mini Facebook"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-retina.png')}">

        <asset:stylesheet src="bootstrap.css"/>
        <asset:stylesheet src="styles.css"/>
        <asset:javascript src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"/>
        <asset:javascript src="bootstrap.js"/>
		<g:layoutHead/>
	</head>
	<body>

    <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed"
                        data-toggle="collapse" data-target="#navbar" aria-expanded="false"
                        aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span> <span
                        class="icon-bar"></span> <span class="icon-bar"></span> <span
                        class="icon-bar"></span>
                </button>
                <g:if test="${!user}">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#" style="color: #428bca;">Mini-Facebook</a>
                    </div>
                </g:if>
            </div>
            <div id="navbar" class="collapse navbar-collapse mynavbar">

                <ul class="nav navbar-nav">

                    <g:if test="${user}">

                        <li><g:link controller="home">Home</g:link></li>
                        <li><g:link controller="profile" id="${user.id}">Profile</g:link></li>
                        <li><g:link controller="friends">friends</g:link></li>
                        <li><g:link controller="auth" action="logout">logout</g:link></li>

                    </g:if>

                </ul>

            </div>
            <!--/.nav-collapse -->

        </div>
    </nav>

        <g:layoutBody/>

        <!-- Bootstrap core JavaScript
================================================== -->
 %{--       <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="/FacebookSpringJpa/resources/js/bootstrap.min.js"></script>--}%
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <!-- <script src="view/js/ie10-viewport-bug-workaround.js"></script> -->


    <script>
        function confirmAction() {
            var confirmed = confirm("Are you sure?");
            return confirmed;
        }

    </script>
    </body>
</html>