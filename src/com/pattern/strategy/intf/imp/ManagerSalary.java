package com.pattern.strategy.intf.imp;

import com.pattern.consts.Consts;
import com.pattern.strategy.intf.SalaryStrategy;

public class ManagerSalary implements SalaryStrategy {
	public static final String roleBinding = Consts.Manager;// 该策略绑定的角色
	private double fixedSalary = 0;// 固定工资
	private double hourlysalary = 40;// 时薪
	private double commissionRate = 0;// 提成率
	private double basicSalary = 0;// 底薪

	private ManagerSalary() {
	};

	public double calcSalary(double workload, Object params) {
		return 0 + calcOvertimeSalary();
	}

	private double calcOvertimeSalary() {
		return 0;
	}

	// 通过静态内部类实现单例模式，另外还有双重检查锁 懒汉式 饿汉式 总共四种方式各有优缺点具体网上百度理解加深记忆通过这些关键词查找
	// SingletonHolder 是一个静态内部类，当外部类 HourlySalary 被加载的时候，并不会创建 SingletonHolder 实例对象。
	// 只有当调用 getInstance() 方法时，SingletonHolder 才会被加载，这个时候才会创建 instance。instance
	// 的唯一性、创建过程的线程安全性，都由 JVM 来保证。所以，这种实现方法既保证了线程安全，又能做到延迟加载。
	private static class SingletonHolder {
		private static final ManagerSalary instance = new ManagerSalary();
	}

	public static SalaryStrategy getInstance() {
		return SingletonHolder.instance;
	}
}
