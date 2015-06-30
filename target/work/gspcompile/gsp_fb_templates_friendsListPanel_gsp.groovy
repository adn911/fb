import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_fb_templates_friendsListPanel_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/templates/_friendsListPanel.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
for( friend in (friends) ) {
printHtmlPart(1)
expressionOut.print(createLink(controller: "image", action: "showProfilePhoto", id: "${friend.id}"))
printHtmlPart(2)
createTagBody(2, {->
expressionOut.print(friend.username)
})
invokeTag('link','g',22,['controller':("profile"),'id':(friend.id)],2)
printHtmlPart(3)
expressionOut.print(friend.firstName)
printHtmlPart(4)
expressionOut.print(friend.lastName)
printHtmlPart(5)
expressionOut.print(friend.dob)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('hiddenField','g',31,['name':("userId"),'value':(friend.id)],-1)
printHtmlPart(7)
invokeTag('submitButton','g',32,['class':("btn btn-default"),'name':("removeFriendSubmit"),'value':("REMOVE")],-1)
printHtmlPart(8)
})
invokeTag('form','g',32,['controller':("friend"),'action':("remove"),'method':("post"),'onsubmit':("return confirmAction()")],2)
printHtmlPart(9)
}
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435686841000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
