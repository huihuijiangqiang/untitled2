package com.ChainResponsibilityPattern;

public class AnalyzeInformation {
    public String AnalyzeSavedInformation(String content,String delContent){


        String a=content.replace(delContent,"");

        return a;

    }
}
