package com.baby;
import java.util.Scanner;

import org.omg.CORBA.portable.ApplicationException;

import com.looks.BaseLook;

public class Baby extends BaseLook {
	//有参构造
	public Baby(String sex, String name, String age) {
		super(sex, name, age);
		// TODO Auto-generated constructor stub
	}
	
	
	//无参构造
	public Baby() {
		// TODO Auto-generated constructor stub
		this.stay();//当实例化是开始游戏
	}
	
	//初始化输入结构
	Scanner imput=new Scanner(System.in);
	
	
	
	
	//开始实现银月功能
	public void stay(){
		System.out.println("欢迎来到银月的世界，请按要求初始化你的银月吧");
		System.out.println("是否开始游戏（Y or N）");
		String userimput=imput.next().toUpperCase();
		System.out.println(userimput);
		if(userimput.equals("Y")){
			
			System.out.println("赶紧创建属于你的银月吧，银月的世界马上打开");
			playGame();
			
		}
		else{
			//System.out.println("赶紧创建属于你的银月吧，银月的世界马上打开");
			//ApplicationException.close();
			System.exit(1);
		}
	}
	
	
	//开始游戏，初始化银月的基本信息
	public void playGame(){
		System.out.println("输入银月的名字");
		super.setName(imput.next());
		System.out.println("输入银月的年龄");
		super.setAge(imput.next());
		System.out.println("输入映月的性别");
		super.setSex(imput.next());
	}
	
	
	
	
}
