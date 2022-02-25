/**
 * 
 */
package com.pichincha.util;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;
import reactor.netty.tcp.TcpClient;

import java.util.Map;
import java.util.concurrent.TimeUnit;

@Component
public class WebClientUtil {

  private WebClient.Builder builder;

  public WebClientUtil builder() {
    TcpClient tcpClient = TcpClient.create()
        .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 30000)
        .doOnConnected(connection -> {
          connection.addHandlerLast(new ReadTimeoutHandler(30000, TimeUnit.MILLISECONDS));
          connection.addHandlerLast(new WriteTimeoutHandler(30000, TimeUnit.MILLISECONDS));
        });

    builder = WebClient.builder()
        .clientConnector(new ReactorClientHttpConnector(HttpClient.from(tcpClient)));
    return this;
  }

  public WebClient build() {
    return builder.build();
  }
}
