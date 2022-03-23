package com.pattern.factory;

import java.util.HashMap;
import java.util.Map;

import com.pattern.strategy.intf.SalaryStrategy;
import com.pattern.strategy.intf.imp.HourlySalary;
import com.pattern.strategy.intf.imp.ManagerSalary;
import com.pattern.strategy.intf.imp.SalespersonSalary;

public class RoleFactory {
	// 这里是单例模式，一个角色只对应一个策略，是一个单例注册表，用于解耦用户和工资计算
	private static Map<String, SalaryStrategy> roleRegister = new HashMap<String, SalaryStrategy>();
	static {

		// 这里可以也可以用java 反射获取类并实例化类，通过接口查找继承类并实例化，可以做到动态注入，这个上次有人问了，你就做一做。
		roleRegister.put(ManagerSalary.roleBinding, ManagerSalary.getInstance());
		roleRegister.put(HourlySalary.roleBinding, ManagerSalary.getInstance());
		roleRegister.put(SalespersonSalary.roleBinding, new SalespersonSalary());
	}

	public static SalaryStrategy getStrategy(String role) {
		return roleRegister.get(role);

	}
}
