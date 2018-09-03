package homework;

import java.util.Scanner;

/**
 * Created by dllo on 18/5/3.
 */
public class Game {
    private Computer computer;
    private Player player;
     
   

    public  Game() {
        //初始化对象
        player = new Player();
        computer = new Computer();
    }
     //选择电脑的方法
    public String chooseHero() {
        System.out.println("-----------欢迎进入游戏世界-----------");
        System.out.println("******************");
        System.out.println("**    猜拳,开始    **");
        System.out.println("******************");
        System.out.println("出拳规则：1.剪刀 2.石头 3.布");
        System.out.print("请选择对方角色：1.亚瑟 2.扁鹊 3.百里守约 :");
        Scanner scanner=new Scanner(System.in);
        
        int num = scanner.nextInt();
        String name = "";
        switch (num) {
            case 1:
                System.out.println("你选择了:亚瑟对战");
                name = "亚瑟";
                break;
            case 2:
                System.out.println("你选择了:扁鹊对战");
                name ="扁鹊";
                break;
            case 3:
                System.out.println("你选择了:百里守约对战");
                name = "百里守约";
                break;
            default:
                System.out.println("输入有误 默认为亚瑟");
                name = "亚瑟";
                break;
        }
      //将选择的名字赋值给电脑
        computer.name = name;
        return name;
    }
    //开始游戏方法
     public void startGame(){
         String name = chooseHero();
         System.out.println("是否开始游戏Y/N");
         Scanner scanner = new Scanner(System.in);
         String whether = scanner.next();
         if (whether.equals("Y")){
             //开始对战
            circlePK(name); 
         }else{
             System.out.println("不玩了");
         }
     }
     //循环PK
    private void circlePK(String name) {
        System.out.println("出拳：1.剪刀 2.石头 3.布");
        pk(player.fight(),computer.fight(name));
        System.out.println("是否继续游戏Y/N");
        Scanner scanner = new Scanner(System.in);
        String whether =scanner.next();
        if (whether.equals("Y")){
            circlePK(name);
        }else {
            System.out.println("游戏结束");
            showResult();
        }

    }
     //单局Pk

    private void showResult() {
        System.out.println(" ------------------");
        System.out.println("------------------------------");
        System.out.println(player.name+"赢了"+player.win+"次");
        System.out.println(player.name+"输了"+player.lose+"次");
        System.out.println(player.name+"平了"+player.peace+"次");
        System.out.println(player.name+"总分"+player.score+"分");
        System.out.println("------------------------------");
        System.out.println(computer.name+"赢了"+computer.win+"次");
        System.out.println(computer.name+"输了"+computer.lose+"次");
        System.out.println(computer.name+"平了"+computer.peace+"次");
        System.out.println(computer.name+"总分"+computer.score+"分");
        System.out.println("------------------------------");
    }

    public void pk(int p, int c){
        //1 剪刀 2 石头 3 布
        if (c==p){
            System.out.println("平局");
            computer.peace+=1;
            player.peace+=1;
            computer.score+=1;
            player.score+=1;

        }else if ((p==1&&c==3)||(p==2&&c==1)||(p==3&&c==2)){
            System.out.println("玩家胜利");
           player.win+=1;
            computer.lose+=1;
            player.score+=2;

        }else{
            System.out.println("电脑胜利");
            computer.win+=2;
            computer.score+=1;
            player.lose+=1;
        }
    }
}
