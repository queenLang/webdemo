package homework;

/**
 * Created by dllo on 18/5/3.
 */
public class Main {
    public static void main(String[] args) {
        /** 需求  猜拳游戏
     * step1 选择一个电脑玩家
     * step2 用户进行出拳操作
     *       电脑也进行出拳操作
                *       进行比较
                *       1 剪刀 2 石头 3布
                *
     * step3 询问用户是否继续游戏 继续则重新出拳 不继续则打印结果
     *      结果要求 玩家以及电脑的 胜利次数 败北次数 平局次数 以及总得分
     *      积分规则 胜利2分 平局1分 负局0分
     *
     *
     *
     */
        new Game().startGame();;
    }
}
