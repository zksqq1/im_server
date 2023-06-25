package com.ww.protocol;

import lombok.Data;

@Data
public abstract class AbstractReqMsg {
    /**
     * 发送者id的长度，用以截取senderId
     */
    protected int senderIdLength;
    /**
     * 实际的senderId，客户端公钥
     */
    protected byte[] senderId;
    /**
     * 发送时间戳，服务端接收时间为准
     */
    protected long sendTimestamp = System.currentTimeMillis();
    /**
     * body摘要的长度，用以截取body的摘要信息
     */
    protected int msgBodyDigestLength;
    /**
     * 发送者用自己的私钥进行加密，加密内容是加密后body的摘要
     * 接收者收到消息后，先用senderId对该数据进行解密，拿到对应的摘要，然后对原始body进行摘要，两相对比，以确认内容是否发生了篡改
     * 解决了伪造发送者和篡改消息内容的问题
     */
    protected byte[] msgBodyDigest;
    /**
     * 实际的body长度，用以截取body
     */
    protected int bodyLength;
    /**
     * 发送者用密钥进行加密
     */
    protected byte[] body;
}
