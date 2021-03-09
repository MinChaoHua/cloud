package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
public class PageEntity<K,T> {
    private int page; // 页数
    private int size; // 页面条数
    private Map<K,T> map; // 条件
    private int offSet;// 数据库的偏移
    private int limit;  // 数据库的大小限制

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Map<K, T> getMap() {
        return map;
    }

    public void setMap(Map<K, T> map) {
        this.map = map;
    }

    public int getOffSet() {
        return (page-1)*size;
    }

    public int getLimit() {
        return size;
    }
}
