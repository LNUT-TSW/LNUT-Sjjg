package com.lnut.common.redis;

/**
 * Created by L on 16/5/15.
 */
public interface RedisListPo extends RedisObj {
    /**
     * 子主键的组合
     * 即redis的hash结构中 key field1 value1 file2 value2中的fieldx组合字段
     * @return
     */
    public String[] getSubUniqueKey();
}
