package top.yfine.wechat.sdkdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.yfine.wechat.sdk.service.WechatService;

/**
 * @author 杨帆
 * @date 2018/12/29 13:50
 */
@Controller
public class IndexController {
    @Autowired
    private WechatService wechatService;

    @RequestMapping("index")
    public String index() {
        wechatService.hello();
        return "index.html";
    }
}
