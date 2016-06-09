package com.lnut.problem.type;

import com.lnut.common.exception.EnumParseException;

/**
 * Created by L on 16/6/6.
 */
public enum ProblemType {
    CHOOSE((byte)1, "选择题"),
    JUDGE((byte)2, "判断题");

    private byte type;
    private String desc;

    ProblemType(byte type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public byte getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public static ProblemType parse(int type) {
        if (type < 0 || type >= values().length)
            throw new EnumParseException(type);
        return values()[type];
    }
}
