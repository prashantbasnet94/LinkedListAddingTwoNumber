import java.util.LinkedList;

public class test {
	      
	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				LinkedList<Integer> listIntegerOne=new LinkedList<Integer>();
			    LinkedList<Integer> listIntegerTwo=new LinkedList<Integer>();
			    
				listIntegerOne.add(2);
				listIntegerOne.add(4);
				listIntegerOne.add(3);

				listIntegerTwo.add(5);
				listIntegerTwo.add(6);
				listIntegerTwo.add(4);
				
			
				
			 
				
				
			System.out.println(addTwoNumbers(listIntegerOne,listIntegerTwo));
				
			}
			
			
			public static <ListNode> ListNode addTwoNumbers(ListNode l1, ListNode l2) {
				String formulateNumberOne="";
				
				 
				String l1StringForm= l1.toString();

				char[] l1CharForm = l1StringForm.toCharArray();
				
				LinkedList<Integer> l1IntegerLinkedList = new LinkedList<Integer>();
				
				for (char c:l1CharForm) {
					 if(Character.isDigit(c)) {
						 l1IntegerLinkedList.add(Character.getNumericValue(c));
					 }
				}
			 
 				
 				String getl2InStringForm = l2.toString();
 				char[] breakL2InCharForm = getl2InStringForm.toCharArray();
 				
 				LinkedList<Integer> l2IntegerLinkedList= new LinkedList<Integer>();
 				
 				
 				for(char e: breakL2InCharForm) {
 					if(Character.isDigit(e)) {
 						l2IntegerLinkedList.add(Character.getNumericValue(e));
 					}
 				}
 				
// 				System.out.println(l1IntegerLinkedList);
// 				System.out.println(l2IntegerLinkedList);

 				String l1IntegerString = null;
 				for( int a: l1IntegerLinkedList) {
 					 if(l1IntegerString ==null) {
 						 l1IntegerString=Integer.toString(a);
 					 }else {
 						 l1IntegerString= l1IntegerString.concat(Integer.toString(a));
 					 }
 					 
 				}
 				
 				
 				// now convert string to integer for operation
 				
 				int l1Integer=Integer.parseInt(l1IntegerString);
  				
 				// since we have integer we do the same for another linkedList
 			
 				String l2IntegerString=null;
 				
 				for( int a: l2IntegerLinkedList) {
 					if(l2IntegerString== null) {
 						l2IntegerString= Integer.toString(a);
 					}else {
 						l2IntegerString = l2IntegerString.concat(Integer.toString(a));
 					}
 				}
 				
 				int l2Integer= Integer.parseInt(l2IntegerString);
 				 
 				String SumOfTwoIntegerLinkedList = Integer.toString(l1Integer+l2Integer);
 				char[] twoIntegerSummedArray = SumOfTwoIntegerLinkedList.toCharArray();
 				LinkedList<Integer> summedLinkedList = new LinkedList<Integer>();
 				
 				for (char a: twoIntegerSummedArray) {
 					summedLinkedList.add(Character.getNumericValue(a));
 				}
 				
 				return  (ListNode) summedLinkedList;

 				
			}

		}
