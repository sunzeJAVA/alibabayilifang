package cn.e3mall.utils;

import java.io.Serializable;
import java.util.List;

public class EasyUiJson implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7823226457995285057L;
	private Long total;
	private List<?> rows;
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}
