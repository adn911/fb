<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Friends Page</title>
</head>
<body>

<div class="container">

    <div class="row">

        <div class="col-md-6 col-md-offset-3">
              <g:render template="/templates/friendsListPanel"></g:render>
              <g:link controller="friend" action="showAddable" class="btn btn-primary">add New Friend</g:link>
        </div>

        <div>

        </div>
    </div>
</div>

</body>
</html>