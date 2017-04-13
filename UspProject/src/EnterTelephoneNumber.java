import java.util.ArrayList;
import java.util.Scanner;

public class EnterTelephoneNumber {
	
	public static  Telephone telephone = new Telephone();
    public static ArrayList<Telephone> telephoneArr = new ArrayList<Telephone>();
    public static int choice;
	private static Scanner scanner;
	public static void main(String[] arguments){
		
		
		for(int i=0;i<=1;i++)
		{
			
			System.out.println("Enter your brand: ");
			scanner = new Scanner(System.in);
			String brand = scanner.nextLine();
			System.out.println("Your brand is " + brand);
		
			System.out.println("Enter your model: ");
			scanner = new Scanner(System.in);
			String model = scanner.nextLine();
			System.out.println("Your model is " + model);
			
			System.out.println("Enter your camera: ");
			scanner = new Scanner(System.in);
			String camera = scanner.nextLine();
			System.out.println("Your camera is " + camera);
			
			Telephone telephone = new Telephone();
			telephone.Brand = brand;
			telephone.Model = model;
			telephone.Camera =camera;
			telephoneArr.add(telephone);
	   }
		
	
		
		 do{

	            System.out.println("Select an option!");
	            System.out.println("1: Search by brand");
	            System.out.println("2: Search by model");
	            System.out.println("3: Search by camera");
	            scanner= new Scanner(System.in);
	            choice = scanner.nextInt();
	                                            

	           switch(choice) {

                case 1:FilterBrand();                  
                        break;

                case 2: FilterModel();
                        break;

                case 3: FilterCamera();
                        break;

               default: System.out.println("You must pick one of given options\n");
                         break;
               }


	        } while(choice != 3);
    
	}
         
	public  static void  FilterBrand()
	{
		    System.out.println("Enter brand name: ");
   		    scanner = new Scanner(System.in);
            String brandName = scanner.nextLine();
            for(int i=0;i<telephoneArr.size();i++){
            if(telephoneArr.get(i).Brand.contains(brandName)){
        
             System.out.println("We are finding:"
                   			 + "Brand:" + telephoneArr.get(i).Brand + " "
                   			 + "Model:" + telephoneArr.get(i).Model + " "
                   			 + "Camera:" + telephoneArr.get(i).Camera);
            	  }
            }
	}
	
	public  static void  FilterModel()
	{
		   System.out.println("Enter model name: ");
  		   scanner = new Scanner(System.in);
           String modelName = scanner.nextLine();
           for(int i=0;i<telephoneArr.size();i++){
           if(telephoneArr.get(i).Model.contains(modelName)){
       
            System.out.println("We are finding:"
                  			 + "Brand:" + telephoneArr.get(i).Brand + " "
                  			 + "Model:" + telephoneArr.get(i).Model + " "
                  			 + "Camera:" + telephoneArr.get(i).Camera);
           	    }
           }
		
	}
	
	public static void  FilterCamera()
	{
		   System.out.println("Enter camera: ");
  		   scanner = new Scanner(System.in);
           String camera = scanner.nextLine();
           for(int i=0;i<telephoneArr.size();i++){
           if(telephoneArr.get(i).Camera.contains(camera)){
       
            System.out.println("We are finding:"
                  			 + "Brand:" + telephoneArr.get(i).Brand + " "
                  			 + "Model:" + telephoneArr.get(i).Model + " "
                  			 + "Camera:" + telephoneArr.get(i).Camera);
           	    }
           }
	}
}