package com.ww.msg;

import com.ww.msg.body.AbstractMsgBody;
import lombok.Data;

@Data
public class Msg {
    private MsgType msgType;
    private AbstractMsgBody msgBody;
}
