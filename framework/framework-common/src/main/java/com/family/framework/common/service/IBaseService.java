package com.family.framework.common.service;

import com.family.framework.common.pageutil.Page;
import com.family.framework.common.vo.BaseModel;


public interface IBaseService<M,QM extends BaseModel> {
	public void create(M m);
	public void update(M m);
	public void delete(int uuid);
	public M getByUuid(int uuid);
	public Page<M> getByConditionPage(QM qm);
}
