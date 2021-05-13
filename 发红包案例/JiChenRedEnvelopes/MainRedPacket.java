package JiChenRedEnvelopes;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        //定义一个群主对象
        Manager manage=new Manager("群主",100);
        //定义普通成员对象
        Member one=new Member("成员A",0);
        Member two=new Member("成员B",0);
        Member three=new Member("成员C",0);

        manage.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===============================");

        ArrayList<Integer> list=manage.sent(20,3);
        one.receive(list);
        two.receive(list);
        three.receive(list);

        manage.show();
        one.show();
        two.show();
        three.show();

    }
}
