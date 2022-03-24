package com.pattern.strategy.intf.imp;

import com.pattern.consts.Consts;
import com.pattern.factory.RoleFactory;
import com.pattern.strategy.intf.SalaryStrategy;

public class OtherSalary implements SalaryStrategy {
	public static final String roleBinding = Consts.Other;// 该策略绑定的角色
	private double fixedSalary = 0;// 固定工资
	private double hourlysalary = 40;// 时薪
	private double commissionRate = 0;// 提成率
	private double basicSalary = 0;// 底薪

	private OtherSalary() {
	};

	public double calcSalary(double workload, Object params) {
		return 0 + calcOvertimeSalary();
	}

	private double calcOvertimeSalary() {
		return 0;
	}

	private static class SingletonHolder {
		private static final OtherSalary instance = new OtherSalary();
	}

	static {
		OtherSalary instance = SingletonHolder.instance;
		RoleFactory.registerStrategy(instance.roleBinding, instance);
	}

}
