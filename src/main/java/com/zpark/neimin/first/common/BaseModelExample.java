package com.zpark.neimin.first.common;

public class BaseModelExample {
    //rowIndex: 每一页的开始行号
    //pageSize: 没一页共显示多少行
    private int rowIndex;
    private int pageSize;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
