package com.reco.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.reco.cn.dao.MemAddrDao;
import com.reco.cn.domain.MemAddrDO;
import com.reco.cn.service.MemAddrService;


@Service
public class MemAddrServiceImpl implements MemAddrService {
    @Autowired
    private MemAddrDao memAddrDao;

    @Override
    public MemAddrDO get(Integer id) {
        return memAddrDao.get(id);
    }

    @Override
    public List<MemAddrDO> list(Map<String, Object> map) {
        return memAddrDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return memAddrDao.count(map);
    }

    @Override
    public int save(MemAddrDO memAddr) {
        return memAddrDao.save(memAddr);
    }

    @Override
    public int update(MemAddrDO memAddr) {
        return memAddrDao.update(memAddr);
    }

    @Override
    public int remove(Integer id) {
        return memAddrDao.remove(id);
    }

    @Override
    public int batchRemove(Integer[] ids) {
        return memAddrDao.batchRemove(ids);
    }

}
