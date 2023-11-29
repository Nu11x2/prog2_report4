package jp.ac.uryukyu.ie.e235701;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    /**
     * Warriorクラスからオブジェクトを生成し、
     * attackWithWeponSkillを3回実行し、
     * 3回ともattackの150%ダメージになっていることを確認する
     */
    @Test
    void weponSkillTsst() {
        Warrior demoWarrior = new Warrior("デモ戦士",100,10);
        Enemy testEnemy = new Enemy("テストエネミー", 100, 0);
        int enemyHP = testEnemy.getHitPoint();
        for (int i = 0; i < 3; i++) {
            demoWarrior.attackWithWeponSkill(testEnemy);
            assertEquals(demoWarrior.getAttack() * 1.5, enemyHP - testEnemy.getHitPoint());
            enemyHP = testEnemy.getHitPoint();
        }
    }
}
