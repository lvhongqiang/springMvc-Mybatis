package itire.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;


/**
 * Created by Lv on 2017/2/21.
 */
@Service
public class IndexService {
    private static final Logger logger = Logger.getLogger(IndexService.class);
    
    public void logs(){
        logger.info("execute IndexService.logs()");
    }
}
