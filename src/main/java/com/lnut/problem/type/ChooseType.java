package com.lnut.problem.type;

import com.lnut.common.exception.EnumParseException;

/**
 * Created by L on 16/6/6.
 */
public enum ChooseType {
    A((byte)1,"A"),
    B((byte)2,"B"),
    C((byte)3,"C"),
    D((byte)4,"D")
    ;

    private byte type;
    private String desc;

    ChooseType(byte type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public byte getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public static ChooseType parse(int type) {
        if (type < 0 || type >= values().length)
            throw new EnumParseException(type);
        return values()[type];
    }
}
