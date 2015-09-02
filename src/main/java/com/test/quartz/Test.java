package com.test.quartz;

import java.util.HashMap;  
  
/** 
 * 一个测试任务噢。 
 * 一个测试的任务，用于测试使用，呵呵。 
 * @author keyboardsun 
 * 
 */  
public class Test extends Task{  
  
  public void execute( HashMap map ){  
    try{  
      Thread.sleep(2000);  
      System.out.println("****************************************");  
      System.out.println("执行任务id:"+map.get("TASK_ID"));  
      System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");  
    }catch( InterruptedException e ){  
    }  
  }  
  
}  