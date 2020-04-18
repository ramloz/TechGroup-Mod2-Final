package herbasluis;

import java.util.Scanner;

public class ConsoleUI {

    public void CreateMenu(){
        System.out.println("Menu");
        System.out.println("Options (Select an option pressing the number of your option");
        System.out.println("1.- Open a file");
        System.out.println("2.- Get a report");
        System.out.println("3.- Send a notification");
        System.out.println("4.- Exit");
        boolean exit = false;

        while (!exit) {

            Scanner keyboard = new Scanner(System.in);
            String option = keyboard.next();

            switch (option) {
                case "1": CreateFileMenu();

                case "2": CreateReportMenu();

                case "3": CreateNotificationMenu();

                case "4": exit = true;
                    break;
                default: option = "Invalid option";
                    System.out.println(option);
                    CreateMenu();
            }
        }
    }

    private void CreateFileMenu(){

        System.out.println("Please insert the path of your JSON or CSV File or type cancel to return to the main menu");

            FileBridge currentFile = new FileBridge();
            Scanner keyboard = new Scanner(System.in);
            String currentPath = keyboard.next();
            if(currentPath.equals("cancel")){
                CreateMenu();
            }else {
                currentFile.getFile(currentPath);
            }

    }

    private void CreateReportMenu(){
        System.out.println("Select your report type or press cancel to return to the main menu");

        Scanner keyboard = new Scanner(System.in);
        String selectReport = keyboard.next();

        if(selectReport.equals("cancel")){
            CreateMenu();
        }else {

        }

    }

    private void CreateNotificationMenu(){
        System.out.println("Select the notification");
        Scanner keyboard = new Scanner(System.in);
        String selectNotification = keyboard.next();

        if(selectNotification.equals("cancel")){
            CreateMenu();
        }else{

        }
    }

}
