package com.looks;

import java.util.Scanner;

import com.tool.BaseAble;
import com.tool.BaseToo2;

//import com.tool.BaseTool;

public class BaseLook extends BaseAble {
	// �вι���

	public BaseLook(String sex, String name, String age) {
		// TODO Auto-generated constructor stub
		this.sex = sex;
		this.name = name;
		this.age = age;
	}

	// �޲ι���
	public BaseLook() {
		// TODO Auto-generated constructor stub
	}

	Scanner imput = new Scanner(System.in);

	// ����
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

	// ��name�����޶�
	public void setName(String name) {
		boolean b = true;// ��������while���ж�
		while (b) {
			if (name.length() > 6) {
				System.out.println("������ֹ�������������");
				name = imput.next();
				continue;
			}
			// ���йؼ����ж�����������ض���ֵ�������������
			String[] safeJudge = { "��" };
			for (int i = 0; i < safeJudge.length; i++) {
				if (name.indexOf(safeJudge[i]) != -1) {
					System.out.println("������ְ������дʻ�����������");
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
		// ����������ʽ����
		// ����Ҫ��֤���ַ���
		String regex = "[0-9]+";// ��ʾһ��ʮ����������һ������
		boolean b = true;
		while (b) {
			System.out.println(age);
			System.out.println(age.matches(regex));
			if (age.matches(regex)) {
				if (Integer.parseInt(age) > 100 || Integer.parseInt(age) < 0) {
					System.out.println("�������������������������");
					age = imput.next();
					continue;
				} else {

					b = false;
				}
			} else {
				System.out.println("���ڷǷ��ַ�������������");
				age = imput.next();
				continue;
			}
		}

		// try {
		// while (Integer.parseInt(age) > 100 || Integer.parseInt(age) < 0) {
		// System.out.println("�������������������������");
		// age = imput.next();
		// }
		// }
		// catch (Exception e) {
		// System.out.println("���������������Ƿ��ַ�������������");
		// age = imput.next();
		// while (Integer.parseInt(age) > 100 || Integer.parseInt(age) < 0) {
		// System.out.println("�������������������������");
		// age = imput.next();
		// }
		// }
		this.age = age;
	}

}
