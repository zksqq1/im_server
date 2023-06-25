package com.ww.msg;

import lombok.Data;

@Data
public class Msg {
    private MsgType msgType;
    private AbstractMsgBody msgBody;
}
