package com.HitCount.service;

import com.HitCount.model.Visiter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class VisiterService {
    Map<String,Integer> mp = new HashMap<String, Integer>();
    public Visiter getcount(String username)
    {
        mp.put(username,mp.getOrDefault(username,0)+1);
        return new Visiter(username,mp.get(username));
    }

}
