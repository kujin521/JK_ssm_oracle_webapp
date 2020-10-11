package cn.itcast.jk.dao.impl;

import cn.itcast.jk.dao.FactoryCDao;
import cn.itcast.jk.domain.FactoryC;
import org.springframework.stereotype.Repository;

/**
 * FactoryDaoImpl
 * todo
 *
 * @author kujin
 * 创建时间：2020/10/10
 * @version 1
 */
@Repository
public class FactoryDaoImpl extends BaseDaoImpl<FactoryC> implements FactoryCDao {
    //设置mapper命名控件
    public FactoryDaoImpl() {
        super.setNs("cn.itcast.jk.mapper.FactoryMapper");
    }
}
