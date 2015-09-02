package com.test.quartz;

import java.util.HashMap;  

public interface ITask{  
  /** 
   * 业务系统写任务逻辑的时候，只需继承Task类即可 
   *  
   * @param map 因为很多任务执行可能需要传入参数，
   * 			这个参数可以配置在JOB_TASK表的PARMS字段里面 
   * 
   * 如在数据库里配置：
   * <item> 
   * 	<key>sss</key> 
   * 	<value>vvv</value> 
   * </item> 
   * <item> 
   * 	<key>ss</key> 
   * 	<value>vv</value> 
   * </item> 
   */  
	public void execute( HashMap map );
  
}
