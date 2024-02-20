package Roleplaying; 

// 게임 메인 클래스
public class RPGGame {
    public static void main(String[] args) {
        Player player = new Player("플레이어", 100, 1);
        int monsterCount = 0;

        System.out.println("[게임 시작]");
        System.out.println(player.getName() + "의 레벨: " + player.getLevel());

        while (true) {
            Monster monster = new Monster("몬스터" + (monsterCount + 1), 50 + monsterCount * 10, 10 + monsterCount * 5);

            System.out.println("\n[몬스터 등장]");
            System.out.println(monster.getName() + "의 체력: " + monster.getHealth());

            while (!player.isDead() && !monster.isDead()) {
                player.attack(monster);
                monster.attack(player);

                System.out.println("\n[전투 상황]");
                System.out.println(player.getName() + "의 체력: " + player.getHealth());
                System.out.println(monster.getName() + "의 체력: " + monster.getHealth());
            }

            if (player.isDead()) {
                System.out.println("\n[전투 패배]");
                System.out.println(player.getName() + "이(가) 사망했습니다. 게임 오버!");
                break;
            } else {
                System.out.println("\n[전투 승리]");
                System.out.println(monster.getName() + "을(를) 처치했습니다.");
                player.levelUp();
                System.out.println(player.getName() + "의 레벨이 " + player.getLevel() + "로 상승했습니다.");

                int experience = ((Monster) monster).getExperience();
                player.setHealth(player.getHealth() + experience);
                System.out.println(player.getName() + "의 체력이 " + experience + "만큼 회복되었습니다.");

                monsterCount++;
            }
        }
    }
}