//Aaryaman Jaising
//11/23/22
//Program to use menu, searching, sorting and displaying using printf

import java.util.ArrayList;
import java.util.Arrays;

class RestaurantApp {

    // Function: searchByCategory
    // Returns an array of Restaurant which match a given category
    // Input keyword (String): the search term
    // Input dataset (Restaurant[]): the array containing all restaurants
    // Return (Restaurant[]): a sublist of restaurants with a category matching the search keyword 
    public static Restaurant[] searchCategoryByKeyword(
        String keyword, Restaurant[] dataset) {

        int idx = 0;
        ArrayList<Restaurant> results = new ArrayList<Restaurant>();
        for (int i = 0; i < dataset.length; i++) {
            Restaurant data = dataset[i];
            String[] categories = data.getCategories();
            for (int j = 0; j < categories.length; j++) {
                String c = categories[j];
                if (c.toLowerCase().contains(keyword.toLowerCase())){
                    results.add(data);
                }
            }
        }
        Restaurant[] array = new Restaurant[results.size()];
        for (int i = 0; i < results.size(); i++) array[i] = results.get(i);
        return array;
    }
    //Search names
    //takes in name to search and dataset in which to search restaurant
    //Prints out Restaurant or not found
    //Returns void
    public static void SearchNames(String name, Restaurant[] dataset){
        Restaurant temp = null;
        for(int i = 0; i < dataset.length; i++){
            for(int j = 0; j < dataset.length - i-1; j++){
                if(dataset[j].getName().compareToIgnoreCase(dataset[j+1].getName()) > 0){
                    temp = dataset[j];
                    dataset[j] = dataset[j+1];
                    dataset[j+1] = temp;
                }
            }
        }
        int low = 0;
        int high = dataset.length-1;
        int mid = (low + high)/2;
        while(low<=high){
            mid = (low + high)/2;
            if(dataset[mid].getName().compareToIgnoreCase(name)==0){
                Restaurant [] temp1 = {dataset[mid]};
                RestaurantUtil.Print(temp1,1);
                high = -1;
                break;
            }
            else if(dataset[mid].getName().compareToIgnoreCase(name) > 0){
                high = mid -1;
            }
            else if(dataset[mid].getName().compareToIgnoreCase(name) < 0){
                low = mid + 1;
            }
        }
        if(dataset[mid].getName().compareToIgnoreCase(name)!=0){
                System.out.println("Not found");
        }
    }
    /*City Summary
    Ask the user for a city and state to search
    Prints the number of restaurants in that city

    Prints the average number of reviews for a restaurant

    Prints the max number of reviews for a restaurant

    Prints the min number of reviews for a restaurant

    Prints the average number of Stars

    Outputs the results in a table with aligned columns
     */
    public static void CitySummary(String city, String state, Restaurant [] dataset){
        int counter = 0;
        for(int i = 0; i < dataset.length; i++){
            if(dataset[i].getCity().compareToIgnoreCase(city) == 0 && dataset[i].getState().compareToIgnoreCase(state)==0){
                dataset[counter] = dataset[i];
                counter++; 
            }
        }
        if(counter>0){
            int max = dataset[1].getNumreviews();
            int min = dataset[1].getNumreviews();
            int sumreviews = 0;
            double sumstars = 0;
        for(int i = 0; i < counter; i++){
            if(dataset[i].getNumreviews() > max){
                max = dataset[i].getNumreviews();
            }
            if(dataset[i].getNumreviews() < min){
                min = dataset[i].getNumreviews();
            }
            sumreviews+=dataset[i].getNumreviews();
            sumstars += dataset[i].getAvgstars();
        }
        double avgreviews = sumreviews/counter;
        double avgstars = sumstars/counter;
        System.out.println("Statistics for " + city + ", " + state);
        System.out.printf("%-30s %-40d %n" , "Count:" , counter);
        System.out.printf("%-30s %-40.2f %n" , "Average number of stars:" , avgstars);
        System.out.printf("%-30s %-40.2f %n" , "Average number of reviews:" , avgreviews);
        System.out.printf("%-30s %-40d %n" , "Max number of reviews:" , max);
        System.out.printf("%-30s %-40d %n" , "Min number of reviews:" , min);


        }
        else{
            System.out.println("No search found");
        }
        
    }
    public static void main(String[] args) {
        System.out.println("1. Search by name");
        System.out.println("2. City summary");
        System.out.println("3. Search category");
        System.out.println("4. Quit");

        System.out.println("Enter Command: ");
        String choice = (System.console().readLine());
        Restaurant [] dataset = RestaurantUtil.Load("restaurants.csv");
            while(!CheckInput.IsInteger(choice) || Integer.parseInt(choice) >= 5|| (Integer.parseInt(choice) < 1)){
                System.out.println("Please enter a valid command");
               main(args);;
            }
            int i = Integer.parseInt(choice);
            if(i == 4){
                System.exit(1);
            }
            else if(i==3){
                System.out.print("Enter a category name: ");
                String category = (System.console().readLine());
                Restaurant[] results = searchCategoryByKeyword(category, dataset);
                if(results.length > 0){
                    for(int k = 0; k < results.length; k++){
                        for(int j = 0; j < results.length - 1; j++){
                            Restaurant temp;
                            if(results[j].getNumreviews() < results[j+1].getNumreviews()){
                                temp = results[j];
                                results[j] = results[j+1];
                                results[j+1] = temp;
                            } 
                        }
                    }
                    RestaurantUtil.Print(results, 25);
                    System.out.println("Showing 25 out of " + dataset.length + " results");
                }
                else{
                    System.out.println("Keyword not found");
                }
            }
            else if(i == 2){
                System.out.println("Enter a city: ");
                String city = (System.console().readLine());
                System.out.println("Enter a State: ");
                String state = (System.console().readLine());
                CitySummary(city, state, dataset);
            }
            else if(i == 1){
                System.out.print("Enter a restaurant name: ");
                String name = (System.console().readLine());
                SearchNames(name,  dataset);
            }
            main(args);
    }
}