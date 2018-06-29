package com.textanalizer.server.model;

import java.util.ArrayList;

public class UploadFileResponse {
    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;
    private ArrayList<String> wordslist;
    private boolean correctBrackets;



    public ArrayList<String> getWordslist() {
        return wordslist;
    }

    public void setWordslist(ArrayList<String> wordslist) {
        this.wordslist = wordslist;
    }

    public boolean isCorrectBrackets() {
        return correctBrackets;
    }

    public void setCorrectBrackets(boolean correctBrackets) {
        this.correctBrackets = correctBrackets;
    }

    public UploadFileResponse(String fileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }

    public UploadFileResponse(String fileName, ArrayList<String> wordslist, boolean correctBrackets) {
        this.fileName = fileName;
        this.wordslist = wordslist;
        this.correctBrackets = correctBrackets;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    public void setFileDownloadUri(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "UploadFileResponse{" +
                "fileName='" + fileName + '\'' +
                ", wordslist=" + wordslist +
                ", correctBrackets=" + correctBrackets +
                '}';
    }
}