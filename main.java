package SIMPLILEARN.assignmentsSelflearningVideo.FindingBugUsingAlgorithmTechnique;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class main {

    public static ArrayList<Integer> expenses;
    static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            /*System.out.println("Hello World!");*/
            System.out.println("\n**************************************\n");
            System.out.println("\tWelcome to TheDesk \n");
            System.out.println("**************************************");
            expenses = new ArrayList<Integer>();
            expenses.add(1000);
            expenses.add(2300);
            expenses.add(45000);
            expenses.add(32000);
            expenses.add(110);
            optionsSelection();



        }
        private static void optionsSelection() {
            String[] arr = {"1. I wish to review my expenditure",
                    "2. I wish to add my expenditure",
                    "3. I wish to delete my expenditure",
                    "4. I wish to sort the expenditures",
                    "5. I wish to search for a particular expenditure",
                    "6. Close the application"
            };
            //int[] arr1 = {1,2,3,4,5,6};
           // int  slen = arr1.length;

            // display the all the Strings mentioned in the String array

            for(int i=0; i<arr.length;i++){
                System.out.println(arr[i]);
            }

            System.out.println("\nEnter your choice:\t");

            int  options =  sc.nextInt();

            for(int j=1;j<=arr.length;j++){
                if(options==j){
                    switch (options){
                        case 1:
                            reviewExpenditure();
                            break;

                        case 2:
                            addAmount();
                            break;

                        case 3:
                            System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                            int con_choice = sc.nextInt();
                            if(con_choice==options){
                                expenses.clear();
                                System.out.println(expenses+"\n");
                                System.out.println("All your expenses are erased!\n");
                            } else {
                                System.out.println("Oops... try again!");
                            }
                            optionsSelection();
                            break;

                        case 4:
                            sortExpenses();
                            break;

                        case 5:
                            searchExpenses();
                            break;

                        case 6:
                            closeApp();
                            break;
                        default:
                            System.out.println("You have made an invalid choice!");
                            break;
                    }
                }
            }

        }


        private static void reviewExpenditure(){
            System.out.println("Your saved expenses are listed below: \n");
            System.out.println(expenses+"\n");
            optionsSelection();
        }


        private static void addAmount() {

        //ArrayList<Integer> arrlist = new ArrayList<Integer>();

        System.out.println("Enter the value to add your Expense: \n");
        int value = sc.nextInt();
        expenses.add(value);
        System.out.println("Your value is updated\n");
        //expenses.addAll(arrlist);
        System.out.println(expenses+"\n");
        optionsSelection();

        //expenses.addAll(arrlist);

        }

        private static void sortExpenses() {


            Collections.sort(expenses);
            System.out.println("Sorted expenses list is: \n" + expenses);
            System.out.println();
            optionsSelection();


        }

        private static void searchExpenses() {

            System.out.println("Enter the expense you need to search:\t");
            int toSearch = sc.nextInt();

            if(expenses.indexOf(toSearch) != -1){
                System.out.println("Found at index " + expenses.indexOf(toSearch) );
            }else{
                System.out.println("Not found");
            }

            System.out.println();
            optionsSelection();
        }

        private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
        }

    }

