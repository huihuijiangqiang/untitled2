package com.Responsibility.two;

public class Application {
    private Handler int_t,long_t,biginteger_t;
    private void createChain(){
        int_t=new Int_type();
        long_t = new long_type();
        biginteger_t = new bigInteger_type();
        int_t.setNextHandler(long_t);
        long_t.setNextHandler(biginteger_t);
    }
    public void reponseClient(String number){
        int_t.handleRequest(number);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.createChain();
        application.reponseClient("92233720368547");
    }
}
