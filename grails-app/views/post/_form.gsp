<%@ page import="fb.Post" %>



<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'comments', 'error')} ">
	<label for="comments">
		<g:message code="post.comments.label" default="Comments" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${postInstance?.comments?}" var="c">
    <li><g:link controller="comment" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="comment" action="create" params="['post.id': postInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'comment.label', default: 'Comment')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'content', 'error')} required">
	<label for="content">
		<g:message code="post.content.label" default="Content" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="content" required="" value="${postInstance?.content}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'dateTime', 'error')} required">
	<label for="dateTime">
		<g:message code="post.dateTime.label" default="Date Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dateTime" precision="day"  value="${postInstance?.dateTime}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'likes', 'error')} ">
	<label for="likes">
		<g:message code="post.likes.label" default="Likes" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${postInstance?.likes?}" var="l">
    <li><g:link controller="like" action="show" id="${l.id}">${l?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="like" action="create" params="['post.id': postInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'like.label', default: 'Like')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'user', 'error')} required">
	<label for="user">
		<g:message code="post.user.label" default="User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user" name="user.id" from="${fb.User.list()}" optionKey="id" required="" value="${postInstance?.user?.id}" class="many-to-one"/>

</div>

