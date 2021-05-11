## Handler
```java
public interface Handler {
    public abstract void handleRequest(String number);
    public abstract void setNextHandler(Handler handler);
}
```
## ConcreteHandler
```java
public class Int_type implements Handler{
    private Handler handler;
    @Override
    public void handleRequest(String number) {
        //判断是否为INT
        String flag="2147483647";
        System.out.println(number.compareTo(flag));
        if (number.length()<flag.length()){
            System.out.println(Math.sqrt(Integer.parseInt(number)));
        }else if (number.length()==flag.length() && number.compareTo(flag)<0){
            System.out.println(Math.sqrt(Integer.parseInt(number)));
        }
        else {
            System.out.println("不是int");
            if (handler!=null)
                handler.handleRequest(number);
        }
    }
    @Override
    public void setNextHandler(Handler handler) {
        this.handler=handler;
    }
}

public class long_type implements Handler{
    private Handler handler;

    @Override
    public void handleRequest(String number) {
        //判断是否为INT
        String flag="9223372036854774807";
        if (number.length()<flag.length()){
            System.out.println(Math.sqrt(Long.parseLong(number)));
        }else if (number.length()==flag.length() && number.compareTo(flag)<0){
            System.out.println(Math.sqrt(Long.parseLong(number)));
        }
        else {
            System.out.println("不是long");
            if (handler!=null)
                handler.handleRequest(number);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler=handler;
    }
}

public class bigInteger_type implements Handler{
    private Handler handler;
    @Override
    public void handleRequest(String number) {
        BigInteger n=new BigInteger(number);
        System.out.println(n.sqrt());
    }
    @Override
    public void setNextHandler(Handler handler) {
        this.handler=handler;
    }
}

```
## Application 
```java
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
        application.reponseClient("947483647");
    }
}

```