package com.dau.Interfaces;

import java.util.HashMap;
import java.util.HashSet;

public interface Service<T,S> {
    void process();
    S getAll();
    S getByDate(String s);
}
