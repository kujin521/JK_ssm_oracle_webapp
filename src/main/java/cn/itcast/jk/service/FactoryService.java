package cn.itcast.jk.service;

import cn.itcast.jk.domain.FactoryC;
import cn.itcast.jk.pagination.Page;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * FactoryService
 * todo
 *
 * @author kujin
 * 创建时间：2020/10/10
 * @version 1
 */
public interface FactoryService {
    public List<FactoryC> findPage(Page page);				//分页查询
    public List<FactoryC> find(Map paraMap);				//带条件查询，条件可以为null，既没有条件；返回list对象集合
    public FactoryC get(Serializable id);					//只查询一个，常用于修改
    public void insert(FactoryC factoryC);					//插入，用实体作为参数
    public void update(FactoryC factoryC);					//修改，用实体作为参数
    public void deleteById(Serializable id);		//按id删除，删除一条；支持整数型和字符串类型ID
    public void delete(Serializable[] ids);			//批量删除；支持整数型和字符串类型ID
}
