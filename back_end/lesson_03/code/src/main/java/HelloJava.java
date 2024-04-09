public class HelloJava {

    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public void getMessage(){
        System.out.println("The message is " + message);
    }

 /*   public void init(){
        System.out.println("Bean is initialised");
    }

    public void destroy(){
        System.out.println("The bean is destroyed");
    }

  */


}
