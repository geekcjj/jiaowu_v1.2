 /**
  * Project Name:moma_crm
  * File Name:ThreadParamIinit.java
  * package Name:cn.yun.common.thread
  * Date:2016年3月1日下午7:30:07
  * Copyright (c) 2016, www.yunjiaowu.cn All Rights Reserved.
   * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
   *
   * Copyright 2017 摩码创想, support@momathink.com
    *
   * This file is part of Jiaowu_v1.0.
   * Jiaowu_v1.0 is free software: you can redistribute it and/or modify
   * it under the terms of the GNU Lesser General Public License as published by
   * the Free Software Foundation, either version 3 of the License, or
   * (at your option) any later version.
   *
   * Jiaowu_v1.0 is distributed in the hope that it will be useful,
   * but WITHOUT ANY WARRANTY; without even the implied warranty of
   * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   * GNU Lesser General Public License for more details.
   *
   * You should have received a copy of the GNU Lesser General Public License
   * along with Jiaowu_v1.0.  If not, see <http://www.gnu.org/licenses/>.
   *
   * 这个文件是Jiaowu_v1.0的一部分。
   * 您可以单独使用或分发这个文件，但请不要移除这个头部声明信息.
    * Jiaowu_v1.0是一个自由软件，您可以自由分发、修改其中的源代码或者重新发布它，
   * 新的任何修改后的重新发布版必须同样在遵守LGPL3或更后续的版本协议下发布.
   * 关于LGPL协议的细则请参考COPYING文件，
   * 您可以在Jiaowu_v1.0的相关目录中获得LGPL协议的副本，
   * 如果没有找到，请连接到 http://www.gnu.org/licenses/ 查看。
   *
   * - Author:摩码创想
   * - Contact: support@momathink.com
   * - License: GNU Lesser General Public License (GPL)
   */

package com.momathink.common.thread;

import org.apache.log4j.Logger;

/**
 * ClassName:ThreadParamIinit <br/>
 * 
 * 
 * Date:     2016年3月1日 下午7:30:07 <br/>
 * @author   Richie
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ThreadParamInit extends Thread {
	private static Logger log = Logger.getLogger(ThreadParamInit.class);
	
	public static String cacheStart_user = "user_";
	public static String cacheStart_user_systemsList = "user_systemsList";
	public static String cacheStart_role = "role_";
	public static String cacheStart_operator = "operator_";
	public static String cacheStart_dict = "dict_";
	public static String cacheStart_dict_child =  "dict_child_";
	public static String cacheStart_i18n = "i18n_";
	public static String cacheStart_system_parentnullmodule ="system_parentnullmodule_" ;
	public static String cacheStart_moduleChild = "moduleChild_" ;
	public static String cacheStart_module = "module_" ;
	public static String cacheStart_moduleOperatorAll = "moduleOperatorAll_" ;
	public static String cacheStart_moduleOperatorPrivilege = "moduleOperatorPrivilege_" ;
	
	public static String cacheStart_dept = "dept_";
	public static String cacheStart_dept_child = "dept_child_";
	
	public static String cacheStart_station = "station_";
	public static String cacheStart_station_child = "station_child_";
	public static String cacheStart_pageData = "pageData_";
	
	
	@Override
	public void run(){
		cacheAll();
	}

	public static synchronized void cacheAll() {
		
		log.info("加载缓存完毕--------------------------------------------------------------");
	}
	
	
	
}

