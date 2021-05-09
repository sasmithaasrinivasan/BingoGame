package case1;
import java.awt.*;
import javax.swing.*;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.*;
import java.awt.event.*;



public class hello {
	
	public static int[][] check1 = new int[5][5];
    public static int[][] check2 = new int[5][5];
    public static int[] row1 = new int[5];
    public static int[] col1 = new int[5];
    public static int[] row2 = new int[5];
    public static int[] col2 = new int[5];
    public static int turn1=0,turn2=0;
    public static int[][] index1 = new int[25][3];
    public static int[][] index2 = new int[25][3];
    public static int d1=0,d2=0,count1=0,count2=0,di1=0,di2=0;
    public static void verify1() {
    	int i,j;
    	for (i=0;i<5;i++) {
    		if (row1[i]==0) {
    			int flag=0;
    			for (j=0;j<5;j++) {
    				if (check1[i][j]==0) {
    					flag=1;
    					break;
    				}
    			}
    			if (flag==0) {
    				row1[i]=1;
    				count1+=1;
    			}
    		}
    	}
    	for (j=0;j<5;j++) {
    		if (col1[j]==0) {
    			int flag=0;
    			for (i=0;i<5;i++) {
    				if (check1[i][j]==0) {
    					flag=1;
    					break;
    				}
    			}
    			if (flag==0) {
    				col1[j]=1;
    				count1+=1;
    			}
    		}
    	}
    	if (d1==0) {
    		if(check1[0][0]==1 && check1[1][1]==1 && check1[2][2]==1 && check1[3][3]==1 && check1[4][4]==1) {
    			d1=1;
    			count1+=1;
    			
    		}
    	}
    	if (d2==0) {
    		if(check1[0][4]==1 && check1[1][3]==1 && check1[2][2]==1 && check1[3][1]==1 && check1[4][0]==1) {
    			d2=1;
    			count1+=1;
    			
    		}
    	}
    	System.out.println(count1);
    	if (count1>=5) {
    		System.out.println("Player 1 won");
    	JFrame frame1 = new JFrame("Display Area");
  	      Container cp = frame1.getContentPane();
  	      JButton stri = new JButton("Player 1 has won");
  	      cp.add(stri);
  	    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame1.setSize(280,280);  // or pack() the components
	      frame1.setLocationRelativeTo(null);  // center the application window
	      frame1.setVisible(true); 
    	}
    }
    public static void verify2() {
    	System.out.println(count2);
    	int i,j;
    	for (i=0;i<5;i++) {
    		if (row2[i]==0) {
    			int flag=0;
    			for (j=0;j<5;j++) {
    				if (check2[i][j]==0) {
    					flag=1;
    					break;
    				}
    			}
    			if (flag==0) {
    				row2[i]=1;
    				count2+=1;
    			}
    		}
    	}
    	for (j=0;j<5;j++) {
    		if (col2[j]==0) {
    			int flag=0;
    			for (i=0;i<5;i++) {
    				if (check2[i][j]==0) {
    					flag=1;
    					break;
    				}
    			}
    			if (flag==0) {
    				col2[j]=1;
    				count2+=1;
    			}
    		}
    	}
    	
    	if (di1==0) {
    		if(check2[0][0]==1 && check2[1][1]==1 && check2[2][2]==1 && check2[3][3]==1 && check2[4][4]==1) {
    			di1=1;
    			count2+=1;
    			
    		}
    	}
    	if (di2==0) {
    		if(check2[0][4]==1 && check2[1][3]==1 && check2[2][2]==1 && check2[3][1]==1 && check2[4][0]==1) {
    			di2=1;
    			count2+=1;
    			
    		}
    	}
    	System.out.println(count2);
    	if (count2>=5) {
    		System.out.println("Player 2 won");
    	JFrame frame1 = new JFrame("Display Area");
  	      Container cp = frame1.getContentPane();
  	      JButton stri = new JButton("Player 2 has won");
  	      cp.add(stri);
  	    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame1.setSize(280,280);  // or pack() the components
	      frame1.setLocationRelativeTo(null);  // center the application window
	      frame1.setVisible(true); 
    	}
    }
	
	   public static void main(String[] args) {
		   for (int k=0; k<5;k++) {
		    	row1[k]=0;
		    	col1[k] = 0;
		    	row2[k]=0;
		    	col2[k]=0;
		    }
		   
	      JFrame frame = new JFrame("Display Area");
	      JFrame frame1 = new JFrame("Display Area");
	      Container cp = frame.getContentPane();
	      cp.setLayout(new FlowLayout());
	      Container cp1 = frame1.getContentPane();
	      cp1.setLayout(new FlowLayout());
	      
	      final JButton[][] bingo1 = new JButton[5][5];
	      final JButton[][] bingo2 = new JButton[5][5];
	      
	      
	      int i=0,j=0;
	      Random randNum = new Random();
	      Set<Integer>set = new LinkedHashSet<Integer>();
	      while (set.size() < 25) {
	         set.add(randNum.nextInt(25)+1);
	      }
	      
	      //System.out.println("Random numbers with no duplicates = "+set);
	      Iterator<Integer> it = set.iterator();
	      for (i=0;i<5;i++) {
	    	  for (j=0;j<5;j++) {
	    		  int temp = it.next();
	    		  bingo1[i][j] = new JButton(String.valueOf(temp));
	    		  index1[temp-1][0] = temp;
	    		  index1[temp-1][1] = i;
	    		  index1[temp-1][2] = j;
	    		  check1[i][j] = 0;
	    		 
	    		 
	    		  final int i1=i;
	    		  final int j1=j;
	    		  bingo1[i][j].addActionListener(new ActionListener(){  
	    			  public void actionPerformed(ActionEvent e){  
	    				  if (turn1==0) {
	    					  	 turn1=1;
	    					  	 turn2=0;
	    				         String ab = bingo1[i1][j1]. getText();
	    				         int tee = Integer.parseInt(ab);
	    				         int i2,j2;
	    				         i2 = index2[tee-1][1];
	    				         j2 = index2[tee-1][2];
	    				         bingo2[i2][j2].setBackground(Color.red);
	    			             bingo1[i1][j1].setBackground(Color.red); 
	    			             check2[i2][j2]=1;
	    			             check1[i1][j1]=1;
	    			             
	    			             
	    			             verify1();
	    			             verify2();
	    				  }
	    			  }  
	    			  }); 
	    		  cp.add(bingo1[i][j]);
	    		  
	    	  }
	      }
	      
	     
	      Set<Integer>set1 = new LinkedHashSet<Integer>();
	      while (set1.size() < 25) {
	         set1.add(randNum.nextInt(25)+1);
	      }
	      Iterator<Integer> it1 = set1.iterator();
	      //System.out.println("Random numbers with no duplicates = "+set1);
	      for (i=0;i<5;i++) {
	    	  for (j=0;j<5;j++) {
	    		  int temp = it1.next();
	    		  bingo2[i][j] = new JButton(String.valueOf(temp));
	    		  check2[i][j] = 0;
	    		  index2[temp-1][0] = temp;
	    		  index2[temp-1][1] = i;
	    		  index2[temp-1][2] = j;
	    		  final int i1=i;
	    		  final int j1=j;
	    		  bingo2[i][j].addActionListener(new ActionListener(){  
	    			  public void actionPerformed(ActionEvent e){  
	    				  if (turn2==0) {
	    					  	 turn2=1;
	    					  	 turn1=0;
	    				         String ab = bingo2[i1][j1]. getText();
	    				         int tee = Integer.parseInt(ab);
	    				         int i2,j2;
	    				         i2 = index1[tee-1][1];
	    				         j2 = index1[tee-1][2];
	    				         bingo1[i2][j2].setBackground(Color.red);
	    			             bingo2[i1][j1].setBackground(Color.red); 
	    			             check1[i2][j2]=1;
	    			             check2[i1][j1]=1;
	    			             
	    			             verify2();
	    			             verify1();
	    				  }
	    			  }  
	    			  });  
	    		  //bingo2[i][j].setBackground(Color.red);
	    		  cp1.add(bingo2[i][j]);
	    		  
	    	  }
	      }
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(280,280);  // or pack() the components
	      frame.setLocationRelativeTo(null);  // center the application window
	      frame.setVisible(true);       
	      frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame1.setSize(280,280);  // or pack() the components
	      frame1.setLocationRelativeTo(null);  // center the application window
	      frame1.setVisible(true); // show it
	 
	      
	   }
	   
	   
	}
