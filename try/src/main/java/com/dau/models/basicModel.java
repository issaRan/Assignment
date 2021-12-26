package com.dau.models;

import com.dau.Interfaces.Model;
import com.dau.ObjectEntity.User;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class basicModel implements Model<Map<String, HashSet<String>>> {

    private Map<String, HashSet<String>> setHashMap;

    public basicModel() {
        this.setHashMap = new HashMap<>();

    }

    public void process(List<String> list) {
        User user = new User(list.get(0), list.get(1));
        HashSet<String> temp;
        if (setHashMap.containsKey(user.getDate())) {
            temp = setHashMap.get(user.getDate());
        } else {
            temp = new HashSet<>();
        }
        temp.add(user.getId());
        setHashMap.put(user.getDate(), temp);
    }

    @Override
    public Map<String, HashSet<String>> getAll() {
        return setHashMap;
    }

    @Override
    public Map<String, HashSet<String>> getGetByDate(String dateAsString) {
        Map<String, HashSet<String>> mapV2 = this.setHashMap.entrySet()
                .stream()
                .filter(map -> map.getKey().equals(dateAsString))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
        return mapV2;
    }

}

