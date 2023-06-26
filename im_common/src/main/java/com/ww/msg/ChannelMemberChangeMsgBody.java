package com.ww.msg;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ChannelMemberChangeMsgBody extends AbstractMsgBody {
    private String channelId;
}
