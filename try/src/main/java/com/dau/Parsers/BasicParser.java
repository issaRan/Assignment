package com.dau.Parsers;

import com.dau.Interfaces.Parser;

import java.util.Arrays;
import java.util.List;

public class BasicParser implements Parser<List<String>> {

    public BasicParser() {
    }

    public List<String> ParserByLogic(String fileAsString) {
        return Arrays.asList(fileAsString.replace(",", " ").split(" "));
    }
}
