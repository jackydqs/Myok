package com.zking.oa.util;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class PageBean {

	private int page = 1;// ҳ��
	private int rows = 10;// ����/ҳ��С
	private int total = 0;// �ܼ�¼��

	private boolean pagination = true;// Ĭ�Ϸ�ҳ

	private String url;// ��һ������ĵ�ַ
	private Map<String, String[]> parameterMap;// ��һ����������в���

	public PageBean() {
		super();
	}

	/**
	 * �Է�ҳbean���г�ʼ��
	 * 
	 * @param request
	 */
	public void setRequest(HttpServletRequest request) {
		// ��������
		this.setPage(request.getParameter("page"));
		this.setRows(request.getParameter("rows"));
		this.setPagination(request.getParameter("pagination"));

		// �����ַ���������
		this.setUrl(request.getContextPath() + request.getServletPath());
		this.setParameterMap(request.getParameterMap());
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, String[]> getParameterMap() {
		return parameterMap;
	}

	public void setParameterMap(Map<String, String[]> parameterMap) {
		this.parameterMap = parameterMap;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setPage(String page) {
		if (null != page && !"".equals(page.trim())) {
			this.page = Integer.parseInt(page);
		}
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public void setRows(String rows) {
		if (null != rows && !"".equals(rows.trim())) {
			this.rows = Integer.parseInt(rows);
		}
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setTotal(String total) {
		this.total = Integer.parseInt(total);
	}

	public boolean isPagination() {
		return pagination;
	}

	public void setPagination(boolean pagination) {
		this.pagination = pagination;
	}

	public void setPagination(String pagination) {
		if ("false".equals(pagination)) {
			this.pagination = false;
		}
	}

	/**
	 * ��һҳ
	 * 
	 * @return
	 */
	public int getNextPage() {
		int nextPage = page + 1;
		if (nextPage > this.getMaxPage()) {
			nextPage = this.getMaxPage();
		}
		return nextPage;
	}

	/**
	 * ��һҳ
	 * 
	 * @return
	 */
	public int getPreviousPage() {
		int previousPage = page - 1;
		if (previousPage < 1) {
			previousPage = 1;
		}
		return previousPage;
	}

	/**
	 * ���ҳ��
	 * 
	 * @return
	 */
	public int getMaxPage() {
		return total % rows == 0 ? total / rows : total / rows + 1;
	}

	/**
	 * ��ʼ��¼���±�
	 * 
	 * @return
	 */
	public int getStartIndex() {
		return (page - 1) * rows;
	}

	@Override
	public String toString() {
		return "PageBean [page=" + page + ", rows=" + rows + ", total=" + total + ", pagination=" + pagination + "]";
	}

}
