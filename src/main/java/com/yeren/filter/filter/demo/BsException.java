package com.yeren.filter.filter.demo;

/** 
 * 业务异常类 
 * @author ajun 
 * @http://blog.csdn.net/ajun_studio 
 */  
public class BsException extends RuntimeException {  
  
    //异常代码  
    private String key;  
      
    private Object[] values;//一些其他信息  
      
    public BsException() {  
        super();  
    }  
  
    public BsException(String message, Throwable throwable) {  
        super(message, throwable);  
    }  
  
    public BsException(String message) {  
        super(message);  
    }  
  
    public BsException(Throwable throwable) {  
        super(throwable);  
    }  
      
    public BsException(String message,String key){  
        super(message);  
        this.key = key;  
    }  
      
    public BsException(String message,String key,Object value){  
        super(message);  
        this.key = key;  
        this.values = new Object[]{value};  
    }  
      
    public BsException(String message,String key,Object[] values){  
        super(message);  
        this.key = key;  
        this.values = values;  
    }  
  
    public String getKey() {  
        return key;  
    }  
  
    public Object[] getValues() {  
        return values;  
    }  
}  
