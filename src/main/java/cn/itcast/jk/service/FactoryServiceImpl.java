package cn.itcast.jk.service;

import cn.itcast.jk.dao.FactoryCDao;
import cn.itcast.jk.domain.FactoryC;
import cn.itcast.jk.pagination.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * FactoryServiceImpl
 * todo
 *
 * @author kujin
 * 创建时间：2020/10/10
 * @version 1
 */
@Service
public class FactoryServiceImpl implements FactoryService {
    @Resource
    FactoryCDao factoryCDao;
    @Override
    public List<FactoryC> findPage(Page page) {
        return null;
    }

    @Override
    public List<FactoryC> find(Map paraMap) {
        return factoryCDao.find(paraMap);
    }

    @Override
    public FactoryC get(Serializable id) {
        return null;
    }

    @Override
    public void insert(FactoryC entity) {

    }

    @Override
    public void update(FactoryC entity) {

    }

    @Override
    public void deleteById(Serializable id) {

    }

    @Override
    public void delete(Serializable[] ids) {

    }
}
