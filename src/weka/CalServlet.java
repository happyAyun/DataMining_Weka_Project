package weka;
import weka.classifiers.*;

import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.rules.OneR;
import weka.classifiers.trees.*;
import weka.core.*;
import weka.core.converters.ArffLoader.ArffReader;
import weka.core.converters.ConverterUtils.DataSource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalServlet
 */
@WebServlet("/CalServlet")
public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 int height = Integer.parseInt(request.getParameter("height"));
			int weight = Integer.parseInt(request.getParameter("weight"));
			int age = Integer.parseInt(request.getParameter("age"));
			String algo = request.getParameter("algori");
			String country = request.getParameter("country");
			System.out.println(height+ " " + weight+ " " + age+ " " +algo);
			
			//CalJava caljava = new CalJava();
			
			BufferedReader reader = new BufferedReader(new FileReader("realfile.arff"));
		System.out.println(reader);
			
			
			ArffReader source = new ArffReader(reader, 1000); 
			
			Instances data = source.getStructure();
			
			System.out.println("First Error");
//			
			data.setClassIndex(data.numAttributes() - 1);
			 Instance inst;
			 while ((inst = source.readInstance(data)) != null) {
			   data.add(inst);
			   
			   System.out.println(inst);   
			 }
			 
			 System.out.println(data.size());
	String map1= null;
	String Japan=null;
	String US=null;
	String EU=null;
			OneR treeR  = new OneR();;
			NaiveBayes treeN = new NaiveBayes();;
			J48 treeJ = new J48();;
			
//			Scanner scan = new Scanner(System.in);
//			algo= scan.next();
			if(algo.equals("One-Rule")){
			
				try {
					treeR.buildClassifier(data);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else if(algo.equals("nb")){
				//NaiveBayes tree = new NaiveBayes();
				try {
					treeN.buildClassifier(data);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
				else if(algo.equals("J")){
				//	J48 tree = new J48();
					try {
						treeJ.buildClassifier(data);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				else {
				
					J48 tree = new J48();
					try {
						treeJ.buildClassifier(data);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					}
					
				System.out.println("제");
				
		 
		//J48 tree = new J48();
	//	NaiveBayes tree = new NaiveBayes();
		
////		
////		tree.buildClassifier(data);
////		
		double accuraccy=0, recall, precision;
		 
		    double str=weight;
			double atr2= age;
			System.out.print("age: ");
		//	atr2= scan.nextDouble();
			//System.out.print((int)atr2/10);
			if((int)atr2/10==2) {
				atr2=5.0;
			}
			else if((int)atr2/10==3) {
				atr2=4.0;
			}
			else if((int)atr2/10==4) {
				atr2=1.0;
			}
			else if((int)atr2/10==1) {
				atr2=3.0;
			}
			else if((int)atr2/10==5) {
				atr2=0.0;
			}
			else if((int)atr2/10==6) {
				atr2=2.0;
			}
			else {
				System.out.println("Wrong Input");
				
			}
			double atr3= height;
			System.out.print("height: ");
			//atr3= scan.nextDouble();
			if(atr3>=180) atr3=10.0;
			else if(atr3>=177) atr3=11.0;
			else if(atr3>=177) atr3=8.0;
			else if(atr3>=174) atr3=9.0;
			else if(atr3>=170) atr3=7.0;
			else if(atr3>=167) atr3=5.0;
			else if(atr3>=164) atr3=6.0;
			else if(atr3>=160) atr3=4.0;
			else if(atr3>=157) atr3=2.0;
			else if(atr3>=154) atr3=3.0;
			else if(atr3>=150) atr3=1.0;
			else if(atr3>=140) atr3=0.0;
			else {
				System.out.println("Wrong Input");
				
				
			}

			System.out.print("weight: ");
			//str = scan.nextDouble();
			if(str>=100) str=0.0;
			else if(str>=97) str=16.0;
			else if(str>=94) str=17.0;
			else if(str>=90) str=15.0;
			else if(str>=87) str=13.0;
			else if(str>=84) str=14.0;
			else if(str>=80) str=12.0;
			else if(str>=77) str=11.0;
			else if(str>=74) str=10.0;
			else if(str>=70) str=9.0;
			else if(str>=67) str=7.0;
			else if(str>=64) str=8.0;
			else if(str>=60) str=6.0;
			else if(str>=57) str=4.0;
			else if(str>=54) str=5.0;
			else if(str>=50) str=3.0;
			else if(str>=47) str=1.0;
			else if(str>=40) str=2.0;
			else {
				System.out.println("Wrong Input");
				
				
			}
			
			
		
			
		
			
			double[] testData = new double[] {
					str, atr2, atr3 //, atr4
			};
			
			Instance testInstance = new DenseInstance(1.0, testData);
			data.add(testInstance);
			//System.out.println(data.instance(data.size()-1));
			double result= 0;
			if(algo.equals("One-Rule")){
				
				accuraccy=60.6667;
				try {
					result= treeR.classifyInstance(data.instance(data.size()-1));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else if(algo.equals("Naive-bayes")){
				accuraccy=69.3333;
				
				 try {
					result =treeN.classifyInstance(data.instance(data.size()-1));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
				else if(algo.equals("J48")){
					accuraccy =70.3333;
					 try {
						result = treeJ.classifyInstance(data.instance(data.size()-1));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				else {
				
					 try {
						result = treeJ.classifyInstance(data.instance(data.size()-1));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					}
			
			//double result = tree.classifyInstance(data.instance(data.size()-1));
				String size= null;
			if(result==5.0)
				{System.out.println("Class : XXL");
				US="10";
				recall=0.660; // 나이브 베이스 일때 출력할 것!!
						precision= 0.775  ;
						map1="88";
						size="XXL";
						}
			else if(result==4.0) {
				System.out.println("Class : XS");
				recall=0.818 ;
				map1="44";
				precision=  0.692 ;
				US="2";
				EU="34";
				size="XS";
			}
			else if(result==2.0) {
				recall=0.860 ;
				precision=  0.721  ;
				size = "S";
				US="4";
				EU="36";
				map1="55";
				System.out.println("Class : S");}
			else if(result==1.0) {
				recall=  0.818 ;
				precision=   0.692 ;
				map1="66";
				US="6";
				size ="M";
				EU="38";
				System.out.println("Class : M");}
			else if(result==0.0) {
				recall=0.732  ;
				precision=  0.658 ;
				map1="77";
				size="L";
				US="8";
				EU="40";
				System.out.println("Class : L");}
			else if(result==3.0) {
				recall=0.371;
				precision=  0.722 ;
				map1="88";
				size="XL";
				US="10";
				EU="42";
				System.out.println("Class : XL");}
			else {
				System.out.println("Class : " +result);
			}
			if(country.contentEquals("Japan")) {
				request.setAttribute("country", map1); 
				
				
			}
			else if(country.contentEquals("EU")) {
				request.setAttribute("country", EU);
				
			}
			else if(country.contentEquals("US")) {
				request.setAttribute("country", US);
				
			}
			else {
				request.setAttribute("country", map1); 
			}
			request.setAttribute("co", country);
			request.setAttribute("accur", accuraccy);
			request.setAttribute("map1", map1);
			request.setAttribute("result", size);
			RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
			dispatcher.forward(request, response);
//response.sendRedirect("result.jsp?result="+size);
		
		System.out.println("Hello world");
	}

}