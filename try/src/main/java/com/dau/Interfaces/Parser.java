package com.dau.Interfaces;

import java.util.HashSet;
import java.util.List;

public interface Parser<T> {
    T ParserByLogic(String fileAsString);
}
