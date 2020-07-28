/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.nacos.config.server.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Trace Util
 *
 * @author Nacos
 */
public class TraceLogUtil {
    /**
     * 记录server各个接口的请求记录
     */
    public static Logger requestLog = LoggerFactory.getLogger("com.alibaba.nacos.config.request");

    /**
     * 记录各个client的轮询请求记录
     */
    public static Logger pollingLog = LoggerFactory.getLogger("com.alibaba.nacos.config.polling");

}
