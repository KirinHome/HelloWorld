package com.lxk.aopJdk.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInterceptor implements InvocationHandler{
	private Object target;
	private Transaction transaction;
	
	public MyInterceptor(Object target,Transaction transaction){
		this.target = target;
		this.transaction = transaction;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		if(method.getName().equals("updatePerson")
				||method.getName().equals("savePerson")
				||method.getName().equals("deletePerson")){
			this.transaction.beginTransaction();
			method.invoke(this.target, args);
			this.transaction.commit();
			return null;
		}else{
			return method.invoke(this.target, args);
		}
	}

}
