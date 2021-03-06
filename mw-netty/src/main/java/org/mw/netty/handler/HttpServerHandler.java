package org.mw.netty.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author devon.ye@foxmail.com
 * @datetime 2020/5/11 4:17 PM
 * @description
 */
public class HttpServerHandler extends SimpleChannelInboundHandler<FullHttpRequest> {
    private static final Logger LOG = LoggerFactory.getLogger(HttpServerHandler.class);

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, FullHttpRequest request) throws Exception {

        LOG.info("process msg:{}",request.content().readableBytes());

        String uri = request.uri();

        HttpResponse httpResponse = new DefaultHttpResponse(request.protocolVersion(), HttpResponseStatus.OK);


        String contentType="";

        httpResponse.headers().set(HttpHeaders.Names.CONTENT_TYPE,contentType+"charset=utf-8;");
        HttpHeaders.isKeepAlive(request);

    }
}
