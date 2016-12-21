/*
 * Copyright (c) 2016, Quancheng-ec.com All right reserved. This software is the
 * confidential and proprietary information of Quancheng-ec.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Quancheng-ec.com.
 */
package com.ypp.thrall.core.grpc.client;

import com.ypp.thrall.core.common.ThrallURL;

import io.grpc.Channel;

/**
 * @author shimingliu 2016年12月14日 下午5:50:42
 * @version GrpcProtocolClient.java, v 0.0.1 2016年12月14日 下午5:50:42 shimingliu
 */
public interface GrpcProtocolClient<T> {

    public T getGrpcClient(ChannelPool channelCall, int callType, int callTimeout);

    public interface ChannelPool {

        public Channel borrowChannel(final ThrallURL refUrl);

        public void returnChannel(final ThrallURL refUrl, final Channel channel);
    }

}
