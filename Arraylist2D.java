package Arrays;

import java.io.*;
import java.util.*;

public class Arraylist2D {
    static void adddata(ArrayList<ArrayList<Integer>> listforfunction, int data, int row, int col) {
        if (row + 1 > listforfunction.size()) {
            ArrayList<Integer> newrow = new ArrayList<>();
            newrow.add(data);
            listforfunction.add(newrow);
        } else {
            listforfunction.get(row).add(data);
        }
    }

    static void modifydata(ArrayList<ArrayList<Integer>> listforfunction, int data, int row, int col) {

        if (row + 1 <= listforfunction.size()) {
                int colsize = listforfunction.get(row).size();
                if (col + 1 <= colsize) {
                    listforfunction.get(row).set(col, data);
                } else {
                    System.out.println("\nColumn doesn't exist :(");
                }
        } else {
            System.out.println("\nRow doesn't exist :(");
        }
    }

    static void deletedata(ArrayList<ArrayList<Integer>> listforfunction, int row, int col) {
      if (row + 1 <= listforfunction.size() && col==0 ){
          listforfunction.remove(row);
          System.out.println("Deleted Successfully :)");
      }
      if (row + 1 < listforfunction.size() && col==0){
          System.out.println("\nRow doesn't exist :(");
      }
      if (col>0) {
          if (row + 1 <= listforfunction.size()) {
              int colsize = listforfunction.get(row).size();
              if (col <= colsize) {
                  listforfunction.get(row).set(col-1,null);
                  System.out.println("Deleted Successfully :)");
              } else {
                  System.out.println("\nColumn doesn't exist :(");
              }
          } else {
              System.out.println("\nRow doesn't exist :(");
          }
      }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 0, col = 0, data = 0, choice = 0;
        boolean decison = true;
        String mood = "yes", filename = "E:\\Prepration\\JAVA\\Arrays\\data.txt";
        ;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println("\n\n\t\t**Welcome to the Program**");
        System.out.println("Here we are gonna create 2D ArrayList and Perform Curd Operation :)");

        System.out.print("Do you want to retrive saved data yes/no  : ");
        mood = sc.nextLine();
        
        if (mood.equalsIgnoreCase("yes")) {
            try {
                FileInputStream fis = new FileInputStream(filename);
                ObjectInputStream ois = new ObjectInputStream(fis);
                list = (ArrayList<ArrayList<Integer>>) ois.readObject();
                fis.close();
                ois.close();
                System.out.println("\t**Data Retrieved successfully**\n");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Here are some of the operation you can perform : ");
        while (decison) {
            System.out.println("1.Create List\n2.Add data \n3.Modify data\n4.Delete data\n5.Show data");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            if (choice != 1 && choice != 5 && choice != 4) {
                System.out.print("Enter the row number : ");
                row = sc.nextInt();
                if (choice != 2) {
                    System.out.print("Enter the column number : ");
                    col = sc.nextInt();
                }
                System.out.print("Enter the data number : ");
                data = sc.nextInt();
            }
            switch (choice) {
                case 1 -> {
                    list.clear();
                    System.out.print("Enter the number of rows : ");
                    row = sc.nextInt();
                    for (int i = 0; i < row; i++) {
                        list.add(new ArrayList<Integer>());
                        System.out.println("Enter the data for " + (i + 1) + " row");
                        for (int j = 0; j < 3; j++) {
                            if (i == 0 && j == 0) {
                                System.out.println("Enter as much value you want to add seperated by space : ");
                            }
                            list.get(i).add(sc.nextInt());
                        }
                    }
                }
                case 2 -> {
                    adddata(list, data, row - 1, col - 1);
                }
                case 3 -> {
                    modifydata(list, data, row - 1, col - 1);
                }
                case 4 -> {
                    System.out.print("Do you want to delete entire row yes/no :");
                    sc.nextLine();
                    mood = sc.nextLine();
                    System.out.print("Enter the number of rows : ");
                    row = sc.nextInt();
                    if (mood.equalsIgnoreCase("yes")) {
                        deletedata(list, row - 1, 0);
                    } else {
                        System.out.print("Enter the number of column : ");
                        col = sc.nextInt();
                        deletedata(list, row - 1, col );
                    }
                }
                case 5 -> {
                    for (ArrayList<Integer> numrow : list) {
                        for (Integer value : numrow) {
                            System.out.print(value + " ");
                        }
                        System.out.println();
                    }
                }
            }
            System.out.print("Do you want to perform Task Again yes/no : ");
            sc.nextLine();
            mood = sc.nextLine();
            if (mood.equalsIgnoreCase("yes")) {
                decison = true;
            } else {
                decison = false;
            }
        }
        System.out.print("Do you want to save this data : ");
        mood = sc.nextLine();
        if (mood.equalsIgnoreCase("yes")) {
            try {
                FileOutputStream fos = new FileOutputStream(filename);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                fos.close();
                oos.close();
                System.out.println("\n\t**Data saved successfully**");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n\t**Thank you for Visiting this Program**");
        sc.close();
    }
}