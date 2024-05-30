package com.csase;

import java.util.Scanner;

/*
 * Represents a student that with a study planner
 */
public class Student {

    private final StudyPlanner planner;       // study planner
    private final Scanner scanner;            // scanner for user input

    /*
     * Sets study planner and scanner
     */
    public Student(){
        planner = new StudyPlanner();
        scanner = new Scanner(System.in);
    }
    
    /*
     * Gets the student's choice and runs it until the student exits
     */
    public void getChoice() {
        int option = -1;

        while (option != 3) {
            System.out.println("Welcome to Study Planner!");
            System.out.println("What would you like to do?");
            System.out.println(planner.getOptions());
            System.out.print("Enter option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            runChoice(option);
        }
    }

    /*
     * Runs the student's choice
     */
    public void runChoice(int option) {
        switch (option) {
            case 1 -> addAssignment();
            case 2 -> System.out.println(planner.listAssignments());
            case 3 -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid option!");
        }
    }

    /*
     * Adds a new assignment to the study planner
     */
    public void addAssignment() {
        System.out.print("Enter assignment name: ");
        String name = scanner.nextLine();
        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dueDate = scanner.nextLine();
        planner.addAssignment(name, dueDate);
    }
}
