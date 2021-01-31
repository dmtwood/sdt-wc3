package com.dimidev.observer.exercise3;

import java.util.ArrayList;
import java.util.List;

public class PrintSpooler {

    private List<Document> docsInQueue;

    private static PrintSpooler uniquePrintSpoolerInstance;

    // !! private ctor
    private PrintSpooler() {
        docsInQueue = new ArrayList<Document>();
    }

    public static PrintSpooler getInstance() {
        if (uniquePrintSpoolerInstance == null)
            uniquePrintSpoolerInstance = new PrintSpooler();
        return uniquePrintSpoolerInstance;
    }

    public List<Document> getDocsInQueue() {
        return docsInQueue;
    }

    public void  addDocument(Document anotherDocToPrint){
        docsInQueue.add(anotherDocToPrint);
    }

    public void processDocument(){
        if ( getDocsInQueue().size() > 0 ) {
            Document firstDoc = getDocsInQueue().remove(getDocsInQueue().size() -1);
            System.out.println(firstDoc);
        } else {
            System.out.println("No more docs in the print-queue.");
        }
    }

    public void removeDocument(Document docToRemove){
        docsInQueue.remove(docToRemove);
    }

    public void printDocuments(){
        System.out.println("*************************QUEUE BEGIN*****************************");
        for(Document d: docsInQueue)
            System.out.println(d);

        System.out.println("*************************QUEUE END*****************************");
    }
}
