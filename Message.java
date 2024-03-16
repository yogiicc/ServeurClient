public class Message {
    static Message decode (String Line); // decode Line et crée une instance de M...
    string encode () // encode le M... en string
    CmdType getCommand();
    Int getIntArg1(); setIntArg1(int N);
    Int getIntArg2();
    String getStrArg1();

    public void Message(int n){
        if(n == 1)
    }

    public void decode(String ligne){
        if( ligne == "WO"){
            message = new Message(1);
        }
    }
}
