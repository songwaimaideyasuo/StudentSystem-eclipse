package com.window;
import com.mysqld.Mysqld;
/*日期：2021年1月2日
 * 创作者:B站up主 翘凳子
 * QQ:3058333641
 * 当前类负责，调用开始的图形界面
 * */
public class StudentSystem {
	public static LoginStart loginstartA;

	public static void main(String[] args) {
		
		show();
		
	}
	static public  void show() {
		LoginStart loginstart=new LoginStart();//初始化构造方法
		loginstartA=loginstart;
		Mysqld a=new Mysqld("root","123456");//数据库账号 和密码
		Manage aa=new Manage();
	}

}
