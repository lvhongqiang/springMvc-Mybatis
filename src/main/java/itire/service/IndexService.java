package itire.service;

import itire.dao.mapper.LogsMapper;
import itire.model.po.Logs;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Lv on 2017/2/21.
 */
@Service
public class IndexService {
    private static final Logger logger = Logger.getLogger(IndexService.class);
    @Autowired
    private LogsMapper logsMapper;
    
    public Logs logs(Integer id){
        logger.info("execute IndexService.logs()");
        return logsMapper.selectByPrimaryKey(id);
    }
}
