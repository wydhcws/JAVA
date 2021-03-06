package com.atguigu.exer;

/*
 * 创建Account类的一个子类CheckAccount代表可透支的账户，
 * 该账户中定义一个属性overdraft代表可透支限额。在CheckAccount类中重写withdraw方法，
 * 其算法如下：
 如果（取款金额<账户余额），
 可直接取款
 如果（取款金额>账户余额），
 计算需要透支的额度
 判断可透支额overdraft是否足够支付本次透支需要，如果可以
 将账户余额修改为0，冲减可透支金额
 如果不可以
 提示用户超过可透支额的限额

 */
public class CheckAccount extends Account {
	private double overdraft;// 可透支额度

	
	public double getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	public CheckAccount(int id, double init_balance, double annualIterestRate,
			double overdraft) {
		super(id, init_balance, annualIterestRate);
		this.overdraft = overdraft;
	}
	//存在透支额度的取钱的操作
	public void withdraw (double amount){
		if(balance >= amount){
			balance -= amount;
		}else if(overdraft >= amount - balance){
			overdraft -= (amount - balance);
			balance = 0;
		}else{
			System.out.println("超过可透支额的限额");
		}
	}
}
