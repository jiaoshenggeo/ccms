package com.ccms.service;


import java.util.List;

import com.ccms.pojo.SysArea;

public interface AreaService {
	/**
	 * 获取所有列表
	 * @param areaType  区域等级
	 */
	public List<SysArea> getAreaList(SysArea area);
}
