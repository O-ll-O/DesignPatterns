package com.pattern.strategy.intf.imp;

import com.pattern.consts.Consts;
import com.pattern.strategy.intf.SalaryStrategy;

public class HourlySalary implements SalaryStrategy {
	public static final String roleBinding = Consts.Hourly;
	private double fixedSalary = 0;
	private double hourlysalary = 40;
	private double commissionRate = 0;
	private double basicSalary = 0;

	public double calcSalary(double workload, Object params) {
		return 0 + calcOvertimeSalary();// 基础工资+加班工资
	}

	// 加班工资
	private double calcOvertimeSalary() {
		return 0;
	}

	// SingletonHolder 是一个静态内部类，当外部类 HourlySalary 被加载的时候，并不会创建 SingletonHolder 实例对象。
	// 只有当调用 getInstance() 方法时，SingletonHolder 才会被加载，这个时候才会创建 instance。instance
	// 的唯一性、创建过程的线程安全性，都由 JVM 来保证。所以，这种实现方法既保证了线程安全，又能做到延迟加载。
	private static class SingletonHolder {
		private static final HourlySalary instance = new HourlySalary();
	}

	public static HourlySalary getInstance() {
		return SingletonHolder.instance;
	}

}
