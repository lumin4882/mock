package com.benben;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class proxymock
 */
public class proxymock extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public proxymock() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String requestUrl = request.getRequestURL().toString();//得到请求的URL地址
	       String requestUri = request.getRequestURI();//得到请求的资源
	       String queryString = request.getQueryString();//得到请求的URL地址中附带的参数
	       String remoteAddr = request.getRemoteAddr();//得到来访者的IP地址
	       String remoteHost = request.getRemoteHost();
	       int remotePort = request.getRemotePort();
	       String remoteUser = request.getRemoteUser();
	       String method = request.getMethod();//得到请求URL地址时使用的方法
	       String pathInfo = request.getPathInfo();
	       String localAddr = request.getLocalAddr();//获取WEB服务器的IP地址
	       String localName = request.getLocalName();//获取WEB服务器的主机名
	       
	       Enumeration<String> reqHeadInfos = request.getHeaderNames();//获取所有的请求头
	     
	       while (reqHeadInfos.hasMoreElements()) {
	           String headName = (String) reqHeadInfos.nextElement();
	           String headValue = request.getHeader(headName);//根据请求头的名字获取对应的请求头的值
	           System.out.println(headName + headValue);
	       }

	       String headValue1  =request.getHeader("connection");
	       System.out.println("headValue1==" + headValue1);
	       
	       String userid = request.getParameter("userid");//获取填写的编号
	       System.out.println("userid==" + userid);
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
		   response.getWriter().append("Served at: ").append(request.getContextPath());
		   response.setCharacterEncoding("UTF-8");//设置将字符以"UTF-8"编码输出到客户端浏览器
	       //通过设置响应头控制浏览器以UTF-8的编码显示数据，如果不加这句话，那么浏览器显示的将是乱码
	       response.setHeader("content-type", "text/html;charset=UTF-8");
	       PrintWriter out = response.getWriter();
	       out.write("获取到的客户机信息如下：");
	       out.write("<hr/>");
	       out.write("请求的URL地址："+requestUrl);
	       out.write("<br/>");
	       out.write("请求的资源："+requestUri);
	       out.write("<br/>");
	       out.write("请求的URL地址中附带的参数："+queryString);
	       out.write("<br/>");
	       out.write("来访者的IP地址："+remoteAddr);
	       out.write("<br/>");
	       out.write("来访者的主机名："+remoteHost);
	       out.write("<br/>");
	       out.write("使用的端口号："+remotePort);
	       out.write("<br/>");
	       out.write("remoteUser："+remoteUser);
	       out.write("<br/>");
	       out.write("请求使用的方法："+method);
	       out.write("<br/>");
	       out.write("pathInfo："+pathInfo);
	       out.write("<br/>");
	       out.write("localAddr："+localAddr);
	       out.write("<br/>");
	       out.write("localName："+localName);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
