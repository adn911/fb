import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_fb_templates_addableFriendsListPanel_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/templates/_addableFriendsListPanel.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
for( user in (usersNotFriends) ) {
printHtmlPart(1)
expressionOut.print(createLink(controller: "image", action: "showProfilePhoto", id: "${user.id}"))
printHtmlPart(2)
expressionOut.print(user.username)
printHtmlPart(3)
expressionOut.print(user.firstName)
printHtmlPart(4)
expressionOut.print(user.lastName)
printHtmlPart(5)
expressionOut.print(user.dob)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
expressionOut.print(user.id)
printHtmlPart(8)
})
invokeTag('form','g',33,['controller':("friend"),'action':("add"),'method':("post")],2)
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
