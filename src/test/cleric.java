package test;

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


}
