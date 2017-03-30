package com.myboardtest.dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class boardDAO extends AbstractDAO {
    public Integer selectCount() {
        return (Integer) selectOne("user.selectCount");
    }
}
