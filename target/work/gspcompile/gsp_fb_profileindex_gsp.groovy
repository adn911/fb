import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_fb_profileindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/profile/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('include','g',13,['view':("/templates/_postInputBox.gsp")],-1)
printHtmlPart(5)
if(true && (posts)) {
printHtmlPart(6)
for( post in (posts) ) {
printHtmlPart(7)
invokeTag('render','g',25,['template':("/templates/postPanel"),'model':([post:post])],-1)
printHtmlPart(7)
for( comment in (post.postComments) ) {
printHtmlPart(8)
invokeTag('render','g',28,['template':("/templates/commentPanel"),'model':([comment:comment])],-1)
printHtmlPart(9)
}
printHtmlPart(7)
invokeTag('render','g',31,['template':("/templates/commentInputBox"),'model':([post:post])],-1)
printHtmlPart(10)
}
printHtmlPart(11)
}
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',44,[:],1)
printHtmlPart(13)
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
