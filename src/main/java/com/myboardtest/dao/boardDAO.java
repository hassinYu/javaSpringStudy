package com.myboardtest.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class boardDAO extends AbstractDAO {
    public Integer selectCount() {
        return (Integer) selectOne("user.selectCount");
    }

    public List<Map<String, Object>> selectList() {
        return (List<Map<String, Object>>) selectList("user.selectList");
    }
}
