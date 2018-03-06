package bhz.springcloud;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author YaoGang
 * @ClassName: LuckServiceZuulFallBackProvider
 * @Description: (指定断熔某个服务, 自定义响应信息内容)
 * @date 2018/3/6 15:30
 */
@Component
public class LuckServiceZuulFallBackProvider implements FallbackProvider {

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return new ClientHttpResponse() {
            // 自定义响应的状态
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.BAD_REQUEST;
            }

            // 自定义响应的状态码
            @Override
            public int getRawStatusCode() throws IOException {
                return this.getStatusCode().value();
            }

            // 状态文本信息
            @Override
            public String getStatusText() throws IOException {
                return this.getStatusCode().getReasonPhrase();
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                return new ByteArrayInputStream("service error...".getBytes());
            }

            // response的响应头信息
            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                return headers;
            }
        };
    }

    /**
     * 指定要断熔的服务的名字: appName
     *
     * @return
     */
    @Override
    public String getRoute() {
        return "web";
    }

}
