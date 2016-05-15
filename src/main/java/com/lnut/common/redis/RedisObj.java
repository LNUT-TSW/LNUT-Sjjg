package com.lnut.common.redis;

import java.util.Map;

/**
 * Created by L on 16/5/15.
 */

public interface RedisObj {
    /**
     * 将对象所有需要存入缓存的数据转成map结构
     * field域名为key，field的值为value存入map之中
     * @return
     */
    public Map<String, String> getAllFeildsToHash();
    /**
     * 这个对象的主键
     * 能唯一定位一条记录的字段
     * @return
     */
    public String getUniqueKey();
    /**
     * 需要保存的字段的个数
     * @return
     */
    public int getFieldCount();
}