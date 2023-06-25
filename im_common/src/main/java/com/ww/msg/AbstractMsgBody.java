package com.ww.msg;

import lombok.Data;

@Data
public abstract class AbstractMsgBody {
    protected String senderId;
    protected long sendTimestamp;
    protected String msgBodyDigest;
    private byte[] body;
}
