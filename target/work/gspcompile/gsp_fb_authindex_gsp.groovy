import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_fb_authindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/auth/index.gsp" }
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
if(true && (error)) {
printHtmlPart(5)
expressionOut.print(error)
printHtmlPart(6)
}
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
invokeTag('textField','g',28,['name':("email"),'id':("email"),'class':("form-control"),'placeholder':("Email")],-1)
printHtmlPart(9)
invokeTag('passwordField','g',29,['name':("password"),'id':("password"),'class':("form-control"),'placeholder':("Password")],-1)
printHtmlPart(10)
invokeTag('submitButton','g',30,['name':("loginSubmit"),'class':("form-control btn btn-info"),'value':("login")],-1)
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',33,['controller':("signUp")],3)
printHtmlPart(13)
})
invokeTag('form','g',35,['action':("login"),'method':("POST")],2)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',48,[:],1)
printHtmlPart(15)
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
