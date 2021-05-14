package InTerFace.USB;

public class Computer {
    public void powerOpen(){
        System.out.println("笔记本开机");
    }
    public void powerOff(){
        System.out.println("笔记本关机");
    }
    //使用USB设备方法，使用接口作为方法的参数
    public void usbDevice(USB usb){
        usb.open();//打开设备

        if(usb instanceof Mouse){//先判断
            Mouse mouse=(Mouse) usb;//向下转型
            mouse.click();
        }else if(usb instanceof Keyboard){//先判断
            Keyboard keyboard=(Keyboard) usb;//向下转型
            keyboard.type();
        }

        usb.close();//关闭设备
    }
}
