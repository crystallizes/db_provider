package com.ccm.db_provider.service;

import com.ccm.db_provider.api.txoneService;
import com.ccm.db_provider.entity.txone;
import com.ccm.db_provider.mapper.txoneMapper;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class txoneImp implements txoneService {

    @Autowired  //(required=false)
    private txoneMapper txoneMapper;

    final Logger logger = LoggerFactory.getLogger(txoneService.class);

    @RequestMapping(value = "/alice")
    public void addLcn() {
        txone user = new txone(10, "sandy", 33);
        txoneMapper.insertUser(user);
        logger.info("insert order success !");
        logger.trace("trace");
        logger.debug("debug");
        logger.warn("warn");
        logger.error("error");
    }
}
