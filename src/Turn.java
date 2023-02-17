public class Turn {

    private int num;
    private int pass;

    //enlaces
    private Turn next;
    private Turn previous;

    public Turn(int num, int pass) {
        this.num = num;
        this.pass = pass;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public Turn getNext() {
        return next;
    }

    public void setNext(Turn next) {
        this.next = next;
    }

    public Turn getPrevious() {
        return previous;
    }

    public void setPrevious(Turn previous) {
        this.previous = previous;
    }
}


