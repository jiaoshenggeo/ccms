package com.ccms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.SelectProvider;

import com.ccms.dao.provider.AreaDynaSqlProvider;
import com.ccms.pojo.SysArea;

public interface AreaDao {
	@SelectProvider(type = AreaDynaSqlProvider.class, method = "selectWithParam")
	public List<SysArea> selectAreaList(Map<String, Object> params);
}
