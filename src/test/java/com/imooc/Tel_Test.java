package com.imooc;

import com.imooc.Tel.*;
import org.junit.Test;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/14 11:25
 */
public class Tel_Test {

    @Test
    public void Tel_Tests(){
        FourthPhone fourthPhone = new FourthPhone();
        fourthPhone.game();
        fourthPhone.network();
        fourthPhone.photo();
        fourthPhone.call();
        fourthPhone.message();
        fourthPhone.music();
        System.out.println("==================================");
        IPhoto ip = new FourthPhone();
        ip.photo();
        ip = new Camer();
        ip.photo();
        System.out.println("======================================");
        System.out.println(INet.TEMP);

        INet net = new SmartWatch();
        System.out.println(net.TEMP);

        SmartWatch smartWatch = new SmartWatch();
        System.out.println(smartWatch.TEMP);

        // 需要用对象名调用静态方法
        INet.stop();

        net.connection();
        System.out.println("======================================");

        INet net2 = new SmartWatch();
        net2.connection();
        IPhoto ip2 = new SmartWatch();
        ip2.connection();
        System.out.println("===================================");
        INet net3= new FourthPhone();
        net3.connection();
        IPhoto ip3 = new FourthPhone();
        ip3.connection();



    }

}
