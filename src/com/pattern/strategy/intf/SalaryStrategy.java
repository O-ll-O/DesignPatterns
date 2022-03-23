package com.pattern.strategy.intf;

// 这里用到的是策略模式，实现类分别实现自己的工资的计算方法
public interface SalaryStrategy {
	// 如果是经理或者临时工，则代表的 工时，如果是销售人员，则代表的是销售额,params 目前没用，用于后续扩展
	public double calcSalary(double workload, Object params);

}
