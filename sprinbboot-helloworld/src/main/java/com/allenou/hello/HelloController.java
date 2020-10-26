package com.allenou.hello;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

@RestController
public class HelloController {


//    @ResponseBody
//    @RequestMapping(value="/hello",method = RequestMethod.POST,produces = "application/text;charset=GBK")
//    public String hello(HttpServletRequest req) {
//        System.out.println("收到请求："+this.getMessage(req));
//        return "Hello World!";
//    }


    @RequestMapping(value="/well",method = RequestMethod.POST,produces = "application/text;charset=GBK")
    public String well (HttpServletRequest req) {
        System.out.println("收到请求："+req);
        return "Hello World 2 !";
    }

    private String getMessage(HttpServletRequest request) {
        try {
            BufferedReader streamReader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
            // 写入数据到Stringbuilder
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = streamReader.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}

