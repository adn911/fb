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
            <g:if test="${!session.user}">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#" style="color: #428bca;">Mini-Facebook</a>
                </div>
            </g:if>
        </div>
        <div id="navbar" class="collapse navbar-collapse mynavbar">

            <ul class="nav navbar-nav">

                <g:if test="${session.user}">

                    <li><g:link controller="home">Home</g:link></li>
                    <li><g:link controller="profile" id="${session.user.id}">Profile</g:link></li>
                    <li><g:link controller="friends">friends</g:link></li>
                    <li><g:link controller="auth" action="logout">logout</g:link></li>

                </g:if>

            </ul>

        </div>
        <!--/.nav-collapse -->

    </div>
</nav>
