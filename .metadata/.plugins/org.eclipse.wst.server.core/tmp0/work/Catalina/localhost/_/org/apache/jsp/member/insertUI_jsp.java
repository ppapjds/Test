/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.103
 * Generated at: 2020-05-16 13:29:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hrd.member.domain.MemberDTO;
import java.util.List;

public final class insertUI_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmax-height: 1300px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tpadding: 0 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table, th, td {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction sumbitFunction() {\r\n");
      out.write("\t\tvar form = document.form;\r\n");
      out.write("\t\tvar inputs = form.querySelectorAll(\"input\");\r\n");
      out.write("\t\tvar ths = form.querySelectorAll(\"th\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor ( var index in inputs) {\r\n");
      out.write("\t\t\tvar th = ths[index];\r\n");
      out.write("\t\t\tvar input = inputs[index];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif (input.type != \"text\") {\r\n");
      out.write("\t\t\t\tcontinue;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar value = input.value;\r\n");
      out.write("\t\t\tvar target = th.innerHTML;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif (nullAndBlankCheck(value)) {\r\n");
      out.write("\t\t\t\talert(target + \"의 값을 확인해 주세요.\");\r\n");
      out.write("\t\t\t\tinput.focus();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction nullAndBlankCheck(value) {\r\n");
      out.write("\t\treturn value === null || value === undefined || value === '';\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction valueSet(self){\r\n");
      out.write("\t\tif(nullAndBlankCheck(self.value) ){\r\n");
      out.write("\t\t\talert(\"값을 입력해 주세요.\");\r\n");
      out.write("\t\t\tself.focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t/* \tvar arr = self.value.split(/[0-9]/g);\r\n");
      out.write("\t\tvar alertText = \"####-##-## 형식으로 입력해 주세요.\";\r\n");
      out.write("\t\t \r\n");
      out.write("\t\tif(arr.length > -1){\r\n");
      out.write("\t\t\tfor(var index in arr){\r\n");
      out.write("\t\t\t\tconsole.log(arr[index]);  \r\n");
      out.write("\t\t\t\tif(arr[index] != \"-\"){\r\n");
      out.write("\t\t\t\t\tself.focus(); \r\n");
      out.write("\t\t\t\t\talert(alertText); \r\n");
      out.write("\t\t\t\t\tself.value = \"\";\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t */\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar value = self.value.replace(/[^0-9]/g,\"\");\r\n");
      out.write("\t\tvar form = document.form;\r\n");
      out.write("\t\tvar teg = form.querySelector(\"input[name='joindate']\");\r\n");
      out.write("\t\tteg.value = value;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
 
 	int custno = Integer.valueOf(String.valueOf(request.getAttribute("custno"))); 
 	
 
      out.write("\r\n");
      out.write("\t<header style=\"background-color: blue; width: 100%; height: 15%;\">\r\n");
      out.write("\t\t<h1 style=\"color: white; text-align: center; padding-top: 50px;\">쇼핑몰\r\n");
      out.write("\t\t\t회원관리 ver1.0</h1>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<nav style=\"background-color: red; height: 5%;\">\r\n");
      out.write("\t\t<div class=\"menu\">\r\n");
      out.write("\t\t\t<a href=\"/member/insertUI.do\"><strong>회원 가입</strong></a> <a\r\n");
      out.write("\t\t\t\thref=\"/member/list.do\"><strong>회원목록 수정/삭제</strong></a> <a href=\"\"><strong>회원\r\n");
      out.write("\t\t\t\t\t매출 조회</strong></a> <a href=\"/\"><strong>홈으로</strong></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<section style=\"background-color: green; height: 800px\">\r\n");
      out.write("\t\t<h1 style=\"padding: 10px; text-align: center;\">회원목록조회/수정</h1>\r\n");
      out.write("\t\t<form action=\"/member/insert.do\" method=\"post\" name=\"form\">\r\n");
      out.write("\t\t\t<table style=\"width: 50%\"> \r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>회원번호</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"custno\" value=\"");
      out.print(custno );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\treadonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>회원이름</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"custname\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>전화번호</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"phone\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>주소</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"address\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>가입일자</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"date\" onchange=\"valueSet(this)\"/>\r\n");
      out.write("\t\t\t\t\t\t<input type = \"hidden\" name=\"joindate\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>고객등급</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"grade\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>거주지역</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"city\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"2\"><input type=\"button\" value=\"회원가입\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"sumbitFunction()\" /> <input type=\"button\" value=\"조회\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"location.href='/member/list.do'\" /></th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\t<footer> </footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
