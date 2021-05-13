package JiChenRedEnvelopes;

import java.util.ArrayList;

//群主的类
public class Manager extends User{
    public Manager(){}
    //调用父类构造方法，初始化成员变量:姓名 和 余额
    public Manager(String name,int money){super(name,money);}
    //发红包  总共发多少钱   多少个
    public ArrayList<Integer> sent(int totalMoney,int count){
        //定义一个集合，用来存储红包
        ArrayList<Integer> redList=new ArrayList<>();

        //查看群主有多少余额
        int liftMoney=super.getMoney();
        if(totalMoney>liftMoney){
            System.out.println("余额不足");
            return redList;//返回一个空集合
        }

        //扣钱，从新设置群主余额
        super.setMoney(liftMoney-totalMoney);

        //准备发红包，设置红包集合参数
        int avg=totalMoney/count;//获取每个红包平均后所获得的钱数
        int mod=totalMoney%count;//获取零头
        //开始发红包，将红包添加到集合,把除了最后一个红包，全部赋上平均值
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        //把零头放到最后一个红包里
        redList.add(avg+mod);
    //返回红包数组集合
        return redList;
    }
}
