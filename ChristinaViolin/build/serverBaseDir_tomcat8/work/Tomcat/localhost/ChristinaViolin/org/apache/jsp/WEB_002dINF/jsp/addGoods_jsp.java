/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-24 16:30:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addGoods_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>添加商品</title>\r\n");
      out.write("\t <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/css/bootstrap.min.css\">\r\n");
      out.write("\t  <script src=\"stylesheet/jquery/jquery-3.2.1.js\"></script>\r\n");
      out.write("    <script src=\"stylesheet/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\t<div class=\"banner\">\r\n");
      out.write("\t\t<div class=\"span1\">\r\n");
      out.write("\t\t\tWelcome christinaviolin.com \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"span2\">\r\n");
      out.write("\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\tHi ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope[\"user_session\"][\"user_name\"]}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<span class=\"divider\"></span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"index\">[Sign out]</a> <span class=\"divider\"></span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t    \t<li>\r\n");
      out.write("\t\t   \t\t\t<a href=\"my_cart\">My cart</a> <span class=\"divider\"></span>\r\n");
      out.write("\t\t    \t</li>\r\n");
      out.write("\t\t    \t<li>\r\n");
      out.write("\t\t    \t\t<a href=\"my_order\">My order</a> <span class=\"divider\"></span>\r\n");
      out.write("\t\t    \t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"AllCol\">My collection</a> <span class=\"divider\"></span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Helpcenter</a> <span class=\"divider\"></span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"logo\">\r\n");
      out.write("\t\t<div class=\"span3\">\r\n");
      out.write("\t\t\t<img alt=\"Christina\" src=\"images/logo.png\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"span4\">\r\n");
      out.write("\t\t\t<form class=\"form-search\">\r\n");
      out.write("\t\t\t\t<input class=\"input-medium search-query\" type=\"text\" /> <button class=\"btn\" type=\"submit\"></button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"nav\">\r\n");
      out.write("\t\t<div class=\"span5\">\r\n");
      out.write("\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"content\">\r\n");
      out.write("\t\t<div class=\"span7\">\r\n");
      out.write("\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t<div class=\"span8\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"span9\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul >\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"alter-goods\">Management-Products</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"select_goods\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tFind Productions\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"addGoods\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tAdd Productions\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<ul >\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tManagement-Orders\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tOrder-detail\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<ul >\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tManagement-Users\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tAll Users\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t<div class=\"span12\">\r\n");
      out.write("\t\t\t<h2>添加商品</h2>\r\n");
      out.write("\t\t\t<form class=\"form-horizontal\" action=\"upload\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t <label class=\"control-label\" for=\"inputId\">goods_sn</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"inputId\" type=\"text\" name=\"goods_sn\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t <label class=\"control-label\" for=\"inputName\">goods_name</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"inputName\" type=\"text\" name=\"goods_name\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t <label class=\"control-label\" for=\"inputType\">type</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t<select size=\"1\" name=\"type\">\r\n");
      out.write("\t\t\t\t\t\t\t<option>1</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>2</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>3</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>4</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>5</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>6</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>7</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t说明：1(V-Junior)、2(V-Senior)、3(S-series)、4(EU-series)、5(EUMaster-series)、6(guita)、7(Bows)\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t <label class=\"control-label\" for=\"inputPrice\">price</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"inputPrice\" type=\"text\" name=\"price\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t <label class=\"control-label\" for=\"inputOther\">describe</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"inputOther\" type=\"text\" name=\"describe\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t <label class=\"control-label\" for=\"inputImage\">images(填写图片的名字，如：xx.jpg)</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>image1：<input type=\"file\" name=\"file\"></td> \r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>image2:<input type=\"file\" name=\"file\"></td> \r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>image3:<input type=\"file\" name=\"file\"></td> \r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>image4：<input type=\"file\" name=\"file\"></td> \r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t <label class=\"control-label\" for=\"inputType\">goods_status</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t<select size=\"1\" name=\"goods_status\">\r\n");
      out.write("\t\t\t\t\t\t\t<option>0</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>1</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t说明：0(已下架)、1(销售中)\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t <label class=\"control-label\" for=\"inputOther\">inventory</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"inputOther\" type=\"text\" name=\"inventory\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"spanx\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!--  <button class=\"btn btn-danger\" type=\"submit\" formaction=\"add_Goods\" formmethod=\"post\">Submit</button>-->\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Submit\"/>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t<img alt=\"140x140\" src=\"images/christinaviolinfooter.jpg\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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
