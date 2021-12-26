package com.dau.Interfaces;

import java.util.List;

public interface Model<S> {
    void process(List<String> list);
    S getAll();
    S getGetByDate(String s);
}
