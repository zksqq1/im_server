package com.ww.protocol;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CommonReqMsg extends AbstractReqMsg {
    /**
     * channelId的长度，用以截取channelId
     */
    private int channelIdLength;
    /**
     * 一个会话的唯一标识，群聊或单聊
     */
    private byte[] channelId;
    /**
     * channel中消息的唯一id
     */
    private long channelMsgId;
    /**
     * 发送方的消息id，用来判断是否发生了错位传输
     */
    private long senderMsgId;
    /**
     * receiverId长度，用以截取receiverId
     */
    private int receiverIdLength;
    /**
     * receiverId，客户端公钥
     */
    private byte[] receiverId;
}
