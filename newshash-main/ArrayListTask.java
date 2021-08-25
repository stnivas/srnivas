
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;

public class ArrayListTask extends ArrayList<Long>{
		static Scanner input=new Scanner(System.in);
	
	
	
//Question1
	public  ArrayList<String> createArrayList(){
	  ArrayList<String> listOne= new ArrayList<String>();
	  return listOne;
	}
	
//Question2
	public static ArrayList<String> addString(String names[]){
	 ArrayList<String> listTwo= new ArrayList<String>();
		
			for(int run=0;run<names.length;run++){
				listTwo.add(names[run]);
			}
	 return  listTwo;
  }
//Question3
	public ArrayList<Integer> addIntegers(int number[]){
	  ArrayList<Integer>listThree=new ArrayList<Integer>();
		
			for(int run=0;run<number.length ;run++){
				listThree.add(number[run]);
			}	
	return listThree;
		}
	
//Question4
	 public ArrayList<ArrayListTask>addCustomObjects(){
	   ArrayList<ArrayListTask> listFour=new ArrayList<>();
       ArrayListTask obj1=new ArrayListTask();
       ArrayListTask obj2=new ArrayListTask();
       listFour.add(obj1);
       listFour.add(obj2);
	 return  listFour;             
	}
	
//Question5
	public ArrayList<Object> addMultiValues(int[] numbers, String[]studentName){
	  ArrayList<Object> list=new ArrayList<Object>();
 	  
 	  		for(int run=0; run<numbers.length;run++){
 	     		list.add(numbers[run]);
 	        }
 	        
 	 	    for(int run=0; run<studentName.length;run++){
 	    		list.add(studentName[run]);
 	   		 }
 	   		  
 	  ArrayListTask obj1=new ArrayListTask();
 	  ArrayListTask obj2=new ArrayListTask();
      list.add(obj1);
      list.add(obj2);
      
      //System.out.println("arraylist:"+list);
      //int len=list.size();
      //System.out.println("arraylist size"+len);
       return list;
         }
//Question6      
	 public int findIndex(ArrayList<String> listSix,String animalName){	
   	   int value= listSix.indexOf(animalName);
   	   return value;
     }

//Question7
	public void stringIterator(ArrayList<String>listSeven){
      Iterator runs=listSeven.iterator();
  
			while(runs.hasNext()){
			  System.out.println("LIST ELEMENT=" +runs.next());
      	   }
	}
//Question8
	public  String printStringGivenIndex(ArrayList<String> listEight, int index){
	        
	        String name=listEight.get(index);	
	        
	        //.out.println("arraylistSize="+list.size());
	      //  System.out.println("arraylist="+list);
	        return name;
	}
//Question9 	
    public int[] findIndexOfDuplicate(ArrayList<String> listNine, String dummy){
		
		int firstIndex=listNine.indexOf(dummy);
		int lastIndex=listNine.lastIndexOf(dummy);
		int[] indexArray=new int[]{firstIndex,lastIndex };
		return indexArray;
    }
//Question10        
	public ArrayList<String> addingSecondPosition(ArrayList<String> tenList,int position ,String addPosition){
	     tenList.add(position , addPosition);
	     return tenList;
	 }
//Question11  
	public int[] createSecondArrayList(ArrayList<String> oneList,int one,int two){
		
		List<String> listTwo=new ArrayList<String>();
		listTwo=oneList.subList(one,two);
        return new int[]{ oneList.size() , listTwo.size()};
    }
        

//Question 12     
	public ArrayList<String> createThirdListUseAboveList(ArrayList<String>addOne, ArrayList<String>addTwo){

        ArrayList<String> thirdList=new ArrayList<String>();
        thirdList.addAll(addOne);
	    thirdList.addAll(addTwo );
        return thirdList;
     }	
    
     

    
//Question14       
	public ArrayList<Double> removeecimalValue(Double[] first, int delete){
		ArrayList<Double> deleteList=new ArrayList<Double>();

	    	for(int run=0; run<first.length; run++){ 
	    
        		 
 	             	 deleteList.add(first[run]);         	 
	           		 System.out.println("REMOVED VALUE "+deleteList.remove(delete));
             		 System.out.println("arraylist con't removed because your giveing wrong input");
                }
         return deleteList;
	  }
	  
//Question15      
	public ArrayList<Double> removeForthDecimalValue(Double[]second, int position){
  	    ArrayList<Double> listAdd =new ArrayList<Double>();
			
			for(int run=0; run<second.length; run++){
	  			listAdd.add(second[run]);
	}
	    listAdd .remove(position);
        return listAdd ;
    }
//Question16
	public ArrayListTask  removeLongValue(Long[] third,int firstNumber,int secondNumber){
       ArrayListTask addlist=new ArrayListTask ();
       
       		for(int run=0; run<third.length;run++){
      		     addlist.add(third[run]);
      	    }
       addlist.removeRange(firstNumber,secondNumber);
       return addlist;
    }     
//Question17   
	public ArrayList<String> removeElementFromFirst(ArrayList<String> firstOneList,ArrayList<String> secondOneList){         
       firstOneList.removeAll(secondOneList);
       return firstOneList;
   }
    
//Question18
    public  ArrayList<String> removeValueNotPresent(ArrayList<String> listFirsts,ArrayList<String> listSeconds){
   		
 	   listFirsts.retainAll(listSeconds);
 	   return listFirsts;
	}
//Question19
 	public  ArrayList<Long> removeAllLongValues(long [] big){
 		ArrayList<Long> listClear=new ArrayList<Long>();	
 		 
 		 	for(int run=0;run<big.length; run++){
            	  listClear.add(big[run]);
       	     }
      	 listClear.clear();
      	 return listClear;
     }
//Question20      	
     public ArrayList<String> checkList(ArrayList<String> lastList, String[] check){
          System.out.println( lastList.contains(check));
          return lastList;
     }
     
    
	public static void main(String[] args){
	 ArrayListTask obj=new ArrayListTask();
	    int choice=0;
		try{ 
	     System.out.println("ENTER YOUR CHOICE");
	      choice=input.nextInt();
	   }
	   catch(InputMismatchException e){
	   System.out.println("ENTER THE PROPER INPUT");
	   }
	   
	switch (choice) {
	 
        case 1:
               ArrayList<String> listOne=obj. createArrayList();
			   System.out.println("ARRAYLIST "+listOne);
			   System.out.println("ARRAYLIST SIZE "+listOne.size());
               System.out.println("SUCCESSFULLY");
        break;
                
        case 2:
                   
               System.out.println("ENTER THE NUMBER OF STRING YOU WANT TO ADD LIST");
               int count = 0; 
               try {
               count=input.nextInt();
               
               String[]names=new String[count];
               System.out.println("ENTER THE"+ " "+count+ " "  + "STRING");
                
		       		for(int run=0;run<count;run++){
		      			 System.out.println("ENTER THE STRINGS");
		      		 	 names[run]=input.next();
                    }
               
                
               ArrayList<String> listTwo =obj.addString(names);
               System.out.println("LIST SIZE="+listTwo. size());
	   	       System.out.println("YOUR LIST="+listTwo);
               System.out.println("SUCCESSFULLY");
               }
              catch(InputMismatchException e){
                System.out.println("PLEASE ENTER PROPER INPUT");

                 } 
          
               
         break;
              
        case 3:
               System.out.println("ENTER THE NUMBERS YOU WANT TO ADD LIST");
              try{ 
               count =input.nextInt();
               int number[]=new int[count];
               System.out.println("ENTER THE " + count + " NUMBERS");
               
              	 for(int run=0;run<count;run++){
                	 System.out.println("ENTER THE NUMBER");
		           	 number[run]=input.nextInt();
                 }
              ArrayList<Integer> listThree=obj.addIntegers(number);
			  System.out.println("ARRAYLIST=" +  listThree);		   
              System.out.println("SIZE OF LIST=" +  listThree.size());
              System.out.println("SUCCESSFULLY");
              }
            
            catch(InputMismatchException e){
              System.out.println("PLEASE ENTER PROPER INPUT");

            } 
              
        break;
                
       case 4:
			  ArrayList<ArrayListTask> listFour=obj.addCustomObjects();
			  System.out.println("ARRAYLIST="+listFour);
			  System.out.println("ARRAYLIST SIZE="+listFour.size());
              System.out.println("SUCCESSFULLY");
       break;
              
              
       case 5:
              System.out.println("HOW MUCH INTEGERS YOU NEED TO ADD LIST");
              
             try{ 
              count=input.nextInt();
              int  numbers[] =new int[count];
              System.out.println("ENTER THE " + count+ " NUMBER");
              
                   for(int run=0; run<count;run++){
                     System.out.println("ENTER THE NUMBER");
                     numbers[run]=input.nextInt();
                     }
                     
              System.out.println("HOW MUCH STRINGS YOU NEED TO ADD LIST");
              count=input.nextInt();
              String studentName[] =new String[count];
              
                  for(int run=0; run<count; run++){
                    System.out.println("ENTER THE STRING");
                    studentName[run]=input.next();
                  } 
       
             ArrayList<Object> list=obj.addMultiValues(numbers, studentName);
             System.out.println("ARRAYLIST"+list);
             System.out.println("ARRAYLIST SIZE="+list.size());
             System.out.println("SUCCESSFULLY");
           }
             
           catch(InputMismatchException e){
              System.out.println("PLEASE ENTER PROPER INPUT");
              } 
      break;
              
      case 6:
             System.out.println("HOW MUCH ANIMALS NAMES YOU NEED TO ADD LIST");
             
            try{ 
             count=input.nextInt();
             String animals[]=new String [count];
             System.out.println("ENTER THE " + count+" ANIMALS NAMES");
                      
                 for(int run=0; run<count; run++){
                    animals[run]=input.next();
                 }
             System.out.println("ENTER THE ANY ONE OF ANIMAL NAME IN GIVE LIST TO FIND THE INDEX");
             
             String animalName=input.next();  
             ArrayList<String> listSix=addString(animals);
             int value=obj.findIndex(listSix,animalName);
             
              if(value==-1){
              System.out.println("VALUE DOESN'T EXIST");
               }
              else{             
			 System.out.println("INDEX OF ANIMAL NAME=:"+value);
			 }
		     System.out.println("ARRAYLIST:"+listSix);
   	         int len = listSix.size();
   	         System.out.println("ARRAYLIST SIZE:"+len);
   	       }
   	       
   	       catch(InputMismatchException e){
              System.out.println("PLEASE ENTER PROPER INPUT");
           } 
      break;
              
              
     case 7:
		    System.out.println("HOW MUCH VALUE YOU NEED TO ADD LIST");
		    
		  try{  
 	        count=input.nextInt();
 	        String name[]=new String[count];
 	        System.out.println("ENTER "+ count +" NAME");
 	        
	 	  	   for(int run=0; run<count;run++){
				     name[run]=input.next();
			  }
		    ArrayList<String> listSeven =addString(name);
            obj.stringIterator(listSeven);
				  // System.out.println("arraylist="+list);
            System.out.println("SUCCESSFULLY");
            }
          catch(InputMismatchException e){
            System.out.println("PLEASE ENTER PROPER INPUT");
        } 
      break;
              
              
    case 8:
		    System.out.println("HOW MUCH ELEMENTS YOU NEED TO ADD LIST");
		  try{  
            count=input.nextInt();
            String names[]=new String [count];
            System.out.println("ENTER " + count+" NAME");
        	    for(int run=0;  run<count; run++){
                    names [run]=input.next();
                 }
		   System.out.println("PLEASE ENTER THE ANY ONE INDEX OF GIVEN LIST");
	       int index=input.nextInt();
	       ArrayList<String> listEight=addString(names);
	       
            String name=obj.printStringGivenIndex(listEight,index);
              
           System.out.println("INDEX OF GIVEN NAME="+name);
           System.out.println("ARRAYLIST="+listEight);
           System.out.println("SIZE OF LIST="+listEight.size());
           System.out.println("SUCCSESSFULLY");
        }
        catch(InputMismatchException e){
            System.out.println("PLEASE ENTER PROPER INPUT");
         } 
           
     break;
              
              
    case 9:
           System.out.println("HOW MUCH VALUE YOU NEED TO ADD LIST");
         try{  
           count=input.nextInt();
            String[]names=new String [count];
           System.out.println("ENTER THE " + count+" STRING");
                for(int run=0;  run<count; run++){
                   names[run]=input.next();
                 }
                      
            System.out.println("ENTER THE ONE NAME OF GIVEN LIST");
              if(dummy==-1){
              System.out.println("VALUE DOESN'T EXIST");
              }else{
              
             String dummy=input.next();
                      
            ArrayList<String> listNine=addString(names);    
            int[] answer = obj.findIndexOfDuplicate(listNine , dummy);
            System.out.println(answer[0] + " " + answer[1]);
            System.out.println("SUCCESFULLY");
          }
         } 
          catch(InputMismatchException e){
          System.out.println("PLEASE ENTER PROPER INPUT");
         }  
      break;
              
              
                case 10:
				    
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String added[]=new String [count];
                      
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      added[run]=input.next();
				
					  }
					  System.out.println("enter the position");
					  int position=input.nextInt();
					  System.out.println("enter the string add list");
					  String  addPosition=input.next();
					  ArrayList<String> tenList=addString(added);
                   ArrayList<String> listTen=obj.addingSecondPosition(tenList, position,addPosition);
                   System.out.println("size of list" +listTen.size());
                   System.out.println("arrayList" + listTen);
                   System.out.println(" successfully");
                break;
 
                case 11:
				      System.out.println("enter the minimum 10 string ");
                      count=input.nextInt();
                      String value[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      value[run]=input.next();
				
					  }
					  int one = 0, two = 0;
					 try{ System.out.println("enter the start index");
					  one=input.nextInt();
					  System.out.println("enter the end Index");
					  two=input.nextInt();
					  }
					  catch(ArrayIndexOutOfBoundsException e){
					  System.out.println("enter the index properly");
					  }
					  ArrayList<String> oneList=addString(value);
                      int[]find = obj.createSecondArrayList(oneList,one,two);
                 
                   System.out.println("arrayList size"+find[0]);
                   System.out.println("arrayList size"+find[1]);
                   System.out.println(" successfully");
                break;
              
             
               case 12:
				
				  
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String valueOne[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      valueOne[run]=input.next();
				
					  }	  
				      System.out.println("how much string you need to be list two");
                      count=input.nextInt();
                      String valueTwo[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      valueTwo[run]=input.next();
				
					  }
					  
					ArrayList<String> addOne=addString(valueOne);
					ArrayList<String> addTwo=addString(valueTwo);
					 
                 ArrayList<String> listThrees= obj.createThirdListUseAboveList(addOne,addTwo);
                 System.out.println("array third list"+listThrees.size());
                 System.out.println("array third list"+listThrees);
                 
                   System.out.println(" successfully");
                break;
              
              
               case 13:
				
				
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String once[] = new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      once[run]=input.next();
				
					  }	  
				      System.out.println("how much string you need list two");
                      count=input.nextInt();
                      String secondOne[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0; run<count; run++){
                      secondOne[run]=input.next();
				
					  }
					    
					 ArrayList<String> listFirst=addString(once);
					ArrayList<String> listSecond=addString(secondOne);
                   ArrayList<String> thirdList = obj.createThirdListUseAboveList(listSecond,listFirst);
                 
                   System.out.println("third arrayList size"+ thirdList.size());
                   System.out.println("third arrayList size"+ thirdList);
                   System.out.println(" successfully");
                break;
             
              
                case 14:
				
				
				      System.out.println("how much decimal value you need");
                      count=input.nextInt();
                     Double first[]=new Double [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      first[run]=input.nextDouble();
					  }
					  System.out.println("enter the delete index");
					  
					  int delete=input.nextInt();
					  
                       ArrayList<Double> deleteList =obj.removeecimalValue(first, delete);
                       System.out.println("ArrayList"+deleteList.size());
                       System.out.println("ArrayList"+deleteList);
                       System.out.println(" successfully");
                break;
              
              
                case 15:
				
				      System.out.println("please enter the minimun 5 decimal values");
                      count=input.nextInt();
                      Double second[]=new Double [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      second[run]=input.nextDouble() ; 
					  }
					  
					  System.out.println("enter the position you want remova list");
					   position=input.nextInt();
                   ArrayList<Double> listAdd =obj.removeForthDecimalValue(second,position);
                    System.out.println("arrayList="+listAdd);
      
                    System.out.println("size of arrayList="+listAdd.size());
                   System.out.println(" successfully");
                break;
              
              
                case 16:
				
				      System.out.println("how much decimal value you need");
                      count=input.nextInt();
                      Long third[]=new  Long [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      third[run]=input.nextLong() ; 
					  }
					  System.out.println("enter the start value of remove");
					   int firstNumber=input.nextInt();
					  System.out.println("enter the end value of remove");
					  int  secondNumber=input.nextInt();
                 ArrayList<Long> addList = obj.removeLongValue(third,firstNumber,secondNumber);
                 
               System.out.println("Arraylist size"+addList.size());
               System.out.println("Arraylist"+addList);
                   System.out.println(" successfully");
                break;
              
              
                case 17:
								
				      System.out.println(" Enter the number of values : ");
                      count=input.nextInt();
                      String firstValue[]=new  String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      firstValue[run]=input.next() ; 
					  }
					  System.out.println("how much  value you need list two");
                      count=input.nextInt();
                      String secondValue[]=new String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      secondValue[run]=input.next() ; 
					  }
				
				ArrayList<String> firstOneList=addString(firstValue);
				ArrayList<String> secondOneList=addString(secondValue);
  			    ArrayList<String> list=	 obj.removeElementFromFirst(firstOneList,secondOneList);
			    int len=list.size();
				System.out.println("arraylist ="+list);
				System.out.println("arraylist size="+len);
				 
                   System.out.println(" successfully");
                break;
              
              
                case 18:
							
				      System.out.println(" Enter the number of values : ");
                      count=input.nextInt();
                      String numOne[]=new  String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      numOne[run]=input.next() ; 
					  }
					  System.out.println("Enter the number of values you need to add list two ");
                      count=input.nextInt();
                      String numTwo[]=new String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      numTwo[run]=input.next() ; 
				   }
				   
				   ArrayList<String> listFirsts=addString(numOne);
				   ArrayList<String> listSeconds=addString(numTwo);
                  ArrayList<String> firstList= obj.removeValueNotPresent(listFirsts,listSeconds);
                  System.out.println(" first ArrayList"+ firstList);
                  System.out.println("first ArrayList"+firstList.size());
                  
                   System.out.println(" successfully");
                break;
              
              
                case 19:
                 	System.out.println("how much number you add to list");
                 	count=input.nextInt();
                 	long[] big=new long[count];
                 	System.out.println("enter the" +count+" number");
                 	for(int run=0;run<count; run++){
                 	big[run]=input.nextLong();
                }
                
               ArrayList<Long> listClear= obj.removeAllLongValues(big);
               System.out.println("arrayList"+  listClear);
            
               System.out.println("arrayList size "+listClear.size());
                   System.out.println(" successfully");
          
                break;
                
                case 20:
                    	System.out.println("enter the string you need");
                       	count=input.nextInt();  
                        String[] nameList=new String[count];
                        System.out.println("enter the "+ count+ "string");
                        for(int run=0;run<count; run++){
                             nameList[run]=input.next();
                             }
                             
         
         
                    	System.out.println("enter the string you need to check");
                       	count=input.nextInt();  
                        String[] check=new String[count];
                        System.out.println("enter the "+ count+ "string");
                        for(int run=0;run<count; run++){
                             check[run]=input.next();
                         }           
                         
                      ArrayList<String> lastList=addString(nameList);
                      ArrayList<String> last =obj.checkList(lastList, check);
                         
                    
                      System.out.println("size of arraylist"+last.size());
                     System.out.println("arraylist"+last);
                
                break;
                
           }      
	    }
	}
	
	
	
	
	
