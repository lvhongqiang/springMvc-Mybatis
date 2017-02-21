package itire.web.controller;

import itire.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Lv on 2017/2/20.
 */
@Controller
public class IndexController {
    @Autowired private IndexService indexService;
    
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        indexService.logs();
        return "index";
    }
}
