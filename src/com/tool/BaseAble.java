package com.tool;

public class BaseAble implements BaseToo2,BaseTool1 {

	//实现接口
		@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("我能吃东西");
		}
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("我能玩游戏");
		}
		@Override
		public void studey() {
			// TODO Auto-generated method stub
			System.out.println("我能学习哦");
		}
		@Override
		public void chat() {
			// TODO Auto-generated method stub
			System.out.println("我会聊天");
		}

}
