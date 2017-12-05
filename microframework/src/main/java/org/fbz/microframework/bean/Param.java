package org.fbz.microframework.bean;

import java.util.Map;

import org.fbz.microframework.util.CastUtil;

public class Param {
    private Map<String, Object> paramMap;
    public Param (Map<String, Object> paramMap){
        this.paramMap = paramMap;
    }
    
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }
    
    public Map<String, Object> getMap(){
        return paramMap;
    }
}
