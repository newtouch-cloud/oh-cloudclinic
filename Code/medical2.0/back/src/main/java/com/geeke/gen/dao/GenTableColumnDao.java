package com.geeke.gen.dao;

import com.geeke.common.persistence.CrudDao;
import com.geeke.gen.entity.GenTableColumn;
import org.apache.ibatis.annotations.Mapper;

/**
 * 业务表管理DAO接口
 * @author lys
 * @version 2021-08-26
 */
@Mapper
public interface GenTableColumnDao extends CrudDao<GenTableColumn> {
}