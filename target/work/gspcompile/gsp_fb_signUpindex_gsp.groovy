import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_fb_signUpindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/signUp/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
if(true && (params.error)) {
printHtmlPart(6)
expressionOut.print(params.error)
printHtmlPart(7)
createTagBody(3, {->
printHtmlPart(8)
createTagBody(4, {->
printHtmlPart(9)
invokeTag('message','g',25,['error':(error)],-1)
printHtmlPart(10)
})
invokeTag('eachError','g',26,['bean':(user),'var':("error")],4)
printHtmlPart(11)
})
invokeTag('hasErrors','g',26,['bean':(user)],3)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (flash.success)) {
printHtmlPart(14)
expressionOut.print(flash.success)
printHtmlPart(15)
}
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(11)
invokeTag('textField','g',48,['name':("username"),'id':("username"),'class':("form-control"),'placeholder':("Enter Username")],-1)
printHtmlPart(17)
invokeTag('textField','g',49,['name':("email"),'id':("email"),'class':("form-control"),'placeholder':("Enter Email")],-1)
printHtmlPart(17)
invokeTag('passwordField','g',50,['name':("password"),'id':("password"),'class':("form-control"),'placeholder':("Enter Password")],-1)
printHtmlPart(18)
invokeTag('datePicker','g',53,['name':("dob"),'id':("dob"),'precision':("day"),'style':("padding: 10px;")],-1)
printHtmlPart(19)
invokeTag('textField','g',57,['name':("firstName"),'id':("firstName"),'class':("form-control"),'placeholder':("Enter FirstName")],-1)
printHtmlPart(17)
invokeTag('textField','g',58,['name':("lastName"),'id':("lastName"),'class':("form-control"),'placeholder':("Enter lastName")],-1)
printHtmlPart(20)
invokeTag('submitButton','g',61,['name':("signUpSubmit"),'value':("submit"),'class':("btn btn-info")],-1)
printHtmlPart(21)
createClosureForHtmlPart(22, 3)
invokeTag('link','g',61,['controller':("auth"),'class':("btn")],3)
printHtmlPart(23)
})
invokeTag('form','g',63,['action':("signUp"),'enctype':("multipart/form-data")],2)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(25)
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
