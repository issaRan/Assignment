package com.dau.service;

import com.dau.Interfaces.Model;
import com.dau.Interfaces.Parser;
import com.dau.Interfaces.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class BasicService implements Service<String, HashMap<String, HashSet<String>>> {

    private Parser basicParser;
    private Model model;
    private String fileAsString;

    public BasicService(Parser basicParser, Model model, String fileAsString) {
        this.basicParser = basicParser;
        this.model = model;
        this.fileAsString = fileAsString;
    }

    public void process() {
        try {
            File file = new File((String) fileAsString);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                List<String> s = (List<String>) this.basicParser.ParserByLogic(data);
                this.model.process(s);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public HashMap<String, HashSet<String>> getAll() {
         return (HashMap<String, HashSet<String>>) this.model.getAll();
    }

    public HashMap<String, HashSet<String>> getByDate(String s) {
        return ((HashMap<String, HashSet<String>>) this.model.getGetByDate(s));
    }
}
