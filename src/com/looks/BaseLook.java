package com.looks;

import java.util.Scanner;

import com.tool.BaseAble;
import com.tool.BaseToo2;

//import com.tool.BaseTool;

public class BaseLook extends BaseAble {
	// 有参构造

	public BaseLook(String sex, String name, String age) {
		// TODO Auto-generated constructor stub
		this.sex = sex;
		this.name = name;
		this.age = age;
	}

	// 无参构造
	public BaseLook() {
		// TODO Auto-generated constructor stub
	}

	Scanner imput = new Scanner(System.in);

	// 属性
	private String sex;
	private String name;
	private String age;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	// 对name进行限定
	public void setName(String name) {
		boolean b = true;// 用来进行while的判定
		while (b) {
			if (name.length() > 6) {
				System.out.println("你的名字过长请重新输入");
				name = imput.next();
				continue;
			}
			// 进行关键词判定，如果包含特定的值不允许进行命名
			String[] safeJudge = { "性" };
			for (int i = 0; i < safeJudge.length; i++) {
				if (name.indexOf(safeJudge[i]) != -1) {
					System.out.println("你的名字包含敏感词汇请重新输入");
					name = imput.next();
				} else {
					b = false;
				}
			}
		}
		this.name = name;

	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		// 利用正则表达式来做
		// 定义要验证的字符串
		String regex = "[0-9]+";// 表示一个十进制数出现一次以上
		boolean b = true;
		while (b) {
			System.out.println(age);
			System.out.println(age.matches(regex));
			if (age.matches(regex)) {
				if (Integer.parseInt(age) > 100 || Integer.parseInt(age) < 0) {
					System.out.println("你输入的年龄有误，请重新输入");
					age = imput.next();
					continue;
				} else {

					b = false;
				}
			} else {
				System.out.println("存在非法字符，请重新输入");
				age = imput.next();
				continue;
			}
		}

		// try {
		// while (Integer.parseInt(age) > 100 || Integer.parseInt(age) < 0) {
		// System.out.println("你输入的年龄有误，请重新输入");
		// age = imput.next();
		// }
		// }
		// catch (Exception e) {
		// System.out.println("你输入的年龄包含非法字符，请重新输入");
		// age = imput.next();
		// while (Integer.parseInt(age) > 100 || Integer.parseInt(age) < 0) {
		// System.out.println("你输入的年龄有误，请重新输入");
		// age = imput.next();
		// }
		// }
		this.age = age;
	}

}
