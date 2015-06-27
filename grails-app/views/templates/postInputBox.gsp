<div class="col-md-6 col-md-offset-3">

    <div class="panel panel-info">
        <%-- <div class="panel-heading">Post Status</div>--%>
        <div class="panel-body">
            <g:form controller="post" action="addPost" method="POST">
                <g:textArea class="form-control" rows="2" name="postContent" placeholder="Post Status.."
                          required="required"></g:textArea>
                <g:submitButton class="btn btn-default pull-right" name="postSubmit" value="post"/>
            </g:form>
        </div>
    </div>

    <hr class="divider">
</div>