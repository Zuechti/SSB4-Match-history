
/**
 * Beschreiben Sie hier die Klasse Stack.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Stack<ContentType>
{
    private class StackNode {

        private ContentType content = null;
        private StackNode nextNode = null;

        /**
         * Ein neues Objekt vom Typ StackNode<ContentType> wird erschaffen. <br />
         * Der Inhalt wird per Parameter gesetzt. Der Verweis ist leer.
         * 
         * @param pContent der Inhalt des Knotens
         */
        public StackNode(ContentType pContent) {
            content = pContent;
            nextNode = null;
        }

        /**
         * Der Verweis wird auf das Objekt, das als Parameter uebergeben wird,
         * gesetzt.
         * 
         * @param pNext der Nachfolger des Knotens
         */
        public void setNext(StackNode pNext) {
            nextNode = pNext;
        }

        /**
         * 
         * @return das Objekt, auf das der aktuelle Verweis zeigt
         */
        public StackNode getNext() {
            return nextNode;
        }

        /**
         * @return das Inhaltsobjekt vom Typ ContentType
         */
        public ContentType getContent() {
            return content;
        }
    }

    private StackNode head;
    
    public Stack(){
        
    }
    
    public boolean isEmpty(){
        return head==null;
    }

    public void push(ContentType pContent){
        if(pContent!=null){
            if(isEmpty()){
                head= new StackNode(pContent);
            }
            else{
                StackNode h= head;
                head= new StackNode(pContent);
                head.setNext(h);
            }
        }
    }
    
    public void pop(){
        if(!isEmpty()){
            head= head.getNext();
        }
    }
    
    public ContentType top(){
        return head.getContent();
    }
}