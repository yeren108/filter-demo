package com.yeren.filter.filter.demo;

public class TestService {  
	  
    public void add(){  
          
        System.out.println("add () was called!!");  
        if(true){  
            throw new BsException("in add() throws exception!!");//抛出异常，根据你的业务逻辑  
        }  
    }  
}  
