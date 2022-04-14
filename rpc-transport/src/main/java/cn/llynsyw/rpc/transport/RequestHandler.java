package cn.llynsyw.rpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Description TODO
 * @Author luolinyuan
 * @Date 2022/3/29
 **/
public interface RequestHandler {
	/**
	 * 处理请求字节流
	 *
	 * @param receive    接收字节流
	 * @param toResponse 输出字节流
	 **/
	void onRequestSteam(InputStream receive, OutputStream toResponse);
}