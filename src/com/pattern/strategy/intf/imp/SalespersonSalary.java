package com.pattern.strategy.intf.imp;

import com.pattern.consts.Consts;
import com.pattern.strategy.intf.SalaryStrategy;

public class SalespersonSalary implements SalaryStrategy {

	public static final String roleBinding = Consts.Salesperson;
	private double fixedSalary = 0;
	private double hourlysalary = 40;
	private double commissionRate = 0;
	private double basicSalary = 0;

	// 工资金额
	public double calcSalary(double workload, Object params) {
		return 0;
	}

	// 加班工资,销售员没有加班工资，故这里注释掉
//	private double calcOvertimeSalary() {
//		return 0;
//	}

	private static class SingletonHolder {
		private static final SalespersonSalary instance = new SalespersonSalary();
	}

	public static SalespersonSalary getInstance() {
		return SingletonHolder.instance;
	}
}
