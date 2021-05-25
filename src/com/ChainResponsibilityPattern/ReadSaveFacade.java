package com.ChainResponsibilityPattern;

public class ReadSaveFacade {
    private ReadFile readFile;
    private AnalyzeInformation analyzeInformation;
    private SaveFile saveFile;

    public ReadSaveFacade(){
        readFile=new ReadFile();
        analyzeInformation=new AnalyzeInformation();
        saveFile=new SaveFile();
    }
    public void doRandS(String readFileName,String delContent){
        String str=readFile.readFileContent(readFileName);
        System.out.println("文本内容为：");
        System.out.println(str);
        String saveStr=analyzeInformation.AnalyzeSavedInformation(str,delContent);
        System.out.println("保存内容为：");
        System.out.println(saveStr);
        saveFile.save_File(saveStr);
    }
}
