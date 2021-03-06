/*
 * Copyright (c) 2010-2015 meituan.com
 * All rights reserved.
 * 
 */
package com.maoyan.machine.httpclient.spring.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 标记请求实体字段为PathVariable
 * 
 * @author xujia06
 * @created 2016年6月12日
 * 
 * @version 1.0
 */
@Retention(RUNTIME)
@Target({ ElementType.FIELD })
public @interface PathVariable {
}
