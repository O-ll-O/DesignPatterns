package com.pattern.consts;

import java.util.HashMap;
import java.util.Map;

public class Consts {

	// 这里是角色定义的地方，如果需要扩展，可以在这里定义，并在角色工厂roleFactory中注册
	public static final String Manager = "Manager";
	public static final String Hourly = "Hourly";
	public static final String Salesperson = "Salesperson";
	// 用户转角色
	public static final Map<String, String> User2Role = new HashMap<String, String>();
	static {
		User2Role.put("Lisa", Manager);
		User2Role.put("Alex", Hourly);
		User2Role.put("Jack", Hourly);
		User2Role.put("Leo", Salesperson);
	}
}
