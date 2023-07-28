package com.ww.msg.body;

import com.ww.msg.body.AbstractMsgBody;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ChannelKeyChangeMsgBody extends AbstractMsgBody {
    private String channelId;
    /**
     * 当前密钥代数
     */
    private Long epoch;
    /**
     * 旧密钥
     */
    private String oldKey;
    /**
     * 新密钥
     */
    private String newKey;
}
