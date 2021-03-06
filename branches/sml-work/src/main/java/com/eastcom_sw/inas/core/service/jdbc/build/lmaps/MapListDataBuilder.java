package com.eastcom_sw.inas.core.service.jdbc.build.lmaps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.eastcom_sw.inas.core.service.jdbc.build.lmaps.AbstractDataBuilder;

public class MapListDataBuilder extends AbstractDataBuilder{

	@Override
	public Object build(List<Map<String, Object>> datas) {
		Map<String,List<Object>> result=new LinkedHashMap<String, List<Object>>();
		for(Map<String,Object> data :datas){
			String key=data.get("key")+"";
			if(!result.containsKey(key)){
				result.put(key,new ArrayList<Object>());
			}
			result.get(key).add(data.get("value"));
		}
		return result;
	}

}
