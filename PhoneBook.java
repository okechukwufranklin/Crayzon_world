import javax.lang.model.element.Name;
import java.util.Scanner;
import java.util.HashMap;
//import java.util.Map;
public class PhoneBook {
    public static void main(String...args){
        HashMap<String, String> hashMap = new HashMap<>();
        Scanner input = new Scanner(System.in);
        HashMap<String, String> userHashMap = SavedNumbers();

        System.out.println("What Would you like to do next?");
        System.out.println("1.deleteNumber\n2.SearchNumber:");
        int Selection = input.nextInt();
            if (Selection == 1) {
                System.out.print("Enter Name to delete");
                String nameToDelete = input.next();
                DeleteNumber(hashMap, nameToDelete);
            } else if (Selection == 3) {
                System.out.println("Function Coming SOON !!!");

            }


    }
    public static HashMap<String,String>SavedNumbers(){
    HashMap<String, String> userHashMap = new HashMap<>();

    Scanner input = new Scanner(System.in);

                System.out.print("Enter Name:");
                String Name = input.next();

                System.out.print("Enter Phone Number:");
                String Number = input.next();

                userHashMap.put(Name, Number);

            for (HashMap.Entry<String, String> entry : userHashMap.entrySet()) {
                ;
                String Names = entry.getKey();
                String Numbers = entry.getValue();


                System.out.println( Name + ":" + Number);
            }
        return userHashMap;
        }

        public static void DeleteNumber(HashMap<String,String>HarshMap,String Name){
        String removeName = HarshMap.remove(Name);
        if(removeName != null){
            System.out.print(Name +"\tHas Been deleted");

        }else {
            System.out.println(Name+"\tNot found in phone book");
        }

        }
        public void Display(){
            Scanner input = new Scanner(System.in);
            System.out.println("1.Add Number,\n2.Delete Number\n,3.Edit Number\n,4.View Saved Number\n,5. search Number\n,6.Exit");
            int SelectedNumber = input.nextInt();
            HashMap<String, String> userHashMap = SavedNumbers();
            
            if (SelectedNumber == 1){
                SavedNumbers();
            }else if (SelectedNumber == 2){
                System.out.println("Enter name to delete:");
                String nameToDelete = input.next();
                DeleteNumber(userHashMap,nameToDelete);
            } else if (SelectedNumber == 3) {
                EditNumber();
            } else if (SelectedNumber == 4) {
                
            }else if(SelectedNumber == 5) {
                System.out.print("Enter a name to search: ");
                String nameToSearch = input.next();
                searchAndDisplayContact(userHashMap, nameToSearch);
            }else if (SelectedNumber == 6) {
                phoneBook();
            }

            phoneBook();



        }

    public static void searchAndDisplayContact(HashMap<String, String> userHashMap, String nameToSearch) {
        String phoneNumber = userHashMap.get(nameToSearch);


        if (phoneNumber != null) {
            System.out.println( nameToSearch );
            System.out.println( nameToSearch + ":" + phoneNumber );
            System.out.println("Phone Number: " + phoneNumber);
        } else {
            System.out.println("Contact not found for '" + nameToSearch + "'.");
        }
    }




    private void EditNumber() {
    }

    public void phoneBook(){
        Display();


    }
    }
