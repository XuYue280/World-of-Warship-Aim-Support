# World-of-Warship-Aim-Support
This is a Java base program

你好，指挥官
无论您是新手玩家还是老手玩家，相信您都曾都曾经怀疑过自己的瞄准镜是否被敌军做过手脚。明明瞄准的是敌方核心区，但却总是打不中。

但只要您了解战舰世界的运行逻辑，这将变成一个有趣的游戏。

瞄准思路：

战舰烟囱拍出来的烟大约持续3.6秒，针对于所有战舰。所以战舰的烟长与航行速度成正比。越快的船会有更长的烟长。
假设敌方战舰的航行角度（与您的战舰）与速度不变，如果我们的瞄准没有提前量，那么此此射击将会错过敌方战舰，在炮弹飞行时 敌方战舰将会向前移动 炮弹飞行时间 * 烟长 * 3.6。
因此我们要将瞄准点 *向前 移动* （炮弹飞行时间 * 烟长） / 3.6
  x

