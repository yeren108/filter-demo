package com.yeren.filter.filter.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExServlet extends HttpServlet {  
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        this.doPost(request, response);  
    }  
	
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        TestService t = new TestService();  
        t.add();//模拟调用业务层方法，在此方法内抛出异常，此异常会在filter中进行捕获。  
    }  
  
}  