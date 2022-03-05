package test;

import java.util.Random;

public class cleric {
String name;
int hp =50;
int maxHp =50;
int mp =10;
int maxMp=10;

public void selfAid() {
	System.out.println("聖職者はセルフエイドを唱えた");
	this.hp =this.maxHp;
	this.mp -= 5;
	System.out.println("HPが全快になった。");
}

public int play(int sec) {
	System.out.println(this.name + "は" + sec + "秒間天に祈った");
	int recover = new Random().nextInt(3) +sec;
	int recoverAfter = Math.min(this.maxHp - this.mp,recover);
	
	this.mp += recoverAfter;
	return recoverAfter;
}


}
