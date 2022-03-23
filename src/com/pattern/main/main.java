package com.pattern.main;

import com.pattern.consts.Consts;
import com.pattern.entity.Department;
import com.pattern.entity.Employee;
import com.pattern.factory.RoleFactory;
import com.pattern.strategy.intf.SalaryStrategy;

/*
 * 
 * 请为 XX 公司设计一套工资计算系统。
XX 公司有三种类型的雇工， 不同类型的员工有不同的工资计算方式， 具体薪资计算规则如下。
• 小时工，每小时薪资为 40 元。
• 经理，每小时薪资为 60 元，每月工作满 150 小时就可以得到全额工资 10000 元。如果工作不满 150 小时，则按照
实际工作时间和时薪计算工资
• 销售人员， 基础工资为每月 3000，每月基础销售额应为 20000，如果销售额为 20000-30000，则超出部分（超出
20000 部分）提成率为 5%，如果销售额为 30000 及以上，则超出部分（超出 20000 部分）提成率为 8%。
• 加班工资计算规则。 对于小时工和经理，当他们每月工作超过 160 小时，则超出部分时长按照时薪 1.3 倍计算工资
请注意：
1. 员工的固定工资，时薪，提成率和底薪都可能会调整。
2. 员工类型可能会增加。
3. 加班规则和其适用的雇员规则都可能变化，比如小时工或者经理可能不再计算加班工资
公司现有雇员如下：
经理: Lisa
小时工：Alex, Jack
销售人员：Leo
请设计程序解析以下 xml 数据，并计算 9 月和 10 月份，公司应支付员工工资总额。最终结果应该四舍五入为两位小
数。
<department>
<month value="9">
<employee name="Lisa" workingHours="145"/>
<employee name="Alex" workingHours="170.5"/>
<employee name="Leo" amount="34100.8"/>
</month>
<month value="10">
<employee name="Lisa" workingHours="165"/>
<employee name="Alex" workingHours="155.75"/>
<employee name="Jack" workingHours ="188.25"/>
<employee name="Leo" amount ="23500.7"/>
</month>
</department>*/
public class main {
	// 通过用户转角色，通过角色拿到工资计算的对象，通过工资计算的对象计算工资的多少，最后汇总输出
	public static void main(String args[]) {
		// TODO 解析xml 会用到java NIO
		Department dp = new Department();
		Employee lisa = new Employee();
		lisa.name = "Lisa";
		lisa.workload = 145.0;
		String role = Consts.User2Role.get(lisa.name);
		SalaryStrategy strategy = RoleFactory.getStrategy(role);
		double salary = strategy.calcSalary(lisa.workload, null);
		// TODO 计算所有人的薪水并输出
	}
}
