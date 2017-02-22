package itire.web.controller;

import itire.model.po.Logs;
import itire.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Lv on 2017/2/20.
 */
@Controller
public class IndexController {
    @Autowired private IndexService indexService;
    
    @RequestMapping(value = "/log/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Logs home(@PathVariable Integer id){
        Logs logs = indexService.logs(id);
        return logs;
    }
}
