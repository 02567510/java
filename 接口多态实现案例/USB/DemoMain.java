package InTerFace.USB;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个笔记本电脑
        Computer computer=new Computer();
        computer.powerOpen();

        //准备一个鼠标供电脑使用
//        Mouse mouse=new Mouse();

        //先向上转型
        USB usb=new Mouse();//多态    写法
        //参数是USB类型，传递的是USB类型的鼠标
        computer.usbDevice(usb);

        //创建一个USB键盘
        Keyboard keyboard=new Keyboard();//不是多态写法
        //方法参数是USB类型，传递的是实现类对象
        computer.usbDevice(keyboard);//正确写法,发生向上转型
        //使用子类对象，匿名对象，也可以
        computer.usbDevice(new Keyboard());//正确写法，匿名对象
        computer.powerOff();


        System.out.println("====================================");

        method(10.0);//正确：double->double
        int a=30;method(a);//正确:int->double(小转大，自动转换)
        method(20);//正确:int->double(小转大，自动转换)
    }
    public static void method(double num){
        System.out.println(num);
    }
}
