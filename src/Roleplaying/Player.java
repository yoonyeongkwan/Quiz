package Roleplaying;

//플레이어 클래스
class Player extends Character {
 private int level;

 public Player(String name, int health, int level) {
     super(name, health);
     this.level = level;
 }

 public int getLevel() {
     return level;
 }

 public void levelUp() {
     level++;
 }
}