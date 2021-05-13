package JiChenRedEnvelopes;

import java.util.ArrayList;
import java.util.Random;

//普通成员
public class Member extends User{
    public  Member(){ }
    public Member(String name,int money){
        super(name, money);
    }
    //收红包
    public void receive(ArrayList<Integer> redList){
        //从多个红包当中【随机】抽取一个给自己
        //随机获取集合中一个索引编号
        int index=new Random().nextInt(redList.size());
        //根据索引，从集合中删除并得到被删除的红包给自己
        int delta =redList.remove(index);
        //当前成员自己本来有多少钱
        int money=super.getMoney();
        //加法，重写设置余额
        super.setMoney(money+delta);
    }
}
