package com.baby;
import java.util.Scanner;

import org.omg.CORBA.portable.ApplicationException;

import com.looks.BaseLook;

public class Baby extends BaseLook {
	//�вι���
	public Baby(String sex, String name, String age) {
		super(sex, name, age);
		// TODO Auto-generated constructor stub
	}
	
	
	//�޲ι���
	public Baby() {
		// TODO Auto-generated constructor stub
		this.stay();//��ʵ�����ǿ�ʼ��Ϸ
	}
	
	//��ʼ������ṹ
	Scanner imput=new Scanner(System.in);
	
	
	
	
	//��ʼʵ�����¹���
	public void stay(){
		System.out.println("��ӭ�������µ����磬�밴Ҫ���ʼ��������°�");
		System.out.println("�Ƿ�ʼ��Ϸ��Y or N��");
		String userimput=imput.next().toUpperCase();
		System.out.println(userimput);
		if(userimput.equals("Y")){
			
			System.out.println("�Ͻ���������������°ɣ����µ��������ϴ�");
			playGame();
			
		}
		else{
			//System.out.println("�Ͻ���������������°ɣ����µ��������ϴ�");
			//ApplicationException.close();
			System.exit(1);
		}
	}
	
	
	//��ʼ��Ϸ����ʼ�����µĻ�����Ϣ
	public void playGame(){
		System.out.println("�������µ�����");
		super.setName(imput.next());
		System.out.println("�������µ�����");
		super.setAge(imput.next());
		System.out.println("����ӳ�µ��Ա�");
		super.setSex(imput.next());
	}
	
	
	
	
}
