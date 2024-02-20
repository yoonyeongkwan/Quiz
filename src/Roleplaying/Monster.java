package Roleplaying;

//몬스터 클래스
class Monster extends Character {
 private int experience;

 public Monster(String name, int health, int experience) {
     super(name, health);
     this.experience = experience;
 }

 public int getExperience() {
     return experience;
 }
}