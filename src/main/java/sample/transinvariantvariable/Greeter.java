package sample.transinvariantvariable;

import akka.actor.UntypedActor;
import com.alibaba.fastjson.JSONObject;

public class Greeter extends UntypedActor {

    @Override
    public void onReceive(Object msg) throws Throwable {
        try {
            System.out.println("Greeter接收到的数据为"+JSONObject.toJSONString(msg));
            getSender().tell("Greeter工作完成",getSelf());         //给HelloWorld发送信息
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
