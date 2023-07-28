package com.ww.msg.body;

import com.ww.msg.body.AbstractMsgBody;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ChannelMemberChangeMsgBody extends AbstractMsgBody {
    private String channelId;
}
