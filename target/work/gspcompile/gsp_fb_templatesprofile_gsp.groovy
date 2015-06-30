import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_fb_templatesprofile_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/templates/profile.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(user.profilePicture)
printHtmlPart(1)
expressionOut.print(user.profilePicture)
printHtmlPart(2)
if(true && (posts)) {
printHtmlPart(3)
for( post in (posts) ) {
printHtmlPart(4)
invokeTag('render','g',23,['template':("/templates/postPanel"),'model':([post:post])],-1)
printHtmlPart(4)
for( comment in (post.comments) ) {
printHtmlPart(5)
invokeTag('render','g',33,['template':("/templates/commentPanel"),'model':([comment:comment])],-1)
printHtmlPart(6)
}
printHtmlPart(4)
invokeTag('render','g',37,['template':("/templates/commentInputBox"),'model':([post:post])],-1)
printHtmlPart(7)
}
printHtmlPart(8)
}
printHtmlPart(9)
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
