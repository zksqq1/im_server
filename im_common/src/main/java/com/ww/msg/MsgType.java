package com.ww.msg;

public enum MsgType {
    DEFAULT(-1, null),
    NORMAL(100, CommonMsgBody.class),
    ATTACH(200, AttachMsgBody.class),
    KEY_CHANGE(300, CommonMsgBody.class),
    ;

    private final int code;
    private final Class<? extends AbstractMsgBody> klazz;

    MsgType(int code, Class<? extends AbstractMsgBody> klazz) {
        this.code = code;
        this.klazz = klazz;
    }

    public int getCode() {
        return code;
    }

    public Class<? extends AbstractMsgBody> getKlazz() {
        return klazz;
    }

    public static MsgType byCode(int code) {
        for (MsgType msgType : MsgType.values()) {
            if (msgType.getCode() == code) {
                return msgType;
            }
        }
        return DEFAULT;
    }
}
