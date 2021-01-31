package com.dimidev.observer.exercise3;

public class PrintSpoolerApp {

    public static void main(String[] args) {
        PrintSpooler.getInstance().addDocument(new Document("Document1", 5, true));
        PrintSpooler.getInstance().addDocument(new Document("Document2", 15, true));
        PrintSpooler.getInstance().addDocument(new Document("Document3", 20, true));

        PrintSpooler.getInstance().processDocument();
        PrintSpooler.getInstance().printDocuments();
        PrintSpooler.getInstance().processDocument();
        PrintSpooler.getInstance().printDocuments();
        PrintSpooler.getInstance().processDocument();
        PrintSpooler.getInstance().processDocument();

    }


    }
