package com.ww.msg.body;

import lombok.Data;

@Data
public abstract class AbstractMsgBody {
    protected String senderId;
    protected long sendTimestamp;
    protected String msgBodyDigest;
    private byte[] body;
}
