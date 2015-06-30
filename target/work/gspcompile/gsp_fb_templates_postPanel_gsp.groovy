import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_fb_templates_postPanel_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/templates/_postPanel.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
expressionOut.print(post.user.username)
})
invokeTag('link','g',8,['controller':("profile"),'id':(post.user.id)],1)
printHtmlPart(1)
expressionOut.print(post.dateTime)
printHtmlPart(2)
expressionOut.print(post.user.id)
printHtmlPart(3)
if(true && (post.user.id == session.user.id)) {
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('hiddenField','g',16,['name':("postId"),'value':(post.id)],-1)
printHtmlPart(6)
})
invokeTag('form','g',19,['controller':("post"),'action':("remove"),'method':("post"),'onsubmit':("return confirmAction()")],2)
printHtmlPart(2)
}
printHtmlPart(7)
expressionOut.print(post.content)
printHtmlPart(8)
expressionOut.print(post.postLikes.size())
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('hiddenField','g',26,['name':("postId"),'value':(post.id)],-1)
printHtmlPart(9)
})
invokeTag('form','g',30,['controller':("like"),'action':("add"),'method':("post")],1)
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
