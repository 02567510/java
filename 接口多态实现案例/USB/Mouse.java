package InTerFace.USB;
//鼠标就是一种USB设备
public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("鼠标打开");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }
    public void click(){
        System.out.println("点击鼠标");
    }

}
