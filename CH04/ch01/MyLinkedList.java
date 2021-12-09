package ch01;

public class MyLinkedList {

   private MyListNode head;
   private int count;
   
   public MyLinkedList() {
      head = null;
      count = 0;
   }

   //���� �߰�
   public MyListNode addElement(String data) {
      MyListNode newNode = new MyListNode(data);;
      if(head == null) {
         head = newNode;
      }
      else {
         MyListNode temp = head;
         while(temp.next != null) {
            temp = temp.next;
         }
         temp.next = newNode;
      }
      count++;
      return newNode;
   }
   
   //�ش� ��ġ�� �߰�
   public MyListNode insertElement(int position, String data) {
      MyListNode tempNode = head;
      MyListNode newNode = new MyListNode(data);
      
      if(position < 0 || position > count) {
         System.out.println("�߰� �� ��ġ �����Դϴ�. ���� ����Ʈ ������ "+ count + "�� �Դϴ�.");
         return null;
      }
      
      if(position == 0) {
         newNode.next = head;
         head = newNode;
      }
      else {
         MyListNode preNode = null;
         for(int i=0; i<position; i++) {
            preNode = tempNode;
            tempNode = tempNode.next;
         }
         newNode.next = preNode.next;
         preNode.next = newNode;
      }
      count++;
      return newNode;
   }
   
   //��ġ ��� ����
   public MyListNode removeElement(int position) {
      MyListNode tempNode = head;
      
      if(position < 0 || position > count) {
         System.out.println("������ ��ġ �����Դϴ�. ���� ����Ʈ ������" + count + "�� �Դϴ�.");
         return null;
      }
      if(position == 0) {
         head = tempNode.next;
      }
      else {
         MyListNode preNode = null;
         for(int i=0; i<position; i++) {
            preNode = tempNode;
            tempNode = tempNode.next;
         }
         preNode.next = tempNode.next;
      }
      count--;
      System.out.println(position + "��° �׸� �����Ǿ����ϴ�.");
      
      return tempNode;
   }
   
   public MyListNode getElement(int position) {
      MyListNode tempNode = head;
      
      if(position < 0 || position > count ) {
         System.out.println("�˻��� ��ġ �����Դϴ�. ���� ����Ʈ ������" + count + "�� �Դϴ�.");
         return null;
      }
      if(position == 0) {
         return head;
      }

      for(int i=0; i<position; i++) {
         tempNode = tempNode.next;
      }
      return tempNode;
   }
   
   public void removeAll() {
      head = null;
      count = 0;
   }
   
   public int getSize()
   {
      return count;
   }
   
   public void printAll()
   {
      if(count == 0){
         System.out.println("����� ������ �����ϴ�.");
         return;
      }
      
      MyListNode temp = head;
      while(temp != null){
         System.out.print(temp.getData());
         temp = temp.next;
         if(temp!=null){
            System.out.print("->");
         }
      }
      System.out.println("");
   }
   
   public boolean isEmpty() {
      if(head == null) return true;
      else return false;
   }
}