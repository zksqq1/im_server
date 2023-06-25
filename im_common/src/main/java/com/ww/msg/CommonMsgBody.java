package com.ww.msg;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CommonMsgBody extends AbstractMsgBody {
    private String channelId;
    private long channelMsgId;
    private long senderMsgId;
    private String receiverId;
}
