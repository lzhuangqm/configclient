package com.cn.controller.config;

/**
 * @author huangqiming
 * @解析Git
 */
import com.cn.controller.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResolveGitController extends ParentController {

    @Value("${home}") // git配置文件里的key
    private String foo;

    public ResolveGitController() {
    }

    @RequestMapping(value = "/getGitInfo", method = RequestMethod.POST)
    public String getGitInfo() {
        return foo;
    }
}
