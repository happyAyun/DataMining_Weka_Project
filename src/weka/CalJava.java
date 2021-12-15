package weka;
import weka.classifiers.*;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.rules.OneR;
import weka.classifiers.trees.*;
import weka.core.*;
import weka.core.converters.ArffLoader.ArffReader;
import weka.core.converters.ConverterUtils.DataSource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CalJava {
	
	//producer
	CalJava(){
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("realfile.arff"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArffReader source = null;
		try {
			source = new ArffReader(reader, 1000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("First Error");
		Instances data = source.getStructure();
		data.setClassIndex(data.numAttributes() - 1);
		 Instance inst;
		 
		 try {
			while ((inst = source.readInstance(data)) != null) {
			   data.add(inst);
			   
			   System.out.println(inst);   
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		BufferedReader reader = new BufferedReader(new FileReader("realfile.arff"));
//		ArffReader source = new ArffReader(reader, 1000); 
//		System.out.println("First Error");
//		Instances data = source.getStructure();
//		data.setClassIndex(data.numAttributes() - 1);
//		 Instance inst;
//		 while ((inst = source.readInstance(data)) != null) {
//		   data.add(inst);
//		   
//		   System.out.println(inst);   
//		 }
//		 
////	J48 tree = new J48();
////	NaiveBayes tree = new NaiveBayes();
//	OneR tree = new OneR();
//	
//	tree.buildClassifier(data);
//	Scanner scan = new Scanner(System.in);
//	
//	while(true) {
//	    double str;
//		double atr2;
//		System.out.print("age: ");
//		atr2= scan.nextDouble();
//		//System.out.print((int)atr2/10);
//		if((int)atr2/10==2) {
//			atr2=5.0;
//		}
//		else if((int)atr2/10==3) {
//			atr2=4.0;
//		}
//		else if((int)atr2/10==4) {
//			atr2=1.0;
//		}
//		else if((int)atr2/10==1) {
//			atr2=3.0;
//		}
//		else if((int)atr2/10==5) {
//			atr2=0.0;
//		}
//		else if((int)atr2/10==6) {
//			atr2=2.0;
//		}
//		else {
//			System.out.println("Wrong Input");
//			continue;
//			
//		}
//		double atr3;
//		System.out.print("height: ");
//		atr3= scan.nextDouble();
//		if(atr3>=180) atr3=10.0;
//		else if(atr3>=177) atr3=11.0;
//		else if(atr3>=177) atr3=8.0;
//		else if(atr3>=174) atr3=9.0;
//		else if(atr3>=170) atr3=7.0;
//		else if(atr3>=167) atr3=5.0;
//		else if(atr3>=164) atr3=6.0;
//		else if(atr3>=160) atr3=4.0;
//		else if(atr3>=157) atr3=2.0;
//		else if(atr3>=154) atr3=3.0;
//		else if(atr3>=150) atr3=1.0;
//		else if(atr3>=140) atr3=0.0;
//		else {
//			System.out.println("Wrong Input");
//			continue;
//			
//		}
//
//		System.out.print("weight: ");
//		str = scan.nextDouble();
//		if(str>=100) str=0.0;
//		else if(str>=97) str=16.0;
//		else if(str>=94) str=17.0;
//		else if(str>=90) str=15.0;
//		else if(str>=87) str=13.0;
//		else if(str>=84) str=14.0;
//		else if(str>=80) str=12.0;
//		else if(str>=77) str=11.0;
//		else if(str>=74) str=10.0;
//		else if(str>=70) str=9.0;
//		else if(str>=67) str=7.0;
//		else if(str>=64) str=8.0;
//		else if(str>=60) str=6.0;
//		else if(str>=57) str=4.0;
//		else if(str>=54) str=5.0;
//		else if(str>=50) str=3.0;
//		else if(str>=47) str=1.0;
//		else if(str>=40) str=2.0;
//		else {
//			System.out.println("Wrong Input");
//			continue;
//			
//		}
//		
//		
//	
//		
//	
//		
//		double[] testData = new double[] {
//				str, atr2, atr3 //, atr4
//		};
//		
//		Instance testInstance = new DenseInstance(1.0, testData);
//		data.add(testInstance);
//		//System.out.println(data.instance(data.size()-1));
//		
//		
//		double result = tree.classifyInstance(data.instance(data.size()-1));
//			
//		if(result==5.0)
//			System.out.println("Class : XXL");
//		else if(result==4.0)
//			System.out.println("Class : XS");
//		else if(result==2.0)
//			System.out.println("Class : S");
//		else if(result==1.0)
//			System.out.println("Class : M");
//		else if(result==0.0)
//			System.out.println("Class : L");
//		else if(result==3.0)
//			System.out.println("Class : XL");
//		else {
//			System.out.println("Class : " +result);
//		}
		
		
	//}
		 
		
		 
		 
		
		

	//}

}