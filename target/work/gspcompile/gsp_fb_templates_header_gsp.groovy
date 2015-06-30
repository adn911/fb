import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_fb_templates_header_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/templates/_header.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (!session.user)) {
printHtmlPart(1)
}
printHtmlPart(2)
if(true && (session.user)) {
printHtmlPart(3)
createClosureForHtmlPart(4, 2)
invokeTag('link','g',23,['controller':("home")],2)
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('link','g',24,['controller':("profile"),'id':(session.user.id)],2)
printHtmlPart(5)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',25,['controller':("friend")],2)
printHtmlPart(5)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',26,['controller':("auth"),'action':("logout")],2)
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
