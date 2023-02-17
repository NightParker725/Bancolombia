public class CircularList {
    private Turn head;

    public void darTurno(Turn node){
        if(head == null){
            head = node;
            head.setNext(head);
            head.setPrevious(head);
        }else{
            Turn tail = head.getPrevious();
            node.setNext(head);
            head.setPrevious(node);
            tail.setNext(node);
            node.setPrevious(tail);
        }
    }

    public int mostrarTurno(){
        if(head == null){
            return 0;
        }else{
            return head.getNum();
        }
    }
    public void pasarTurno(){
        int pass = head.getPass();
        head.setPass(pass+1);
        if(head.getPass()==3){
            delete(head.getNum());
        }
        else {
            head = head.getNext();
        }
    }

    public void delete(int goal){
        if(head == null){
            System.out.println("Lista vacia");
        }else{
            delete(head, goal);
        }
    }

    private void delete(Turn current, int goal){
        if(current.getNum()==goal){
            if(current == head){
                if(head.getNext()==head){
                    head = null;
                }
                else {
                    head.getPrevious().setNext(head.getNext());
                    head.getNext().setPrevious(head.getPrevious());
                    head = head.getNext();
                }


            }else{
                Turn prev = current.getPrevious();
                Turn next = current.getNext();
                prev.setNext(next);
                next.setPrevious(prev);
            }
            return;
        }
        if(current.getNext() == head){
            return;
        }
        delete(current.getNext(), goal);

    }



}
